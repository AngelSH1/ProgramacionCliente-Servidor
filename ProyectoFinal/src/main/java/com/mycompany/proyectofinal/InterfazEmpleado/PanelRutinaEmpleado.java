package com.mycompany.proyectofinal.InterfazEmpleado;

import com.mycompany.proyectofinal.InfoClase;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * Proyecto creado por Dabney Arosemena Alpízar / Daniel Gilberto Picado Urbina / Angel Salmeron Hernández
 */
public class PanelRutinaEmpleado extends javax.swing.JPanel {

    public PanelRutinaEmpleado() {
        initComponents();
        llenarTabla();
        desabilitado();
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NuevaRutina = new javax.swing.JLabel();
        rbNuevaRutina = new javax.swing.JRadioButton();
        ActualizarRutina = new javax.swing.JLabel();
        rbActualizar = new javax.swing.JRadioButton();
        btnEliminar = new javax.swing.JButton();
        CampoGrupoM = new javax.swing.JComboBox<>();
        btnselecionar = new javax.swing.JButton();
        btnRegistrarRutina = new javax.swing.JButton();
        CampoRepeticiones = new javax.swing.JTextField();
        CampoSeries = new javax.swing.JTextField();
        CampoEjercicio = new javax.swing.JTextField();
        lbId = new javax.swing.JLabel();
        FondoRutina = new javax.swing.JLabel();
        TablaInstructores = new javax.swing.JScrollPane();
        Rutinas = new javax.swing.JTable();
        Fondo = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(990, 460));
        setPreferredSize(new java.awt.Dimension(990, 460));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NuevaRutina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagenes/Crear nueva rutina.png"))); // NOI18N
        add(NuevaRutina, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, -1, 20));

        rbNuevaRutina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNuevaRutinaActionPerformed(evt);
            }
        });
        add(rbNuevaRutina, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, -1, -1));

        ActualizarRutina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagenes/Actualizar.png"))); // NOI18N
        add(ActualizarRutina, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 70, -1));

        rbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbActualizarActionPerformed(evt);
            }
        });
        add(rbActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, -1, -1));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagenes/Boton Eliminar.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, 120, 20));

        CampoGrupoM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PIERNAS", "PECHO / HOMBROS", "ESPALDA", "BRAZOS", "ABDOMINALES" }));
        add(CampoGrupoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 320, 30));

        btnselecionar.setBackground(new java.awt.Color(255, 153, 51));
        btnselecionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagenes/Boton Seleccionar.png"))); // NOI18N
        btnselecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnselecionarActionPerformed(evt);
            }
        });
        add(btnselecionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, 120, 20));

        btnRegistrarRutina.setBackground(new java.awt.Color(246, 104, 68));
        btnRegistrarRutina.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        btnRegistrarRutina.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarRutina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagenes/Boton Registrar_.png"))); // NOI18N
        btnRegistrarRutina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarRutinaActionPerformed(evt);
            }
        });
        add(btnRegistrarRutina, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 380, 150, 40));
        add(CampoRepeticiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 270, 270, 30));
        add(CampoSeries, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 320, 30));
        add(CampoEjercicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 320, 30));

        lbId.setText("0");
        add(lbId, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, -1, -1));

        FondoRutina.setForeground(new java.awt.Color(255, 255, 255));
        FondoRutina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagenes/Registro de Rutina.png"))); // NOI18N
        add(FondoRutina, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 550, -1));

        Rutinas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID_RUTINA", "NOMBRE_RUTINA", "NOMBRE_EJERCICIO", "SERIES", "REPETICIONES"
            }
        ));
        Rutinas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RutinasMouseClicked(evt);
            }
        });
        TablaInstructores.setViewportView(Rutinas);

        add(TablaInstructores, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 400, 430));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagenes/Fondo.png"))); // NOI18N
        add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 460));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarRutinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarRutinaActionPerformed
        // TODO add your handling code here:
        try {
            if (rbNuevaRutina.isSelected()) {
                insertaDatosRutina();
            } else if (rbActualizar.isSelected()) {
                ModificarRutina();
            } else {
                JOptionPane.showMessageDialog(null, "Debe Selecionar una Accion");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        

        
        
        
    }//GEN-LAST:event_btnRegistrarRutinaActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarDatosRutina();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void rbNuevaRutinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNuevaRutinaActionPerformed
        // TODO add your handling code here:
        if (rbNuevaRutina.isSelected()) {
            //limpiar();
            rbActualizar.setSelected(false);
            habilitado();
        }
    }//GEN-LAST:event_rbNuevaRutinaActionPerformed

    private void rbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbActualizarActionPerformed
        // TODO add your handling code here:
        if (rbActualizar.isSelected()) {
            rbNuevaRutina.setSelected(false);
            habilitado();
            JOptionPane.showMessageDialog(null, "Al Actualizar debe volver a \nselecionar todos los datos","Advertencia",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_rbActualizarActionPerformed

    private void RutinasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RutinasMouseClicked
        // TODO add your handling code here:
        int fila = Rutinas.rowAtPoint(evt.getPoint());
        CampoGrupoM.setToolTipText(Rutinas.getValueAt(fila, 1).toString());
        CampoEjercicio.setText(Rutinas.getValueAt(fila, 2).toString());
        CampoSeries.setText(Rutinas.getValueAt(fila, 3).toString());
        CampoRepeticiones.setText(Rutinas.getValueAt(fila, 4).toString());
    }//GEN-LAST:event_RutinasMouseClicked

    private void btnselecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnselecionarActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = Rutinas.getSelectedRow();
        if (filaSeleccionada != -1) {
            // Obtener los valores de la fila seleccionada
            int idClase = (int) Rutinas.getValueAt(filaSeleccionada, 0);
            lbId.setText(String.valueOf(idClase));
        } else {
            // Si no hay fila seleccionada, muestra un mensaje de error
            JOptionPane.showMessageDialog(null, "Selecciona una fila Para Acutalizar.");
        }
    }//GEN-LAST:event_btnselecionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ActualizarRutina;
    private javax.swing.JTextField CampoEjercicio;
    private javax.swing.JComboBox<String> CampoGrupoM;
    private javax.swing.JTextField CampoRepeticiones;
    private javax.swing.JTextField CampoSeries;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel FondoRutina;
    private javax.swing.JLabel NuevaRutina;
    private javax.swing.JTable Rutinas;
    private javax.swing.JScrollPane TablaInstructores;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrarRutina;
    private javax.swing.JButton btnselecionar;
    private javax.swing.JLabel lbId;
    private javax.swing.JRadioButton rbActualizar;
    private javax.swing.JRadioButton rbNuevaRutina;
    // End of variables declaration//GEN-END:variables

    InfoClase infoClase = new InfoClase();
//INSERTAR RUTINA
        public void insertaDatosRutina() {
        try {
            String grupoMuscular = (String) CampoGrupoM.getSelectedItem();
            String ejercicio = CampoEjercicio.getText();
            int series = Integer.parseInt(CampoSeries.getText());
            int repeticiones = Integer.parseInt(CampoRepeticiones.getText());
            int opcion = JOptionPane.showConfirmDialog(null, "¿Esta seguro de insertar estos datos?",
                    "Confirmación de inserción", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                infoClase.insertarRutina(grupoMuscular, ejercicio, series, repeticiones);
                JOptionPane.showMessageDialog(null, "Rutina Agregada");
                //Vaciamos textfields
                CampoEjercicio.setText("");
                CampoSeries.setText("");
                CampoRepeticiones.setText("");
                llenarTabla();
            } else {
                JOptionPane.showMessageDialog(null, "Rutina cancelada.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Formato de datos no valido");
            e.printStackTrace();
        }
    }
//ELIMINAR RUTINA 
    public void eliminarDatosRutina() {    
    int filaSeleccionada = Rutinas.getSelectedRow();
        if (filaSeleccionada != -1) {
            // Obtener los valores de la fila seleccionada
            int idRutina = (int) Rutinas.getValueAt(filaSeleccionada, 0);
            int opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de eliminar este registro?",
                    "Confirmación de eliminación", JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.YES_OPTION) {
                infoClase.eliminarRutina(idRutina);
                llenarTabla();
            } else {
                JOptionPane.showMessageDialog(null, "Eliminación cancelada.");
            }
        } else {
            // Si no hay fila seleccionada, muestra un mensaje de error
            JOptionPane.showMessageDialog(null, "Selecciona una fila Para Acutalizar.");
        }
    }    
//MODIFICAR RUTINA      
    public void ModificarRutina() {
        try {
            String grupoMuscular = (String) CampoGrupoM.getSelectedItem();
            String ejercicio = CampoEjercicio.getText();
            int series = Integer.parseInt(CampoSeries.getText());
            int repeticiones = Integer.parseInt(CampoRepeticiones.getText());
            int id = Integer.parseInt(lbId.getText());
            int opcion = JOptionPane.showConfirmDialog(null, "¿Esta seguro de actualizar estos datos?",
                    "Confirmación de actualización", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                infoClase.modificarRutina(grupoMuscular, ejercicio, series, repeticiones, id);
                llenarTabla();
                //limpiar();
                
            } else {
                JOptionPane.showMessageDialog(null, "Actualización cancelada.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Formato de datos no valido");
            e.printStackTrace();
        }
    }
//LLENAR TABLA    
    public void llenarTabla() {
        InfoClase f = new InfoClase();
        try {
            // Llamar a la función consultarTodos() de FuncionesEstudiante
            DefaultTableModel model = f.consultaParaRutinas();

            // Actualizar la tabla con los datos obtenidos de la consulta
            Rutinas.setModel(model);
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Aquí puedes agregar algún mensaje de error en caso de que ocurra un problema con la consulta
        }
    }
//Habilitar/Deshabilitar 
        public void desabilitado() {
        CampoGrupoM.setEnabled(false);
        CampoEjercicio.setEnabled(false);
        CampoRepeticiones.setEnabled(false);
        CampoSeries.setEnabled(false);
        btnRegistrarRutina.setEnabled(false);
        btnEliminar.setEnabled(false);
    }

    public void habilitado() {
        CampoGrupoM.setEnabled(true);
        CampoEjercicio.setEnabled(true);
        CampoRepeticiones.setEnabled(true);
        CampoSeries.setEnabled(true);
        btnRegistrarRutina.setEnabled(true);
        btnEliminar.setEnabled(true);
    }
}


