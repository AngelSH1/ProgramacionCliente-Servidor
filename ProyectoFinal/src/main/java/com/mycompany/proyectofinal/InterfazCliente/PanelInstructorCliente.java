package com.mycompany.proyectofinal.InterfazCliente;

import com.mycompany.proyectofinal.InterfazEmpleado.*;
import com.mycompany.proyectofinal.InfoClase;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * Proyecto creado por Dabney Arosemena Alpízar / Daniel Gilberto Picado Urbina / Angel Salmeron Hernández
 */
public class PanelInstructorCliente extends javax.swing.JPanel {

    public PanelInstructorCliente() {
        initComponents();
        llenarTabla();
        desabilitados();
        columnasTamano();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoEspecialidad = new javax.swing.JTextField();
        campoNombre = new javax.swing.JTextField();
        campoApellido = new javax.swing.JTextField();
        lbid = new javax.swing.JLabel();
        FondoRegistroUsuarios = new javax.swing.JLabel();
        TablaInstructores = new javax.swing.JScrollPane();
        tablaInstructores = new javax.swing.JTable();
        Fondo = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(990, 460));
        setPreferredSize(new java.awt.Dimension(990, 460));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoEspecialidad.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        add(campoEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 270, 280, 40));

        campoNombre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        add(campoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 320, 40));

        campoApellido.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        add(campoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 320, 40));
        add(lbid, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 30, 30));

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
        tablaInstructores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaInstructoresMouseClicked(evt);
            }
        });
        TablaInstructores.setViewportView(tablaInstructores);

        add(TablaInstructores, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 400, 420));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagenes/Fondo.png"))); // NOI18N
        add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 460));
    }// </editor-fold>//GEN-END:initComponents

    private void tablaInstructoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaInstructoresMouseClicked
        // TODO add your handling code here:
        int fila = tablaInstructores.rowAtPoint(evt.getPoint());
        campoNombre.setText(tablaInstructores.getValueAt(fila, 1).toString());
        campoApellido.setText(tablaInstructores.getValueAt(fila, 2).toString());
        campoEspecialidad.setText(tablaInstructores.getValueAt(fila, 3).toString());
    }//GEN-LAST:event_tablaInstructoresMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel FondoRegistroUsuarios;
    private javax.swing.JScrollPane TablaInstructores;
    private javax.swing.JTextField campoApellido;
    private javax.swing.JTextField campoEspecialidad;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JLabel lbid;
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
