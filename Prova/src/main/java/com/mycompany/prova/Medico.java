
package com.mycompany.prova;

import java.time.LocalDate;


public class Medico extends Funcionario{
private String crm;

    public Medico(String crm, String cpf, String rg, String matricula, double salario, LocalDate DataNascimento, Genero genero, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, salario, DataNascimento, genero, nome, telefone, email, endereco);
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public String toString() {
        return super.toString()+
                "crm: " + crm;
    }

   

   
}
