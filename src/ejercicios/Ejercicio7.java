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
public class Ejercicio7 {
    
    public static void main(String[] args) {
     
        int num;

        Scanner reader = new Scanner (System.in); 
        
        do{
            
            System.out.println ("Por favor introduzca un numero de nuevo:");
            num = reader.nextInt();
        
        }while(num<0);
        
        System.out.println("El numero que rompio el ciclo fue: "+num+" porque es mayor o igual a cero");
    
    }
    
}
