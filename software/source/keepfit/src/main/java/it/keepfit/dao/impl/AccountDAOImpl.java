package it.keepfit.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import it.keepfit.dao.AccountDAO;
import it.keepfit.entity.Account;

public class AccountDAOImpl implements AccountDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Account leggiAccountById(int id) {
	return em.find(Account.class, id);
    }

}
