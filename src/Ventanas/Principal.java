package Ventanas;

import java.sql.Connection;

import java.util.Date;
import java.text.SimpleDateFormat;
import Conexion.Conexion;
import com.sun.glass.events.KeyEvent;
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
        setSize(800, 550);
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
        Mensaje = new javax.swing.JLabel();
        Etiqueta_Clasificacion = new javax.swing.JLabel();
        Combo_Clasificacion = new javax.swing.JComboBox<>();
        Etiqueta_Interfaz = new javax.swing.JLabel();
        Combo_Interfaz = new javax.swing.JComboBox<>();
        Etiqueta_Estatus = new javax.swing.JLabel();
        Combo_Estatus = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        Area_Comentarios = new javax.swing.JTextArea();
        Etiqueta_Comentarios = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

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
        getContentPane().add(Combo_recursos);
        Combo_recursos.setBounds(30, 50, 110, 26);

        Etiqueta_Recurso.setForeground(new java.awt.Color(255, 255, 255));
        Etiqueta_Recurso.setText("Recurso:");
        getContentPane().add(Etiqueta_Recurso);
        Etiqueta_Recurso.setBounds(29, 23, 88, 16);

        Etiqueta_Horas.setForeground(new java.awt.Color(255, 255, 255));
        Etiqueta_Horas.setText("Horas:");
        getContentPane().add(Etiqueta_Horas);
        Etiqueta_Horas.setBounds(580, 20, 37, 16);

        Campo_Horas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_HorasActionPerformed(evt);
            }
        });
        Campo_Horas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Campo_HorasKeyTyped(evt);
            }
        });
        getContentPane().add(Campo_Horas);
        Campo_Horas.setBounds(580, 50, 53, 24);
        Campo_Horas.setColumns(1);

        Etiqueta_Descripcion.setForeground(new java.awt.Color(255, 255, 255));
        Etiqueta_Descripcion.setText("Descripción de la actividad:");
        getContentPane().add(Etiqueta_Descripcion);
        Etiqueta_Descripcion.setBounds(29, 101, 155, 16);

        Area_Descripcion.setColumns(2);
        Area_Descripcion.setRows(5);
        Area_Descripcion.setAutoscrolls(false);
        Area_Descripcion.setMaximumSize(new java.awt.Dimension(100, 200));
        Area_Descripcion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Area_DescripcionFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(Area_Descripcion);
        Area_Descripcion.setLineWrap(true);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(29, 123, 740, 83);

        Fecha.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Fecha);
        Fecha.setBounds(680, 40, 96, 26);

        Etiqueta_Fecha.setForeground(new java.awt.Color(255, 255, 255));
        Etiqueta_Fecha.setText("Fecha:");
        getContentPane().add(Etiqueta_Fecha);
        Etiqueta_Fecha.setBounds(680, 20, 50, 16);

        Boton_Guardar.setText("GUARDAR");
        Boton_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(Boton_Guardar);
        Boton_Guardar.setBounds(30, 400, 100, 32);

        Mensaje.setForeground(new java.awt.Color(221, 103, 33));
        getContentPane().add(Mensaje);
        Mensaje.setBounds(150, 400, 228, 18);

        Etiqueta_Clasificacion.setForeground(new java.awt.Color(255, 255, 255));
        Etiqueta_Clasificacion.setText("Clasificación:");
        getContentPane().add(Etiqueta_Clasificacion);
        Etiqueta_Clasificacion.setBounds(190, 20, 90, 20);

        Combo_Clasificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cambio", "Mejora", "Incidencia" }));
        getContentPane().add(Combo_Clasificacion);
        Combo_Clasificacion.setBounds(190, 50, 100, 26);

        Etiqueta_Interfaz.setForeground(new java.awt.Color(255, 255, 255));
        Etiqueta_Interfaz.setText("Interfaz:");
        getContentPane().add(Etiqueta_Interfaz);
        Etiqueta_Interfaz.setBounds(330, 20, 70, 16);

        Combo_Interfaz.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Egresos", "P. Siniestros", "P. Agentes", "Ingresos" }));
        getContentPane().add(Combo_Interfaz);
        Combo_Interfaz.setBounds(330, 50, 90, 26);

        Etiqueta_Estatus.setForeground(new java.awt.Color(255, 255, 255));
        Etiqueta_Estatus.setText("Estatus:");
        getContentPane().add(Etiqueta_Estatus);
        Etiqueta_Estatus.setBounds(460, 20, 60, 16);

        Combo_Estatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Abierta", "Cerrada" }));
        getContentPane().add(Combo_Estatus);
        Combo_Estatus.setBounds(460, 50, 80, 26);

        Area_Comentarios.setColumns(20);
        Area_Comentarios.setRows(5);
        jScrollPane2.setViewportView(Area_Comentarios);
        Area_Comentarios.setLineWrap(true);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(30, 260, 740, 83);

        Etiqueta_Comentarios.setForeground(new java.awt.Color(255, 255, 255));
        Etiqueta_Comentarios.setText("Comentarios:");
        getContentPane().add(Etiqueta_Comentarios);
        Etiqueta_Comentarios.setBounds(30, 230, 100, 16);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Vector.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(230, 210, 560, 320);

        jLabel1.setBackground(new java.awt.Color(27, 39, 57));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static String fecha() {
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("YYYY/MM/dd");
        return formatoFecha.format(fecha);
    }


    private void Campo_HorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo_HorasActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_Campo_HorasActionPerformed


    private void Boton_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_GuardarActionPerformed

        // TODO add your handling code here:
        String combo = Combo_recursos.getSelectedItem().toString();
        //DATOS
        guardaDatos(combo);
        

        
    }//GEN-LAST:event_Boton_GuardarActionPerformed
    // Colocar llamada a base de datos en una funciÃ³n

    private void guardaDatos(String combo) {
        String clasificacion = Combo_Clasificacion.getSelectedItem().toString();
        String interfaz = Combo_Interfaz.getSelectedItem().toString();
        String estatus = Combo_Estatus.getSelectedItem().toString();
        
       
                //Validacion del campo horas
           if (Campo_Horas.getText().trim().isEmpty()){
               Mensaje.setText("¡ Por favor llena el campo de horas !");
                
     
        }else{
        Mensaje.setVisible(false);
        switch (combo) {
            case "Reinchard":
                System.out.println("El combo es Reinchard");
                     
                    try (Connection cn = Conexion.conectar(); // Es mejor manejar las conecxiones en el TRY 
                            Statement st = cn.createStatement()) { // En esta version se cierra en automÃ¡tico la conexiÃ³n al finalizar el bloque TRY / CATCH
                        st.executeUpdate("INSERT INTO horas (FECHA,DESCRIPCION,CLASIFICACION,INTERFAZ,ESTATUS,COMENTARIOS,HRS_REINCHARD)"
                                + "VALUES ('" + Fecha.getText() + "','" + Area_Descripcion.getText() + "','" 
                                + clasificacion + "','"
                                + interfaz + "','"
                                + estatus + "','"
                                + Area_Comentarios.getText() + "','"
                                + Campo_Horas.getText() + "')");

                        JOptionPane.showMessageDialog(rootPane, "Datos guardados correctamente");

                    } catch (SQLException ex) {
                        Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                
            case "Misael":
                System.out.println("El combo es Misa");
                try (Connection cn = Conexion.conectar();
                        Statement st = cn.createStatement()) {
                     st.executeUpdate("INSERT INTO horas (FECHA,DESCRIPCION,CLASIFICACION,INTERFAZ,ESTATUS,COMENTARIOS,HRS_MISAEL)"
                                + "VALUES ('" + Fecha.getText() + "','" + Area_Descripcion.getText() + "','" 
                                + clasificacion + "','"
                                + interfaz + "','"
                                + estatus + "','"
                                + Area_Comentarios.getText() + "','"
                                + Campo_Horas.getText() + "')");

                        JOptionPane.showMessageDialog(rootPane, "Datos guardados correctamente");
                } catch (SQLException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case "Irving":
                System.out.println("El combo es Irving");
                try (Connection cn = Conexion.conectar();
                        Statement st = cn.createStatement()) {
                    st.executeUpdate("INSERT INTO horas (FECHA,DESCRIPCION,CLASIFICACION,INTERFAZ,ESTATUS,COMENTARIOS,HRS_IRVING)"
                                + "VALUES ('" + Fecha.getText() + "','" + Area_Descripcion.getText() + "','" 
                                + clasificacion + "','"
                                + interfaz + "','"
                                + estatus + "','"
                                + Area_Comentarios.getText() + "','"
                                + Campo_Horas.getText() + "')");

                        JOptionPane.showMessageDialog(rootPane, "Datos guardados correctamente");
                } catch (SQLException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case "Jesus":
                System.out.println("El combo es Jesus");
                try (Connection cn = Conexion.conectar();
                        Statement st = cn.createStatement()) {
                    st.executeUpdate("INSERT INTO horas (FECHA,DESCRIPCION,CLASIFICACION,INTERFAZ,ESTATUS,COMENTARIOS,HRS_JESUS)"
                                + "VALUES ('" + Fecha.getText() + "','" + Area_Descripcion.getText() + "','" 
                                + clasificacion + "','"
                                + interfaz + "','"
                                + estatus + "','"
                                + Area_Comentarios.getText() + "','"
                                + Campo_Horas.getText() + "')");

                        JOptionPane.showMessageDialog(rootPane, "Datos guardados correctamente");

                } catch (SQLException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                   
                }
                break;
        }
        
           }
    }
    private void Combo_recursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo_recursosActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_Combo_recursosActionPerformed

    private void Combo_recursosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Combo_recursosItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_Combo_recursosItemStateChanged

    private void Area_DescripcionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Area_DescripcionFocusGained
        // TODO add your handling code here:
       
    }//GEN-LAST:event_Area_DescripcionFocusGained

    private void Campo_HorasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Campo_HorasKeyTyped
        // TODO add your handling code here:
        
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)){
        getToolkit().beep();
       JOptionPane.showMessageDialog(rootPane, "Ingresa solo numeros por favor");

        }
         
    }//GEN-LAST:event_Campo_HorasKeyTyped

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
    private javax.swing.JTextArea Area_Comentarios;
    private javax.swing.JTextArea Area_Descripcion;
    private javax.swing.JButton Boton_Guardar;
    private javax.swing.JTextField Campo_Horas;
    private javax.swing.JComboBox<String> Combo_Clasificacion;
    private javax.swing.JComboBox<String> Combo_Estatus;
    private javax.swing.JComboBox<String> Combo_Interfaz;
    private javax.swing.JComboBox<String> Combo_recursos;
    private javax.swing.JLabel Etiqueta_Clasificacion;
    private javax.swing.JLabel Etiqueta_Comentarios;
    private javax.swing.JLabel Etiqueta_Descripcion;
    private javax.swing.JLabel Etiqueta_Estatus;
    private javax.swing.JLabel Etiqueta_Fecha;
    private javax.swing.JLabel Etiqueta_Horas;
    private javax.swing.JLabel Etiqueta_Interfaz;
    private javax.swing.JLabel Etiqueta_Recurso;
    private javax.swing.JLabel Fecha;
    private javax.swing.JLabel Mensaje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
