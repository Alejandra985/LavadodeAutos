/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lavadodeautos;


public class Modelo {
    private double tipoServicio;
    private double funcionario;
    private double rangoFecha;

    public void setTipoServicio(double tipoServicio) {
        this.tipoServicio = tipoServicio;
    }
    public void setFuncionario(double funcionario) {
        this.funcionario = funcionario;
    }
    public void setRangoFecha(double rangoFecha) {
        this.rangoFecha = rangoFecha;
    }       

    public Double getTipoServicio() {
        return tipoServicio;
    }
    public Double getFuncionario() {
        return funcionario;
    }
    public Double getRangoFecha() {
        return rangoFecha;
    }
    
    public void calcularFecha(int x){
        rangoFecha = rangoFecha * x;
    }
    public void calcularFuncionario(double x){
        funcionario = funcionario * x;
    }
    
}
