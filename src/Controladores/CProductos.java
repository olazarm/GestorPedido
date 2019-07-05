/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Conexion.Server;
import Modelos.DaoProductos;
import Vistas.FrmRegProductos;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import sun.invoke.empty.Empty;

public class CProductos {
    Server con = new Server();
    DaoProductos p = new DaoProductos();
    JTextField fecha;

    public void listarProductos(JTable tabla) {
        p.listarProductos(tabla);
    }
    
    public void registrarProductos(FrmRegProductos prod) {
        String descri = prod.txtDescri.getText();
        int stock = Integer.parseInt(prod.txtStock.getText());
        int comp = Integer.parseInt(prod.txtComp.getText());
        int vent = Integer.parseInt(prod.txtVent.getText());
        int tipr = Integer.parseInt(prod.txtTipr.getText());
        boolean band = true;
        if ("".equals(descri)) {
            JOptionPane.showMessageDialog(null,"Debe ingresar la descripción del producto");
            band = false;
        }
        if ("".equals(stock)) {
            JOptionPane.showMessageDialog(null,"Debe ingresar la cantidad de articulos en stock del producto");
            band = false;
        }
        if ("".equals(comp)) {
            JOptionPane.showMessageDialog(null,"Debe ingresar el precio de compra del producto");
            band = false;
        }
        if ("".equals(vent)) {
            JOptionPane.showMessageDialog(null,"Debe ingresar el precio de venta del producto");
            band = false;
        }
        if ("".equals(tipr)) {
            JOptionPane.showMessageDialog(null,"Debe ingresar el codigo de tipo de producto");
            band = false;
        }
        if (band==true) {
            if (p.registrarProducto(descri,stock,comp, vent, tipr)==true) {
                JOptionPane.showMessageDialog(null,"El producto ha sido registrado correctamente","Correcto!!!",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
