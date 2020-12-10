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

@Entity
@Table(name = "PROTOCOLLI")
public class Protocollo {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "CATEGORIA", length = 20, nullable = false)
    @Enumerated(EnumType.STRING)
    private Categoria categoria;
    @OneToMany
    private Set<Sessione> sessioni;

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public Categoria getCategoria() {
	return categoria;
    }

    public void setCategoria(Categoria categoria) {
	this.categoria = categoria;
    }

    public Set<Sessione> getSessioni() {
	return sessioni;
    }

    public void setSessioni(Set<Sessione> sessioni) {
	this.sessioni = sessioni;
    }

}
