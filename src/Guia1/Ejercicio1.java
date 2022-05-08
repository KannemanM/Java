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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, total;
        
        System.out.println("Ingresar primer numero:");
        Scanner leer = new Scanner(System.in);
        num1 = leer.nextInt();
        System.out.println("Ingrese segundo numero:");
        num2 = leer.nextInt();
        total = num1 + num2;
        System.out.println("La suma es: " + total);     
       
                
                
        
        
    }
    
}
