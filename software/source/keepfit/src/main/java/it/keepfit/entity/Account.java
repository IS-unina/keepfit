/*
 * 
 */
package it.keepfit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class Account.
 */
@Entity
@Table(name = "ACCOUNT")
public class Account extends Abbonato {

    /** The username. */
    @Column(name = "USERNAME", length = 20, nullable = false, unique = true)
    private String username;
    
    /** The password. */
    @Column(name = "PASSWORD", length = 20, nullable = false, unique = true)
    private String password;
    
    /** The abbonamento premium. */
    @OneToOne
    private AbbonamentoPremium abbonamentoPremium;

    /**
     * Gets the username.
     *
     * @return the username
     */
    public String getUsername() {
	return username;
    }

    /**
     * Sets the username.
     *
     * @param username the new username
     */
    public void setUsername(String username) {
	this.username = username;
    }

    /**
     * Gets the password.
     *
     * @return the password
     */
    public String getPassword() {
	return password;
    }

    /**
     * Sets the password.
     *
     * @param password the new password
     */
    public void setPassword(String password) {
	this.password = password;
    }

    /**
     * Gets the abbonamento premium.
     *
     * @return the abbonamento premium
     */
    public AbbonamentoPremium getAbbonamentoPremium() {
	return abbonamentoPremium;
    }

    /**
     * Sets the abbonamento premium.
     *
     * @param abbonamentoPremium the new abbonamento premium
     */
    public void setAbbonamentoPremium(AbbonamentoPremium abbonamentoPremium) {
	this.abbonamentoPremium = abbonamentoPremium;
    }

}
