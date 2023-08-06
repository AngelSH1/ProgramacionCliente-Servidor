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

        BotonRegistrar = new javax.swing.JButton();
        CampoPuesto = new javax.swing.JTextField();
        CampoNombreInstructor = new javax.swing.JTextField();
        CampoSalario = new javax.swing.JTextField();
        CampoCedula = new javax.swing.JTextField();
        FondoRegistroUsuarios = new javax.swing.JLabel();
        TablaInstructores = new javax.swing.JScrollPane();
        Instructores = new javax.swing.JTable();
        Fondo = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(990, 460));
        setPreferredSize(new java.awt.Dimension(990, 460));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonRegistrar.setBackground(new java.awt.Color(246, 104, 68));
        BotonRegistrar.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        BotonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        BotonRegistrar.setText("Registrar");
        BotonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarActionPerformed(evt);
            }
        });
        add(BotonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 380, 140, 50));
        add(CampoPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, 320, 30));
        add(CampoNombreInstructor, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 320, 30));
        add(CampoSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 320, 30));
        add(CampoCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 320, 30));

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

    private void BotonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonRegistrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonRegistrar;
    private javax.swing.JTextField CampoCedula;
    private javax.swing.JTextField CampoNombreInstructor;
    private javax.swing.JTextField CampoPuesto;
    private javax.swing.JTextField CampoSalario;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel FondoRegistroUsuarios;
    private javax.swing.JTable Instructores;
    private javax.swing.JScrollPane TablaInstructores;
    // End of variables declaration//GEN-END:variables
}
