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
public class Ejercicio10 {
    
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        String Frase = reader.nextLine();
        
        Frase = Frase.replace(" ","");
       
        System.out.println(Frase);
        
    }
    
}
