package com.mycompany.proyectofinal;

import com.mycompany.proyectofinal.InterfazEmpleado.MenuPrincipalEmpleado;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Daniel
 */
public class Funciones {

    Conexion conexion = new Conexion();
    ResultSet resultado = null;
    private static String usuario;
    private static String contraseña;
    private static JTextField textField1;
    private static JTextField textField2;
    private static JTextField textField3;
    private static String perfil;
    private static JComboBox campoCliente;

    private boolean campos(JTextField textField1, JTextField textField2, JTextField textField3) {

        if ((textField1.getText().equals("")) || (textField2.getText().equals("")) || (textField3.getText().equals(""))) {
            return true;

        } else {
            return false;
        }

    }

    private boolean campos2(JTextField textField1, JTextField textField2) {

        if ((textField1.getText().equals("")) || (textField2.getText().equals(""))) {
            return true;

        } else {
            return false;
        }

    }

    public void ingresarMenu(JTextField textField1, JTextField textField2) {
        try {
            usuario = textField1.getText();
            contraseña = textField2.getText();
            if (campos2(textField1, textField2)) {
                JOptionPane.showMessageDialog(null, "Campos en Blanco");
                throw new Exception();
            } else {
                if (existeUsuario(textField1)) {
                    MenuPrincipalEmpleado ventanaMenuPrincipal = new MenuPrincipalEmpleado();
                    ventanaMenuPrincipal.setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(null, "El Usuario No Existe");
                    throw new Exception();

                }

            }

        } catch (Exception e) {
            e.printStackTrace();

        }

    }

    public void guardarDatos(JTextField textField1, JTextField textField2, JTextField textField3, JComboBox campoCliente) {
        try {
            usuario = textField1.getText();
            contraseña = textField2.getText();
            //rol = campoCliente.getText();

            if (campos(textField1, textField2, textField3)) {
                throw new Exception();
            } else {
                if (textField2.getText().equals(textField3.getText())) {
                    crearUsuario(usuario, contraseña);
                } else {
                    throw new Exception();
                }

            }

        } catch (Exception e) {
            e.printStackTrace();

        }

    }

    private void crearUsuario(String usuario, String contraseña) {
        try {
            conexion.setConexion();
            conexion.setConsulta("INSERT INTO tab_usuarios (usuario, contraseña) VALUES (?,?)");
            conexion.getConsulta().setString(1, usuario);
            conexion.getConsulta().setString(2, contraseña);

            if (conexion.getConsulta().executeUpdate() > 0) {
                System.out.println("Cliente guardado!");
            } else {
                System.out.println("Error en la operacion!");
            }

            conexion.cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private boolean existeUsuario(JTextField textField1) {
        try {
            conexion.setConexion();
            conexion.setConsulta("SELECT count(*) FROM tab_usuarios WHERE usuario = ?");
            conexion.getConsulta().setString(1, textField1.getText());
            ResultSet resultSet = conexion.getConsulta().executeQuery();
            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                if (count > 0) {
                    return true;
                }
            }

            conexion.cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

}
