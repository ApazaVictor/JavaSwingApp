
package com.victor.pe.cnegocio;

import java.sql.Connection;
import com.victor.pe.cdatosdao.TipoDocumentoDao;
import com.victor.pe.cmodelo.TipoDocumento;
import com.victor.pe.db.Conexion;
import java.sql.SQLException;
import javax.swing.JTable;


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
    
    public void ListarTipoDocumento(JTable table) throws SQLException{
        Connection c = Conexion.getConnection();
        try {
            tdd.listarTipoDocumento(c, table);
            c.commit();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            c.close();
        }
    }
}
