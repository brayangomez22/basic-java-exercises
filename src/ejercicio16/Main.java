/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16;

import ejercicio16.Persona;
import java.util.Scanner;

/**
 *
 * @author Brayan Gomez
 */
public class Main {
    
    public static void main(String[] args) {
     
        final int SOBREPESO = 1;
        final int INFRAPESO = -1;
        final int PESOIDEAL = 0;

        Entrada entrada= new Entrada();

        String nombre;
        int edad;
        String sexo;
        float peso;
        float altura;

        System.out.println("Obtencion de datos");
        System.out.println("------------------");
        nombre = entrada.obtenerString("Dame el nombre de la persona:");
        edad = entrada.obtenerEntero("Dame la edad de " + nombre);
        sexo = entrada.obtenerString("Dime el sexo de " + nombre);
        peso = entrada.obtenerFloat("Dime el peso de " + nombre);
        altura = entrada.obtenerFloat("Dame la altura para " + nombre);

        // Creamos las personas con los distintos constructores
        System.out.println("\nCreando las personas");
        System.out.println("--------------------");
        Persona p1 = new Persona();
        System.out.println("Persona 1 creada!");
        Persona p2 = new Persona(nombre, edad, sexo);
        System.out.println("Persona 2 creada!");
        Persona p3 = new Persona(nombre, edad, sexo, peso, altura);
        System.out.println("Persona 3 creada!");

        //Mostramos la relacion de peso
        System.out.println("\nMostrando relacion de pesos");
        System.out.println("---------------------------");
        System.out.print("El peso de la persona 1 es: ");

        switch (p1.calcularIMC()) {

                case SOBREPESO:
                        System.out.println("SOBREPESO");
                        break;
                case INFRAPESO:
                        System.out.println("INFRAPESO");
                        break;
                case PESOIDEAL:
                        System.out.println("PESOIDEAL");
                        break;				
        }

        System.out.print("El peso de la persona 2 es: ");

        switch (p2.calcularIMC()) {

                case SOBREPESO:
                        System.out.println("SOBREPESO");
                        break;
                case INFRAPESO:
                        System.out.println("INFRAPESO");
                        break;
                case PESOIDEAL:
                        System.out.println("PESOIDEAL");
                        break;

        }

        System.out.print("El peso de la persona 3 es: ");

        switch (p3.calcularIMC()) {

                case SOBREPESO:
                        System.out.println("SOBREPESO");
                        break;
                case INFRAPESO:
                        System.out.println("INFRAPESO");
                        break;
                case PESOIDEAL:
                        System.out.println("PESOIDEAL");
                        break;

        }

        // Mostramos la mayoria de edad
        System.out.println("\nMostrando mayorias de edad");
        System.out.println("--------------------------");
        System.out.println("La persona 1 es: " + (p1.esMayorDeEdad() ? "Mayor de edad" : "Menor de edad"));
        System.out.println("La persona 2 es: " + (p2.esMayorDeEdad() ? "Mayor de edad" : "Menor de edad"));
        System.out.println("La persona 3 es: " + (p3.esMayorDeEdad() ? "Mayor de edad" : "Menor de edad"));

        // Mostramos todos los datos con el metodo toString() que ha sido Override
        System.out.println("\nMostrando todos los datos");
        System.out.println("-------------------------");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        
    }

}