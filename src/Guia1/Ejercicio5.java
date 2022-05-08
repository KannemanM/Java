/*
 Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
 */
package Guia1;

import java.util.Scanner;


public class Ejercicio5 {
    
    public static void main(String[] args) {
        int num, doble, triple;
        double raiz;
        System.out.println("Ingrese un numero:");
        Scanner leer = new Scanner(System.in);
        num = leer.nextInt();
        
        doble = num * 2;
        triple = num * 3;
        raiz = Math.sqrt(num);
        
        System.out.println("El doble de " + num + " es: " + doble);
        System.out.println("El tripe de " + num + " es: " + triple);
        System.out.println("La raiz cuadrada de " + num + " es: " + raiz);
        
        
        
        
    }
         
}