/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Conexion.Server;
import Modelos.DaoProveedores;
import Vistas.FrmRegProveedor;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import sun.invoke.empty.Empty;

public class CProveedores {
    
    Server con = new Server();
    DaoProveedores p = new DaoProveedores();
    JTextField fecha;
    
    public void listarProveedores(JTable tabla) {
        p.listarProveedores(tabla);
    }
    
    public void registrarProveedores(FrmRegProveedor prov) {
        int nroDoc = Integer.parseInt(prov.txtNroDoc.getText());
        String nombres = prov.txtNombres.getText();
        String apellidos = prov.txtApellidos.getText();
        String direccion = prov.txtDireccion.getText();
        int telefono;
        if (prov.txtTelefono.getText().isEmpty()) {
            telefono = 0;
        }else{
            telefono = Integer.parseInt(prov.txtTelefono.getText());
        }
        boolean band = true;
        if ("".equals(nroDoc)) {
            JOptionPane.showMessageDialog(null,"Debe ingresar el número de documento del proveedor");
            band = false;
        }
        if ("".equals(nombres)) {
            JOptionPane.showMessageDialog(null,"Debe ingresar el nombre del proveedor");
            band = false;
        }
        if ("".equals(apellidos)) {
            JOptionPane.showMessageDialog(null,"Debe ingresar el apellido del proveedor");
            band = false;
        }
        if (band==true) {
            if (p.registrarProveedor(nroDoc,nombres,apellidos,direccion,telefono)==true) {
                JOptionPane.showMessageDialog(null,"El proveedor ha sido registrado correctamente","Correcto!!!",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }


}
