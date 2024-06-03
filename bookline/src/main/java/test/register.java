/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class register extends JPanel {
    private final Image image;
    
    public  register() {
        image = new ImageIcon(getClass().getResource("/picture/ register.jpg")).getImage();
        
    }
    
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);
        
        Graphics2D gd = (Graphics2D)grphcs.create();
        
        gd.drawImage(image, 0, 0, getWidth(), getHeight(),null);
        gd.dispose();
    }
}
