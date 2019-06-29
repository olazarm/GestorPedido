/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Conexion.Server;
import Modelos.DaoLogin;
import Modelos.Login;
import Vistas.FrmLogin;
import Vistas.FrmPrincipal;
import javax.swing.JOptionPane;

/**
 *
 * @author ajcolman
 */
public class CLogin {
    Server con = new Server();
    Login  lg = new Login();
    public void comprobarCredenciales(FrmLogin login){
        String usuario  = login.txtUsuario.getText();
        String password = login.txtPassword.getText();
        if (!"".equals(usuario) && !"".equals(password)) {
            DaoLogin log = new DaoLogin();
            if (log.comprobarCredenciales(usuario,password)) {
                FrmPrincipal p = new FrmPrincipal();
                p.setVisible(true);
                login.dispose();
            }
        } else {
            JOptionPane.showConfirmDialog(null, "Ingrese sus credenciales para ingresar al sistema", "Atención!!!",JOptionPane.WARNING_MESSAGE);
        }
    
    }
}
