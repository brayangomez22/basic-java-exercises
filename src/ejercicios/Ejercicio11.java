/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Brayan Gomez
 */
public class Ejercicio11 {
    
    public static void main(String[] args) {
        
        String texto = "";
        int contA=0;
        int contE=0;
        int contI=0;
        int contO=0;
        int contU=0;
        
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(in);
        
        System.out.println("Escribe una frase");
        
        try{
            texto = buffer.readLine();
        }catch(Exception e){
            System.out.println("Debes de escribir un numero");
        };
        
        int a = texto.length();
        System.out.println("La frase tiene una longitud de "+a+" letras");
        
        for(int i=0;i<texto.length();i++){
            
            char c = texto.charAt(i);
            
            if(c == 'a'){
                contA++;
            }
            if(c == 'e'){
                contE++;
            }
            if(c == 'i'){
                contI++;
            }
            if(c == 'o'){
                contO++;
            }
            if(c == 'u'){
                contU++;
            }
        }
        
        System.out.println("La frase tiene "+contA+" vocales de A");
        System.out.println("La frase tiene "+contE+" vocales de E");
        System.out.println("La frase tiene "+contI+" vocales de I");
        System.out.println("La frase tiene "+contO+" vocales de O");
        System.out.println("La frase tiene "+contU+" vocales de U");
        
    }
    
}
