package it.keepfit.dao.impl;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import it.keepfit.dao.AbbonatoDAO;
import it.keepfit.entity.Abbonato;

public class AbbonatoDAOImpl implements AbbonatoDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Abbonato> leggiAbbonati() {
	CriteriaBuilder cb = em.getCriteriaBuilder();
	CriteriaQuery<Abbonato> q = cb.createQuery(Abbonato.class);
	Root<Abbonato> c = q.from(Abbonato.class);
	q.select(c);
	TypedQuery<Abbonato> query = em.createQuery(q);
	return query.getResultList();
    }

    @Override
    public List<Abbonato> leggiAbbonatiByNome(String nome) {
	CriteriaBuilder cb = em.getCriteriaBuilder();
	CriteriaQuery<Abbonato> q = cb.createQuery(Abbonato.class);
	Root<Abbonato> c = q.from(Abbonato.class);
	q.select(c).where(cb.like(c.get("nome"), nome + "%"));
	TypedQuery<Abbonato> query = em.createQuery(q);
	return query.getResultList();
    }

    @Override
    public List<Abbonato> leggiAbbonatoByCognome(String cognome) {
	CriteriaBuilder cb = em.getCriteriaBuilder();
	CriteriaQuery<Abbonato> q = cb.createQuery(Abbonato.class);
	Root<Abbonato> c = q.from(Abbonato.class);
	q.select(c).where(cb.like(c.get("cognome"), cognome + "%"));
	TypedQuery<Abbonato> query = em.createQuery(q);
	return query.getResultList();
    }

    @Override
    public List<Abbonato> leggiAbbonatoByDataFine(Date dataFine) {
	CriteriaBuilder cb = em.getCriteriaBuilder();
	CriteriaQuery<Abbonato> q = cb.createQuery(Abbonato.class);
	Root<Abbonato> c = q.from(Abbonato.class);
	q.select(c).where(cb.greaterThan(c.get("dataFine"), dataFine));
	TypedQuery<Abbonato> query = em.createQuery(q);
	return query.getResultList();
    }

    @Override
    public Abbonato leggiAbbonatoById(int id) {
	return em.find(Abbonato.class, id);
    }

}
