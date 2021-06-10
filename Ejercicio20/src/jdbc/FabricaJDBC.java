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
public class FabricaJDBC {
    
  
     public static void get(Connection connection, int numero_fabrica) throws SQLException{
         
        String query = "SELECT * FROM Fabrica WHERE numero_fabrica=?"; 
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setInt(1, numero_fabrica);
        
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {            
          StringBuffer fabrica = new StringBuffer();
          fabrica.append("Numero Fabrica: " + rs.getInt("numero_fabrica"));
          fabrica.append("Numero empleados: " + rs.getInt("cantidad_empleados"));
          fabrica.append("Pais: " + rs.getString("pais"));
          fabrica.append("Gerente: " + rs.getString("gerente"));
          System.out.println(fabrica);
        }             
     }   

    public static void getAll(Connection connection) throws SQLException{
         
        String query = "SELECT * FROM Fabrica"; 
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query);
        
        while (rs.next()) {            
          StringBuffer fabrica = new StringBuffer();
          fabrica.append("numero Fabrica: " + rs.getInt("numero_fabrica"));
          fabrica.append(" numero empleados: " + rs.getInt("cantidad_empleados"));
          fabrica.append(" pais: " + rs.getString("pais"));
          fabrica.append(" gerente: " + rs.getString("gerente"));
          System.out.println(fabrica);
        }             
    }
    
     public static void insert(Connection connection, int numero_fabrica, int cantidad_empleados, String pais, String gerente ) throws SQLException {
          
          String insert = "INSERT INTO Fabrica VALUES (?, ?, ?, ?)";
          PreparedStatement ps = connection.prepareStatement(insert);
          ps.setInt(1, numero_fabrica);
          ps.setInt(2, cantidad_empleados);
          ps.setString(3, pais);
          ps.setString(4, gerente);
          
          if(ps.executeUpdate() > 0){
              System.out.println("Fila agregada!");
          };   
          
        } 
       
    public static void update (Connection connection,
            int numero_fabrica, 
            int cantidad_empleados, 
            String pais, String gerente) throws SQLException{
        
            String update = "UPDATE Fabrica SET cantidad_empleados=?, pais=?, gerente=? WHERE numero_fabrica = ?";
            PreparedStatement ps = connection.prepareStatement(update);
            ps.setInt(1, cantidad_empleados);
            ps.setString(2, pais);
            ps.setString(3, gerente);
            ps.setInt(4, numero_fabrica);
            
            if(ps.executeUpdate() > 0){
                System.out.println("Fila Actulizada!");
            }
            
    }       
    public static void delete(Connection connection, int numero_fabrica) throws SQLException{
            
            String delete = "DELETE FROM Fabrica WHERE numero_fabrica=?";
            PreparedStatement ps = connection.prepareStatement(delete);
            ps.setInt(1, numero_fabrica);
                        
            if(ps.executeUpdate() > 0){
                System.out.println("Fila eliminada!");
            }
        
    }        
                
}
