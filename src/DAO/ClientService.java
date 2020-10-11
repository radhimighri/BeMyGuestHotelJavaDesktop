/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entities.Client;
import java.sql.ResultSet;

/**
 *
 * @author Radhi Mighri
 */
public interface ClientService {

    /**
     *
     * @param c
     * @return
     */
    public void addClient(Client c);
    public void delClient(String id);
    public void  EditClient(Client c,String id);
    public ResultSet getAllClient();
    public ResultSet getAllClientWhere(String etat);
    
}
