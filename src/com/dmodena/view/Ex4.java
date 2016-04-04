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
public class Ex4 {
    
    public static void lancar() {
        System.out.print("throw ");
        throw new RuntimeException();
    }
    
    public static void main(String[] Args) {
        try {
            System.out.print("olá ");
            lancar();
        }
        catch(Exception e) {
            System.out.print("catch ");
        }
        finally {
            System.out.print("finally ");
        }
        
        System.out.println("depois ");
    }
}
