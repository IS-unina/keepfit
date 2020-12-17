/*
 * 
 */
package it.keepfit.entity;

import java.io.File;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class Esercizio.
 */
@Entity
@Table(name = "ESERCIZI")
public class Esercizio {

    /** The id. */
    @Id
    @GeneratedValue
    private Long id;
    
    /** The nome. */
    @Column(name = "NOME", length = 20, nullable = false, unique = true)
    private String nome;
    
    /** The descrizione. */
    @Column(name = "DESCRIZIONE", length = 200)
    private String descrizione;
    
    /** The media. */
    @Column(name = "MEDIA")
    private File media;
    
    /** The gruppo muscolare. */
    @Column(name = "GRUPPO_MUSCOLARE", length = 20, nullable = false)
    @Enumerated(EnumType.STRING)
    private GruppoMuscolare gruppoMuscolare;

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
     * Gets the descrizione.
     *
     * @return the descrizione
     */
    public String getDescrizione() {
	return descrizione;
    }

    /**
     * Sets the descrizione.
     *
     * @param descrizione the new descrizione
     */
    public void setDescrizione(String descrizione) {
	this.descrizione = descrizione;
    }

    /**
     * Gets the media.
     *
     * @return the media
     */
    public File getMedia() {
	return media;
    }

    /**
     * Sets the media.
     *
     * @param media the new media
     */
    public void setMedia(File media) {
	this.media = media;
    }

    /**
     * Gets the gruppo muscolare.
     *
     * @return the gruppo muscolare
     */
    public GruppoMuscolare getGruppoMuscolare() {
	return gruppoMuscolare;
    }

    /**
     * Sets the gruppo muscolare.
     *
     * @param gruppoMuscolare the new gruppo muscolare
     */
    public void setGruppoMuscolare(GruppoMuscolare gruppoMuscolare) {
	this.gruppoMuscolare = gruppoMuscolare;
    }

}
