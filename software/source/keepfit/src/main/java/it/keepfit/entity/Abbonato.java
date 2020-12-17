/*
 * 
 */
package it.keepfit.entity;

import java.util.Date;

import javax.persistence.CascadeType;
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
 * The Class Abbonato.
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "ABBONATI")
public class Abbonato {

    /** The id. */
    @Id
    @GeneratedValue
    private Long id;
    
    /** The nome. */
    @Column(name = "NOME", length = 20, nullable = false)
    private String nome;
    
    /** The cognome. */
    @Column(name = "COGNOME", length = 20, nullable = false)
    private String cognome;
    
    /** The data nascita. */
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    @Column(name = "DATA_NASCITA", nullable = false)
    private Date dataNascita;
    
    /** The codice fiscale. */
    @Column(name = "CODICE_FISCALE", nullable = false, unique = true)
    private String codiceFiscale;
    
    /** The residenza. */
    @Column(name = "RESIDENZA", length = 50, nullable = false)
    private String residenza;
    
    /** The domicilio. */
    @Column(name = "DOMICILIO", length = 50)
    private String domicilio;
    
    /** The telefono fisso. */
    @Column(name = "TELEFONO_FISSO", length = 10)
    private String telefonoFisso;
    
    /** The telefono mobile. */
    @Column(name = "TELEFONO_MOBILE", length = 10)
    private String telefonoMobile;
    
    /** The data iscrizione. */
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    @Column(name = "DATA_ISCRIZIONE", nullable = false)
    private Date dataIscrizione;
    
    /** The abbonamento. */
    @OneToOne(mappedBy = "abbonato", cascade = CascadeType.ALL)
    private Abbonamento abbonamento;
    
    /** The abbonamento premium. */
    @OneToOne(mappedBy = "abbonato")
    private AbbonamentoPremium abbonamentoPremium;

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
     * Gets the nome.
     *
     * @return the nome
     */
    public String getNome() {
	return nome;
    }

    /**
     * Sets the nome.
     *
     * @param nome the new nome
     */
    public void setNome(String nome) {
	this.nome = nome;
    }

    /**
     * Gets the cognome.
     *
     * @return the cognome
     */
    public String getCognome() {
	return cognome;
    }

    /**
     * Sets the cognome.
     *
     * @param cognome the new cognome
     */
    public void setCognome(String cognome) {
	this.cognome = cognome;
    }

    /**
     * Gets the data nascita.
     *
     * @return the data nascita
     */
    public Date getDataNascita() {
	return dataNascita;
    }

    /**
     * Sets the data nascita.
     *
     * @param dataNascita the new data nascita
     */
    public void setDataNascita(Date dataNascita) {
	this.dataNascita = dataNascita;
    }

    /**
     * Gets the codice fiscale.
     *
     * @return the codice fiscale
     */
    public String getCodiceFiscale() {
	return codiceFiscale;
    }

    /**
     * Sets the codice fiscale.
     *
     * @param codiceFiscale the new codice fiscale
     */
    public void setCodiceFiscale(String codiceFiscale) {
	this.codiceFiscale = codiceFiscale;
    }

    /**
     * Gets the residenza.
     *
     * @return the residenza
     */
    public String getResidenza() {
	return residenza;
    }

    /**
     * Sets the residenza.
     *
     * @param residenza the new residenza
     */
    public void setResidenza(String residenza) {
	this.residenza = residenza;
    }

    /**
     * Gets the domicilio.
     *
     * @return the domicilio
     */
    public String getDomicilio() {
	return domicilio;
    }

    /**
     * Sets the domicilio.
     *
     * @param domicilio the new domicilio
     */
    public void setDomicilio(String domicilio) {
	this.domicilio = domicilio;
    }

    /**
     * Gets the telefono fisso.
     *
     * @return the telefono fisso
     */
    public String getTelefonoFisso() {
	return telefonoFisso;
    }

    /**
     * Sets the telefono fisso.
     *
     * @param telefonoFisso the new telefono fisso
     */
    public void setTelefonoFisso(String telefonoFisso) {
	this.telefonoFisso = telefonoFisso;
    }

    /**
     * Gets the telefono mobile.
     *
     * @return the telefono mobile
     */
    public String getTelefonoMobile() {
	return telefonoMobile;
    }

    /**
     * Sets the telefono mobile.
     *
     * @param telefonoMobile the new telefono mobile
     */
    public void setTelefonoMobile(String telefonoMobile) {
	this.telefonoMobile = telefonoMobile;
    }

    /**
     * Gets the data iscrizione.
     *
     * @return the data iscrizione
     */
    public Date getDataIscrizione() {
	return dataIscrizione;
    }

    /**
     * Sets the data iscrizione.
     *
     * @param dataIscrizione the new data iscrizione
     */
    public void setDataIscrizione(Date dataIscrizione) {
	this.dataIscrizione = dataIscrizione;
    }

    /**
     * Gets the abbonamento.
     *
     * @return the abbonamento
     */
    public Abbonamento getAbbonamento() {
	return abbonamento;
    }

    /**
     * Sets the abbonamento.
     *
     * @param abbonamento the new abbonamento
     */
    public void setAbbonamento(Abbonamento abbonamento) {
	this.abbonamento = abbonamento;
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
