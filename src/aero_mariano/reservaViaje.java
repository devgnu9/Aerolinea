package aero_mariano;
import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/*
 */

/**
 *
 * @author Mariano
 */
public class reservaViaje extends javax.swing.JFrame 
{
    /**
     * Creates new form reservaViaje
     */
    public reservaViaje() {
        initComponents();
        //Pone un icono en la barra de tareas
        setIconImage(new ImageIcon(getClass().getResource("../Recursos/AvionIcono.png")).getImage());
    }
    
    public void LimpiarCajasRegistro()
    {
        txtfDestinoClaseNormal.setText("");
        txtfNombreClaseNormal.setText("");
        txtfApellidoPClaseNormal.setText("");
        txtfApellidoMClaseNormal.setText("");
        txtfEdadClaseNormal.setText("");
        txtfSexoClaseNormal.setText("");
        txtfAsientoClaseNormal.setText("");
    }
    
    /*public void ObtenerTexto()
    {
       String clase,destino,precio,nombre,apellido_p,apellido_m,edad,sexo;
       
       clase = txtfClaseClaseNormal.getText();
       destino = txtfDestinoClaseNormal.getText();
       precio = txtfPrecioClaseNormal.getText();
       nombre = txtfNombreClaseNormal.getText();
       apellido_p = txtfApellidoPClaseNormal.getText();
       apellido_m = txtfApellidoMClaseNormal.getText();
       edad = txtfEdadClaseNormal.getText();
       sexo = txtfSexoClaseNormal.getText();
    }*/
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblEdadClaseNormal = new javax.swing.JLabel();
        lblNombreClaseNormal = new javax.swing.JLabel();
        txtfSexoClaseNormal = new javax.swing.JTextField();
        txtfEdadClaseNormal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnReservarClaseNormal = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblClaseNormal = new javax.swing.JLabel();
        txtfClaseClaseNormal = new javax.swing.JTextField();
        lblSexoClaseNormal = new javax.swing.JLabel();
        lblPrecioClaseNormal = new javax.swing.JLabel();
        txtfPrecioClaseNormal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtfNombreClaseNormal = new javax.swing.JTextField();
        lblApellidoPaternoClaseNormal = new javax.swing.JLabel();
        txtfApellidoPClaseNormal = new javax.swing.JTextField();
        lblApellidoMaternoClaseNormal = new javax.swing.JLabel();
        txtfApellidoMClaseNormal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtfDestinoClaseNormal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtfAsientoClaseNormal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("TimeBurner", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Aire-Lines");

        jLabel2.setFont(new java.awt.Font("TimeBurner", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("--Registro--");

        lblEdadClaseNormal.setText("Edad:");

        lblNombreClaseNormal.setText("Nombre:");

        txtfSexoClaseNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfSexoClaseNormalActionPerformed(evt);
            }
        });

        txtfEdadClaseNormal.setText("00");
        txtfEdadClaseNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfEdadClaseNormalActionPerformed(evt);
            }
        });

        jLabel5.setText("años");

        btnReservarClaseNormal.setText("Reservar");
        btnReservarClaseNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarClaseNormalActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblClaseNormal.setText("Clase:");

        txtfClaseClaseNormal.setEditable(false);
        txtfClaseClaseNormal.setText("Clase Normal");

        lblSexoClaseNormal.setText("Sexo:");

        lblPrecioClaseNormal.setText("Precio:");

        txtfPrecioClaseNormal.setEditable(false);
        txtfPrecioClaseNormal.setText("1000");
        txtfPrecioClaseNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfPrecioClaseNormalActionPerformed(evt);
            }
        });

        jLabel10.setText("$");

        txtfNombreClaseNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfNombreClaseNormalActionPerformed(evt);
            }
        });

        lblApellidoPaternoClaseNormal.setText("Apellido Paterno:");

        txtfApellidoPClaseNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfApellidoPClaseNormalActionPerformed(evt);
            }
        });

        lblApellidoMaternoClaseNormal.setText("Apellido Materno:");

        txtfApellidoMClaseNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfApellidoMClaseNormalActionPerformed(evt);
            }
        });

        jLabel3.setText("[H] Hombre -- [M] Mujer");

        jLabel4.setText("Destino:");

        jLabel7.setText("Asiento:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel6)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblNombreClaseNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtfNombreClaseNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblApellidoPaternoClaseNormal)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtfApellidoPClaseNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblPrecioClaseNormal)
                                        .addGap(74, 74, 74)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtfPrecioClaseNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnReservarClaseNormal)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnCancelar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblApellidoMaternoClaseNormal)
                                            .addComponent(lblEdadClaseNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblSexoClaseNormal))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtfEdadClaseNormal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtfApellidoMClaseNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtfSexoClaseNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel3)))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtfAsientoClaseNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(lblClaseNormal)
                                        .addGap(74, 74, 74)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtfDestinoClaseNormal)
                                            .addComponent(txtfClaseClaseNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(263, 263, 263))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel2)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClaseNormal)
                    .addComponent(txtfClaseClaseNormal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtfDestinoClaseNormal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtfAsientoClaseNormal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPrecioClaseNormal)
                        .addComponent(txtfPrecioClaseNormal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombreClaseNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfNombreClaseNormal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidoPaternoClaseNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfApellidoPClaseNormal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidoMaternoClaseNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfApellidoMClaseNormal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEdadClaseNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfEdadClaseNormal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSexoClaseNormal)
                    .addComponent(txtfSexoClaseNormal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReservarClaseNormal)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        
        /*-------------------------------------------------------------------*/
        /*-------------- BOTON DE CANCELAR RESERVACION  ---------------------*/
        /*-------------------------------------------------------------------*/
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnReservarClaseNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarClaseNormalActionPerformed
        
        /*-------------------------------------------------------------------*/
        /*----------------------- BOTON DE RESERVA  -------------------------*/
        /*-------------------------------------------------------------------*/
         
       //Instancia
       Conexion guardar = new Conexion();
       //Objeto
       Connection conexion = guardar.conexionDB();
       String sql="";
       
       String clase,destino,asiento,precio,nombre,apellido_p,apellido_m,edad,sexo;
       
       clase = txtfClaseClaseNormal.getText();
       destino = txtfDestinoClaseNormal.getText();
       asiento =txtfAsientoClaseNormal.getText();
       precio = txtfPrecioClaseNormal.getText();
       nombre = txtfNombreClaseNormal.getText();
       apellido_p = txtfApellidoPClaseNormal.getText();
       apellido_m = txtfApellidoMClaseNormal.getText();
       edad = txtfEdadClaseNormal.getText();
       sexo = txtfSexoClaseNormal.getText();
       //ObtenerTexto();
       
       sql = "INSERT INTO reservaciones (clase,destino,asiento,precio,nombre,apellido_p,apellido_m,edad,sexo) VALUES (?,?,?,?,?,?,?,?,?)";
       
        try 
        {
            PreparedStatement orden = conexion.prepareStatement(sql);
            orden.setString(1,clase);
            orden.setString(2,destino);
            orden.setString(3,asiento);
            orden.setString(4,precio);
            orden.setString(5,nombre);
            orden.setString(6,apellido_p);
            orden.setString(7,apellido_m);
            orden.setString(8,edad);
            orden.setString(9,sexo);
            
            int m = orden.executeUpdate(); //Si se guardo exitosamente se guarda un 1
            
            if (m > 0) 
            {
                JOptionPane.showMessageDialog(null,"Registro EXITOSO");
                LimpiarCajasRegistro(); //Limpia los campos
            }
            
        } catch (SQLException ex) 
        {
            Logger.getLogger(reservaViaje.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_btnReservarClaseNormalActionPerformed

    private void txtfSexoClaseNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfSexoClaseNormalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfSexoClaseNormalActionPerformed

    private void txtfEdadClaseNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfEdadClaseNormalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfEdadClaseNormalActionPerformed

    private void txtfPrecioClaseNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfPrecioClaseNormalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfPrecioClaseNormalActionPerformed

    private void txtfNombreClaseNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfNombreClaseNormalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfNombreClaseNormalActionPerformed

    private void txtfApellidoPClaseNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfApellidoPClaseNormalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfApellidoPClaseNormalActionPerformed

    private void txtfApellidoMClaseNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfApellidoMClaseNormalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfApellidoMClaseNormalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(reservaViaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reservaViaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reservaViaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reservaViaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reservaViaje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnReservarClaseNormal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblApellidoMaternoClaseNormal;
    private javax.swing.JLabel lblApellidoPaternoClaseNormal;
    private javax.swing.JLabel lblClaseNormal;
    private javax.swing.JLabel lblEdadClaseNormal;
    private javax.swing.JLabel lblNombreClaseNormal;
    private javax.swing.JLabel lblPrecioClaseNormal;
    private javax.swing.JLabel lblSexoClaseNormal;
    private javax.swing.JTextField txtfApellidoMClaseNormal;
    private javax.swing.JTextField txtfApellidoPClaseNormal;
    private javax.swing.JTextField txtfAsientoClaseNormal;
    private javax.swing.JTextField txtfClaseClaseNormal;
    private javax.swing.JTextField txtfDestinoClaseNormal;
    private javax.swing.JTextField txtfEdadClaseNormal;
    private javax.swing.JTextField txtfNombreClaseNormal;
    private javax.swing.JTextField txtfPrecioClaseNormal;
    private javax.swing.JTextField txtfSexoClaseNormal;
    // End of variables declaration//GEN-END:variables
}
