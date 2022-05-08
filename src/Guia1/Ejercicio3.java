/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia1;

import java.util.Scanner;

/**
 *
 * @author HURACAN
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase;
        System.out.println("Escriba una frase:");
        Scanner leer = new Scanner(System.in);
        frase = leer.nextLine();
        System.out.println("Frase en mayusculas: " + frase.toUpperCase());
        System.out.println("Frase en minusculas: " + frase.toLowerCase());
    }
    
}
