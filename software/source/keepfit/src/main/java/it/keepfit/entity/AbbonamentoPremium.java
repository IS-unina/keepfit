package it.keepfit.entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ABBONAMENTI_PREMIUM")
public class AbbonamentoPremium extends Abbonamento {

    @OneToOne
    private Abbonato abbonato;
    @OneToOne(mappedBy = "abbonamentoPremium")
    private Account account;

    public Abbonato getAbbonato() {
	return abbonato;
    }

    public void setAbbonato(Abbonato abbonato) {
	this.abbonato = abbonato;
    }

    public Account getAccount() {
	return account;
    }

    public void setAccount(Account account) {
	this.account = account;
    }

}
