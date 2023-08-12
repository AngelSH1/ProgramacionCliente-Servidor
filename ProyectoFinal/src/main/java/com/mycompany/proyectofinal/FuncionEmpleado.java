package com.mycompany.proyectofinal;

import java.sql.*;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniel
 */
public class FuncionEmpleado {

    Conexion conexion = new Conexion();
    private static String usuario;
    private static String contraseña;
    private static String verificar;
    private static String rol;
    private JTable tablaEmpleado;

    private boolean campos(JTextField textField1, JTextField textField2, JTextField textField3) {

        if ((textField1.getText().equals("")) || (textField2.getText().equals("")) || (textField3.getText().equals(""))) {
            return true;

        } else {
            return false;
        }

    }

    public void guardarDatos(JTextField textField1, JTextField textField2, JTextField textField3, JComboBox campoRol) {
        try {
            usuario = textField1.getText();
            contraseña = textField2.getText();
            verificar = textField3.getText();
            rol = (String) campoRol.getSelectedItem();

            if (campos(textField1, textField2, textField3)) {
                throw new Exception();
            } else {
                if (textField2.getText().equals(textField3.getText())) {
                    crearEmpleado(usuario, contraseña, rol);
                } else {
                    throw new Exception();
                }

            }

        } catch (Exception e) {
            e.printStackTrace();

        }

    }

    private void crearEmpleado(String usuario, String contraseña, String rol) {
        try {
            conexion.setConexion();
            conexion.setConsulta("INSERT INTO tab_usuarios (usuario, contraseña, rol) VALUES (?,?,?)");
            conexion.getConsulta().setString(1, usuario);
            conexion.getConsulta().setString(2, contraseña);
            conexion.getConsulta().setString(3, rol);

            if (conexion.getConsulta().executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Empleado creado");
            } else {
                JOptionPane.showMessageDialog(null, "Error en la operacion!");
            }

            conexion.cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void seleccionarEmpleado() {
        int filaSeleccionada = tablaEmpleado.getSelectedRow();
        if (filaSeleccionada != -1) {
            int idEmpleado = (int) tablaEmpleado.getValueAt(filaSeleccionada, 0);
            int opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de eliminar este registro?",
                    "Confirmación de eliminación", JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.YES_OPTION) {
                eliminarEstudiante(idEmpleado);
                llenarTabla();
            } else {
                JOptionPane.showMessageDialog(null, "Eliminación cancelada.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila para actualizar.");
        }
    }

    private void eliminarEstudiante(int id) {
        try {
            conexion.setConexion();
            conexion.setConsulta("delete from estudiante where id = ?");
            conexion.getConsulta().setInt(1, id);

            if (conexion.getConsulta().executeUpdate() > 0) {
                System.out.println("Estudiante eliminado!");
            } else {
                System.out.println("Error en la operación!");
            }

            conexion.cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void llenarTabla() {

        try {
            DefaultTableModel model = consultaEmpleado();
            tablaEmpleado.setModel(model);
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

    private DefaultTableModel consultaEmpleado() throws SQLException {

        ResultSet resultado = null;
        DefaultTableModel model = null;
        try {
            conexion.setConsulta("Select * from estudiante");
            resultado = conexion.getResultado();
            model = buildTableModel(resultado);
        } catch (SQLException error) {
            error.printStackTrace();
        }
        return model;
    }

    private DefaultTableModel buildTableModel(ResultSet rs) throws SQLException {
        ResultSetMetaData metaData = rs.getMetaData();
        int columnCount = metaData.getColumnCount();
        Vector<String> columnNames = new Vector<>();
        for (int column = 1; column <= columnCount; column++) {
            columnNames.add(metaData.getColumnName(column));
        }
        Vector<Vector<Object>> data = new Vector<>();
        while (rs.next()) {
            Vector<Object> row = new Vector<>();
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                row.add(rs.getObject(columnIndex));
            }
            data.add(row);
        }
        return new DefaultTableModel(data, columnNames);
    }

}
