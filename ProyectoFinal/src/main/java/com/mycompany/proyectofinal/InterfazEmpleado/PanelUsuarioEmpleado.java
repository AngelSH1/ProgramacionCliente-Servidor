package com.mycompany.proyectofinal.InterfazEmpleado;

import com.mycompany.proyectofinal.InfoClase;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;

/**
 *
 * Proyecto creado por Dabney Arosemena Alpízar / Daniel Gilberto Picado Urbina / Angel Salmeron Hernández
 */
public class PanelUsuarioEmpleado extends javax.swing.JPanel {

    /**
     * Creates new form PanelUsuarios
     */
    public PanelUsuarioEmpleado() {
        initComponents();
        llenarTabla();

    }

    InfoClase infoClase = new InfoClase();

    private boolean verificarCampos(JTextField campoNombre, JTextField campoContraseña, JTextField campoVerContraseña) {
        if ((campoNombre.getText().isEmpty()) || (campoContraseña.getText().isEmpty()) || (campoVerContraseña.getText().isEmpty())) {
            return true;

        } else {
            return false;
        }

    }

    public void guardarDatos() {
        try {
            String usuario = campoNombre.getText();
            String contraseña = campoContraseña.getText();
            String verificarCon = campoVerContraseña.getText();
            String rol = (String) campoRol.getSelectedItem();
            if (!verificarCampos(campoNombre, campoContraseña, campoVerContraseña) && contraseña.equals(verificarCon)) {
                int opcion = JOptionPane.showConfirmDialog(null, "¿Esta seguro de insertar estos datos?",
                        "Confirmación de inserción", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) {
                    infoClase.insertarEmpleado(usuario, contraseña, rol);
                    JOptionPane.showMessageDialog(null, "Empleado agregado");
                    llenarTabla();
                    campoNombre.setText("");
                    campoContraseña.setText("");
                    campoVerContraseña.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Creación de empleado cancelada.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Algunos campos no fueron rellenados correctamente");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Formato de datos no valida");
            e.printStackTrace();
        }

    }

    public void eliminarDatos() {
        try {
            int filaSeleccionada = tablaEmpleado.getSelectedRow();
            if (filaSeleccionada != -1) {
                int id = (int) tablaEmpleado.getValueAt(filaSeleccionada, 0);
                int opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de eliminar este empleado?",
                        "Confirmación de eliminación", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) {
                    infoClase.eliminarEmpleado(id);
                    llenarTabla();
                } else {
                    JOptionPane.showMessageDialog(null, "Eliminación cancelada.");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void modificarDatos() {
        try {
            int filaSeleccionada = tablaEmpleado.getSelectedRow();
            if (filaSeleccionada != -1) {
                int id = (int) tablaEmpleado.getValueAt(filaSeleccionada, 0);
                String usuario = campoNombre.getText();
                String contraseña = campoContraseña.getText();
                String verificarCon = campoVerContraseña.getText();
                if (!verificarCampos(campoNombre, campoContraseña, campoVerContraseña) && contraseña.equals(verificarCon)) {
                    int opcion = JOptionPane.showConfirmDialog(null, "¿Esta seguro de actualizar estos datos?",
                            "Confirmación de actualización", JOptionPane.YES_NO_OPTION);
                    if (opcion == JOptionPane.YES_OPTION) {
                        infoClase.modificarEmpleado(id, usuario, contraseña);
                        llenarTabla();
                        campoNombre.setText("");
                        campoContraseña.setText("");
                        campoVerContraseña.setText("");

                    } else {
                        JOptionPane.showMessageDialog(null, "Actualización cancelada.");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Alguno de los campos no fue rellenado correctamente");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Formato de datos no valido");
            e.printStackTrace();
        }
    }

    public void llenarTabla() {
        InfoClase f = new InfoClase();
        try {
            DefaultTableModel model = f.consultaEmpleados();
            tablaEmpleado.setModel(model);
        } catch (SQLException ex) {
            ex.printStackTrace();

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoRol = new javax.swing.JComboBox<>();
        BotonActualizarUsuario = new javax.swing.JButton();
        BotonBorrarUsuario = new javax.swing.JButton();
        BotonRegistarUsuario = new javax.swing.JButton();
        campoNombre = new javax.swing.JTextField();
        campoContraseña = new javax.swing.JTextField();
        campoVerContraseña = new javax.swing.JTextField();
        FondoRegistroUsuarios = new javax.swing.JLabel();
        TablaUsuarios = new javax.swing.JScrollPane();
        tablaEmpleado = new javax.swing.JTable();
        Fondo = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(990, 460));
        setPreferredSize(new java.awt.Dimension(990, 460));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Empleado" }));
        campoRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoRolActionPerformed(evt);
            }
        });
        add(campoRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, -1, -1));

        BotonActualizarUsuario.setBackground(new java.awt.Color(246, 104, 68));
        BotonActualizarUsuario.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        BotonActualizarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        BotonActualizarUsuario.setText("Actualizar");
        BotonActualizarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActualizarUsuarioActionPerformed(evt);
            }
        });
        add(BotonActualizarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 140, 50));

        BotonBorrarUsuario.setBackground(new java.awt.Color(246, 104, 68));
        BotonBorrarUsuario.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        BotonBorrarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        BotonBorrarUsuario.setText("Borrar");
        BotonBorrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBorrarUsuarioActionPerformed(evt);
            }
        });
        add(BotonBorrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, 140, 50));

        BotonRegistarUsuario.setBackground(new java.awt.Color(246, 104, 68));
        BotonRegistarUsuario.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        BotonRegistarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        BotonRegistarUsuario.setText("Registrar");
        BotonRegistarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistarUsuarioActionPerformed(evt);
            }
        });
        add(BotonRegistarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 380, 140, 50));

        campoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNombreActionPerformed(evt);
            }
        });
        add(campoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, 320, 30));
        add(campoContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, 320, 30));
        add(campoVerContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 320, 30));

        FondoRegistroUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        FondoRegistroUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagenes/Registro de Usuarios Internos.png"))); // NOI18N
        add(FondoRegistroUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 550, 420));

        tablaEmpleado.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEmpleadoMouseClicked(evt);
            }
        });
        TablaUsuarios.setViewportView(tablaEmpleado);

        add(TablaUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 400, 360));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagenes/Fondo.png"))); // NOI18N
        add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 460));
    }// </editor-fold>//GEN-END:initComponents

    private void BotonRegistarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistarUsuarioActionPerformed
        // TODO add your handling code here:
        guardarDatos();


    }//GEN-LAST:event_BotonRegistarUsuarioActionPerformed

    private void BotonBorrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBorrarUsuarioActionPerformed
        // TODO add your handling code here:
        eliminarDatos();

    }//GEN-LAST:event_BotonBorrarUsuarioActionPerformed

    private void BotonActualizarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActualizarUsuarioActionPerformed
        // TODO add your handling code here:
        modificarDatos();


    }//GEN-LAST:event_BotonActualizarUsuarioActionPerformed

    private void campoRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoRolActionPerformed

    private void campoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNombreActionPerformed

    private void tablaEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEmpleadoMouseClicked
        // TODO add your handling code here:
        int fila = tablaEmpleado.rowAtPoint(evt.getPoint());
        campoNombre.setText(tablaEmpleado.getValueAt(fila, 2).toString());
        campoContraseña.setText(tablaEmpleado.getValueAt(fila, 1).toString());
        campoVerContraseña.setText(tablaEmpleado.getValueAt(fila, 1).toString());
    }//GEN-LAST:event_tablaEmpleadoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonActualizarUsuario;
    private javax.swing.JButton BotonBorrarUsuario;
    private javax.swing.JButton BotonRegistarUsuario;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel FondoRegistroUsuarios;
    private javax.swing.JScrollPane TablaUsuarios;
    private javax.swing.JTextField campoContraseña;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JComboBox<String> campoRol;
    private javax.swing.JTextField campoVerContraseña;
    private javax.swing.JTable tablaEmpleado;
    // End of variables declaration//GEN-END:variables
}
