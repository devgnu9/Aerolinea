/*
PROYECTO FINAL DE PROGRAMACIÓN 1 

                            " A E R O L I N E A "
*/
package aero_mariano;
import Conexion.Conexion;

/**
 * @author Mariano
 */

public class Aero_Mariano 
{
    public static void main(String[] args) 
    {
        
        //Barra de carga
        cargaApp barra = new cargaApp();
        
        //--------------------------------------------------------------------        
        barra.setVisible(true);//Muestra el loading
        //Panel de la app
        aeroPanel panel = new aeroPanel();
        
        try 
        {
            /*Con este for se muestra el numero del porcentaje aumentando 
            dinamicamente*/
            for (int m = 0; m < 101; m++) 
            {
                Thread.sleep(40);
                barra.lblNumeroDeCarga.setText(Integer.toString(m) + "%");
                barra.BarraDeCarga.setValue(m);//Aumenta con color en base al %
                if (m == 100) 
                {
                    barra.setVisible(false);//Oculta la pantalla de carga
                    panel.setVisible(true);//Muestra el panel 
                }
            }
        }catch (Exception e) 
        {
        
        }
        
        
        
        
    }//Clase principal

}//Clase Padre
