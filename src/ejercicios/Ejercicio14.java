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
public class Ejercicio14 {
    
    public static void main(String[] args) {
        
        int num;
        
        Scanner reader = new Scanner (System.in); 

        System.out.println ("Por favor introduzca un numero:");
        num = reader.nextInt();
        
        for(int aux=num; aux<=1000; aux+=2){
            System.out.println("Número: "+aux);
        }
        
    }
    
}
