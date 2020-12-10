package it.keepfit.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "SESSIONI")
public class Sessione {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "NOME", unique = true, length = 10)
    private String nome;
    @OneToMany
    private Set<Esercizio> esercizi;

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

    public Set<Esercizio> getEsercizi() {
	return esercizi;
    }

    public void setEsercizi(Set<Esercizio> esercizi) {
	this.esercizi = esercizi;
    }

}
