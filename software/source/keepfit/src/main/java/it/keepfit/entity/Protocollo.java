/*
 * 
 */
package it.keepfit.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class Protocollo.
 */
@Entity
@Table(name = "PROTOCOLLI")
public class Protocollo {

    /** The id. */
    @Id
    @GeneratedValue
    private Long id;
    
    /** The categoria. */
    @Column(name = "CATEGORIA", length = 20, nullable = false)
    @Enumerated(EnumType.STRING)
    private Categoria categoria;
    
    /** The sessioni. */
    @OneToMany
    private Set<Sessione> sessioni;

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
     * Gets the categoria.
     *
     * @return the categoria
     */
    public Categoria getCategoria() {
	return categoria;
    }

    /**
     * Sets the categoria.
     *
     * @param categoria the new categoria
     */
    public void setCategoria(Categoria categoria) {
	this.categoria = categoria;
    }

    /**
     * Gets the sessioni.
     *
     * @return the sessioni
     */
    public Set<Sessione> getSessioni() {
	return sessioni;
    }

    /**
     * Sets the sessioni.
     *
     * @param sessioni the new sessioni
     */
    public void setSessioni(Set<Sessione> sessioni) {
	this.sessioni = sessioni;
    }

}
