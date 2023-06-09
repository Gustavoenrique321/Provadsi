/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova;

import java.time.LocalDate;


public abstract class  Fisica extends Pessoa{
    protected LocalDate DataNascimento;
    protected Genero genero;

    public Fisica(LocalDate DataNascimento, Genero genero, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.DataNascimento = DataNascimento;
        this.genero = genero;
    }

    public LocalDate getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(LocalDate DataNascimento) {
        this.DataNascimento = DataNascimento;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\n DataNascimento: " + DataNascimento + 
                "\n genero: " + genero;
    }

   
   
}
