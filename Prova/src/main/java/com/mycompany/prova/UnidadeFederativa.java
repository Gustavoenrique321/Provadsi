/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.prova;

/**
 *
 * @author Aluno
 */
public enum UnidadeFederativa {
    BAHIA("Bahia", "BA"),
    SAO_PAULO("Sao paulo", "SP"),
    RIO_DE_JANEIRO("Rio de janeiro","RJ");
    
   private final String UnidadeFederativa;
   private final String sigla;

    private UnidadeFederativa(String UnidadeFederativa, String sigla) {
        this.UnidadeFederativa = UnidadeFederativa;
        this.sigla = sigla;
    }

    public String getUnidadeFederativa() {
        return UnidadeFederativa;
    }

    public String getSigla() {
        return sigla;
    }

   
   
}
