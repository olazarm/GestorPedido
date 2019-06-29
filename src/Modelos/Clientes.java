/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author ajcolman
 */
public class Clientes {
    private static int clien_id;
    private static String clien_nom;
    private static String clien_ape;
    private static int clien_doc;
    private static String clien_direc;
    private static String clien_tel;

    public static int getClien_id() {
        return clien_id;
    }

    public static void setClien_id(int clien_id) {
        Clientes.clien_id = clien_id;
    }

    public static String getClien_nom() {
        return clien_nom;
    }

    public static void setClien_nom(String clien_nom) {
        Clientes.clien_nom = clien_nom;
    }

    public static String getClien_ape() {
        return clien_ape;
    }

    public static void setClien_ape(String clien_ape) {
        Clientes.clien_ape = clien_ape;
    }

    public static int getClien_doc() {
        return clien_doc;
    }

    public static void setClien_doc(int clien_doc) {
        Clientes.clien_doc = clien_doc;
    }

    public static String getClien_direc() {
        return clien_direc;
    }

    public static void setClien_direc(String clien_direc) {
        Clientes.clien_direc = clien_direc;
    }

    public static String getClien_tel() {
        return clien_tel;
    }

    public static void setClien_tel(String clien_tel) {
        Clientes.clien_tel = clien_tel;
    }
    
    
}
