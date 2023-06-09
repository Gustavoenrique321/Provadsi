/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.prova;


public enum Genero {
   MASCULINO("Masculino",'M'),
   FEMININO("Feminino",'F');
    
   private final char caracter;
   private String nome;

    private Genero(String nome, char caracter) {
        this.caracter = caracter;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
    
   

    
