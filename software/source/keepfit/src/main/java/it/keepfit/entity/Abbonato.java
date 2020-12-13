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

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "ABBONATI")
public class Abbonato {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "NOME", length = 20, nullable = false)
    private String nome;
    @Column(name = "COGNOME", length = 20, nullable = false)
    private String cognome;
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    @Column(name = "DATA_NASCITA", nullable = false)
    private Date dataNascita;
    @Column(name = "CODICE_FISCALE", nullable = false, unique = true)
    private String codiceFiscale;
    @Column(name = "RESIDENZA", length = 50, nullable = false)
    private String residenza;
    @Column(name = "DOMICILIO", length = 50)
    private String domicilio;
    @Column(name = "TELEFONO_FISSO", length = 10)
    private String telefonoFisso;
    @Column(name = "TELEFONO_MOBILE", length = 10)
    private String telefonoMobile;
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    @Column(name = "DATA_ISCRIZIONE", nullable = false)
    private Date dataIscrizione;
    @OneToOne(mappedBy = "abbonato", cascade = CascadeType.ALL)
    private Abbonamento abbonamento;
    @OneToOne(mappedBy = "abbonato")
    private AbbonamentoPremium abbonamentoPremium;

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getNome() {
	return nome;
    }

    public void setNome(String nome) {
	this.nome = nome;
    }

    public String getCognome() {
	return cognome;
    }

    public void setCognome(String cognome) {
	this.cognome = cognome;
    }

    public Date getDataNascita() {
	return dataNascita;
    }

    public void setDataNascita(Date dataNascita) {
	this.dataNascita = dataNascita;
    }

    public String getCodiceFiscale() {
	return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
	this.codiceFiscale = codiceFiscale;
    }

    public String getResidenza() {
	return residenza;
    }

    public void setResidenza(String residenza) {
	this.residenza = residenza;
    }

    public String getDomicilio() {
	return domicilio;
    }

    public void setDomicilio(String domicilio) {
	this.domicilio = domicilio;
    }

    public String getTelefonoFisso() {
	return telefonoFisso;
    }

    public void setTelefonoFisso(String telefonoFisso) {
	this.telefonoFisso = telefonoFisso;
    }

    public String getTelefonoMobile() {
	return telefonoMobile;
    }

    public void setTelefonoMobile(String telefonoMobile) {
	this.telefonoMobile = telefonoMobile;
    }

    public Date getDataIscrizione() {
	return dataIscrizione;
    }

    public void setDataIscrizione(Date dataIscrizione) {
	this.dataIscrizione = dataIscrizione;
    }

    public Abbonamento getAbbonamento() {
	return abbonamento;
    }

    public void setAbbonamento(Abbonamento abbonamento) {
	this.abbonamento = abbonamento;
    }

    public AbbonamentoPremium getAbbonamentoPremium() {
	return abbonamentoPremium;
    }

    public void setAbbonamentoPremium(AbbonamentoPremium abbonamentoPremium) {
	this.abbonamentoPremium = abbonamentoPremium;
    }

}
