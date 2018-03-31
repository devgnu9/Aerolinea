/*
 */
package aero_mariano;

import java.awt.Graphics;
import javax.swing.ImageIcon;
/**
 *
 * @author Mariano
 */
public class FondoOpcion extends javax.swing.JPanel 
{
 public FondoOpcion()
    {
        //           Largo/Alto
	this.setSize(400,300);
    }
    
    @ Override
    public void paintComponent(Graphics g)
	{
            ImageIcon imagenFondo = new ImageIcon(getClass().getResource("../Recursos/nubes.jpg"));
            g.drawImage(imagenFondo.getImage(),0,0,400,300, null);
            setOpaque(false);
            super.paintComponent(g);
	}
}//Clase FondoDeOpcion
