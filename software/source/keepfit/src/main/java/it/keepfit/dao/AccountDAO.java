/*
 * 
 */
package it.keepfit.dao;

import it.keepfit.entity.Account;

// TODO: Auto-generated Javadoc
/**
 * The Interface AccountDAO.
 */
public interface AccountDAO {

    /**
     * Leggi account by id.
     *
     * @param id the id
     * @return the account
     */
    public Account leggiAccountById(int id);

}
