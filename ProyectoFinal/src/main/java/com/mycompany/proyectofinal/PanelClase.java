/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.proyectofinal;

import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author shang
 */
public class PanelClase extends javax.swing.JPanel {

    /**
     * Creates new form clase
     */
    public PanelClase() {
        initComponents();
        llenarTabla();
        desabilitados();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TablaInstructores = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        rbNuevaClase = new javax.swing.JRadioButton();
        botonSeleccionar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        nombreClase = new javax.swing.JLabel();
        txtNombreClase2 = new javax.swing.JTextField();
        descripcion = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        cupoMax = new javax.swing.JLabel();
        txtCupoMaximo = new javax.swing.JTextField();
        rbAcutalizar = new javax.swing.JRadioButton();
        botonRegistrar = new javax.swing.JButton();
        lbid = new javax.swing.JLabel();
        actualizar = new javax.swing.JLabel();
        crearNuevaClase = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        FondoGde = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID CLASE", "NOMBRE DE CLASE", "DESCRIPCION", "CUPO MAXIMO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla1.getTableHeader().setReorderingAllowed(false);
        TablaInstructores.setViewportView(tabla1);

        add(TablaInstructores, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 647, 380));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rbNuevaClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNuevaClaseActionPerformed(evt);
            }
        });
        jPanel1.add(rbNuevaClase, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        botonSeleccionar.setBackground(new java.awt.Color(246, 104, 68));
        botonSeleccionar.setFont(new java.awt.Font("Eras Demi ITC", 0, 12)); // NOI18N
        botonSeleccionar.setForeground(new java.awt.Color(255, 255, 255));
        botonSeleccionar.setText("Seleccionar");
        botonSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeleccionarActionPerformed(evt);
            }
        });
        jPanel1.add(botonSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 30));

        botonEliminar.setBackground(new java.awt.Color(246, 104, 68));
        botonEliminar.setFont(new java.awt.Font("Eras Demi ITC", 0, 12)); // NOI18N
        botonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 100, 30));

        nombreClase.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        nombreClase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagenes/Nombre Clase.png"))); // NOI18N
        jPanel1.add(nombreClase, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));
        jPanel1.add(txtNombreClase2, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 132, 290, 30));

        descripcion.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        descripcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagenes/Descripción.png"))); // NOI18N
        jPanel1.add(descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));
        jPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 290, 30));

        cupoMax.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        cupoMax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagenes/Cupo Maximo.png"))); // NOI18N
        jPanel1.add(cupoMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));
        jPanel1.add(txtCupoMaximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 278, 290, 30));

        rbAcutalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAcutalizarActionPerformed(evt);
            }
        });
        jPanel1.add(rbAcutalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        botonRegistrar.setBackground(new java.awt.Color(246, 104, 68));
        botonRegistrar.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        botonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        botonRegistrar.setText("Registrar");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(botonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 314, 140, 50));
        jPanel1.add(lbid, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 98, 32, 28));

        actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagenes/Actualizar.png"))); // NOI18N
        jPanel1.add(actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, -1));

        crearNuevaClase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagenes/Crear Nueva Clase.png"))); // NOI18N
        jPanel1.add(crearNuevaClase, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, 20));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagenes/Fondo Pequeño.png"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 380));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(659, 6, 310, 380));

        FondoGde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagenes/Fondo.png"))); // NOI18N
        add(FondoGde, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 460));
    }// </editor-fold>//GEN-END:initComponents

    private void rbNuevaClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNuevaClaseActionPerformed
        // TODO add your handling code here:
        if (rbNuevaClase.isSelected()) {
            rbAcutalizar.setSelected(false);
            abilitados();
        }
    }//GEN-LAST:event_rbNuevaClaseActionPerformed

    private void botonSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeleccionarActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = tabla1.getSelectedRow();
        if (filaSeleccionada != -1) {
            // Obtener los valores de la fila seleccionada
            int idClase = (int) tabla1.getValueAt(filaSeleccionada, 0);
            String nombre = (String) tabla1.getValueAt(filaSeleccionada, 1);
            String descripcion = (String) tabla1.getValueAt(filaSeleccionada, 2);
            int cupoMaximo = (int) tabla1.getValueAt(filaSeleccionada, 3);
            lbid.setText(String.valueOf(idClase));
            txtNombreClase2.setText(nombre);
            txtDescripcion.setText(descripcion);
            txtCupoMaximo.setText(String.valueOf(cupoMaximo));
        } else {
            // Si no hay fila seleccionada, muestra un mensaje de error
            JOptionPane.showMessageDialog(null, "Selecciona una fila Para Acutalizar.");
        }
    }//GEN-LAST:event_botonSeleccionarActionPerformed

    private void rbAcutalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAcutalizarActionPerformed
        // TODO add your handling code here:
        if (rbAcutalizar.isSelected()) {
            rbNuevaClase.setSelected(false);
            abilitados();
        }
    }//GEN-LAST:event_rbAcutalizarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        int filaSeleccionada = tabla1.getSelectedRow();
        if (filaSeleccionada != -1) {
            // Obtener los valores de la fila seleccionada
            int idClase = (int) tabla1.getValueAt(filaSeleccionada, 0);
            int opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de eliminar este registro?",
                "Confirmación de eliminación", JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.YES_OPTION) {
                infoclase.eliminarClase(idClase);
                llenarTabla();
            } else {
                JOptionPane.showMessageDialog(null, "Eliminación cancelada.");
            }
        } else {
            // Si no hay fila seleccionada, muestra un mensaje de error
            JOptionPane.showMessageDialog(null, "Selecciona una fila Para Acutalizar.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        // TODO add your handling code here:
        //insertaDatos();
        try {
            if (rbNuevaClase.isSelected()) {
                insertaDatos();
            } else if (rbAcutalizar.isSelected()) {
                ModificarDatos();
            } else {
                JOptionPane.showMessageDialog(null, "Debe Selecionar una Accion");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_botonRegistrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel FondoGde;
    private javax.swing.JScrollPane TablaInstructores;
    private javax.swing.JLabel actualizar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JButton botonSeleccionar;
    private javax.swing.JLabel crearNuevaClase;
    private javax.swing.JLabel cupoMax;
    private javax.swing.JLabel descripcion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbid;
    private javax.swing.JLabel nombreClase;
    private javax.swing.JRadioButton rbAcutalizar;
    private javax.swing.JRadioButton rbNuevaClase;
    private javax.swing.JTable tabla1;
    private javax.swing.JTextField txtCupoMaximo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNombreClase2;
    // End of variables declaration//GEN-END:variables
InfoClase infoclase = new InfoClase();

    public void llenarTabla() {
        InfoClase f = new InfoClase();
        try {
            // Llamar a la función consultarTodos() de FuncionesEstudiante
            DefaultTableModel model = f.consultarTodosParaTabla();

            // Actualizar la tabla con los datos obtenidos de la consulta
            tabla1.setModel(model);
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Aquí puedes agregar algún mensaje de error en caso de que ocurra un problema con la consulta
        }
    }

    public void insertaDatos() {
        try {
            String nombre = txtNombreClase2.getText();
            String descripcion = txtDescripcion.getText();
            int cupo = Integer.parseInt(txtCupoMaximo.getText());
            int opcion = JOptionPane.showConfirmDialog(null, "¿Esta seguro de insertar estos datos?",
                    "Confirmación de inserción", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                infoclase.insertarClase(nombre, descripcion, cupo);
                llenarTabla();
                limpiar();
                JOptionPane.showMessageDialog(null, "Registro Insertado");
            } else {
                JOptionPane.showMessageDialog(null, "Inserción cancelada.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Formato de datos no valido");
            e.printStackTrace();
        }
    }

    public void ModificarDatos() {
        try {
            String nombre = txtNombreClase2.getText();
            String descripcion = txtDescripcion.getText();
            int cupo = Integer.parseInt(txtCupoMaximo.getText());
            int id = Integer.parseInt(lbid.getText());
            int opcion = JOptionPane.showConfirmDialog(null, "¿Esta seguro de actualizar estos datos?",
                    "Confirmación de actualización", JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.YES_OPTION) {
                infoclase.modificarClase(nombre, descripcion, cupo, id);
                llenarTabla();
                limpiar();
                JOptionPane.showMessageDialog(null, "Registro Actualizado");
            } else {
                JOptionPane.showMessageDialog(null, "Actualización cancelada.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Formato de datos no valido");
            e.printStackTrace();
        }
    }

    public void limpiar() {
        lbid.setText(String.valueOf(0));
        txtNombreClase2.setText("");
        txtDescripcion.setText("");
        txtCupoMaximo.setText(String.valueOf(""));
    }

    public void desabilitados() {
        lbid.setText(String.valueOf(0));
        txtNombreClase2.setEnabled(false);
        txtDescripcion.setEnabled(false);
        txtCupoMaximo.setEnabled(false);
        botonRegistrar.setEnabled(false);
    }

    public void abilitados() {
        lbid.setText(String.valueOf(0));
        txtNombreClase2.setEnabled(true);
        txtDescripcion.setEnabled(true);
        txtCupoMaximo.setEnabled(true);
        botonRegistrar.setEnabled(true);
    }

}

