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
public class Pedido {
    private int idPedido;
    private int idUsuario;
    private Date fechapedido;
    private String estado;

    public Pedido(int idPedido, int idUsuario, Date fechapedido, String estado) {
        this.idPedido = idPedido;
        this.idUsuario = idUsuario;
        this.fechapedido = fechapedido;
        this.estado = estado;
    }
    
    
}

