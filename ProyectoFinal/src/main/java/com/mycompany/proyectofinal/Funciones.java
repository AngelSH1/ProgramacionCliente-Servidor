package com.mycompany.proyectofinal;

import com.mycompany.proyectofinal.InterfazCliente.MenuPrincipalCliente;
import com.mycompany.proyectofinal.InterfazEmpleado.MenuPrincipalEmpleado;
import java.sql.*;
import javax.swing.*;

/**
 *
 * Proyecto creado por Dabney Arosemena Alpízar / Daniel Gilberto Picado Urbina
 * / Angel Salmeron Hernández
 */
public class Funciones {

    Conexion conexion = new Conexion();
    ResultSet resultado = null;
    private static String usuario;
    private static String contraseña;
    private static String rol;
    private static JTextField textField1;
    private static JTextField textField2;
    private static JTextField textField3;
    private static String perfil;
    private static JComboBox campoRol;

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
    String nombreUsuario;

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void ingresarMenu(JTextField textField1, JTextField textField2) {
        try {
            if (campos2(textField1, textField2)) {
                JOptionPane.showMessageDialog(null, "Campos en blanco");
                throw new Exception();
            } else {
                if (existeUsuario(textField1, textField2)) {
                    if (existeCliente(textField1, textField2)) {
                        MenuPrincipalCliente ventanaCliente = new MenuPrincipalCliente(textField1.getText());
                        ventanaCliente.setVisible(true);

                        //ventanaCliente.setNombreUsuario(textField1.getText());
                        //ventanaCliente.prueba(textField1.getText());
                    } else {
                        MenuPrincipalEmpleado ventanaEmpleado = new MenuPrincipalEmpleado();
                        ventanaEmpleado.setVisible(true);

                    }

                } else {
                    JOptionPane.showMessageDialog(null, "El usuario no existe");
                    throw new Exception();

                }

            }

        } catch (Exception e) {
            e.printStackTrace();

        }

    }

    public void guardarDatos(JTextField textField1, JTextField textField2, JTextField textField3, JComboBox campoRol) {
        try {
            usuario = textField1.getText();
            contraseña = textField2.getText();
            rol = (String) campoRol.getSelectedItem();

            if (campos(textField1, textField2, textField3)) {
                throw new Exception();
            } else {
                if (textField2.getText().equals(textField3.getText())) {
                    crearUsuario(usuario, contraseña, rol);
                } else {
                    throw new Exception();
                }

            }

        } catch (Exception e) {
            e.printStackTrace();

        }

    }

    private void crearUsuario(String usuario, String contraseña, String rol) {
        try {
            conexion.setConexion();
            conexion.setConsulta("INSERT INTO tab_usuarios (contraseña, usuario, rol) VALUES (?,?,?)");
            conexion.getConsulta().setString(1, contraseña);
            conexion.getConsulta().setString(2, usuario);
            conexion.getConsulta().setString(3, rol);
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

    private boolean existeUsuario(JTextField textField1, JTextField textField2) {
        try {
            conexion.setConexion();
            conexion.setConsulta("SELECT count(*) FROM tab_usuarios WHERE usuario = ? and contraseña = ?");
            conexion.getConsulta().setString(1, textField1.getText());
            conexion.getConsulta().setString(2, textField2.getText());
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

    private boolean existeCliente(JTextField textField1, JTextField textField2) {
        boolean esCliente = false;
        try {

            conexion.setConexion();
            //Definimos la consulta
            conexion.setConsulta("Select rol from tab_usuarios where usuario = ? and contraseña = ?");
            conexion.getConsulta().setString(1, textField1.getText());
            conexion.getConsulta().setString(2, textField2.getText());
            resultado = conexion.getResultado();

            while (resultado.next()) {
                String rol = resultado.getString("rol");
                if (rol.equals("Cliente")) {
                    esCliente = true;

                }

            }

            conexion.cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return esCliente;

    }
}
