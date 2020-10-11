/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import DB.ConnexionDB;
import Entities.Facture;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Radhi Mighri
 */
public class FactureServiceImplement {
    Connection cn = ConnexionDB.getConnexion();
	Statement st = null;
	
	

	public void addFacture(Facture f) {
		String sql = "insert into `facture` (id_facture,montant,datefacture,client) values(null,'"+f.getMontfac()+"','"+f.getDatefac()+"','"+f.getClient()+"')";
				
		try {
			st = (Statement) cn.createStatement();
			st.executeUpdate(sql);

				
			}
		 catch (Exception e) {
			e.printStackTrace();
			System.out.print(e.getMessage());
		}
		
	}
        
	public   void delFacture(String id) {
		String sql = "delete from `facture` where id_facture=" + id;
		
		try {
			st = (Statement) cn.createStatement();
			st.executeUpdate(sql);

				
			}
		 catch (Exception e) {
			e.printStackTrace();
			System.out.print(e.getMessage());
		}
		

	}
        
        public void EditFact(Facture f,String id) {
		String sql = "UPDATE facture SET montant='" + f.getMontfac()+ "',datefacture='" + f.getDatefac()+ "',client='"+f.getClient()+"' WHERE id_facture=" +id;

		try {
			st = (Statement) cn.createStatement();
			if (st.executeUpdate(sql) == 1) {

			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erreur update");

		}

	}
                
        public ResultSet getAllFacture() {
		String sql = "SELECT * FROM `facture`";
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
              
        public ResultSet getAllFactureWhere(String etat) {
		String sql = "SELECT * FROM `facture` WHERE " + etat;
		try {
                    System.out.println("Done\n"+sql);
			st = (Statement) cn.createStatement();
			ResultSet rs = (ResultSet) st.executeQuery(sql);
		
		return rs;

		} catch (SQLException e) {
			System.out.println(e.getMessage());

			return null;
		}

	}
        
	

	
                
}


