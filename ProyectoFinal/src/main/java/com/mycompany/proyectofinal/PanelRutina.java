package com.mycompany.proyectofinal;
/**
 *
 * @author Dabney Arosemena Alpízar
 */
public class PanelRutina extends javax.swing.JPanel {

    public PanelRutina() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonRegistrarRutina = new javax.swing.JButton();
        CampoTiempo = new javax.swing.JTextField();
        CampoDescanso = new javax.swing.JTextField();
        CampoGrupoM = new javax.swing.JTextField();
        CampoSets = new javax.swing.JTextField();
        CampoEjercicios = new javax.swing.JTextField();
        FondoRutina = new javax.swing.JLabel();
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
        add(CampoTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, 320, 30));
        add(CampoDescanso, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, 320, 30));
        add(CampoGrupoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 320, 30));
        add(CampoSets, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 320, 30));
        add(CampoEjercicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 320, 30));

        FondoRutina.setForeground(new java.awt.Color(255, 255, 255));
        FondoRutina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagenes/Registro de Rutina.png"))); // NOI18N
        add(FondoRutina, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 550, -1));

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonRegistrarRutina;
    private javax.swing.JTextField CampoDescanso;
    private javax.swing.JTextField CampoEjercicios;
    private javax.swing.JTextField CampoGrupoM;
    private javax.swing.JTextField CampoSets;
    private javax.swing.JTextField CampoTiempo;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel FondoRutina;
    private javax.swing.JTable Rutinas;
    private javax.swing.JScrollPane TablaInstructores;
    // End of variables declaration//GEN-END:variables
}
