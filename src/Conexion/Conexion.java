/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author jes_a
 */
public class Conexion {
    
        
    public static Connection conectar(){
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/horas_hdi", "root","");
            System.out.println("La conexion es correcta");
            return cn;
            
            
        } catch (SQLException e) {
            
            System.out.println("Error en la conexión local" + e);
        }
        return (null);
    }
    
}
