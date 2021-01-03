/*
 * 
 */
package it.keepfit.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import it.keepfit.dao.AccountDAO;
import it.keepfit.entity.Account;

// TODO: Auto-generated Javadoc
/**
 * The Class AccountDAOImpl.
 */
@Component
public class AccountDAOImpl implements AccountDAO {

    /** The em. */
    @PersistenceContext
    private EntityManager em;

    /**
     * Leggi account by id.
     *
     * @param id the id
     * @return the account
     */
    @Override
    public Account leggiAccountById(int id) {
	return em.find(Account.class, id);
    }

}
