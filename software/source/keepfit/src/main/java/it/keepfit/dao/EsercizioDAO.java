package it.keepfit.dao;

import java.util.List;

import it.keepfit.entity.Esercizio;
import it.keepfit.entity.GruppoMuscolare;

public interface EsercizioDAO {

    public List<Esercizio> leggiEsercizi();

    public Esercizio leggiEsercizioById(int id);

    public List<Esercizio> leggiEsercizioByGruppo(GruppoMuscolare gruppoMuscolare);
}
