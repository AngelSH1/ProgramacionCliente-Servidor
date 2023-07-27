package com.mycompany.proyectofinal;
/**
 *
 * @author Dabney Arosemena Alpízar
 */
public class PanelClase extends javax.swing.JPanel {

    public PanelClase() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonRegistrarRutina = new javax.swing.JButton();
        CampoDia = new javax.swing.JComboBox<>();
        CampoHorario = new javax.swing.JComboBox<>();
        CampoInstructor = new javax.swing.JComboBox<>();
        CampoCategoria = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        CampoAlumno = new javax.swing.JTextField();
        FondoRegistroUsuarios = new javax.swing.JLabel();
        TablaInstructores = new javax.swing.JScrollPane();
        Rutinas = new javax.swing.JTable();
        Fondo = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(990, 460));
        setPreferredSize(new java.awt.Dimension(990, 460));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonRegistrarRutina.setBackground(new java.awt.Color(246, 104, 68));
        BotonRegistrarRutina.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        BotonRegistrarRutina.setForeground(new java.awt.Color(255, 255, 255));
        BotonRegistrarRutina.setText("Registrar");
        BotonRegistrarRutina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarRutinaActionPerformed(evt);
            }
        });
        add(BotonRegistrarRutina, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 380, 140, 50));

        CampoDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" }));
        CampoDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoDiaActionPerformed(evt);
            }
        });
        add(CampoDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, 290, 30));

        CampoHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7:00 AM - 8:00 AM", "8:00 AM - 9:00 AM", "4:00 PM - 5:00 PM", "7:00 PM - 8:00 PM" }));
        CampoHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoHorarioActionPerformed(evt);
            }
        });
        add(CampoHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, 290, 30));

        CampoInstructor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(CampoInstructor, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, 290, 30));

        CampoCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pesas", "Cardio", "Full Body", "Bicicleta", "Zumba" }));
        CampoCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCategoriaActionPerformed(evt);
            }
        });
        add(CampoCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 212, 290, 30));

        jButton1.setText("jButton1");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 110, 60, -1));
        add(CampoAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 290, 30));

        FondoRegistroUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        FondoRegistroUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagenes/Registro de Clases.png"))); // NOI18N
        add(FondoRegistroUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 550, -1));

        Rutinas.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaInstructores.setViewportView(Rutinas);

        add(TablaInstructores, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 400, 360));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagenes/Fondo.png"))); // NOI18N
        add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 460));
    }// </editor-fold>//GEN-END:initComponents

    private void BotonRegistrarRutinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarRutinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonRegistrarRutinaActionPerformed

    private void CampoHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoHorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoHorarioActionPerformed

    private void CampoCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCategoriaActionPerformed

    private void CampoDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoDiaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonRegistrarRutina;
    private javax.swing.JTextField CampoAlumno;
    private javax.swing.JComboBox<String> CampoCategoria;
    private javax.swing.JComboBox<String> CampoDia;
    private javax.swing.JComboBox<String> CampoHorario;
    private javax.swing.JComboBox<String> CampoInstructor;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel FondoRegistroUsuarios;
    private javax.swing.JTable Rutinas;
    private javax.swing.JScrollPane TablaInstructores;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
