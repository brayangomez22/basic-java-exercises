/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author Brayan Gomez
 */
public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        int i=1;
        int j=1;
        
        System.out.println("Numeros pares ");      
        while(i<=100) {
           if(i%2==0)
           System.out.println(i);                                                                         
           i++;
        }
        
        System.out.println("Impares");
        while(j<=100) {
            if(j%2!=0)
           System.out.println(j);                                                                         
           j++;
        }
         
    }
    
}
