package com.mycompany.proyectofinal.InterfazEmpleado;

import com.mycompany.proyectofinal.InfoClase;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * Proyecto creado por Dabney Arosemena Alpízar / Daniel Gilberto Picado Urbina / Angel Salmeron Hernández
 */
public class PanelInstructorEmpleado extends javax.swing.JPanel {

    public PanelInstructorEmpleado() {
        initComponents();
        llenarTabla();
        desabilitados();
        columnasTamano();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonRegistrar = new javax.swing.JButton();
        campoEspecialidad = new javax.swing.JTextField();
        campoNombre = new javax.swing.JTextField();
        campoApellido = new javax.swing.JTextField();
        lbid = new javax.swing.JLabel();
        rbAcutalizar = new javax.swing.JRadioButton();
        Actualizar = new javax.swing.JLabel();
        rbNuevaInstructor = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        FondoRegistroUsuarios = new javax.swing.JLabel();
        TablaInstructores = new javax.swing.JScrollPane();
        tablaInstructores = new javax.swing.JTable();
        Fondo = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(990, 460));
        setPreferredSize(new java.awt.Dimension(990, 460));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonRegistrar.setBackground(new java.awt.Color(246, 104, 68));
        botonRegistrar.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        botonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        botonRegistrar.setText("Registrar");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });
        add(botonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 370, 140, 50));
        add(campoEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, 280, 30));
        add(campoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 320, 30));
        add(campoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 320, 30));
        add(lbid, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 30, 30));

        rbAcutalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAcutalizarActionPerformed(evt);
            }
        });
        add(rbAcutalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 90, -1, -1));

        Actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagenes/Actualizar.png"))); // NOI18N
        add(Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 90, 70, -1));

        rbNuevaInstructor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNuevaInstructorActionPerformed(evt);
            }
        });
        add(rbNuevaInstructor, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 60, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Crear Instructor");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 60, -1, 20));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagenes/Boton Eliminar.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 120, 30));

        jButton1.setBackground(new java.awt.Color(255, 153, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagenes/Boton Seleccionar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 130, 30));

        FondoRegistroUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        FondoRegistroUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagenes/Registro de Instructores.png"))); // NOI18N
        add(FondoRegistroUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 550, -1));

        tablaInstructores.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaInstructores.setViewportView(tablaInstructores);

        add(TablaInstructores, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 400, 410));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagenes/Fondo.png"))); // NOI18N
        add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 460));
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        //insertaDatos();
             try {
            if (rbNuevaInstructor.isSelected()) {
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = tablaInstructores.getSelectedRow();
        if (filaSeleccionada != -1) {
            // Obtener los valores de la fila seleccionada
            int idInstructor = (int) tablaInstructores.getValueAt(filaSeleccionada, 0);
            String nombre = (String) tablaInstructores.getValueAt(filaSeleccionada, 1);
            String apellido = (String) tablaInstructores.getValueAt(filaSeleccionada, 2);
            String especialidad = (String) tablaInstructores.getValueAt(filaSeleccionada, 3);
            lbid.setText(String.valueOf(idInstructor));
            campoNombre.setText(nombre);
            campoApellido.setText(apellido);
            campoEspecialidad.setText(especialidad);
        } else {
            // Si no hay fila seleccionada, muestra un mensaje de error
            JOptionPane.showMessageDialog(null, "Selecciona una fila Para Acutalizar.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int filaSeleccionada = tablaInstructores.getSelectedRow();
        if (filaSeleccionada != -1) {
            // Obtener los valores de la fila seleccionada
            int idInstructor = (int) tablaInstructores.getValueAt(filaSeleccionada, 0);
            int opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de eliminar este registro?",
                "Confirmación de eliminación", JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.YES_OPTION) {
                infoclase.eliminarInstructor(idInstructor);
                llenarTabla();
            } else {
                JOptionPane.showMessageDialog(null, "Eliminación cancelada.");
            }
        } else {
            // Si no hay fila seleccionada, muestra un mensaje de error
            JOptionPane.showMessageDialog(null, "Selecciona una fila Para Eliminar.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void rbNuevaInstructorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNuevaInstructorActionPerformed
        // TODO add your handling code here:
        if (rbNuevaInstructor.isSelected()) {
            limpiar();
            rbAcutalizar.setSelected(false);
            habilitado();
        }
    }//GEN-LAST:event_rbNuevaInstructorActionPerformed

    private void rbAcutalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAcutalizarActionPerformed
        // TODO add your handling code here:
        if (rbAcutalizar.isSelected()) {
            rbNuevaInstructor.setSelected(false);
            habilitado();
        }
    }//GEN-LAST:event_rbAcutalizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Actualizar;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel FondoRegistroUsuarios;
    private javax.swing.JScrollPane TablaInstructores;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JTextField campoApellido;
    private javax.swing.JTextField campoEspecialidad;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbid;
    private javax.swing.JRadioButton rbAcutalizar;
    private javax.swing.JRadioButton rbNuevaInstructor;
    private javax.swing.JTable tablaInstructores;
    // End of variables declaration//GEN-END:variables
InfoClase infoclase = new InfoClase();

    public void llenarTabla() {
        InfoClase f = new InfoClase();
        try {
            // Llamar a la función consultarTodos() de FuncionesEstudiante
            DefaultTableModel model = f.consultaParaInstructores();

            // Actualizar la tabla con los datos obtenidos de la consulta
            tablaInstructores.setModel(model);
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Aquí puedes agregar algún mensaje de error en caso de que ocurra un problema con la consulta
        }
    }

    public void insertaDatos() {
        try {
            String nombre = campoNombre.getText();
            String apellido = campoApellido.getText();
            String especialidad = campoEspecialidad.getText();
            if (nombre.isEmpty() || apellido.isEmpty() || especialidad.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
            return;}
            int opcion = JOptionPane.showConfirmDialog(null, "¿Esta seguro de insertar estos datos?",
                    "Confirmación de inserción", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                infoclase.insertarIntructor(nombre, apellido, especialidad);
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
            String nombre = campoNombre.getText();
            String apellido = campoApellido.getText();
            String especialidad = campoEspecialidad.getText();
            int idInstrucor = Integer.parseInt(lbid.getText());
            
            if (nombre.isEmpty() || apellido.isEmpty() || especialidad.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
            return;
            }
            int opcion = JOptionPane.showConfirmDialog(null, "¿Esta seguro de actualizar estos datos?",
                    "Confirmación de actualización", JOptionPane.YES_NO_OPTION);
            
            if (opcion == JOptionPane.YES_OPTION) {
                infoclase.modificarInstructor(idInstrucor, nombre, apellido, especialidad);
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
        campoNombre.setText("");
        campoApellido.setText("");
        campoEspecialidad.setText(String.valueOf(""));
    }

    public void desabilitados() {
        lbid.setText(String.valueOf(0));
        campoNombre.setEnabled(false);
        campoApellido.setEnabled(false);
        campoEspecialidad.setEnabled(false);
        botonRegistrar.setEnabled(false);
        btnEliminar.setEnabled(true);

    }

    public void habilitado() {
        campoNombre.setEnabled(true);
        campoApellido.setEnabled(true);
        campoEspecialidad.setEnabled(true);
        botonRegistrar.setEnabled(true);
        btnEliminar.setEnabled(true);
    }
    public void columnasTamano(){
            TableColumn columna0,columna1,columna2;
        columna0 = tablaInstructores.getColumnModel().getColumn(0);
        columna0.setPreferredWidth(40);
        columna0.setMaxWidth(40);
        columna0.setMinWidth(40);
        
        columna1 = tablaInstructores.getColumnModel().getColumn(1);
        columna1.setPreferredWidth(80);
        columna1.setMaxWidth(80);
        columna1.setMinWidth(80);

        columna2 = tablaInstructores.getColumnModel().getColumn(2);
        columna2.setPreferredWidth(80);
        columna2.setMaxWidth(80);
        columna2.setMinWidth(80);
        
        tablaInstructores.setRowHeight(20);
    }
}
