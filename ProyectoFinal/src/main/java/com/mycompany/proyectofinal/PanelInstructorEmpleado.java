package com.mycompany.proyectofinal;
/**
 *
 * @author Dabney Arosemena Alpízar
 */
public class PanelInstructorEmpleado extends javax.swing.JPanel {

    public PanelInstructorEmpleado() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonEliminar = new javax.swing.JButton();
        Actualizar = new javax.swing.JButton();
        botonRegistrar = new javax.swing.JButton();
        campoEspecialidad = new javax.swing.JTextField();
        campoNombre = new javax.swing.JTextField();
        campoApellido = new javax.swing.JTextField();
        FondoRegistroUsuarios = new javax.swing.JLabel();
        TablaInstructores = new javax.swing.JScrollPane();
        Instructores = new javax.swing.JTable();
        Fondo = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(990, 460));
        setPreferredSize(new java.awt.Dimension(990, 460));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonEliminar.setBackground(new java.awt.Color(246, 104, 68));
        botonEliminar.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        botonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 140, 50));

        Actualizar.setBackground(new java.awt.Color(246, 104, 68));
        Actualizar.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        Actualizar.setForeground(new java.awt.Color(255, 255, 255));
        Actualizar.setText("Registrar");
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });
        add(Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, 140, 50));

        botonRegistrar.setBackground(new java.awt.Color(246, 104, 68));
        botonRegistrar.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        botonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        botonRegistrar.setText("Registrar");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });
        add(botonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 370, 140, 50));
        add(campoEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, 280, 30));
        add(campoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 320, 30));
        add(campoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 320, 30));

        FondoRegistroUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        FondoRegistroUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagenes/Registro de Instructores.png"))); // NOI18N
        add(FondoRegistroUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 550, -1));

        Instructores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TablaInstructores.setViewportView(Instructores);

        add(TablaInstructores, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 400, 360));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagenes/Fondo.png"))); // NOI18N
        add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 460));
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegistrarActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ActualizarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel FondoRegistroUsuarios;
    private javax.swing.JTable Instructores;
    private javax.swing.JScrollPane TablaInstructores;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JTextField campoApellido;
    private javax.swing.JTextField campoEspecialidad;
    private javax.swing.JTextField campoNombre;
    // End of variables declaration//GEN-END:variables
}
