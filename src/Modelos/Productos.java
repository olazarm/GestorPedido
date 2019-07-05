/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author tt
 */
public class Productos {
    private static int prod_id;
    private static String prod_descri;
    private static int prod_stock;
    private static int prod_precio_comp;
    private static int prod_precio_vent;
    private static int prod_tipr_id;
    
   public static int getProd_id() {
        return prod_id;
    }

    public static void setProd_id(int prod_id) {
        Productos.prod_id = prod_id;
    }

    public static String getProd_descri() {
        return prod_descri;
    }

    public static void setProd_descri(String prod_descri) {
        Productos.prod_descri = prod_descri;
    }
    public static int getProd_stock() {
        return prod_stock;
    }

    public static void setProd_stock(int prod_stock) {
        Productos.prod_stock = prod_stock;
    }
    
    public static int getProd_precio_comp() {
        return prod_precio_comp;
    }

    public static void setProd_precio_comp(int prod_precio_comp) {
        Productos.prod_precio_comp = prod_precio_comp;
    }
    
    public static int getProd_precio_vent() {
        return prod_precio_vent;
    }

    public static void setProd_precio_vent(int prod_precio_vent) {
        Productos.prod_precio_vent = prod_precio_vent;
    }
    
    public static int getProd_tipr_id() {
        return prod_tipr_id;
    }

    public static void setProd_tipr_id(int prod_tipr_id) {
        Productos.prod_tipr_id = prod_tipr_id;
    }
}
