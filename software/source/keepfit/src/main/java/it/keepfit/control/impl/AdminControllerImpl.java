package it.keepfit.control.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.keepfit.control.AdminController;
import it.keepfit.dao.AbbonatoDAO;
import it.keepfit.entity.Abbonato;

@Component
public class AdminControllerImpl implements AdminController {

    @Autowired
    private AbbonatoDAO abbonatoDAO;

    @Override
    public void aggiungiAbbonato(Abbonato nuovoAbbonato) {

	if (nuovoAbbonato == null) {
	    throw new IllegalStateException("L'oggetto di tipo Abbonato è null");
	}
	if (nuovoAbbonato.getNome() == null || nuovoAbbonato.getCognome() == null) {
	    throw new IllegalStateException("L'oggetto di tipo Abbonato ha l'attributo nome o cognome null");
	}
	if (!nuovoAbbonato.getNome().isEmpty() && !nuovoAbbonato.getNome().matches("[a-z,A-Z]")) {
	    throw new IllegalStateException("Nome dell'abbonato non valido");
	}
	if (!nuovoAbbonato.getCognome().isEmpty() && !nuovoAbbonato.getCognome().matches("[a-z,A-Z]")) {
	    throw new IllegalStateException("Cognome dell'abbonato non valido");
	}

	abbonatoDAO.creaAggiornaAbbonato(nuovoAbbonato);
    }

    @Override
    public List<Abbonato> ricercaAbbonati(String nome, String cognome, String stato) {

	if (nome == null || cognome == null || stato == null) {
	    throw new IllegalStateException("Il parametro di ricerca è null");
	}
	List<Abbonato> abbonatiTrovati = new ArrayList<>();
	abbonatiTrovati = abbonatoDAO.leggiAbbonati(nome, cognome, stato);
	return abbonatiTrovati;
    }

    @Override
    public Abbonato ricercaAbbonato(int id) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void modificaAbbonato(Abbonato abbonato) {
	// TODO Auto-generated method stub

    }

    @Override
    public void promuoviAbbonatoAPremium(int id) {
	// TODO Auto-generated method stub

    }

    @Override
    public void disattivaAccountAbbonato(int id) {
	// TODO Auto-generated method stub

    }

    @Override
    public List<Abbonato> ricercaAbbonatiConAccount() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void rinnovaAbbonamentoPalestra(Abbonato abbonato) {
	// TODO Auto-generated method stub

    }

    @Override
    public void rinnovaAbbonamentoAccount(Abbonato abbonato) {
	// TODO Auto-generated method stub

    }

}
