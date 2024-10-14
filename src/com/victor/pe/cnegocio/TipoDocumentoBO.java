
package com.victor.pe.cnegocio;

import com.victor.pe.cdatosdao.TipoDocumentoDao;
import com.victor.pe.cmodelo.TipoDocumento;
import com.victor.pe.db.Conexion;
//import java.awt.List;
import java.sql.Connection;
import java.sql.SQLException;
<<<<<<< Updated upstream
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.text.ParseException;

=======
import javax.swing.JTable;
>>>>>>> Stashed changes


public class TipoDocumentoBO {
    private String mensaje;
    TipoDocumentoDao tdd = new TipoDocumentoDao();
    
    public String agregarTipoDocumento(TipoDocumento tipoDocumento) throws SQLException{
        Connection c = Conexion.getConnection();
        try {
            mensaje = tdd.agregarTipoDocumento(c, tipoDocumento);
            c.commit();
        } catch (Exception e) {
            c.rollback();
        } finally {
            c.close();
        }
        return mensaje;
    }
    
    public String eliminarTipoDocumento(TipoDocumento tipoDocumento) throws SQLException{
        Connection c = Conexion.getConnection();
        try {
            mensaje = tdd.eliminarTipoDocumento(c, tipoDocumento);
            c.commit();
        } catch (Exception e) {
            c.rollback();
        } finally {
            c.close();
        }
        return mensaje;
    }
    
    public String ModificarTipoDocumento(TipoDocumento tipoDocumento) throws SQLException{
        Connection c = Conexion.getConnection();
        try {
            mensaje = tdd.ModificarTipoDocumento(c, tipoDocumento);
            c.commit();
        } catch (Exception e) {
            c.rollback();
        } finally {
            c.close();
        }
        return mensaje;
    }
    
<<<<<<< Updated upstream
    /*public TipoDocumento getTipoDocumentoById(int id) throws SQLException, ParseException {
    TipoDocumento tipoDoc = null;
    String sql = "SELECT id_tipo_documento, nombre, sigla, estado, orden, fecha_actualiza FROM tipo_documento WHERE id_tipo_documento = ?";

    try (Connection conn = Conexion.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {
        
        stmt.setInt(1, id);  // Setear el ID en el parámetro de la consulta
        try (ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                tipoDoc = new TipoDocumento();
                tipoDoc.setIdTipoDocumento(rs.getInt("id_tipo_documento"));
                tipoDoc.setNombre(rs.getString("nombre"));
                tipoDoc.setSigla(rs.getString("sigla"));
                tipoDoc.setEstado(rs.getString("estado"));
                tipoDoc.setOrden(rs.getInt("orden"));
                tipoDoc.setFechaActualiza(rs.getString("fecha_actualiza"));
            }
        }
    } catch (SQLException e) {
        throw new SQLException("Error al obtener el TipoDocumento con ID: " + id + " - " + e.getMessage());
    }
    return tipoDoc;
}
    
    public TipoDocumento getTipoDocumentoByIdTipoDocumento(int id) throws SQLException, ParseException {
    TipoDocumento tipoDoc = null;
    String sql = "SELECT id_tipo_documento, nombre, sigla, estado, orden, fecha_actualiza FROM tipo_documento WHERE id_tipo_documento = ?";

    try (Connection conn = Conexion.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {
        
        // Setear el ID en el parámetro de la consulta
        stmt.setInt(1, id);
        
        try (ResultSet rs = stmt.executeQuery()) {
            // Verificar si se encontró un registro
            if (rs.next()) {
                tipoDoc = new TipoDocumento();
                tipoDoc.setIdTipoDocumento(rs.getInt("id_tipo_documento"));
                tipoDoc.setNombre(rs.getString("nombre"));
                tipoDoc.setSigla(rs.getString("sigla"));
                tipoDoc.setEstado(rs.getString("estado"));
                tipoDoc.setOrden(rs.getInt("orden"));
                tipoDoc.setFechaActualiza(rs.getString("fecha_actualiza"));
            }
        }
    } catch (SQLException e) {
        throw new SQLException("Error al obtener el TipoDocumento con ID: " + id + " - " + e.getMessage());
    }
    return tipoDoc;
}

    public java.util.List<TipoDocumento> listarTipoDocumento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/


           
=======
    public void ListarTipoDocumento(JTable table) throws SQLException{
        Connection c = Conexion.getConnection();
        try {
            tdd.ListarTipoDocumento(c, table);
            c.commit();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            c.close();
        }
    }
>>>>>>> Stashed changes
}
