
package com.victor.pe.cdatosdao;


import com.victor.pe.cmodelo.TipoDocumento;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class TipoDocumentoDao {
    private String mensaje;
    
    //Primer metodo = INSERTAR TIPO DOCUMENTO A LA DB;
    public String agregarTipoDocumento(Connection conn, TipoDocumento tipoDocumento){
        PreparedStatement ps = null;
        String sql = "INSERT INTO TIPO_DOCUMENTO(ID_TIPO_DOCUMENTO, (NOMBRE, SIGLA, ESTADO, ORDEN)"
                +"VALUES(?,?,?,?,?)";
                
        try{
            ps = conn.prepareStatement(sql);
            ps.setString(1, tipoDocumento.getNombre());
            ps.setString(2, tipoDocumento.getSigla());
            ps.setString(3, tipoDocumento.getEstado());
            ps.setInt(4, tipoDocumento.getOrden());
            //ps.setDate(5, (Date) tipoDocumento.getFacha());
            ps.execute();
            ps.close();
            mensaje = "El tipo documento fue creado correctamente";
        
        }catch (Exception c) {
            mensaje = "Alto error al crear tipo documento." + c.getMessage();
            System.out.println(c.getMessage());

        } 
        return mensaje;
        
    }
    
    //Segundo Metodo = MODIFICAR TIPO DOCUMENTO.
}
