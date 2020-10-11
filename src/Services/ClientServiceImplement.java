/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import DAO.ClientService;
import DB.ConnexionDB;
import Entities.Client;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Radhi Mighri
 */
public class ClientServiceImplement implements ClientService  {
    	Connection cn = ConnexionDB.getConnexion();
	Statement st = null;
	
	

	public void addClient(Client c) {
		String sql = "insert into `clients` (id_client,Nom,Prenom,Nationalite,typepiece,numpiece,addresse,tel) values(null,'"+c.getNom()+"','"+c.getPrenom()+"','"+c.getNationalite()+"','"+c.getTypePiece()+"','"+c.getNumPiece()+"','"+c.getAddresse()+"','"+c.getTel()+"')";
				
		try {
                    st = (Statement) cn.createStatement();
			st.executeUpdate(sql);

				
			}
		 catch (Exception e) {
			e.printStackTrace();
			System.out.print(e.getMessage());
		}
		
	}
        public   void delClient(String id) {
		String sql = "delete from `clients` where id_client=" + id;
		
		try {
			st = (Statement) cn.createStatement();
			st.executeUpdate(sql);

				
			}
		 catch (Exception e) {
			e.printStackTrace();
			System.out.print(e.getMessage());
		}
		

	} 
        public void EditClient(Client c,String id) {
                    String sql = "UPDATE `clients` SET `Nom`= '" + c.getNom() + "',`Prenom`= '"
                        + c.getPrenom() + "', `Nationalite`= '" + c.getAddresse() + "', `typepiece`='" + c.getTypePiece()
                        + "', `numpiece`= '" + c.getNumPiece() + "', `addresse`= '" + c.getAddresse()
                        + "', `tel`= '" + c.getTel()
                        + "'  WHERE id_client= " +id;
		try {
			st = (Statement) cn.createStatement();
			if (st.executeUpdate(sql) == 1) {

			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erreur update");

		}

	}              
        public ResultSet getAllClient() {
		String sql = "SELECT * FROM `clients`";
		try {
			st = (Statement) cn.createStatement();
			ResultSet rs = (ResultSet) st.executeQuery(sql);
		
		return rs;

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());

			return null;
		}

	}  
        public ResultSet getAllClientWhere(String etat) {
		String sql = "SELECT * FROM `clients` WHERE " + etat;
		try {
			st = (Statement) cn.createStatement();
			ResultSet rs = (ResultSet) st.executeQuery(sql);
		
		return rs;

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());

			return null;
		}

	}
                
}
