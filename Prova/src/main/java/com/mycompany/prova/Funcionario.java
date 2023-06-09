/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public abstract class Funcionario extends Fisica{
    protected String cpf;
    protected String rg;
    protected String matricula;
    protected double salario;

    public Funcionario(String cpf, String rg, String matricula, double salario, LocalDate DataNascimento, Genero genero, String nome, String telefone, String email, Endereco endereco) {
        super(DataNascimento, genero, nome, telefone, email, endereco);
        this.cpf = cpf;
        this.rg = rg;
        this.matricula = matricula;
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "\n cpf: " + cpf + 
                "\n rg: " + rg + 
                "\n matricula: " + matricula +
                "\n salario: " + salario;
    }

    
    }
    

