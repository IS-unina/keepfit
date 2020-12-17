/*
 * 
 */
package it.keepfit.entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class AbbonamentoPremium.
 */
@Entity
@Table(name = "ABBONAMENTI_PREMIUM")
public class AbbonamentoPremium extends Abbonamento {

    /** The abbonato. */
    @OneToOne
    private Abbonato abbonato;
    
    /** The account. */
    @OneToOne(mappedBy = "abbonamentoPremium")
    private Account account;

    /**
     * Gets the abbonato.
     *
     * @return the abbonato
     */
    public Abbonato getAbbonato() {
	return abbonato;
    }

    /**
     * Sets the abbonato.
     *
     * @param abbonato the new abbonato
     */
    public void setAbbonato(Abbonato abbonato) {
	this.abbonato = abbonato;
    }

    /**
     * Gets the account.
     *
     * @return the account
     */
    public Account getAccount() {
	return account;
    }

    /**
     * Sets the account.
     *
     * @param account the new account
     */
    public void setAccount(Account account) {
	this.account = account;
    }

}
