package it.keepfit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ACCOUNT")
public class Account extends Abbonato {

    @Column(name = "USERNAME", length = 20, nullable = false, unique = true)
    private String username;
    @Column(name = "PASSWORD", length = 20, nullable = false, unique = true)
    private String password;
    @OneToOne
    private AbbonamentoPremium abbonamentoPremium;

    public String getUsername() {
	return username;
    }

    public void setUsername(String username) {
	this.username = username;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    public AbbonamentoPremium getAbbonamentoPremium() {
	return abbonamentoPremium;
    }

    public void setAbbonamentoPremium(AbbonamentoPremium abbonamentoPremium) {
	this.abbonamentoPremium = abbonamentoPremium;
    }

}
