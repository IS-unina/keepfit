/*
 * 
 */
package it.keepfit.dao;

import java.util.List;

import it.keepfit.entity.Protocollo;

// TODO: Auto-generated Javadoc
/**
 * The Interface ProtocolloDAO.
 */
public interface ProtocolloDAO {

    /**
     * Leggi protocolli.
     *
     * @return the list
     */
    public List<Protocollo> leggiProtocolli();

    /**
     * Leggi protocollo by id.
     *
     * @param id the id
     * @return the protocollo
     */
    public Protocollo leggiProtocolloById(int id);
}
