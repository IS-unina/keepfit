/*
 * 
 */
package it.keepfit.control;

import java.util.List;

import it.keepfit.entity.Abbonato;

/**
 * The Interface AdminController.
 */
public interface AdminController {

    /**
     * Aggiungi abbonato.
     *
     * @param nuovoAbbonato the nuovo abbonato
     */
    public void aggiungiAbbonato(Abbonato nuovoAbbonato);

    /**
     * Ricerca abbonati.
     *
     * @param nome    nome
     * @param cognome cognome
     * @param stato   stato abbonamento
     * @return the list
     */
    public List<Abbonato> ricercaAbbonati(String nome, String cognome, String stato);

    /**
     * Ricerca abbonato.
     *
     * @param id the id
     * @return the abbonato
     */
    public Abbonato ricercaAbbonato(long id);

    /**
     * Modifica abbonato.
     *
     * @param abbonato the abbonato modificato
     */
    public void modificaAbbonato(Abbonato abbonato);

    /**
     * Elimina abbonato.
     *
     * @param id the id
     */
    public void eliminaAbbonato(long id);

    /**
     * Promuovi abbonato A premium.
     *
     * @param id id abbonato
     */
    public void promuoviAbbonatoAPremium(int id);

    /**
     * Disattiva account abbonato.
     *
     * @param id id abbonato
     */
    public void disattivaAccountAbbonato(int id);

    /**
     * Ricerca abbonati con account.
     *
     * @return the list
     */
    public List<Abbonato> ricercaAbbonatiConAccount();

    /**
     * Rinnova abbonamento palestra.
     *
     * @param abbonato the abbonato
     */
    public void rinnovaAbbonamentoPalestra(Abbonato abbonato);

    /**
     * Rinnova abbonamento account.
     *
     * @param abbonato the abbonato
     */
    public void rinnovaAbbonamentoAccount(Abbonato abbonato);
}
