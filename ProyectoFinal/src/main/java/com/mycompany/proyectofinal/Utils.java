package com.mycompany.proyectofinal;

import java.io.FileInputStream;
import java.util.Properties;

/**
 La clase Utils contiene un método estático para recuperar propiedades desde un archivo de configuración.
 @author Dabney Arosemena
 */

public class Utils {
    /**
     * Recupera propiedades desde un archivo de configuración.
     * @return un arreglo de String que contiene las propiedades recuperadas, o null si ocurre un error.
     */
    public static String[] getProperties(){
        String[] properties = new String[8];
        Properties p = new Properties();
        String path ="";

        try {
            p.load(new FileInputStream(path));
            properties[0] = p.getProperty("driver");
            properties[1] = p.getProperty("server");
            properties[2] = p.getProperty("dataBase");
            properties[3] = p.getProperty("useSSL");
            properties[4] = p.getProperty("allowPublicKeyRetrieval");
            properties[5] = p.getProperty("serverTimezone");
            properties[6] = p.getProperty("user");
            properties[7] = p.getProperty("password");

            return properties;

        }catch(Exception e){
            return null;
        }
    }

}
