/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author Radhi Mighri
 */
public class Facture {
    private String idfac;
    private String datefac;
    private String montfac;
    private String client;

    public Facture(String idfac,String montfac, String datefac, String client) {
        this.idfac = idfac;
        this.datefac = datefac;
        this.montfac = montfac;
        this.client = client;
    }

    public String getIdfac() {
        return idfac;
    }

    public void setIdfac(String idfac) {
        this.idfac = idfac;
    }

    public String getDatefac() {
        return datefac;
    }

    public void setDatefac(String datefac) {
        this.datefac = datefac;
    }

    public String getMontfac() {
        return montfac;
    }

    public void setMontfac(String montfac) {
        this.montfac = montfac;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

   
    
}
