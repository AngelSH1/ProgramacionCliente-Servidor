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
import javax.swing.JOptionPane;

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

//METODOS RUTINAS    
    public void insertarRutina(String grupoMuscular, String ejercicio, int series, int repeticiones) {
        try {
            ///abrimos conexion
            conexion.setConexion();
            //definimos la consulta
            conexion.setConsulta("insert into tab_rutinas(nombre_rutina, nombre_ejercicio, series, repeticiones)"
                    + "values(?,?,?,?)");
            conexion.getConsulta().setString(1, grupoMuscular);
            conexion.getConsulta().setString(2, ejercicio);
            conexion.getConsulta().setInt(3, series);
            conexion.getConsulta().setInt(4, repeticiones);
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

    public DefaultTableModel consultaParaRutinas() throws SQLException {
        PreparedStatement consulta = null;
        ResultSet resultado = null;
        DefaultTableModel model = null;
        Connection conectado = conexion.crearConexion();
        try {
            consulta = conectado.prepareStatement("select id_rutina, nombre_rutina, nombre_ejercicio, series, repeticiones from tab_rutinas");
            ///extraer los datos de mysql y las guardamos en java
            resultado = consulta.executeQuery();
            ///recorrer las columnas de la consulta
            model = buildTableModel(resultado);
            while (resultado.next()) {
                int id = resultado.getInt("id_rutina");
                String nombreRutina = resultado.getString("nombre_rutina");
                String nombreEjercicio = resultado.getString("nombre_ejercicio");
                int series = resultado.getInt("series");
                int repeticiones = resultado.getInt("repeticiones");
                System.out.println("Id: " + id
                        + " Nombre de la rutina: \n" + nombreRutina
                        + " Nombre del ejercicio: \n" + nombreEjercicio
                        + " Series: \n" + series
                        + " Repeticiones: " + repeticiones);
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

    public void modificarRutina(String grupoMuscular, String ejercicio, int series, int repeticiones, int id) {
        try {
            ///abricmos conexion
            conexion.setConexion();
            //definimos la consulta
            conexion.setConsulta("update tab_rutinas set NOMBRE_RUTINA = ?, NOMBRE_EJERCICIO = ?, SERIES = ?, REPETICIONES = ? where id_rutina = ?");
            conexion.getConsulta().setString(1, grupoMuscular);
            conexion.getConsulta().setString(2, ejercicio);
            conexion.getConsulta().setInt(3, series);
            conexion.getConsulta().setInt(4, repeticiones);
            conexion.getConsulta().setInt(5, id);
            if (conexion.getConsulta().executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Registro Actualizado");
                System.out.println("Registro Modificado");
            } else {
                System.out.println("Error en la operacion");
                JOptionPane.showMessageDialog(null, "Para poder actualizar debes seleccionar la fila y clickear en ´Seleccionar´.");
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminarRutina(int id) {
        try {
            ///abricmos conexion
            conexion.setConexion();
            //definimos la consulta
            conexion.setConsulta("delete from tab_rutinas where id_rutina = ?");
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

    //FIN METODOS RUTINAS  
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

    ////METODOS PARA TABLA INSTRUCTORES
    public DefaultTableModel consultaParaInstructores() throws SQLException {
        PreparedStatement consulta = null;
        ResultSet resultado = null;
        DefaultTableModel model = null;
        Connection conectado = conexion.crearConexion();
        try {
            consulta = conectado.prepareStatement("SELECT ID_INSTRUCTOR, NOMBRE, APELLIDO, ESPECIALIDAD FROM TAB_INSTRUCTORES");
            resultado = consulta.executeQuery();
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

    public void insertarIntructor(String nombre, String apellido, String especialidad) {
        try {
            conexion.setConexion();
            conexion.setConsulta("insert into tab_instructores(nombre, apellido, especialidad)"
                    + "values(?,?,?)");
            conexion.getConsulta().setString(1, nombre);
            conexion.getConsulta().setString(2, apellido);
            conexion.getConsulta().setString(3, especialidad);
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

    public void modificarInstructor(int id, String nombre, String apellido, String especialidad) {
        try {
            conexion.setConexion();
            conexion.setConsulta("update tab_instructores set nombre = ?, apellido = ?, especialidad = ? where id_instructor = ?");
            conexion.getConsulta().setString(1, nombre);
            conexion.getConsulta().setString(2, apellido);
            conexion.getConsulta().setString(3, especialidad);
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

    public void eliminarInstructor(int id) {
        try {
            conexion.setConexion();
            conexion.setConsulta("delete from tab_instructores where id_instructor = ?");
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

    ///FIN METODOS TABLA INSTRUCTORES
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
///////METODOS TABLA MATRICULA CLIENTE

    public DefaultTableModel consultaParaMatricula(String id) throws SQLException {
        PreparedStatement consulta = null;
        ResultSet resultado = null;
        DefaultTableModel model = null;
        Connection conectado = conexion.crearConexion();

        try {
            consulta = conectado.prepareStatement("SELECT US.USUARIO, TC.NOMBRE_CLASE, TH.FECHA, TH.HORA_INICIO, TH.HORA_FINALIZACION, TI.NOMBRE AS NOMBRE_INSTRUCTOR\n"
                    + "FROM TAB_MATRICULA MT "
                    + "JOIN TAB_HORARIOS TH ON TH.ID_HORARIO = MT.ID_HORARIO_MATRICULADO "
                    + "JOIN TAB_INSTRUCTORES TI ON TH.ID_INSTRUCTOR = TI.ID_INSTRUCTOR "
                    + "JOIN TAB_CLASES TC ON TH.ID_CLASE = TC.ID_CLASE "
                    + "JOIN TAB_USUARIOS US ON MT.ID_USUARIO = US.ID_USUARIO "
                    + "WHERE US.USUARIO = ?;");
            consulta.setString(1, id);  // Set the parameter value

            resultado = consulta.executeQuery();

            // Populate data into DefaultTableModel
            String[] columnNames = {"Usuario", "Nombre Clase", "Fecha", "Hora Inicio", "Hora Finalización", "Nombre Instructor"};
            model = new DefaultTableModel(columnNames, 0);

            while (resultado.next()) {
                String usuario = resultado.getString("USUARIO");
                String nombreClase = resultado.getString("NOMBRE_CLASE");
                String fecha = resultado.getString("FECHA");
                String horaInicio = resultado.getString("HORA_INICIO");
                String horaFinalizacion = resultado.getString("HORA_FINALIZACION");
                String nombreInstructor = resultado.getString("NOMBRE_INSTRUCTOR");

                Object[] rowData = {usuario, nombreClase, fecha, horaInicio, horaFinalizacion, nombreInstructor};
                model.addRow(rowData);
            }
        } catch (SQLException error) {
            error.printStackTrace();
        } finally {
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
    int id_usuario;

    public int encontrarId(String nombreUsuario) {
        int id_usuario = -1; // Valor por defecto en caso de no encontrar un ID

        try {
            Connection conectado = conexion.crearConexion();
            PreparedStatement stmt = conectado.prepareStatement("SELECT ID_USUARIO FROM tab_USUARIOS WHERE USUARIO = ?");
            stmt.setString(1, nombreUsuario);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                id_usuario = rs.getInt("ID_USUARIO");
            }

            rs.close();
            stmt.close();
            conectado.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(id_usuario);
        return id_usuario;
    }

    public void insertarMatricula(String nombreUsuario, int id_horario) {
        try {
            int i=encontrarId(nombreUsuario);
            conexion.setConexion();
            conexion.setConsulta("insert into tab_matricula(ID_USUARIO, ID_HORARIO_MATRICULADO)"
                    + "values(?,?)");
            conexion.getConsulta().setInt(1, i);
            conexion.getConsulta().setInt(2, id_horario);
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

    //CODIGO PARA EL JFRAME PANELUSUARIOEMPLEADO
    public void insertarEmpleado(String usuario, String contraseña, String rol) {
        try {
            ///abrimos conexion
            conexion.setConexion();
            //definimos la consulta
            conexion.setConsulta("insert into tab_usuarios(contraseña,usuario,rol)"
                    + "values(?,?,?)");
            conexion.getConsulta().setString(1, contraseña);
            conexion.getConsulta().setString(2, usuario);
            conexion.getConsulta().setString(3, rol);

            if (conexion.getConsulta().executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Empleado Guardado");
            } else {
                JOptionPane.showMessageDialog(null, "Error en la operacion");
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public DefaultTableModel consultaEmpleados() throws SQLException {
        PreparedStatement consulta = null;
        ResultSet resultado = null;
        DefaultTableModel model = null;
        Connection conectado = conexion.crearConexion();
        try {
            consulta = conectado.prepareStatement("select id_usuario,contraseña,usuario,rol from tab_usuarios");
            ///extraer los datos de mysql y las guardamos en java
            resultado = consulta.executeQuery();
            ///recorrer las columnas de la consulta
            model = buildTableModel(resultado);
            while (resultado.next()) {
                int id = resultado.getInt("id_rutina");
                String usuario = resultado.getString("usuario");
                String contraseña = resultado.getString("contraseña");
                String rol = resultado.getString("rol");

                System.out.println("Id: " + id
                        + " Usuario: \n" + usuario
                        + " Nombre del ejercicio: \n" + contraseña
                        + " Series: \n" + rol);
            }
            conexion.cerrarConexion();
        } catch (SQLException error) {
            error.printStackTrace();

        }
        return model;
    }

    public void modificarEmpleado(int id, String usuario, String contraseña) {
        try {
            conexion.setConexion();
            conexion.setConsulta("update tab_usuarios set contraseña = ?, usuario = ? where id_usuario = " + id);
            conexion.getConsulta().setString(1, contraseña);
            conexion.getConsulta().setString(2, usuario);
            if (conexion.getConsulta().executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Empleado modificado");
                System.out.println("Registro Modificado");
            } else {
                System.out.println("Error en la operacion");
                JOptionPane.showMessageDialog(null, "Para poder actualizar debes seleccionar la fila y clickear en Seleccionar.");
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminarEmpleado(int id) {
        try {
            ///abricmos conexion
            conexion.setConexion();
            //definimos la consulta
            conexion.setConsulta("delete from tab_usuarios where id_usuario = ?");
            conexion.getConsulta().setInt(1, id);
            if (conexion.getConsulta().executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Empleado Eliminado");
            } else {
                System.out.println("Error en la operacion");
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // FIN DE CODIGO PARA EL JFRAME PANELUSUARIOEMPLEADO

}
