/*
 * 
 */
package it.keepfit.dao;

import java.util.List;

import it.keepfit.entity.Esercizio;
import it.keepfit.entity.GruppoMuscolare;

// TODO: Auto-generated Javadoc
/**
 * The Interface EsercizioDAO.
 */
public interface EsercizioDAO {

    /**
     * Leggi esercizi.
     *
     * @return the list
     */
    public List<Esercizio> leggiEsercizi();

    /**
     * Leggi esercizio by id.
     *
     * @param id the id
     * @return the esercizio
     */
    public Esercizio leggiEsercizioById(int id);

    /**
     * Leggi esercizio by gruppo.
     *
     * @param gruppoMuscolare the gruppo muscolare
     * @return the list
     */
    public List<Esercizio> leggiEsercizioByGruppo(GruppoMuscolare gruppoMuscolare);
}
