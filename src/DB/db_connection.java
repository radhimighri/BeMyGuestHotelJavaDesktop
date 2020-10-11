
package DB;

import java.net.Socket;

import java.sql.*;


public class db_connection {

    Connection connection;
    Statement statement;
    String SQL;
   
 String url;
    String username;
    String password;
    Socket client;
    int Port;
    String Host;

  
  public db_connection(String url, String username, String password, String Host, int Port) {

      
  this.url = url;
        this.username = username;
        this.password = password;
        this.Host = Host;
     
   this.Port = Port;
    }

   
 public Connection connexionDatabase() {

      
  try {
            Class.forName("com.mysql.jdbc.Driver");
          
  connection = DriverManager.getConnection(url, username, password);
        } catch (Exception e) 
{System.err.println(e);//
        }
        return connection;
    }

 
   public Connection closeconnexion() {

        try {
            connection.close();
        } catch (Exception e) {System.err.println(e);//
        }
        return connection;
    }

   

    

   

    
}
