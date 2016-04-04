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
public class Ex5 {
    
    public static void throwit() {
        throw new RuntimeException();
    }
    
    public static void main(String Args[]) {
        try{
            System.out.println("Olá ");
            throwit();
            System.out.println("Bloco try");
        }
        finally {
            System.out.println("Executando finally ");
        }
    }
}
