/*
 * 
 */
package it.keepfit.dao.impl;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.persistence.TemporalType;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Component;

import it.keepfit.constants.StatoAbbonamento;
import it.keepfit.dao.AbbonatoDAO;
import it.keepfit.entity.Abbonato;
import it.keepfit.exception.AbbonatoException;

// TODO: Auto-generated Javadoc
/**
 * The Class AbbonatoDAOImpl.
 */
@Component
public class AbbonatoDAOImpl implements AbbonatoDAO {

    /** The em. */
    @PersistenceContext
    private EntityManager em;

    /**
     * Leggi abbonati.
     *
     * @param nome    the nome
     * @param cognome the cognome
     * @param stato   the stato
     * @return the list
     */
    @Override
    public List<Abbonato> leggiAbbonati(String nome, String cognome, String stato) {
	CriteriaBuilder cb = em.getCriteriaBuilder();
	CriteriaQuery<Abbonato> q = cb.createQuery(Abbonato.class);
	Root<Abbonato> c = q.from(Abbonato.class);

	Predicate pr1 = cb.like(c.get("nome"), nome + "%");
	Predicate pr2 = cb.like(c.get("cognome"), cognome + "%");
	TypedQuery<Abbonato> query = null;

	if (stato.equals("")) {
	    q.select(c).where(pr1, pr2);
	    query = em.createQuery(q);
	} else {
	    // se indico lo stato dell'abbonamento eseguo la join con la tabella abbonamento
	    if (stato.equals(StatoAbbonamento.ATTIVO.name())) {
		query = em.createQuery(
			"SELECT abb.abbonato FROM Abbonamento abb WHERE abb.fineAbbonamento >= :today and abb.abbonato.nome like :nome and abb.abbonato.cognome like :cognome",
			Abbonato.class);
		query.setParameter("today", new Date(), TemporalType.DATE);
		query.setParameter("nome", nome + "%");
		query.setParameter("cognome", cognome + "%");
	    } else {
		query = em.createQuery(
			"SELECT abb.abbonato FROM Abbonamento abb WHERE abb.fineAbbonamento < :today and abb.abbonato.nome like :nome and abb.abbonato.cognome like :cognome",
			Abbonato.class);
		query.setParameter("today", new Date(), TemporalType.DATE);
		query.setParameter("nome", nome + "%");
		query.setParameter("cognome", cognome + "%");
	    }

	}

	List<Abbonato> listaAbbonati;

	try {
	    listaAbbonati = query.getResultList();
	} catch (PersistenceException e) {
	    throw new AbbonatoException(e.getMessage());
	}
	return listaAbbonati;
    }

    /**
     * Leggi abbonato by id.
     *
     * @param id the id
     * @return the abbonato
     */
    @Override
    public Abbonato leggiAbbonatoById(long id) {
	return em.find(Abbonato.class, id);
    }

    /**
     * Crea aggiorna abbonato.
     *
     * @param abbonato the abbonato
     */
    @Override
    public void creaAggiornaAbbonato(Abbonato abbonato) {
	em.merge(abbonato);
    }

    /**
     * Elimina abbonato.
     *
     * @param abbonato the abbonato
     */
    @Override
    public void eliminaAbbonato(Abbonato abbonato) {
	em.remove(abbonato);
    }

}
