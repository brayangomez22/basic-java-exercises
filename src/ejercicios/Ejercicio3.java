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
public class Ejercicio3 {
    
    /*psvm*/
    
    public static void main(String[] args) {

        String respuesta="";
        
        do{

            System.out.println("Ingresar el radio del circulo" );
            System.out.println("________");
            Scanner Escribir=new Scanner(System.in);
            double radioCirculo=Double.parseDouble(Escribir.nextLine());
            double areaCirculo = Math.PI * Math.pow(radioCirculo,2);

            System.out.println("El radio del circulo es: "+radioCirculo+" por ende su area es "+areaCirculo);
            System.out.println("Empezar de nuevo");
            System.out.println("Posibles respuestas (si/no)");
            respuesta=Escribir.nextLine();
            
        }while(respuesta.equalsIgnoreCase("si"));
        
        System.out.println("Terminado");
        
    }
    
}
