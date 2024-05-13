package clases;
import java.sql.*;

public class Conexion {
    
   public static Connection conectar(){           
      final String url = "jdbc:mariadb://localhost:3306/mfm";
      final String user = "root";
      final String pass = "4240";
       
       try{
           Connection cn = DriverManager.getConnection(url, user, pass);           
           return cn;
           
       } catch(SQLException e){
           System.err.println("Ha ocurrido un error en la conexion local " + e);
           
       }
       return(null); 
   }
}
