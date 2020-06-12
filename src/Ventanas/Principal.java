package Ventanas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.text.SimpleDateFormat;
import Conexion.Conexion;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

import java.util.logging.Level;
import java.util.logging.Logger;
 

public class Principal extends javax.swing.JFrame {
  public static String user;
  String password;
 

    public Principal() {
        initComponents();
        Fecha.setText(fecha());
        setSize(400,550);
        setResizable(false);
        setTitle("Control de horas Vector v1.0");
        setLocationRelativeTo(null);   
        
    
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Combo_recursos = new javax.swing.JComboBox<>();
        Etiqueta_Recurso = new javax.swing.JLabel();
        Etiqueta_Horas = new javax.swing.JLabel();
        Campo_Horas = new javax.swing.JTextField();
        Etiqueta_Descripcion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Area_Descripcion = new javax.swing.JTextArea();
        Fecha = new javax.swing.JLabel();
        Etiqueta_Fecha = new javax.swing.JLabel();
        Boton_Guardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Combo_recursos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reinchard", "Jesus", "Irving", "Misael" }));
        Combo_recursos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Combo_recursosItemStateChanged(evt);
            }
        });
        Combo_recursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo_recursosActionPerformed(evt);
            }
        });

        Etiqueta_Recurso.setText("Recurso:");

        Etiqueta_Horas.setText("Horas:");

        Campo_Horas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_HorasActionPerformed(evt);
            }
        });

        Etiqueta_Descripcion.setText("Descripción de la actividad:");

        Area_Descripcion.setColumns(20);
        Area_Descripcion.setRows(5);
        jScrollPane1.setViewportView(Area_Descripcion);

        Etiqueta_Fecha.setText("Fecha");

        Boton_Guardar.setText("GUARDAR");
        Boton_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_GuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Boton_Guardar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Etiqueta_Descripcion)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Combo_recursos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Etiqueta_Recurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addComponent(Etiqueta_Fecha)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Etiqueta_Horas)
                                    .addComponent(Campo_Horas, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Etiqueta_Recurso)
                    .addComponent(Etiqueta_Horas)
                    .addComponent(Etiqueta_Fecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Combo_recursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Campo_Horas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(Etiqueta_Descripcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(Boton_Guardar)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    public static String fecha (){
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("YYYY/MM/dd");
        return formatoFecha.format(fecha);
    }
    
    
    private void Campo_HorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo_HorasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Campo_HorasActionPerformed
 
        
 
    private void Boton_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_GuardarActionPerformed
      // TODO add your handling code here:
        Connection cn = Conexion.conectar();
       
        String combo = Combo_recursos.getSelectedItem().toString();
      
         if (Campo_Horas != null){
        //JOptionPane.showMessageDialog(rootPane, "Llena el campo de horas por favor");
              throw new ArithmeticException("Llena el campo de horas por favor");

           }
        
        
        
       //System.out.println(combo);
      switch (combo) {
          case "Reinchard":
              System.out.println("El combo es Reinchard");
              try {
                  Statement st = cn.createStatement();
                  st.executeUpdate("INSERT INTO horas (FECHA,DESCRIPCION,HRS_REINCHARD)"
                          + "VALUES ('"+Fecha.getText()+"','"+Area_Descripcion.getText()+"','"+Campo_Horas.getText()+"')");
                  JOptionPane.showMessageDialog(rootPane, "Datos guardados correctamente");
              } catch (SQLException ex) {
                  Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
              } break;
          case "Misael":
              System.out.println("El combo es el Misa");
              try {
                  Statement st = cn.createStatement();
                  st.executeUpdate("INSERT INTO horas (FECHA,DESCRIPCION,HRS_MISAEL)"
                          + "VALUES ('"+Fecha.getText()+"','"+Area_Descripcion.getText()+"','"+Campo_Horas.getText()+"')");
                  JOptionPane.showMessageDialog(rootPane, "Datos guardados correctamente");
              } catch (SQLException ex) {
                  Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
              } 
              break;
          case "Irving":
              System.out.println("El combo es Irving");
              try {
                  Statement st = cn.createStatement();
                  st.executeUpdate("INSERT INTO horas (FECHA,DESCRIPCION,HRS_IRVING)"
                          + "VALUES ('"+Fecha.getText()+"','"+Area_Descripcion.getText()+"','"+Campo_Horas.getText()+"')");
                  JOptionPane.showMessageDialog(rootPane, "Datos guardados correctamente");
              } catch (SQLException ex) {
                  Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
              } 
              break;
          case "Jesus":
              System.out.println("El combo es Jesus");
              try {
                  Statement st = cn.createStatement();
                  st.executeUpdate("INSERT INTO horas (FECHA,DESCRIPCION,HRS_JESUS)"
                          + "VALUES ('"+Fecha.getText()+"','"+Area_Descripcion.getText()+"','"+Campo_Horas.getText()+"')");
                  JOptionPane.showMessageDialog(rootPane, "Datos guardados correctamente");
                  
                  
              } catch (SQLException ex) {
                  Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
              } break;
          default:
              break;
              
          
      }
        
        
 
        
        
        
        
        
        
        
    }//GEN-LAST:event_Boton_GuardarActionPerformed

    private void Combo_recursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo_recursosActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_Combo_recursosActionPerformed

    private void Combo_recursosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Combo_recursosItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_Combo_recursosItemStateChanged
       


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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Area_Descripcion;
    private javax.swing.JButton Boton_Guardar;
    private javax.swing.JTextField Campo_Horas;
    private javax.swing.JComboBox<String> Combo_recursos;
    private javax.swing.JLabel Etiqueta_Descripcion;
    private javax.swing.JLabel Etiqueta_Fecha;
    private javax.swing.JLabel Etiqueta_Horas;
    private javax.swing.JLabel Etiqueta_Recurso;
    private javax.swing.JLabel Fecha;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
