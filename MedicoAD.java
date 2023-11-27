package com.medicoeste.accesodatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MedicoAD {
    
        public ResultSet getAllMed(){
        DB db = new DB();
        Connection conexion = db.getConexion();
        // Definir consulta
        String query = "SELECT m.rut, m.nombre, m.apellido_pat, m.apellido_mat, e.nombre FROM medico m JOIN especialidad e ON m.cod_especialidad = e.codigo ORDER BY m.cod_especialidad ASC";
        
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
