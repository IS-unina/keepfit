package it.keepfit.control;

import java.util.List;

import it.keepfit.entity.Esercizio;
import it.keepfit.entity.Protocollo;

public interface AbbonatoController {

    public List<Esercizio> leggiEsercizi();

    public Esercizio leggiDettaglioEsercizio(int id);

    public List<Protocollo> leggiProtocolli();

    public Protocollo leggiProtocollo(int id);
}
