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
public class Ex2 {
    static String s = "-";
    
    public static void main(String[] Args) {
        try{
            throw new Exception();
        }
        catch(Exception e) {
            try {
                try {
                    throw new Exception();
                }
                catch(Exception ex) {
                    s += "ic ";
                }
                
                throw new Exception();
            }
            catch(Exception x) {
                s += " mc";
            }
            finally {
                s += " mf";
            }
        }
        finally {
            s += " of";
        }
        
        System.out.println(s);
    }
}
