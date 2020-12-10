package it.keepfit.entity;

import java.io.File;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ESERCIZI")
public class Esercizio {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "NOME", length = 20, nullable = false, unique = true)
    private String nome;
    @Column(name = "DESCRIZIONE", length = 200)
    private String descrizione;
    @Column(name = "MEDIA")
    private File media;
    @Column(name = "GRUPPO_MUSCOLARE", length = 20, nullable = false)
    @Enumerated(EnumType.STRING)
    private GruppoMuscolare gruppoMuscolare;

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

    public String getDescrizione() {
	return descrizione;
    }

    public void setDescrizione(String descrizione) {
	this.descrizione = descrizione;
    }

    public File getMedia() {
	return media;
    }

    public void setMedia(File media) {
	this.media = media;
    }

    public GruppoMuscolare getGruppoMuscolare() {
	return gruppoMuscolare;
    }

    public void setGruppoMuscolare(GruppoMuscolare gruppoMuscolare) {
	this.gruppoMuscolare = gruppoMuscolare;
    }

}
