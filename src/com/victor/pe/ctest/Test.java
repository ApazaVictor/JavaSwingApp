
package com.victor.pe.ctest;

import com.victor.pe.cmodelo.TipoDocumento;
import com.victor.pe.cnegocio.TipoDocumentoBO;
import java.sql.SQLException;
import java.text.ParseException;
//import java.util.Date;

public class Test {
    TipoDocumentoBO tdbo = new  TipoDocumentoBO();
    TipoDocumento td = new TipoDocumento();
    
    public  void insertar() throws SQLException, ParseException{
        td.setNombre("jkasbdjhasbvd asfdbhsa dvhka");
        td.setEstado("1");
        td.setOrden(1);
        td.setSigla("DNIA");
        //td.setFecha("12-12-12");
        td.setFechaActualiza("09-10-2024");
        tdbo.agregarTipoDocumento(td);
    }
    
    public  void eliminar() throws SQLException, ParseException{
        td.setIdTipoDocumento(9);
        tdbo.eliminarTipoDocumento(td);
    }
    
    public  void modificar() throws SQLException, ParseException{
        td.setNombre("Diego");
        td.setEstado("1");
        td.setOrden(1);
        td.setSigla("D");
        //td.setFecha("12-12-12");
        td.setFechaActualiza("09-10-2024");
        td.setIdTipoDocumento(11);
        
        tdbo.ModificarTipoDocumento(td);
    }
    
    public static void main(String[] args) throws SQLException, ParseException {
        Test t = new  Test();
        //t.insertar();
        //t.eliminar();
        t.modificar();
    }
}


    


