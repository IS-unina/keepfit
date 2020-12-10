package it.keepfit.dao.impl;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import it.keepfit.constants.StatoAbbonamento;
import it.keepfit.dao.AbbonatoDAO;
import it.keepfit.entity.Abbonato;

public class AbbonatoDAOImpl implements AbbonatoDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Abbonato> leggiAbbonati(String nome, String cognome, String stato) {
	CriteriaBuilder cb = em.getCriteriaBuilder();
	CriteriaQuery<Abbonato> q = cb.createQuery(Abbonato.class);
	Root<Abbonato> c = q.from(Abbonato.class);

	Predicate pr1 = cb.like(c.get("nome"), nome + "%");
	Predicate pr2 = cb.like(c.get("cognome"), cognome + "%");

	if (stato.equals("")) {
	    q.select(c).where(pr1, pr2);
	} else {

	    Predicate pr3;

	    if (stato.equals(StatoAbbonamento.ATTIVO.name())) {
		pr3 = cb.greaterThan(c.get("dataFine"), new Date());
	    } else {
		pr3 = cb.lessThan(c.get("dataFine"), new Date());
	    }
	    q.select(c).where(pr1, pr2, pr3);
	}

	TypedQuery<Abbonato> query = em.createQuery(q);
	return query.getResultList();
    }

    @Override
    public Abbonato leggiAbbonatoById(int id) {
	return em.find(Abbonato.class, id);
    }

    @Override
    public void creaAggiornaAbbonato(Abbonato nuovoAbbonato) {
	em.persist(nuovoAbbonato);
    }

}
