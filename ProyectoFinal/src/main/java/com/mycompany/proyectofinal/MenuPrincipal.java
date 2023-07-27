package com.mycompany.proyectofinal;

import java.awt.BorderLayout;

/**
 *
 * @author Dabney Arosemena Alpízar
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form ModuloRutinas
     */
    public MenuPrincipal() {
        initComponents();
        PanelUsuario();
    }

    //Método para que aparezca vacía la ventana de Inicio
    public void Inicio(){
        MenuPrincipal.this.setVisible(false);
        new Inicio().setVisible(true);
      }  
    //Método para que aparezca vacía la ventana Usuarios
    public void PanelUsuario(){
        PanelUsuario pu = new PanelUsuario();
        pu.setSize(1000,450);
        pu.setLocation(0,0);
        
        PanelInterior.removeAll();
        PanelInterior.add(pu, BorderLayout.CENTER);
        PanelInterior.revalidate();
        PanelInterior.repaint();  
    }
    //Método para que aparezca vacía la ventana Horarios
    /*public void PanelHorario(){
        PanelHorario ph = new PanelHorario();
        ph.setSize(1000,450);
        ph.setLocation(0,0);
        
        PanelInterior.removeAll();
        PanelInterior.add(ph, BorderLayout.CENTER);
        PanelInterior.revalidate();
        PanelInterior.repaint();  
    }*/
    //Método para que aparezca vacía la ventana Instructores
    public void PanelInstructor(){
        PanelInstructor pi = new PanelInstructor();
        pi.setSize(1000,450);
        pi.setLocation(0,0);
        
        PanelInterior.removeAll();
        PanelInterior.add(pi, BorderLayout.CENTER);
        PanelInterior.revalidate();
        PanelInterior.repaint();  
    }
    //Método para que aparezca vacía la ventana Instructores
    public void PanelRutina(){
        PanelRutina pr = new PanelRutina();
        pr.setSize(1000,450);
        pr.setLocation(0,0);
        
        PanelInterior.removeAll();
        PanelInterior.add(pr, BorderLayout.CENTER);
        PanelInterior.revalidate();
        PanelInterior.repaint();  
    }
    //Método para que aparezca vacía la ventana Clases
    public void PanelClase(){
        PanelClase pc = new PanelClase();
        pc.setSize(1000,450);
        pc.setLocation(0,0);
        
        PanelInterior.removeAll();
        PanelInterior.add(pc, BorderLayout.CENTER);
        PanelInterior.revalidate();
        PanelInterior.repaint();  
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelInterior = new javax.swing.JPanel();
        BotonSalir = new javax.swing.JButton();
        BotonClases = new javax.swing.JButton();
        BotonRutinas = new javax.swing.JButton();
        BotonInstructores = new javax.swing.JButton();
        BotonHorarios = new javax.swing.JButton();
        BotonUsuarios = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelInterior.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelInteriorLayout = new javax.swing.GroupLayout(PanelInterior);
        PanelInterior.setLayout(PanelInteriorLayout);
        PanelInteriorLayout.setHorizontalGroup(
            PanelInteriorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
        );
        PanelInteriorLayout.setVerticalGroup(
            PanelInteriorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        getContentPane().add(PanelInterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 980, 430));

        BotonSalir.setBackground(new java.awt.Color(246, 104, 68));
        BotonSalir.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        BotonSalir.setForeground(new java.awt.Color(255, 255, 255));
        BotonSalir.setText("Cerrar Sesión");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(BotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 190, 60));

        BotonClases.setBackground(new java.awt.Color(246, 104, 68));
        BotonClases.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        BotonClases.setForeground(new java.awt.Color(255, 255, 255));
        BotonClases.setText("Clases");
        BotonClases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonClasesActionPerformed(evt);
            }
        });
        getContentPane().add(BotonClases, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 190, 60));

        BotonRutinas.setBackground(new java.awt.Color(246, 104, 68));
        BotonRutinas.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        BotonRutinas.setForeground(new java.awt.Color(255, 255, 255));
        BotonRutinas.setText("Rutinas");
        BotonRutinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRutinasActionPerformed(evt);
            }
        });
        getContentPane().add(BotonRutinas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 190, 60));

        BotonInstructores.setBackground(new java.awt.Color(246, 104, 68));
        BotonInstructores.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        BotonInstructores.setForeground(new java.awt.Color(255, 255, 255));
        BotonInstructores.setText("Instructores");
        BotonInstructores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInstructoresActionPerformed(evt);
            }
        });
        getContentPane().add(BotonInstructores, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 190, 60));

        BotonHorarios.setBackground(new java.awt.Color(246, 104, 68));
        BotonHorarios.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        BotonHorarios.setForeground(new java.awt.Color(255, 255, 255));
        BotonHorarios.setText("Horarios");
        BotonHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonHorariosActionPerformed(evt);
            }
        });
        getContentPane().add(BotonHorarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 190, 60));

        BotonUsuarios.setBackground(new java.awt.Color(246, 104, 68));
        BotonUsuarios.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        BotonUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        BotonUsuarios.setText("Usuarios");
        BotonUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(BotonUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 190, 60));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagenes/Fondo Menu.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonUsuariosActionPerformed
        // TODO add your handling code here:
        PanelUsuario();
        
    }//GEN-LAST:event_BotonUsuariosActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        // TODO add your handling code here:
        Inicio();
        this.dispose();
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void BotonHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonHorariosActionPerformed
        // TODO add your handling code here:
        //PanelHorario();
    }//GEN-LAST:event_BotonHorariosActionPerformed

    private void BotonInstructoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInstructoresActionPerformed
        // TODO add your handling code here:
        PanelInstructor();
    }//GEN-LAST:event_BotonInstructoresActionPerformed

    private void BotonRutinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRutinasActionPerformed
        // TODO add your handling code here:
        PanelRutina();
    }//GEN-LAST:event_BotonRutinasActionPerformed

    private void BotonClasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonClasesActionPerformed
        // TODO add your handling code here:
        PanelClase();
    }//GEN-LAST:event_BotonClasesActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonClases;
    private javax.swing.JButton BotonHorarios;
    private javax.swing.JButton BotonInstructores;
    private javax.swing.JButton BotonRutinas;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JButton BotonUsuarios;
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel PanelInterior;
    // End of variables declaration//GEN-END:variables
}
