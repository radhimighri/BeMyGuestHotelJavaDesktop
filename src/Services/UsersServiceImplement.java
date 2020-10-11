/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import DB.ConnexionDB;
import Entities.User;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Radhi Mighri
 */
public class UsersServiceImplement {
    Connection cn = ConnexionDB.getConnexion();
	Statement st = null;
	
	

	public void addUser(User u) {
		String sql = "insert into `utilisateur` (id_user,username,password,role) values(null,'"+u.getUsername()+"','"+u.getPasswd()+"','"+u.getRole()+"')";
				
		try {
			st = (Statement) cn.createStatement();
			st.executeUpdate(sql);

				
			}
		 catch (Exception e) {
			e.printStackTrace();
			System.out.print(e.getMessage());
		}
		
	}
        
	public   void delUser(String id) {
		String sql = "delete from `Utilisateur` where id_user=" + id;
		
		try {
			st = (Statement) cn.createStatement();
			st.executeUpdate(sql);

				
			}
		 catch (Exception e) {
			e.printStackTrace();
			System.out.print(e.getMessage());
		}
		

	}
        
        	public void EditUser(User u,String id) {
		String sql = "UPDATE utilisateur SET username='"+u.getUsername()+"',password='" + u.getPasswd()+ "',role='" + u.getRole()+ "' WHERE id_user=" +id;

		try {
			st = (Statement) cn.createStatement();
			if (st.executeUpdate(sql) == 1) {

			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erreur update");

		}

	}
                
                public ResultSet getAllUser() {
		String sql = "SELECT * FROM `Utilisateur`";
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
              
                
                
              public ResultSet getAllUserWhere(String etat) {
		String sql = "SELECT * FROM `Utilisateur` WHERE " + etat;
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

              public ResultSet Login(String username,String pwd) {
		String sql = "SELECT * FROM `Utilisateur` WHERE username='"+username+"' and password='"+pwd+"'";
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


