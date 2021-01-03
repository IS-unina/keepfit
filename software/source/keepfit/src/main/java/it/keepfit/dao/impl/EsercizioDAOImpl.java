/*
 * 
 */
package it.keepfit.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Component;

import it.keepfit.dao.EsercizioDAO;
import it.keepfit.entity.Esercizio;
import it.keepfit.entity.GruppoMuscolare;

// TODO: Auto-generated Javadoc
/**
 * The Class EsercizioDAOImpl.
 */
@Component
public class EsercizioDAOImpl implements EsercizioDAO {

    /** The em. */
    @PersistenceContext
    private EntityManager em;

    /**
     * Leggi esercizi.
     *
     * @return the list
     */
    @Override
    public List<Esercizio> leggiEsercizi() {
	CriteriaBuilder cb = em.getCriteriaBuilder();
	CriteriaQuery<Esercizio> q = cb.createQuery(Esercizio.class);
	Root<Esercizio> c = q.from(Esercizio.class);
	q.select(c);
	TypedQuery<Esercizio> query = em.createQuery(q);
	return query.getResultList();
    }

    /**
     * Leggi esercizio by id.
     *
     * @param id the id
     * @return the esercizio
     */
    @Override
    public Esercizio leggiEsercizioById(int id) {
	return em.find(Esercizio.class, id);
    }

    /**
     * Leggi esercizio by gruppo.
     *
     * @param gruppoMuscolare the gruppo muscolare
     * @return the list
     */
    @Override
    public List<Esercizio> leggiEsercizioByGruppo(GruppoMuscolare gruppoMuscolare) {
	CriteriaBuilder cb = em.getCriteriaBuilder();
	CriteriaQuery<Esercizio> q = cb.createQuery(Esercizio.class);
	Root<Esercizio> c = q.from(Esercizio.class);
	q.select(c).where(cb.equal(c.get("gruppoMuscolare"), gruppoMuscolare));
	TypedQuery<Esercizio> query = em.createQuery(q);
	return query.getResultList();
    }

}
