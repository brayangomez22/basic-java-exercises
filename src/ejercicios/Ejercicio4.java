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
public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        double precio;
        double iva = 0.21;
        double precioFinal;

        Scanner reader = new Scanner (System.in); 

        System.out.println ("Por favor introduzca el precio del producto:");
        precio = reader.nextDouble();
        
        precioFinal = (precio * iva) + precio;

        System.out.println("El precio final con el IVA es de: "+precioFinal);
        
    }
    
}
