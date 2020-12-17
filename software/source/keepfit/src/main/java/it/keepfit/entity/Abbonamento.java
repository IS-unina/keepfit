/*
 * 
 */
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

// TODO: Auto-generated Javadoc
/**
 * The Class Abbonamento.
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "ABBONAMENTI")
public class Abbonamento {

    /** The id. */
    @Id
    @GeneratedValue
    private Long id;
    
    /** The inizio abbonamento. */
    @Column(name = "DATA_INIZIO")
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date inizioAbbonamento;
    
    /** The fine abbonamento. */
    @Column(name = "DATA_FINE")
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date fineAbbonamento;
    
    /** The abbonato. */
    @OneToOne
    private Abbonato abbonato;

    /**
     * Gets the id.
     *
     * @return the id
     */
    public Long getId() {
	return id;
    }

    /**
     * Sets the id.
     *
     * @param id the new id
     */
    public void setId(Long id) {
	this.id = id;
    }

    /**
     * Gets the inizio abbonamento.
     *
     * @return the inizio abbonamento
     */
    public Date getInizioAbbonamento() {
	return inizioAbbonamento;
    }

    /**
     * Sets the inizio abbonamento.
     *
     * @param inizioAbbonamento the new inizio abbonamento
     */
    public void setInizioAbbonamento(Date inizioAbbonamento) {
	this.inizioAbbonamento = inizioAbbonamento;
    }

    /**
     * Gets the fine abbonamento.
     *
     * @return the fine abbonamento
     */
    public Date getFineAbbonamento() {
	return fineAbbonamento;
    }

    /**
     * Sets the fine abbonamento.
     *
     * @param fineAbbonamento the new fine abbonamento
     */
    public void setFineAbbonamento(Date fineAbbonamento) {
	this.fineAbbonamento = fineAbbonamento;
    }

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

}
