/*
 */
package Conexion;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Mariano
 */
public class Conexion 
{
    Connection conexion = null;
    
    public Connection conexionDB()
    {
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            
            String usuario = "mariano";
            String contrasena = "mariano_final";
            
            conexion = DriverManager.getConnection("jdbc:derby://localhost:1527/aerolinea", usuario, contrasena);
            
            //JOptionPane.showMessageDialog(null,"Conexion establecida");
                
            
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Error en la conexion" + ex.getMessage());
        }
        return conexion;
    }
    
    
    public ResultSet consulta(String consulta)
    {
        ResultSet respuesta = null;
        
        try
        {
            
            PreparedStatement orden = conexion.prepareStatement(consulta);
            
            respuesta = orden.executeQuery();
            
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Error, contacte a Mariano" + ex.getMessage());
        }
        
        return respuesta;
    }
    
    
    
    
    
}
