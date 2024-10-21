
package com.victor.pe.cnegocio;

import java.sql.Connection;
import com.victor.pe.cdatosdao.TipoDocumentoDao;
import com.victor.pe.cmodelo.TipoDocumento;
import com.victor.pe.db.Conexion;
import java.sql.SQLException;
import java.util.ArrayList;
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
    
    public void listarTipoDocumento(JTable table){
        Connection c = Conexion.getConnection();
        tdd.listarTipoDocumento(c, table);
        try {
            c.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } 
    }
    /*public ArrayList<TipoDocumento> listarTipoDocumentoCombo(){
        ArrayList<TipoDocumento> listaTipoDocumento = new ArrayList<>();
        Connection c = Conexion.getConnection();
        listaTipoDocumento = tdd.listarTipoDocumentosCombo(c);
        try {
            c.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } 
        return listaTipoDocumento;
    }
}*/
    public ArrayList<TipoDocumento> listarTipoDocumentoCombo() {
    ArrayList<TipoDocumento> listaTipoDocumento = new ArrayList<>();
    Connection c = null;
    TipoDocumentoDao tdd = new TipoDocumentoDao(); // Aquí se instancia

    try {
        c = Conexion.getConnection(); // Obtener conexión a la base de datos
        if (c != null) {
            listaTipoDocumento = tdd.listarTipoDocumentoCombo(c); // Llama al método
        } else {
            System.out.println("Error: la conexión es null.");
        }
    } catch (Exception e) {
        System.out.println("Error al listar tipo documentos para combo: " + e.getMessage());
    } finally {
        if (c != null) {
            try {
                c.close(); // Cerrar conexión
            } catch (Exception e) {
                System.out.println("Error al cerrar conexión: " + e.getMessage());
            }
        }
    }
    return listaTipoDocumento;
  }

}
    
