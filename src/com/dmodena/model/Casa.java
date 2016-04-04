/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmodena.model;

/**
 *
 * @author dmodena
 */
public class Casa {
    private boolean alugada;
    private double valorAluguel;
    private double totalAluguel;
    
    public Casa() {
        alugada = false;
        valorAluguel = 0d;
        totalAluguel = 0d;
    }
    
    public boolean getAlugada() {
        return alugada;
    }
    
    public double getValorAluguel() {
        return valorAluguel;
    }
    
    public double getTotalAluguel() {
        return totalAluguel;
    }
    
    public void iniciarContrato(double valorAluguel) {
        this.valorAluguel = valorAluguel;
        alugada = true;
    }
    
    public void encerrarContrato() {
        totalAluguel += valorAluguel;
        valorAluguel = 0d;
        alugada = false;
    }
    
    
}
