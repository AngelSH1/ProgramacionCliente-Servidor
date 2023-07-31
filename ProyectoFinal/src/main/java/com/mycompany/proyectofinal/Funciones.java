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
    private static JTextField textField1;
    private static JTextField textField2;
    private static JTextField textField3;

    private boolean campos() {
        textField1 = new JTextField();
        textField2 = new JTextField();
        textField3 = new JTextField();

        if ((textField1.getText().equals("")) || (textField2.getText().equals("")) || (textField3.getText().equals(""))) {
            return true;

        } else {
            return false;
        }

    }

    public void ingresarMenu(JTextField textField1, JTextField textField2) {
        try {
            usuario = textField1.getText();
            contraseña = textField2.getText();

            if (campos()) {
                throw new Exception();
            } else {
                if (existeUsuario(textField1)) {
                    MenuPrincipal ventanaMenuPrincipal = new MenuPrincipal();
                    ventanaMenuPrincipal.setVisible(true);

                } else {
                    throw new Exception();

                }

            }

        } catch (Exception e) {
            e.printStackTrace();

        }

    }

    public void guardarDatos(JTextField textField1, JTextField textField2, JTextField textField3) {
        try {
            usuario = textField1.getText();
            contraseña = textField2.getText();

            if (campos()) {
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
            conexion.setConsulta("INSERT INTO persona (usuario, contraseña) VALUES (?,?)");
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
            conexion.setConsulta("SELECT COUNT(*) FROM persona WHERE usuario =" + textField1.getText());
            conexion.getConsulta().setString(1, usuario);
            if (resultado.next()) {
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
