package it.keepfit.control;

import java.util.List;

import it.keepfit.entity.Abbonato;

public interface AdminController {

    public void aggiungiAbbonato(Abbonato nuovoAbbonato);

    public List<Abbonato> ricercaAbbonati(String nome, String cognome, String stato);

    public Abbonato ricercaAbbonato(int id);

    public void modificaAbbonato(Abbonato abbonato);

    public void promuoviAbbonatoAPremium(int id);

    public void disattivaAccountAbbonato(int id);

    public List<Abbonato> ricercaAbbonatiConAccount();

    public void rinnovaAbbonamentoPalestra(Abbonato abbonato);

    public void rinnovaAbbonamentoAccount(Abbonato abbonato);
}
