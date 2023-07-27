/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectofinal;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author mende
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        //TeclaEnter();
    }

    //Método para el boton enter y click
    /*public void TeclaEnter() {
        campoContraseña.setFocusable(true);
        campoContraseña.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e){
            }
            @Override
            public void keyPressed(KeyEvent e){
                if(e.getKeyCode()==KeyEvent.VK_ENTER){
                    verificacionDatos();
                }
                if(e.getKeyCode()==KeyEvent.VK_ESCAPE){
                    System.exit(0);
                }
            }
            @Override
            public void keyReleased(KeyEvent e){
            }
        }); 
    }*/ //REVISAR********
    
    //Metodo para verificar todos los datos ingresados, verificar que cuente con privilegios
    /*public void verificacionDatos(){
        if(verificarCampos()){
            us = campoUsuario.getText(); //Obtengo el dato ingresado
            cont = campoContraseña.getText(); //Obtengo el dato ingresado
            Usuario usuarioIngresado = new Usuario(us, cont);
            Archivo a = new Archivo("usuarios.txt");
            ArrayList<Usuario> usuarios = a.obtenerUsuariosDelArchivo();
            boolean usuarioEncontrado  = false;
            for (int i = 0; i < usuarios.size(); i++) {
                if (usuarioIngresado.getNombreUsuario().equals(usuarios.get(i).getNombreUsuario())) {
                    if (usuarioIngresado.getNombreUsuario().equals(usuarios.get(i).getNombreUsuario())){
                    System.out.println("Usuario encontrado: "+ us);   
                    if (usuarioIngresado.getContraseñaUsuario().equals(usuarios.get(i).getContraseñaUsuario())) {
                        System.out.println("Contraseña correcta de: " + us);
                        usuarioIngresado.setPrivilegioUsuario(usuarios.get(i).getPrivilegioUsuario());
                        i = usuarios.size() + 1;
                        usuarioEncontrado = true;
                        }
                    }
                }
            }

            if(usuarioEncontrado){
                switch (usuarioIngresado.getPrivilegioUsuario()) {
                    case "Empleado" -> {
                        MenuEmpleado ventanaMenuEmpleado = new MenuEmpleado();
                        ventanaMenuEmpleado.setVisible(true);
                        this.dispose();
                    }
                    case "Cliente" -> {
                        MenuVentas ventas = new MenuVentas();
                        ventas.setVisible(true);
                        this.dispose();
                    }
                    //case "Proveedor" -> {
                        //Proveedor ventanaProveedor = new Proveedor();
                        //ventanaProveedor.setVisible(true);
                        //this.dispose();
                    //}
                    default -> {
                        System.out.println("Privilegio incorrecto");
                        JOptionPane.showMessageDialog(null, "El usuario no cuenta con privilegios");
                    }
                }
            }else{
                JOptionPane.showMessageDialog(null, "Datos incorrectos!");
            }
        }   
    }*/
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        CampoContraseña = new javax.swing.JTextField();
        CampoUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(55, 221, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagenes/BotonCrearNuevoUsuario.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagenes/BotonCrearNuevoUsuario.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagenes/BotonCrearNuevoUsuarioGde.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, 450, 130));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagenes/BotonIngresar.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagenes/BotonIngresar.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagenes/BotonIngresarGde.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, 390, 70));
        getContentPane().add(CampoContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 410, 40));
        getContentPane().add(CampoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 410, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagenes/Ingreso.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    CreacionUsuario ventanaCreacionUsuario = new CreacionUsuario();
    ventanaCreacionUsuario.setVisible(true);
    this.dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MenuPrincipal ventanaMenuPrincipal = new MenuPrincipal();
        ventanaMenuPrincipal.setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoContraseña;
    private javax.swing.JTextField CampoUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
