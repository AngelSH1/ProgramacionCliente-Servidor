/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shang
 */
public class InfoClase {

    Conexion conexion = new Conexion();

    public DefaultTableModel consultarTodosParaTabla() throws SQLException {
        PreparedStatement consulta = null;
        ResultSet resultado = null;
        DefaultTableModel model = null;
        Connection conectado = conexion.crearConexion();
        try {
            consulta = conectado.prepareStatement("select id_clase, nombre_clase, descripcion_clase, cupo_maximo_estudiantes from tab_clases");
            ///extraer los datos de mysql y las guardamos en java
            resultado = consulta.executeQuery();
            ///recorrer las columnas de la consulta
            model = buildTableModel(resultado);
            while (resultado.next()) {
                int id = resultado.getInt("id_clase");
                String nombreClase = resultado.getString("nombre_clase");
                String descripcion_clase = resultado.getString("descripcion_clase");
                int cupo_maximo_estudiantes = resultado.getInt("cupo_maximo_estudiantes");
                System.out.println("Id: " + id + " Nombre clase: " + nombreClase + " Descripcion: " + descripcion_clase + " Cupos" + cupo_maximo_estudiantes);
            }
            //model = buildTableModel(resultado);
        } catch (SQLException error) {
            error.printStackTrace();
        } finally {////limpia los resultados obtenidos a l hacer la consulta
            if (resultado != null) {
                try {
                    resultado.close();
                } catch (SQLException error) {
                    error.printStackTrace();
                }
            }

            if (consulta != null) {
                try {
                    consulta.close();
                } catch (SQLException error) {
                    error.printStackTrace();
                }
            }
        }
        return model;
    }

    public void insertarClase(String Nombre, String descripcion, int cupo) {
        try {
            ///abricmos conexion
            conexion.setConexion();
            //definimos la consulta
            conexion.setConsulta("insert into tab_clases(nombre_clase, descripcion_clase, cupo_maximo_estudiantes)"
                    + "values(?,?,?)");
            conexion.getConsulta().setString(1, Nombre);
            conexion.getConsulta().setString(2, descripcion);
            conexion.getConsulta().setInt(3, cupo);
            if (conexion.getConsulta().executeUpdate() > 0) {
                System.out.println("Registro Guardado");
            } else {
                System.out.println("Error en la operacion");
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void modificarClase(String Nombre, String descripcion, int cupo, int id) {
        try {
            ///abricmos conexion
            conexion.setConexion();
            //definimos la consulta
            conexion.setConsulta("update tab_clases set nombre_clase = ?, descripcion_clase = ?, cupo_maximo_estudiantes = ? where id_clase = ?");
            conexion.getConsulta().setString(1, Nombre);
            conexion.getConsulta().setString(2, descripcion);
            conexion.getConsulta().setInt(3, cupo);
            conexion.getConsulta().setInt(4, id);
            if (conexion.getConsulta().executeUpdate() > 0) {
                System.out.println("Registro Modificado");
            } else {
                System.out.println("Error en la operacion");
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void eliminarClase(int id) {
        try {
            ///abricmos conexion
            conexion.setConexion();
            //definimos la consulta
            conexion.setConsulta("delete from tab_clases where id_clase = ?");
            conexion.getConsulta().setInt(1, id);
            if (conexion.getConsulta().executeUpdate() > 0) {
                System.out.println("Registro Eliminado");
            } else {
                System.out.println("Error en la operacion");
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public DefaultTableModel consultarTodosPrint() throws SQLException {
        PreparedStatement consulta = null;
        ResultSet resultado = null;
        DefaultTableModel model = null;
        Connection conectado = conexion.crearConexion();
        try {
            consulta = conectado.prepareStatement("select id_clase, nombre_clase, descripcion_clase, cupo_maximo_estudiantes from tab_clases");
            ///extraer los datos de mysql y las guardamos en java
            resultado = consulta.executeQuery();
            ///recorrer las columnas de la consulta
            //model = buildTableModel(resultado);
            while (resultado.next()) {
                int id = resultado.getInt("id_clase");
                String nombreClase = resultado.getString("nombre_clase");
                String descripcion_clase = resultado.getString("descripcion_clase");
                int cupo_maximo_estudiantes = resultado.getInt("cupo_maximo_estudiantes");
                System.out.println("Id: " + id + " Nombre clase: " + nombreClase + " Descripcion: " + descripcion_clase + " Cupos" + cupo_maximo_estudiantes);
            }
            //model = buildTableModel(resultado);
        } catch (SQLException error) {
            error.printStackTrace();
        } finally {////limpia los resultados obtenidos a l hacer la consulta
            if (resultado != null) {
                try {
                    resultado.close();
                } catch (SQLException error) {
                    error.printStackTrace();
                }
            }

            if (consulta != null) {
                try {
                    consulta.close();
                } catch (SQLException error) {
                    error.printStackTrace();
                }
            }
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
