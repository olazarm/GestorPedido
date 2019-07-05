/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Conexion.Server;
import Modelos.DaoUsuarios;
import Vistas.FrmRegUsuarios;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import sun.invoke.empty.Empty;

public class CUsuarios {
    Server con = new Server();
    DaoUsuarios u = new DaoUsuarios();
    JTextField fecha;
    
    public void listarUsuarios(JTable tabla) {
        u.listarUsuarios(tabla);
    }
    
    public void registrarUsuarios(FrmRegUsuarios usua) {
        String nombres = usua.txtNombres.getText();
        String apellidos = usua.txtApellidos.getText();
        String loguin = usua.txtLoguin.getText();
        String pass = usua.txtPass.getText();
        String roles = usua.txtRoles.getText();
        String habi= usua.txtHabi.getText();
        /*if (usua.txtHabi.getText().isEmpty()) {
            habi = "S";
        }else{
            habi = usua.txtHabi.getText();
        }*/
        boolean band = true;
        if ("".equals(nombres)) {
            JOptionPane.showMessageDialog(null,"Debe ingresar el nombre del usuario");
            band = false;
        }
        if ("".equals(apellidos)) {
            JOptionPane.showMessageDialog(null,"Debe ingresar el apellido del usuario");
            band = false;
        }
        if ("".equals(loguin)) {
            JOptionPane.showMessageDialog(null,"Debe ingresar el nombre de usuario del usuario");
            band = false;
        }
        if ("".equals(pass)) {
            JOptionPane.showMessageDialog(null,"Debe ingresar una contraseña para el usuario");
            band = false;
        }
        if ("".equals(roles)) {
            JOptionPane.showMessageDialog(null,"Debe ingresar el rol del usuario");
            band = false;
        }
        if (band==true) {
            if (u.registrarUsuario(nombres,apellidos,loguin, pass, habi, roles)==true) {
                JOptionPane.showMessageDialog(null,"El usuario ha sido registrado correctamente","Correcto!!!",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    
}
