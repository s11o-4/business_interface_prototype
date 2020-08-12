package clases;
import java.sql.*;


public class Conexion {
    //Conexion Local
    
   public static Connection conectar(){
       
       try{
           
           Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/Amplificadores","root","");
           return cn;
           
       } catch(SQLException e){
           
           System.err.println("Ha ocurrido un error en la conexion local " + e);
           
       }
       
       return(null);
       
   }
    
}
