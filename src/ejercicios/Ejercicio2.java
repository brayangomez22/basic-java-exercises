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
public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        int num1;
        int num2;

        Scanner reader = new Scanner (System.in); 

        System.out.println ("Por favor introduzca el primer numero:");
        num1 = reader.nextInt();
        
        System.out.println ("Por favor introduzca el segundo numero:");
        num2 = reader.nextInt();
        
        if(num1 > num2){
            System.out.println("El numéro 1, o sea el "+num1+" es mayor que el 2 = "+num2);
        }else if(num1 < num2){
            System.out.println("El numéro 2, o sea el "+num2+" es mayor que el 1 = "+num1);
        }else{
            System.out.println("Los numeros son iguales");
        }
        
    }
    
}
