/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import clases.Conexion;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import java.sql.*;

/**
 *
 * @author ruben
 */
public class Administracion extends javax.swing.JFrame {

    /**
     * Creates new form Administracion
     */
    public Administracion() {

        initComponents();
        setSize(979, 591);
        setLocationRelativeTo(null);
        setResizable(false);
        ImageIcon wallpaper = new ImageIcon("src/images/Wallpaper2.png");
        Icon fondo = new ImageIcon(wallpaper.getImage().getScaledInstance(Labelfondo.getWidth(), Labelfondo.getHeight(), Image.SCALE_DEFAULT));

        Labelfondo.setIcon(fondo);

        this.repaint();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

    }

    boolean bandera = false;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        txt_mes1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_componentes = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        txt_mes2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_mes3 = new javax.swing.JTextField();
        Enviar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Labelfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 360, 250));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ventas de Abril");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 140, 20));

        txt_mes1.setBackground(new java.awt.Color(185, 234, 252));
        txt_mes1.setForeground(new java.awt.Color(19, 99, 169));
        getContentPane().add(txt_mes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 210, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("No. de componentes usados");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, -1, -1));

        txt_componentes.setBackground(new java.awt.Color(185, 234, 252));
        txt_componentes.setForeground(new java.awt.Color(19, 99, 169));
        getContentPane().add(txt_componentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 210, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Piezas y Precio");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 190, -1));

        area.setBackground(new java.awt.Color(185, 234, 252));
        area.setColumns(20);
        area.setForeground(new java.awt.Color(0, 0, 0));
        area.setRows(5);
        area.setText("\n");
        jScrollPane1.setViewportView(area);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 450, 360));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ventas de Mayo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 140, 20));
        jLabel4.getAccessibleContext().setAccessibleName("");

        txt_mes2.setBackground(new java.awt.Color(185, 234, 252));
        txt_mes2.setForeground(new java.awt.Color(19, 99, 169));
        getContentPane().add(txt_mes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 210, 30));
        txt_mes2.getAccessibleContext().setAccessibleName("");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ventas de Junio");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 140, 20));
        jLabel5.getAccessibleContext().setAccessibleName("");

        txt_mes3.setBackground(new java.awt.Color(185, 234, 252));
        txt_mes3.setForeground(new java.awt.Color(19, 99, 169));
        getContentPane().add(txt_mes3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 210, 30));
        txt_mes3.getAccessibleContext().setAccessibleName("");

        Enviar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Enviar.setText("Graficar");
        Enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarActionPerformed(evt);
            }
        });
        getContentPane().add(Enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 150, 90));

        jButton1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 40, 190, 80));
        getContentPane().add(Labelfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarActionPerformed

        bandera = true;

        repaint();

    }//GEN-LAST:event_EnviarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String componentes2 = txt_componentes.getText().trim();
        String area2 = area.getText().trim();

        if (!componentes2.equals("") && !area2.equals("")) {
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("insert into Contaduria values(?, ?, ?)");

                pst.setInt(1, 0);
                pst.setString(2, txt_componentes.getText().trim());
                pst.setString(3, area.getText().trim());

                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Datos actualizados con exito ");

                txt_componentes.setText("");
                area.setText("");

            } catch (Exception e) {
                System.out.println("Error al subir contaduria");
                JOptionPane.showMessageDialog(null, "Ocurrio un error al subir los datos ", "", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos  ", "", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Enviar;
    private javax.swing.JLabel Labelfondo;
    private javax.swing.JTextArea area;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField txt_componentes;
    private javax.swing.JTextField txt_mes1;
    private javax.swing.JTextField txt_mes2;
    private javax.swing.JTextField txt_mes3;
    // End of variables declaration//GEN-END:variables

    public void paint(Graphics g) {

        super.paint(g);

        if (bandera == true) {

            int mes1 = Integer.parseInt(txt_mes1.getText().trim());
            int mes2 = Integer.parseInt(txt_mes2.getText().trim());
            int mes3 = Integer.parseInt(txt_mes3.getText().trim());

            //mi 100%
            int Total = mes1 + mes2 + mes3;

            int gradosmes1 = mes1 * 360 / Total;
            int gradosmes2 = mes1 * 360 / Total;
            int gradosmes3 = mes3 * 360 / Total;

            g.setColor(new Color(255, 0, 0));
            g.fillArc(25, 80, 200, 200, 0, gradosmes1);
            g.fillRect(250, 120, 20, 20);
            g.drawString("Mes1", 275, 135);

            g.setColor(new Color(0, 255, 0));
            g.fillArc(25, 80, 200, 200, gradosmes1, gradosmes2);
            g.fillRect(250, 150, 20, 20);
            g.drawString("Mes2", 275, 165);

            g.setColor(new Color(0, 0, 255));
            g.fillArc(25, 80, 200, 200, gradosmes2 + gradosmes1, gradosmes3);
            g.fillRect(250, 180, 20, 20);
            g.drawString("Mes3", 275, 195);

        }

    }

}