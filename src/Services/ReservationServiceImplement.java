/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import DB.ConnexionDB;
import Entities.Reservation;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Radhi Mighri
 */
public class ReservationServiceImplement {
    Connection cn = ConnexionDB.getConnexion();
	Statement st = null;
	
	

	public void addReservation(Reservation r) {
		String sql = "insert into `reservation` (id_res,dateres,datearr,datedep,nbrepersonne,Client) values(null,'"+r.getDatereservation()+"','"+r.getDatearrive()+"','"+r.getDatedeparture()+"','"+r.getNombrepers()+"','"+r.getClient()+"')";
				
		try {
			st = (Statement) cn.createStatement();
			st.executeUpdate(sql);

				
			}
		 catch (Exception e) {
			e.printStackTrace();
			System.out.print(e.getMessage());
		}
		
	}
        
	public   void delReservation(String id) {
		String sql = "delete from `reservation` where id_res=" + id;
		
		try {
			st = (Statement) cn.createStatement();
			st.executeUpdate(sql);

				
			}
		 catch (Exception e) {
			e.printStackTrace();
			System.out.print(e.getMessage());
		}
		

	}
        
        	public void EditReservation(Reservation r,String id) {
		String sql = "UPDATE reservation SET dateres='" + r.getDatereservation()+ "',datearr='" + r.getDatearrive()+ "',datedep='" + r.getDatedeparture()+ "',nbrepersonne='" + r.getNombrepers()+ "' WHERE id_res=" +id;

		try {
			st = (Statement) cn.createStatement();
			if (st.executeUpdate(sql) == 1) {

			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erreur update");

		}

	}
                
                public ResultSet getAllReservation() {
		String sql = "SELECT * FROM `reservation`";
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
              
                
                
              public ResultSet getAllReservationWhere(String etat) {
		String sql = "SELECT * FROM `reservation` WHERE " + etat;
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


