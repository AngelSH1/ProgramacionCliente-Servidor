package com.mycompany.proyectofinal;
/**
 La clase Conector se encarga de establecer la conexión con la base de datos.
 Utiliza la clase AccesoBD para crear la conexión y la clase Utils para obtener la información de conexión desde un archivo de configuración.
 @author Dabney Arosemena
 */
public class Conector {
    /**
     * Retorna una instancia de AccesoBD, que representa la conexión a la base de datos.
     * Si la conexión no ha sido establecida previamente, utiliza la clase Utils para obtener la información de conexión desde un archivo de configuración.
     * @return una instancia de AccesoBD, que representa la conexión a la base de datos.
     * @throws Exception sí ocurre un error al establecer la conexión con la base de datos.
     */

    private static AccesoBD coneccionBD = null;

    public static AccesoBD getConnector() throws Exception{

        String[] infoBD = Utils.getProperties();
        String URL = infoBD[0]+ "//"+infoBD[1]+"/"+ infoBD[2] +"?"+infoBD[3]+"&"+
                infoBD[4]+ "&"+infoBD[5];
        String user =infoBD[6];
        String password = infoBD[7];

        if(coneccionBD == null){
            coneccionBD = new AccesoBD(URL,user,password);
        }
        return coneccionBD;
    }
}
