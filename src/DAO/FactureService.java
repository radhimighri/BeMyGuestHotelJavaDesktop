/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entities.Facture;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author Radhi Mighri
 */
public interface FactureService {
    
        public void addFacture(Facture f);
        public void delFacture(Facture f);
        public void EditFacture(Facture f);
        public ResultSet getAllFacture();
        public ResultSet getAllFactureWhere(String etat);

    
}
