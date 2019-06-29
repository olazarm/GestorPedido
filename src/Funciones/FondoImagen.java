/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ajcolman
 */
public class FondoImagen extends JPanel{
   private Image img = null;
    String fondo = "/Recursos/fondo4.jpg";
   
    @Override
    protected void paintChildren(Graphics g){
        g.drawImage(img,0,0,getWidth(),getHeight(),null);
        super.paintChildren(g);
    }
   
    public void setImage(){
        if (fondo!=null) {
            try {
                img = new ImageIcon(getClass().getResource(fondo)).getImage();
            } catch (Exception e) {
                //JOptionPane.showMessageDialog(null, e);
                JOptionPane.showMessageDialog(null, "No se Localizó la Imagen de Fondo","Atención",JOptionPane.WARNING_MESSAGE);
            }
        }
    } 
}
