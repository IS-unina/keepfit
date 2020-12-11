package it.keepfit.control.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.keepfit.control.AbbonatoController;
import it.keepfit.dao.EsercizioDAO;
import it.keepfit.dao.ProtocolloDAO;
import it.keepfit.entity.Esercizio;
import it.keepfit.entity.Protocollo;

@Component
public class AbbonatoControllerImpl implements AbbonatoController {

    @Autowired
    private EsercizioDAO esercizioDAO;
    @Autowired
    private ProtocolloDAO protocolloDAO;

    @Override
    public List<Esercizio> leggiEsercizi() {
	return esercizioDAO.leggiEsercizi();
    }

    @Override
    public Esercizio leggiDettaglioEsercizio(int id) {
	return esercizioDAO.leggiEsercizioById(id);
    }

    @Override
    public List<Protocollo> leggiProtocolli() {
	return protocolloDAO.leggiProtocolli();
    }

    @Override
    public Protocollo leggiProtocollo(int id) {
	return protocolloDAO.leggiProtocolloById(id);
    }

}
