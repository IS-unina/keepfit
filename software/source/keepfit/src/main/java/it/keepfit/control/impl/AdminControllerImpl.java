/*
 * 
 */
package it.keepfit.control.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.keepfit.control.AdminController;
import it.keepfit.dao.AbbonatoDAO;
import it.keepfit.entity.Abbonato;
import it.keepfit.exception.AbbonatoException;

/**
 * The Class AdminControllerImpl.
 */
@Component
public class AdminControllerImpl implements AdminController {

    /** The logger. */
    private static Logger LOGGER = LoggerFactory.getLogger(AdminControllerImpl.class);

    /** The abbonato DAO. */
    @Autowired
    private AbbonatoDAO abbonatoDAO;

    /**
     * Aggiungi abbonato.
     *
     * @param nuovoAbbonato the nuovo abbonato
     */
    @Override
    public void aggiungiAbbonato(Abbonato nuovoAbbonato) {

	if (nuovoAbbonato == null) {
	    throw new IllegalStateException("L'oggetto di tipo Abbonato è null");
	}
	if (!nuovoAbbonato.getNome().matches("^[a-zA-Z]{2,20}$")) {
	    throw new IllegalStateException("Nome dell'abbonato non valido");
	}
	if (!nuovoAbbonato.getCognome().matches("^[a-zA-Z]{2,20}$")) {
	    throw new IllegalStateException("Cognome dell'abbonato non valido");
	}
	if (!nuovoAbbonato.getCodiceFiscale().matches("[a-zA-Z0-9]{16}$")) {
	    throw new IllegalStateException("Codice fiscale dell'abbonato non valido");
	}
	if (!nuovoAbbonato.getTelefonoFisso().isEmpty() && !nuovoAbbonato.getTelefonoFisso().matches("^[0-9]{10}$")) {
	    throw new IllegalStateException("Telefono fisso dell'abbonato non valido");
	}
	if (!nuovoAbbonato.getTelefonoMobile().isEmpty() && !nuovoAbbonato.getTelefonoMobile().matches("^[0-9]{10}$")) {
	    throw new IllegalStateException("Telefono mobile dell'abbonato non valido");
	}
	if (nuovoAbbonato.getDataIscrizione() == null || nuovoAbbonato.getDataNascita() == null) {
	    throw new IllegalStateException("Data non valida");
	}

	// TODO controllare se gia esiste il codice fiscale

	nuovoAbbonato.setNome(nuovoAbbonato.getNome().toUpperCase());
	nuovoAbbonato.setCognome(nuovoAbbonato.getCognome().toUpperCase());
	nuovoAbbonato.setCodiceFiscale(nuovoAbbonato.getCodiceFiscale().toUpperCase());

	abbonatoDAO.creaAggiornaAbbonato(nuovoAbbonato);
    }

    /**
     * Ricerca abbonati.
     *
     * @param nome    nome
     * @param cognome cognome
     * @param stato   stato abbonamento
     * @return the list
     */
    @Override
    public List<Abbonato> ricercaAbbonati(String nome, String cognome, String stato) {

	if (nome == null || cognome == null || stato == null) {
	    throw new IllegalStateException("Il parametro di ricerca è null");
	}
	List<Abbonato> listaAbbonati = new ArrayList<>();
	try {
	    listaAbbonati = abbonatoDAO.leggiAbbonati(nome.toUpperCase(), cognome.toUpperCase(), stato);
	} catch (AbbonatoException e) {
	    LOGGER.error(e.getMessage());
	}

	return listaAbbonati;
    }

    /**
     * Ricerca abbonato.
     *
     * @param id id abbonato
     * @return the abbonato
     */
    @Override
    public Abbonato ricercaAbbonato(long id) {
	return abbonatoDAO.leggiAbbonatoById(id);
    }

    /**
     * Modifica abbonato.
     *
     * @param abbonato the abbonato
     */
    @Override
    public void modificaAbbonato(Abbonato abbonato) {
	// TODO Auto-generated method stub

    }

    /**
     * Promuovi abbonato A premium.
     *
     * @param id id abbonato
     */
    @Override
    public void promuoviAbbonatoAPremium(int id) {
	// TODO Auto-generated method stub

    }

    /**
     * Disattiva account abbonato.
     *
     * @param id id abbonato
     */
    @Override
    public void disattivaAccountAbbonato(int id) {
	// TODO Auto-generated method stub

    }

    /**
     * Ricerca abbonati con account.
     *
     * @return the list
     */
    @Override
    public List<Abbonato> ricercaAbbonatiConAccount() {
	// TODO Auto-generated method stub
	return null;
    }

    /**
     * Rinnova abbonamento palestra.
     *
     * @param abbonato the abbonato
     */
    @Override
    public void rinnovaAbbonamentoPalestra(Abbonato abbonato) {
	// TODO Auto-generated method stub

    }

    /**
     * Rinnova abbonamento account.
     *
     * @param abbonato the abbonato
     */
    @Override
    public void rinnovaAbbonamentoAccount(Abbonato abbonato) {
	// TODO Auto-generated method stub

    }

    /**
     * Elimina abbonato.
     *
     * @param id id abbonato
     */
    @Override
    public void eliminaAbbonato(long id) {
	Abbonato trovato = abbonatoDAO.leggiAbbonatoById(id);
	abbonatoDAO.eliminaAbbonato(trovato);

    }

}
