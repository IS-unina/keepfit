/*
 * 
 */
package it.keepfit.dao;

import java.util.List;

import it.keepfit.entity.Abbonato;

/**
 * The Interface AbbonatoDAO.
 */
public interface AbbonatoDAO {

    /**
     * Leggi abbonati.
     *
     * @param nome    nome
     * @param cognome cognome
     * @param stato   stato abbonamento
     * @return the list
     */
    public List<Abbonato> leggiAbbonati(String nome, String cognome, String stato);

    /**
     * Leggi abbonato by id.
     *
     * @param id the id
     * @return the abbonato
     */
    public Abbonato leggiAbbonatoById(long id);

    /**
     * Crea aggiorna abbonato.
     *
     * @param nuovoAbbonato the nuovo abbonato
     */
    public void creaAggiornaAbbonato(Abbonato nuovoAbbonato);

    /**
     * Elimina abbonato.
     *
     * @param trovato the trovato
     */
    public void eliminaAbbonato(Abbonato trovato);

}
