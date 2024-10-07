
package com.victor.pe.ctest;

import com.victor.pe.cmodelo.TipoDocumento;
import com.victor.pe.cnegocio.TipoDocumentoBO;
import java.sql.SQLException;


public class Test {
    TipoDocumentoBO tdbo = new TipoDocumentoBO();
    TipoDocumento td = new TipoDocumento();
    
    public void insertar() throws SQLException{
       td.setNombre("Registro Nacional de identidad");
       td.setEstado("1");
       td.setOrden(1);
       td.setSigla("DNI");
       //td.setFecha("12/12/12");
       tdbo.agregarTipoDocumento(td);
    }
    public static void main(String[] arge) throws SQLException {
        Test t = new Test();
        t.insertar();
    }
}
