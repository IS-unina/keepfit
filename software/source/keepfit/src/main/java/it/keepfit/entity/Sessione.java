/*
 * 
 */
package it.keepfit.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class Sessione.
 */
@Entity
@Table(name = "SESSIONI")
public class Sessione {

    /** The id. */
    @Id
    @GeneratedValue
    private Long id;
    
    /** The nome. */
    @Column(name = "NOME", unique = true, length = 10)
    private String nome;
    
    /** The esercizi. */
    @OneToMany
    private Set<Esercizio> esercizi;

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
     * Gets the esercizi.
     *
     * @return the esercizi
     */
    public Set<Esercizio> getEsercizi() {
	return esercizi;
    }

    /**
     * Sets the esercizi.
     *
     * @param esercizi the new esercizi
     */
    public void setEsercizi(Set<Esercizio> esercizi) {
	this.esercizi = esercizi;
    }

}
