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
public class Conta {
    private float saldo;
    
    public float getSaldo() {
        return saldo;
    }
    
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public void efetuarSaque(int valor) throws IllegalArgumentException {
        if(valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente!");
        }
        else {
            saldo -= valor;
        }
    }
    
    public void efetuarDeposito(int valor) throws IllegalArgumentException {
        if(valor < 0) {
            throw new IllegalArgumentException("Operação ilegal. O valor informado é negativo!");
        }
        else {
            saldo += valor;
        }
    }
}
