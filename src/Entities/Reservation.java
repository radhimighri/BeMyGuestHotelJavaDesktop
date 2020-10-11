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
public class Reservation {
    private String idres;
    private String datereservation;
    private String datearrive;
    private String datedeparture;
    private String nombrepers;
    private String Client;

    public Reservation(String idres, String datereservation, String datearrive, String datedeparture, String nombrepers, String Client) {
        this.idres = idres;
        this.datereservation = datereservation;
        this.datearrive = datearrive;
        this.datedeparture = datedeparture;
        this.nombrepers = nombrepers;
        this.Client = Client;
    }

    public String getIdres() {
        return idres;
    }

    public void setIdres(String idres) {
        this.idres = idres;
    }

    public String getDatereservation() {
        return datereservation;
    }

    public void setDatereservation(String datereservation) {
        this.datereservation = datereservation;
    }

    public String getDatearrive() {
        return datearrive;
    }

    public void setDatearrive(String datearrive) {
        this.datearrive = datearrive;
    }

    public String getDatedeparture() {
        return datedeparture;
    }

    public void setDatedeparture(String datedeparture) {
        this.datedeparture = datedeparture;
    }

    public String getNombrepers() {
        return nombrepers;
    }

    public void setNombrepers(String nombrepers) {
        this.nombrepers = nombrepers;
    }

    public String getClient() {
        return Client;
    }

    public void setClient(String Client) {
        this.Client = Client;
    }


   

    
}
