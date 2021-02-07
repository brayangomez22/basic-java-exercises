/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Brayan Gomez
 */
public class Ejercicio12 {
    
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        String Frase1 = reader.nextLine();

        Scanner reader2 = new Scanner(System.in);
        String Frase2 = reader.nextLine();

        if (Frase1.equals(Frase2)) {
            System.out.println("Las Palabras son iguales");
        }else{
            System.out.println("Escribiste: "+Frase2+", y la manera correcta era: "+Frase1);
        }
        
    }
    
}
