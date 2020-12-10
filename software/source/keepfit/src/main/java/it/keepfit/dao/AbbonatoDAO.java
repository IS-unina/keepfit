package it.keepfit.dao;

import java.util.Date;
import java.util.List;

import it.keepfit.entity.Abbonato;

public interface AbbonatoDAO {

    public List<Abbonato> leggiAbbonati();

    public List<Abbonato> leggiAbbonatiByNome(String nome);

    public List<Abbonato> leggiAbbonatoByCognome(String cognome);

    public List<Abbonato> leggiAbbonatoByDataFine(Date dataFine);

    public Abbonato leggiAbbonatoById(int id);

}
