
package com.victor.pe.cdatosdao;


import com.victor.pe.cmodelo.TipoDocumento;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class TipoDocumentoDao {
    private String mensaje;
    
    //Primer metodo = INSERTAR TIPO DOCUMENTO A LA DB;
    public String agregarTipoDocumento(Connection conn, TipoDocumento tipoDocumento){
        PreparedStatement ps = null;
        String sql = "INSERT INTO TIPO_DOCUMENTO(NOMBRE, SIGLA, ESTADO, ORDEN, FECHA_ACTUALIZA)"
                +"VALUES(?,?,?,?,?)";
                
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, tipoDocumento.getNombre());
            ps.setString(2, tipoDocumento.getSigla());
            ps.setString(3, tipoDocumento.getEstado());
            ps.setInt(4, tipoDocumento.getOrden());
            ps.setString(5, tipoDocumento.getFechaActualiza());
            ps.execute();
            ps.close();
            mensaje = "El tipo documento fue creado correctamente";
        
        }
        
        catch (Exception c) {
            mensaje = "Alto error al crear tipo documento." + c.getMessage();
            System.out.println(c.getMessage());
            

        } 
        return mensaje;
        
    }
    
    //Segundo metodo eliminar
    public String eliminarTipoDocumento(Connection conn, TipoDocumento tipoDocumento){
        PreparedStatement ps = null;
        String sql = "DELETE FROM TIPO_DOCUMENTO WHERE ID_TIPO_DOCUMENTO = ?";
                
        try{
            ps = conn.prepareStatement(sql);
            ps.setInt(1, tipoDocumento.getIdTipoDocumento());
            ps.execute();
            ps.close();
            mensaje = "El tipo documento fue eliminado correctamente";
        
        }catch (Exception e) {
            mensaje = "Alto error al eliminar tipo documento." + e.getMessage();
            System.out.println(e.getMessage());

        } 
        return mensaje;
        
    }
    
    //Tercer metodo = Modificar Tipo Documento
    public String ModificarTipoDocumento(Connection conn, TipoDocumento tipoDocumento){
        PreparedStatement ps = null;
        String sql = "UPDATE TIPO_DOCUMENTO"
                + " SET NOMBRE = ?, SIGLA = ?, ESTADO = ?, ORDEN = ?, FECHA_ACTUALIZA = ? "
                + " WHERE ID_TIPO_DOCUMENTO = ? ";
                
        try{
            ps = conn.prepareStatement(sql);
            ps.setString(1, tipoDocumento.getNombre());
            ps.setString(2, tipoDocumento.getSigla());
            ps.setString(3, tipoDocumento.getEstado());
            ps.setInt(4, tipoDocumento.getOrden());
            ps.setString(5, tipoDocumento.getFechaActualiza());
            ps.setInt(6, tipoDocumento.getIdTipoDocumento());
            ps.execute();
            ps.close();
            mensaje = "El tipo documento fue Modificado correctamente";
        
        }catch (Exception e) {
            mensaje = "Alto error al actualizado tipo documento." + e.getMessage();
            System.out.println(e.getMessage());

        } 
        return mensaje;
        
    }
    //
}
