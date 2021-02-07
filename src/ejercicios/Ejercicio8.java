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
public class Ejercicio8 {
    
    public static void main(String[] args) {
        
        String dia;

        Scanner reader = new Scanner (System.in); 

        System.out.println ("Por favor introduzca el primer numero:");
        dia = reader.nextLine();
        
        switch(dia){
            case "lunes":
                System.out.println("El "+dia+" es un día laboral");
                break;
                
            case "martes":
                System.out.println("El "+dia+" es un día laboral");
                break;
                
            case "miercoles":
                System.out.println("El "+dia+" es un día laboral");
                break;
                
            case "jueves":
                System.out.println("El "+dia+" es un día laboral");
                break;
                
            case "viernes":
                System.out.println("El "+dia+" es un día laboral");
                break;
                
            case "sabado":
                System.out.println("El "+dia+" es un día laboral");
                break;
                
            case "domingo":
                System.out.println("El "+dia+" no es un día laboral, es día de descanso");
                break;
                
            default:
                System.out.println("Ingrese un día valido, please");
                break;
        }
        
    }
    
}
