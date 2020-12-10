package it.keepfit.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import it.keepfit.dao.ProtocolloDAO;
import it.keepfit.entity.Protocollo;

public class ProtocolloDAOImpl implements ProtocolloDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Protocollo> leggiProtocolli() {
	CriteriaBuilder cb = em.getCriteriaBuilder();
	CriteriaQuery<Protocollo> q = cb.createQuery(Protocollo.class);
	Root<Protocollo> c = q.from(Protocollo.class);
	q.select(c);
	TypedQuery<Protocollo> query = em.createQuery(q);
	return query.getResultList();
    }

    @Override
    public Protocollo leggiProtocolloById(int id) {
	return em.find(Protocollo.class, id);
    }

}
