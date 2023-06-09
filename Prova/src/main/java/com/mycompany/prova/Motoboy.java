
package com.mycompany.prova;

import java.time.LocalDate;



public class Motoboy extends Funcionario{
    private String cnh;

    public Motoboy(String cnh, String cpf, String rg, String matricula, double salario, LocalDate DataNascimento, Genero genero, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, salario, DataNascimento, genero, nome, telefone, email, endereco);
        this.cnh = cnh;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    @Override
    public String toString() {
        return super.toString()+
                "cnh: " + cnh;
    }


    }

 
    
    

