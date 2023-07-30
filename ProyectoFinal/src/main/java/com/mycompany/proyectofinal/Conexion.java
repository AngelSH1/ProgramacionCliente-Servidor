/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal;

import java.sql.*;

/**
 *
 * @author shang
 */
public class Conexion {

    PreparedStatement consulta = null;
    ResultSet resultado = null;
    Connection conexion = null;
    String url = "jdbc:mysql://localhost:3306/proyecto";
    String username = "root";
    String password = "root";

    public Connection crearConexion() {
        try {
            ////datos de conexion y logueo
            ///realiza la conexion. y preparacion de la consulta que vamos a realizar
            conexion = DriverManager.getConnection(url, username, password);
        } catch (SQLException error) {
            error.printStackTrace();
        }
        return conexion;
    }
    // Métodos para establecer y obtener el PreparedStatement

    public void setConsulta(String sql) {
        try {
            this.consulta = conexion.prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public PreparedStatement getConsulta() {
        return consulta;
    }

    public ResultSet getResultado() {
        try {
            return consulta.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void setConexion() {
        try {
            this.conexion = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void cerrarConexion() {
        if (resultado != null) {
            try {
                resultado.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (consulta != null) {
            try {
                consulta.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conexion != null) {
            try {
                conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
