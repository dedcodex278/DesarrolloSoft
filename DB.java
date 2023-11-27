package com.medicoeste.accesodatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    
        public Connection getConexion(){
        Connection cnx = null;
        String usuario = "root";
        String clave = "";
        String url = "jdbc:mysql://localhost/medic_oeste";
        try{
            cnx = DriverManager.getConnection(url, usuario, clave);
            return cnx;
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
            return null;
        }
    }
    
}
