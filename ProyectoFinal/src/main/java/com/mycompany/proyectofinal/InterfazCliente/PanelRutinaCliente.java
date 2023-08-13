package com.mycompany.proyectofinal.InterfazCliente;

import com.mycompany.proyectofinal.InfoClase;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dabney Arosemena Alpízar
 */
public class PanelRutinaCliente extends javax.swing.JPanel {

    public PanelRutinaCliente() {
        initComponents();
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnselecionar = new javax.swing.JButton();
        btnRegistrarRutina = new javax.swing.JButton();
        lbId = new javax.swing.JLabel();
        TablaInstructores = new javax.swing.JScrollPane();
        Rutinas = new javax.swing.JTable();
        Fondo = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(990, 460));
        setPreferredSize(new java.awt.Dimension(990, 460));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnselecionar.setBackground(new java.awt.Color(255, 153, 51));
        btnselecionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagenes/Boton Seleccionar.png"))); // NOI18N
        btnselecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnselecionarActionPerformed(evt);
            }
        });
        add(btnselecionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 370, 120, 20));

        btnRegistrarRutina.setBackground(new java.awt.Color(246, 104, 68));
        btnRegistrarRutina.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        btnRegistrarRutina.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarRutina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagenes/Boton Registrar_.png"))); // NOI18N
        btnRegistrarRutina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarRutinaActionPerformed(evt);
            }
        });
        add(btnRegistrarRutina, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 400, 150, 40));

        lbId.setText("0");
        add(lbId, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 440, 30, -1));

        Rutinas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NOMBRE_RUTINA", "NOMBRE_EJERCICIO", "SERIES", "REPETICIONES"
            }
        ));
        Rutinas.getTableHeader().setReorderingAllowed(false);
        Rutinas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RutinasMouseClicked(evt);
            }
        });
        TablaInstructores.setViewportView(Rutinas);

        add(TablaInstructores, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 810, 430));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagenes/Fondo.png"))); // NOI18N
        add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 460));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarRutinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarRutinaActionPerformed
        // TODO add your handling code here:
        /*try {
            if (rbNuevaRutina.isSelected()) {
                insertaDatosRutina();
            } else if (rbActualizar.isSelected()) {
                ModificarRutina();
            } else {
                JOptionPane.showMessageDialog(null, "Debe Selecionar una Accion");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        

        
        
        
    }//GEN-LAST:event_btnRegistrarRutinaActionPerformed

    private void RutinasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RutinasMouseClicked
        // TODO add your handling code here:
        /*int fila = Rutinas.rowAtPoint(evt.getPoint());
        CampoGrupoM.setToolTipText(Rutinas.getValueAt(fila, 1).toString());
        CampoEjercicio.setText(Rutinas.getValueAt(fila, 2).toString());
        CampoSeries.setText(Rutinas.getValueAt(fila, 3).toString());
        CampoRepeticiones.setText(Rutinas.getValueAt(fila, 4).toString());*/
        
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
    private javax.swing.JLabel Fondo;
    private javax.swing.JTable Rutinas;
    private javax.swing.JScrollPane TablaInstructores;
    private javax.swing.JButton btnRegistrarRutina;
    private javax.swing.JButton btnselecionar;
    private javax.swing.JLabel lbId;
    // End of variables declaration//GEN-END:variables

    InfoClase infoClase = new InfoClase();
//INSERTAR RUTINA
        /*public void insertaDatosRutina() {
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
    }*/

    
    
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
}


