/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.victor.pe.cmodelo;

import java.util.Date;

/**
 *
 * @author Alumno-PB203
 */
public class TipoDocumento {
    private int idTipoDocumento;
    private String nombre;
    private String sigla;
    private String estado;
    private int orden;
    //private Date fecha;

    /*public TipoDocumento(int idTipoDocumento, String nombre, String sigla, String estado, int orden) {
        this.idTipoDocumento = idTipoDocumento;
        this.nombre = nombre;
        this.sigla = sigla;
        this.estado = estado;
        this.orden = orden;
    }*/

    public int getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(int idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }
    
    
    
}
