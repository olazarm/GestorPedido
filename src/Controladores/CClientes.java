/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Conexion.Server;
import Modelos.DaoClientes;
import Vistas.FrmRegClientes;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import sun.invoke.empty.Empty;

public class CClientes {

    Server con = new Server();
    DaoClientes c = new DaoClientes();
    JTextField fecha;

    public void listarClientes(JTable tabla) {
        c.listarClientes(tabla);
    }

    public void registrarClientes(FrmRegClientes clie) {
        int nroDoc = Integer.parseInt(clie.txtNroDoc.getText());
        String nombres = clie.txtNombres.getText();
        String apellidos = clie.txtApellidos.getText();
        String direccion = clie.txtDireccion.getText();
        String naci = ((JTextField) clie.txtFechNaci.getDateEditor().getUiComponent()).getText();
        System.out.println(naci);
        int telefono;
        if (clie.txtTelefono.getText().isEmpty()) {
            telefono = 0;
        }else{
            telefono = Integer.parseInt(clie.txtTelefono.getText());
        }
        boolean band = true;
        if ("".equals(nroDoc)) {
            JOptionPane.showMessageDialog(null,"Debe ingresar el número de documento del cliente");
            band = false;
        }
        if ("".equals(nombres)) {
            JOptionPane.showMessageDialog(null,"Debe ingresar el nombre del cliente");
            band = false;
        }
        if ("".equals(apellidos)) {
            JOptionPane.showMessageDialog(null,"Debe ingresar el apellido del cliente");
            band = false;
        }
        if (band==true) {
            if (c.registrarCliente(nroDoc,naci,nombres,apellidos,direccion,telefono)==true) {
                JOptionPane.showMessageDialog(null,"El cliente ha sido registrado correctamente","Correcto!!!",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    
    //aca vamos a crear la funcion en el controlado para modificar al cliente
}
