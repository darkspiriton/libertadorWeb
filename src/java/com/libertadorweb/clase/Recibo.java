/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.libertadorweb.clase;

/**
 *
 * @author StOn
 */
public class Recibo {
    private int cod;
    private int dni;
    private int monto;
    private String estado;

    public Recibo() {
    }

    public Recibo(int cod, int dni, int monto, String estado) {
        this.cod = cod;
        this.dni = dni;
        this.monto = monto;
        this.estado = estado;
    }

      

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
}
