/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;


public class Proveedores {
    private static int prov_id;
    private static String prov_nom;
    private static String prov_ape;
    private static int prov_doc;
    private static String prov_direc;
    private static String prov_tel;
    
    public static int getProv_id() {
        return prov_id;
    }

    public static void setProv_id(int prov_id) {
        Proveedores.prov_id = prov_id;
    }

    public static String getProv_nom() {
        return prov_nom;
    }

    public static void setProv_nom(String prov_nom) {
        Proveedores.prov_nom = prov_nom;
    }

    public static String getProv_ape() {
        return prov_ape;
    }

    public static void setProv_ape(String prov_ape) {
        Proveedores.prov_ape = prov_ape;
    }

    public static int getProv_doc() {
        return prov_doc;
    }

    public static void setProv_doc(int prov_doc) {
        Proveedores.prov_doc = prov_doc;
    }

    public static String getProv_direc() {
        return prov_direc;
    }

    public static void setProv_direc(String prov_direc) {
        Proveedores.prov_direc = prov_direc;
    }

    public static String getProv_tel() {
        return prov_tel;
    }

    public static void setProv_tel(String prov_tel) {
        Proveedores.prov_tel = prov_tel;
    }
}
