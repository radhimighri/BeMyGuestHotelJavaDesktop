/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Date;

/**
 *
 * @author Radhi Mighri
 */
public class Client {
    private String idClient;
    private String Nom;
    private String Prenom;
    private String Nationalite;
    private String TypePiece;
    private String NumPiece;
    private String Addresse;
    private String Tel;

    public Client(String idClient, String Nom, String Prenom, String Nationalite, String TypePiece, String NumPiece, String Addresse, String Tel) {
        this.idClient = idClient;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Nationalite = Nationalite;
        this.TypePiece = TypePiece;
        this.NumPiece = NumPiece;
        this.Addresse = Addresse;
        this.Tel = Tel;
       
    }

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public String getNationalite() {
        return Nationalite;
    }

    public void setNationalite(String Nationalite) {
        this.Nationalite = Nationalite;
    }

    public String getTypePiece() {
        return TypePiece;
    }

    public void setTypePiece(String TypePiece) {
        this.TypePiece = TypePiece;
    }

    public String getNumPiece() {
        return NumPiece;
    }

    public void setNumPiece(String NumPiece) {
        this.NumPiece = NumPiece;
    }

    public String getAddresse() {
        return Addresse;
    }

    public void setAddresse(String Addresse) {
        this.Addresse = Addresse;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String Tel) {
        this.Tel = Tel;
    }
        
}
