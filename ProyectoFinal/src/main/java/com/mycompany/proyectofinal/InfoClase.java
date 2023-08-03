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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;

/**
 *
 * @author shang
 */
public class InfoClase {

    Conexion conexion = new Conexion();
/////////////////>>>>>>>>>><tabla de clases<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

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

    public DefaultTableModel consultaParaHorarios() throws SQLException {
        PreparedStatement consulta = null;
        ResultSet resultado = null;
        DefaultTableModel model = null;
        Connection conectado = conexion.crearConexion();
        try {
            consulta = conectado.prepareStatement("SELECT TH.ID_HORARIO, TC.NOMBRE_CLASE, TH.FECHA, TH.HORA_INICIO, TH.HORA_FINALIZACION, TI.NOMBRE AS NOMBRE_INSTRUCTOR "
                    + "FROM TAB_HORARIOS TH "
                    + "JOIN TAB_INSTRUCTORES TI ON TH.ID_INSTRUCTOR = TI.ID_INSTRUCTOR "
                    + "JOIN TAB_CLASES TC ON TH.ID_CLASE = TC.ID_CLASE "
                    + "ORDER BY TH.ID_HORARIO;");
            ///extraer los datos de mysql y las guardamos en java
            resultado = consulta.executeQuery();
            ///recorrer las columnas de la consulta
            model = buildTableModel(resultado);
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
/////////////////>>>>>>>>>><tabla de horarios<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

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

    ///<<<<<<<<<<<<<<<<<<<<<<<<<< inserta tabla horarios >>>>>>>>>>>>>>>>>>>>>>>>>>><
    public void insertarHorarios(String fecha, String horaInicio, String horaFinalizacion, int Instructor, int clase) {
        try {
            ///abricmos conexion
            conexion.setConexion();
            //definimos la consulta
            conexion.setConsulta("insert into tab_horarios(FECHA, HORA_INICIO, HORA_FINALIZACION, ID_INSTRUCTOR, ID_CLASE)"
                    + "values(?,?,?,?,?)");
            conexion.getConsulta().setString(1, fecha);
            conexion.getConsulta().setString(2, horaInicio);
            conexion.getConsulta().setString(3, horaFinalizacion);
            conexion.getConsulta().setInt(4, Instructor);
            conexion.getConsulta().setInt(5, clase);
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

    public void modificarHorario(String fecha, String horaInicio, String horaFinalizacion, int Instructor, int clase, int id) {
        try {
            ///abricmos conexion
            conexion.setConexion();
            //definimos la consulta
            conexion.setConsulta("update tab_horarios set FECHA = ?, HORA_INICIO = ?, HORA_FINALIZACION = ?, ID_INSTRUCTOR = ?, ID_CLASE = ? where id_horario = ?");
            conexion.getConsulta().setString(1, fecha);
            conexion.getConsulta().setString(2, horaInicio);
            conexion.getConsulta().setString(3, horaFinalizacion);
            conexion.getConsulta().setInt(4, Instructor);
            conexion.getConsulta().setInt(5, clase);
            conexion.getConsulta().setInt(6, id);
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

    public void eliminarHorario(int id) {
        try {
            ///abricmos conexion
            conexion.setConexion();
            //definimos la consulta
            conexion.setConsulta("delete from tab_horarios where id_horario = ?");
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

    public ArrayList<String> cargarInstructores() {
        ArrayList<String> nombresInstructores = new ArrayList<>();
        try {
            Connection conectado = conexion.crearConexion();
            Statement stmt = conectado.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT NOMBRE FROM tab_instructores");
            while (rs.next()) {
                String nombreInstructor = rs.getString("NOMBRE");
                nombresInstructores.add(nombreInstructor);
            }
            rs.close();
            stmt.close();
            conectado.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return nombresInstructores;
    }

    public ArrayList<String> cargarClases() {
        ArrayList<String> nombresInstructores = new ArrayList<>();
        try {
            Connection conectado = conexion.crearConexion();
            Statement stmt = conectado.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT NOMBRE_CLASE FROM tab_CLASES");
            while (rs.next()) {
                String nombreInstructor = rs.getString("NOMBRE_CLASE");
                nombresInstructores.add(nombreInstructor);
            }
            rs.close();
            stmt.close();
            conectado.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return nombresInstructores;
    }

    public ArrayList<String> cargarIdClases() {
        ArrayList<String> nombresInstructores = new ArrayList<>();
        try {
            Connection conectado = conexion.crearConexion();
            Statement stmt = conectado.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT ID_CLASE FROM tab_CLASES");
            while (rs.next()) {
                int nombreInstructor = rs.getInt("ID_CLASE");
                nombresInstructores.add(String.valueOf(nombreInstructor));
            }
            rs.close();
            stmt.close();
            conectado.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return nombresInstructores;
    }

    public ArrayList<String> cargarIdInstrucores() {
        ArrayList<String> nombresInstructores = new ArrayList<>();
        try {
            Connection conectado = conexion.crearConexion();
            Statement stmt = conectado.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT ID_INSTRUCTOR FROM tab_instructores");
            while (rs.next()) {
                int nombreInstructor = rs.getInt("ID_INSTRUCTOR");
                nombresInstructores.add(String.valueOf(nombreInstructor));
            }
            rs.close();
            stmt.close();
            conectado.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return nombresInstructores;
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
