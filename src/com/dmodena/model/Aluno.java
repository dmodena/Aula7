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
public class Aluno {
    private int matricula;
    private String nome;
    private String email;
    private double nota1;
    private double nota2;
    
    public Aluno(int matricula, String nome, String email) {
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) throws IllegalArgumentException {
        if(nota1 < 0 || nota1 > 10) 
            throw new IllegalArgumentException("Nota deve estar entre  0 e 10.");        
        else 
            this.nota1 = nota1;
               
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        if(nota2 < 0 || nota2 > 10)
            throw new IllegalArgumentException("Nota deve estar entre 0 e 10.");
        else
            this.nota2 = nota2;        
    }   
    
    public double getMedia() {
        return (nota1 + nota2) / 2;
    }
}
