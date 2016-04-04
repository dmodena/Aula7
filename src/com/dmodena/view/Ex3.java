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
public class Ex3 {
    static String s = "";
    
    public static void main(String[] Args) {
        try {
            s += "1";
            throw new Exception();
        }
        catch(Exception e) {
            s += "2";
        }
        finally {
            s += "3";
            facaAlgo();
            s += "4";
        }
        
        System.out.println(s);
    }
    
    static void facaAlgo() {
        int x = 0;
        int y = 9 / x;
    }
}
