/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmodena.view;

/**
 *
 * @author dmodena
 */
public class Ex10 {
    public static void main(String Args[]) {
        try {
            metodo1();
        }
        catch(NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void metodo1() {
        metodo2();
    }
    
    public static void metodo2() {
        throw new NullPointerException("Lançando uma exceção!");
    }
}
