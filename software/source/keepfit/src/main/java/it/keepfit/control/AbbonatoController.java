/*
 * 
 */
package it.keepfit.control;

import java.util.List;

import it.keepfit.entity.Esercizio;
import it.keepfit.entity.Protocollo;

// TODO: Auto-generated Javadoc
/**
 * The Interface AbbonatoController.
 */
public interface AbbonatoController {

    /**
     * Leggi esercizi.
     *
     * @return the list
     */
    public List<Esercizio> leggiEsercizi();

    /**
     * Leggi dettaglio esercizio.
     *
     * @param id the id
     * @return the esercizio
     */
    public Esercizio leggiDettaglioEsercizio(int id);

    /**
     * Leggi protocolli.
     *
     * @return the list
     */
    public List<Protocollo> leggiProtocolli();

    /**
     * Leggi protocollo.
     *
     * @param id the id
     * @return the protocollo
     */
    public Protocollo leggiProtocollo(int id);
}
