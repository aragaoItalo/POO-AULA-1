/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.eteczl.aula1poo;

/**
 *
 * @author Admin
 */
public class Aula1POO {

    public static void main(String[] args) {
        Morador m1 = new Morador("Maria");
        Morador m2 = new Morador("Lucas");
        Morador m3 = new Morador ("Lucelia");
        
        System.out.print("Nome do primeiro morador = " + m1.nome);
        System.out.print("Nome do segundo morador = " + m2.nome);
        System.out.print("Nome do terceiro morador = " + m3.nome);
    }
    public static void exemploCasa(){
        System.out.println("Método Main rodou!!!");
        
        Casa cVermelho = new Casa();
        cVermelho.cor = "Vermelha";
        System.out.println("A casa é " + cVermelho.cor);
        
        System.out.println("O número da casa é " + Casa.nmrDaCasa);
        
        System.out.println("Alterando o atributo estático criado na classe Casa:");
        Casa.nmrDaCasa = 4459;
        System.out.println("O novo número da casa é " + Casa.nmrDaCasa);
    }
}
