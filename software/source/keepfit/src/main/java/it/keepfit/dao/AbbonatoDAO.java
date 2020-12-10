package it.keepfit.dao;

import java.util.List;

import it.keepfit.entity.Abbonato;

public interface AbbonatoDAO {

    public List<Abbonato> leggiAbbonati(String nome, String cognome, String stato);

    public Abbonato leggiAbbonatoById(int id);

    public void creaAggiornaAbbonato(Abbonato nuovoAbbonato);

}
