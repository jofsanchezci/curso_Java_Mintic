/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.*;

/*
 *
 * @author Juan
 */
public class Main {
    
    
    public static void main(String[] args) throws SQLException {
           
        try(Connection connection = DBConnection.getConnection()){
            
        if(connection != null){
            System.out.println("Conectado con la BD!");
        }
        
        // Create
        FabricaJDBC.insert(connection, 8, 10, "Argentina", "Luisa");
        
        // Read or Retrieve
        FabricaJDBC.getAll(connection);
        
        // Update
        FabricaJDBC.update(connection, 1, 33, "Colombia", "Claudia");
        
        // Delete
       //Fabrica.delete(connection, 4);
        
        FabricaJDBC.get(connection, 3 );
        
        
        System.out.println("Fin!");
        
        } catch (SQLException e){
            System.err.print(e);
        
        } finally {
            
            
            
        }
        
        
        
        
        
        
        
        
        
    }
}
