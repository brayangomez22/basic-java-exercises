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
public class Ejercicio9 {
    
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        String conc = reader.nextLine();
        
        String Frase = "La sonrisa serala mejor arma "
                + "contra la tristeza";
        Frase = Frase.replace('a','e');
        Frase = Frase.concat(" "+ conc);
       
        System.out.println(Frase);
        
    }
    
}