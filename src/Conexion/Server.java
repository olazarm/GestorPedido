/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ajcolman
 */
public class Server {
    
    public Connection con;
    public PreparedStatement st;
    public ResultSet rs;
    
    public boolean Conexion(){
        boolean estado = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stock","root","admin");
            estado = true;
            
        } catch(SQLException|ClassNotFoundException e){
            System.err.println("Error SERV-39: "+e);
            JOptionPane.showMessageDialog(null, e,"Error SERV-40",JOptionPane.ERROR_MESSAGE);
        }
        return estado;
    }
    
}
