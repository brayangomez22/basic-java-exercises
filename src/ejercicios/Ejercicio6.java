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
public class Ejercicio6 {
    
    public static void main(String[] args) {
        
        System.out.println("Pares ");                                                             
        for(int i=0;i<=100;i++){
            if(i%2==0)
                System.out.println(i);                                                                         
        }       
        
        System.out.println("impares");
        for(int j=0;j<=100;j++) {
            if(j%2!=0)
                System.out.println(j);                                                                         
        }
        
    }
    
}