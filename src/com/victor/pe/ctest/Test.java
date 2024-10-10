
package com.victor.pe.ctest;

import com.victor.pe.cmodelo.TipoDocumento;
import com.victor.pe.cnegocio.TipoDocumentoBO;
import java.sql.SQLException;
import java.text.ParseException;


public class Test {
    TipoDocumentoBO tdbo = new TipoDocumentoBO();
    TipoDocumento td = new TipoDocumento();
    
    public void insertar() throws SQLException, ParseException{
       td.setNombre("Registro Nacional de identidad");
       td.setEstado("1");
       td.setOrden(1);
       td.setSigla("DNI");
       td.setFechaActualiza("12-12-2012");
       tdbo.agregarTipoDocumento(td);
    } 
    
    /*public void eliminar() throws SQLException, ParseException{
       td.setIdTipoDocumento(1);
       tdbo.eliminarTipoDocumento(td);
    }*/
    
    public void Modificar() throws SQLException, ParseException{
       td.setIdTipoDocumento(3);
       td.setNombre("Hugo");
       td.setEstado("Bien");
       td.setOrden(3);
       td.setSigla("Ok");
       td.setFechaActualiza("09-10-2024");
       tdbo.ModificarTipoDocumento(td);
    }
    
    public static void main(String[] arge) throws SQLException, ParseException {
        Test t = new Test();
        t.Modificar();
    }
    
    /*public static void main(String[] arge) throws SQLException, ParseException {
        Test t = new Test();
        t.eliminar();
    }*/
    
    /*public static void main(String[] arge) throws SQLException, ParseException {
        Test t = new Test();
        t.insertar();
    }*/
    
}



    


