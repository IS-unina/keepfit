package it.keepfit.dao;

import java.util.List;

import it.keepfit.entity.Protocollo;

public interface ProtocolloDAO {

    public List<Protocollo> leggiProtocolli();

    public Protocollo leggiProtocolloById(int id);
}
