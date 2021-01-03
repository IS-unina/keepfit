/*
 * 
 */
package it.keepfit.control.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.keepfit.control.AbbonatoController;
import it.keepfit.dao.EsercizioDAO;
import it.keepfit.dao.ProtocolloDAO;
import it.keepfit.entity.Esercizio;
import it.keepfit.entity.Protocollo;

// TODO: Auto-generated Javadoc
/**
 * The Class AbbonatoControllerImpl.
 */
@Component
public class AbbonatoControllerImpl implements AbbonatoController {

    /** The esercizio DAO. */
    @Autowired
    private EsercizioDAO esercizioDAO;
    
    /** The protocollo DAO. */
    @Autowired
    private ProtocolloDAO protocolloDAO;

    /**
     * Leggi esercizi.
     *
     * @return the list
     */
    @Override
    public List<Esercizio> leggiEsercizi() {
	return esercizioDAO.leggiEsercizi();
    }

    /**
     * Leggi dettaglio esercizio.
     *
     * @param id the id
     * @return the esercizio
     */
    @Override
    public Esercizio leggiDettaglioEsercizio(int id) {
	return esercizioDAO.leggiEsercizioById(id);
    }

    /**
     * Leggi protocolli.
     *
     * @return the list
     */
    @Override
    public List<Protocollo> leggiProtocolli() {
	return protocolloDAO.leggiProtocolli();
    }

    /**
     * Leggi protocollo.
     *
     * @param id the id
     * @return the protocollo
     */
    @Override
    public Protocollo leggiProtocollo(int id) {
	return protocolloDAO.leggiProtocolloById(id);
    }

}
