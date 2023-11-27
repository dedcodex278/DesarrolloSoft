package com.medicoeste.accesodatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EspecialidadAD {
    
        public ResultSet getAllEsp(){
        DB db = new DB();
        Connection conexion = db.getConexion();
        // Definir consulta
        String query = "SELECT codigo, nombre FROM especialidad";
        
        try{
            PreparedStatement pst = conexion.prepareStatement(query);
            ResultSet resultado = pst.executeQuery();
            return resultado;
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            return null;
        } 
    }
    
    
}
