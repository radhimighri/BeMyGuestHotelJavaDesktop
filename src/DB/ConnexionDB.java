/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Radhi Mighri
 */
public class ConnexionDB {
	
	String url="jdbc:mysql://localhost/reception_hotel";
	String login="root";
	String password="";
	
	static Connection cn; // l'objet connection

	private ConnexionDB() {
		super();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			cn = DriverManager.getConnection(url, login, password);
		} 
		catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		
	}
	
	public static Connection getConnexion () {
		if (cn==null) {
			new ConnexionDB();
		}
		
		return cn;
	}

}
