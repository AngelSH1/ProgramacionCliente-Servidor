package com.mycompany.proyectofinal;

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

    private boolean camposIngresar(JTextField textField1, JTextField textField2) {

        if ((textField1.getText().isEmpty()) || (textField2.getText().isEmpty())) {
            return true;

        } else {
            return false;
        }

    }

    private boolean campoVerificar(JTextField textField3) {

        if ((textField3.getText().isEmpty())) {
            return true;
        } else {
            return false;

        }
    }

    public void ingresarMenu(JTextField textField1, JTextField textField2) {

        try {
            textField1.getText();
            textField2.getText();
            if (camposIngresar(textField1, textField2)) {
                throw new Exception();

            } else {
                if (existeUsuario01(textField1)) {
                    MenuPrincipal menuPrincipal = new MenuPrincipal();
                    menuPrincipal.setVisible(true);
                } else {
                    throw new Exception();
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
    }

    public void guardarDatos(JTextField textField1, JTextField textField2, JTextField textField3) {
        try {
            usuario = textField1.getText();
            contraseña = textField2.getText();

            if (camposIngresar(textField1, textField2) && campoVerificar(textField3)) {
                throw new Exception();
            } else {
                if (textField2.getText().equals(textField3.getText())) {
                    crearUsuario(usuario, contraseña);
                } else {
                    throw new Exception();
                }

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }

    }

    private void crearUsuario(String usuario, String contraseña) {
        try {
            conexion.setConexion();
            conexion.setConsulta("INSERT INTO tab_usuarios (contraseña, nombre) VALUES (?,?)");
            conexion.getConsulta().setString(1, contraseña);
            conexion.getConsulta().setString(2, usuario);

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

    private boolean existeUsuario01(JTextField textField1) {
        try {
            conexion.setConexion();
            conexion.setConsulta("select count(*) from tab_usuarios WHERE nombre = ?");
            conexion.getConsulta().setString(1, textField1.getText());
            resultado = conexion.getConsulta().executeQuery();
            if (resultado != null && resultado.next()) {
                int cuenta = resultado.getInt(1);
                return cuenta > 0;
            }

            conexion.cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;

    }

    private boolean existeUsuario02(JTextField textField1) {
        try {
            conexion.setConexion();
            conexion.setConsulta("select count(*) from tab_usuarios WHERE nombre = ?");
            conexion.getConsulta().setString(1, textField1.getText());
            resultado = conexion.getConsulta().executeQuery();
            if (resultado != null && resultado.next()) {
                int cuenta = resultado.getInt(1);
                return cuenta > 0;
            }

            conexion.cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

}
