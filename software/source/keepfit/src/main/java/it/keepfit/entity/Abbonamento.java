package it.keepfit.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "ABBONAMENTI")
public class Abbonamento {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "DATA_INIZIO")
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date inizioAbbonamento;
    @Column(name = "DATA_FINE")
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date fineAbbonamento;
    @OneToOne
    private Abbonato abbonato;

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public Date getInizioAbbonamento() {
	return inizioAbbonamento;
    }

    public void setInizioAbbonamento(Date inizioAbbonamento) {
	this.inizioAbbonamento = inizioAbbonamento;
    }

    public Date getFineAbbonamento() {
	return fineAbbonamento;
    }

    public void setFineAbbonamento(Date fineAbbonamento) {
	this.fineAbbonamento = fineAbbonamento;
    }

    public Abbonato getAbbonato() {
	return abbonato;
    }

    public void setAbbonato(Abbonato abbonato) {
	this.abbonato = abbonato;
    }

}
