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
public class Ejercicio15 {
    
    static Scanner scanner = new Scanner(System.in); //Sirve para recoger texto por consola
    static int select = -1; //opción elegida del usuario
    static int num1 = 0, num2 = 0; //Variables
    
    public static void main(String[] args) {
        
        while(select != 0){
            //Try catch para evitar que el programa termine si hay un error
            try{
                System.out.println("Elige opción:\n1.- NUEVO ACTOR" +
                                "\n2.- BUSCAR ACTOR \n" +
                                "3.- ELIMINAR ACTOR \n" +
                                "4.- MODIFICAR ACTOR \n" +
                                "5.- VER TODOS LOS ACTORES \n"+
                                "6.- VER PELICULAS DE LOS ACTORES \n"+
                                "7.- VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES \n"+
                                "8.- Salir \n");

                select = Integer.parseInt(scanner.nextLine()); 

                switch(select){
                case 1: 
                        pideNumeros();
                        System.out.println("Haz seleccionado Nuevo Actor");
                        break;
                case 2: 
                        pideNumeros();
                        System.out.println("Haz seleccionado Buscar Actor");
                        break;
                case 3: 
                        pideNumeros();
                        System.out.println("Haz seleccionado Elminar Actor");
                        break;
                case 4: 
                        pideNumeros();
                        System.out.println("Haz seleccionado Modificar Actor");
                        break;
                case 5: 
                        pideNumeros();
                        System.out.println("Haz selecionado Ver Todos");
                        break;
                case 6: 
                        pideNumeros();
                        System.out.println("Haz selecionado Ver Peliculas");
                        break;
                case 7: 
                        pideNumeros();
                        System.out.println("Haz selecionado Ver Categoria");
                        break;
                case 8: 
                        pideNumeros();
                        System.out.println("Haz selecionado Salir");
                        break;        
                default:
                        System.out.println("Número no reconocido");break;
                }

                System.out.println("\n"); //Mostrar un salto de línea en Java

            }catch(Exception e){
                    System.out.println("Uoop! Error!");
            }
	}

    }
    
    public static void pideNumeros(){
       System.out.println("Introduce el dato");
       num1 = Integer.parseInt(scanner.nextLine());
       System.out.println("\n"); 
    }   
    
}