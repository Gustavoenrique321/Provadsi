/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prova;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class Main {

    public static void main(String[] args) {
        
        Endereco endereco = new Endereco ("Casa", "775", "Casa", "40800200", "Salvador", UnidadeFederativa.BAHIA);
        System.out.println();
         
        Motoboy motoboy = new Motoboy ("78964", "665.789.125-18", "1254489", "7756", 285, LocalDate.of(1994, Month.MARCH, 5), Genero.MASCULINO, "Babal", "(71)99818-6514", "Babal@gmail.com",endereco);
        System.out.println();

        Cliente cliente = new Cliente (77896, LocalDate.of(1994, Month.AUGUST, 13), Genero.MASCULINO, "Jones", "(71)99218-2040", "Jones@gmail.com", endereco);
        System.out.println();

        Juridica juridica = new Juridica("776498124", "1857", "lamrque", "7199521-7125", "lamequejr@gmail.com",  endereco);
        
        
        
    }
}
