package Guia1;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Float cel, fah;
        System.out.println("Ingresar grados Celcius:");
        Scanner leer = new Scanner(System.in);
        cel = leer.nextFloat();
        fah = 32 + (9 * cel / 5);
        System.out.println(cel + "° Celcius equivalen a " + fah + "° Fahrenheit");
        
    }
    
}
