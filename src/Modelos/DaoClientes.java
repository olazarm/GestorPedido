/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import Conexion.Server;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ajcolman
 */
public class DaoClientes {

    Server sv = new Server();
    Clientes cl = new Clientes();
    DefaultTableModel modelo = new DefaultTableModel();

    public void listarClientes(JTable tabla) {
        tituloTabla(tabla);
        sv.Conexion();
        String sql = "select * from clientes";
        try {
            sv.st = sv.con.prepareStatement(sql);
            sv.rs = sv.st.executeQuery();
            System.out.println(sql);
            while (sv.rs.next()) {
                Object[] datos = new Object[5];
                datos[0] = sv.rs.getInt(4);
                datos[1] = sv.rs.getString(2) + " " + sv.rs.getString(3);
                datos[2] = sv.rs.getString(5);
                datos[3] = sv.rs.getString(6);
                datos[4] = sv.rs.getString(7);
                modelo.addRow(datos);
            }
            tabla.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede realizar la conexión a la Base de datos", "Error!!!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public boolean registrarCliente(int nroDoc, String naci, String nombres, String apellidos, String direccion, int telefono) {
        sv.Conexion();
        boolean band = false;
        String sql = "insert into clientes (clien_nom,clien_ape,clien_doc,clien_fech_nac,clien_direc,clien_tel) values ('"+nombres+"','"+apellidos+"',"+nroDoc+",DATE_FORMAT(STR_TO_DATE('"+naci+"','%d/%m/%Y'),'%Y-%m-%d'),'"+direccion+"',"+telefono+")";
        System.out.println(sql);
        try {
            band = true;
            sv.st = sv.con.prepareStatement(sql);
            /*sv.st.setString(1,nombres);
            sv.st.setString(2,apellidos);
            sv.st.setInt(3,nroDoc);
            sv.st.setString(4,naci);
            sv.st.setString(5,direccion);
            sv.st.setInt(6,telefono);*/
            sv.st.executeUpdate();
        } catch (Exception e) {
            band = false;
            JOptionPane.showMessageDialog(null, e,"Error!!!",JOptionPane.ERROR_MESSAGE);
        }
      return band;
    }
    private void tituloTabla(JTable tabla) {
        modelo.addColumn("Nro. de Documento");
        modelo.addColumn("Nombre y Apellido");
        modelo.addColumn("Fecha de Nacimiento");
        modelo.addColumn("Dirección");
        modelo.addColumn("Nro. de teléfono");
        tabla.setModel(modelo);
    }

}
