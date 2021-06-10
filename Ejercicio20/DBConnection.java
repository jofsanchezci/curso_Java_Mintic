/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;
import java.sql.*;

/**
 *
 * @author Juan
 */
public class DBConnection {
         
    final static String USER = "root";
    final static String PASS = "1234";
    final static String URL = "jdbc:mysql://localhost/Fabrica" +
            "?serverTimeZone=UTC" + 
            "& useSSL=false";  
    
    public static Connection getConnection() throws SQLException{
       
        return DriverManager.getConnection(URL, USER, PASS);
        
    }
    
    
}
