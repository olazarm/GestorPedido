/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import Conexion.Server;
import com.mysql.jdbc.MySQLConnection;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author ajcolman
 */
public class DaoLogin {
    Server sv = new Server();
    Login  lg = new Login();
    
    public boolean comprobarCredenciales(String usuario,String password){
     boolean cnx = false;
        sv.Conexion();
        String sha1 = org.apache.commons.codec.digest.DigestUtils.sha1Hex(password);
        String sql = "select * from usuario where usua_loguin= '"+usuario+"' and usua_pass= '"+sha1+"'";
        try {
            sv.st = sv.con.prepareStatement(sql);
            sv.rs = sv.st.executeQuery();
            System.out.println(sql);
            if(sv.rs.next()){
               lg.setUsua_id(sv.rs.getInt(1));
               lg.setUsua_nombre(sv.rs.getString(2));
               lg.setUsua_ape(sv.rs.getString(3));
               lg.setUsua_loguin(sv.rs.getString(4));
               lg.setUsua_habi(sv.rs.getString(6));
               lg.setUsua_roles(sv.rs.getString(7));
               cnx = true;
            }else{
               JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrectos","Atención!!!",JOptionPane.WARNING_MESSAGE); 
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede realizar la conexión a la Base de datos","Error!!!",JOptionPane.ERROR_MESSAGE);
        }
        return cnx;
    }
}
