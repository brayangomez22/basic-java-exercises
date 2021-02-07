/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16;

/**
 *
 * @author Brayan Gomez
 */
public class Persona {
    
    private final static char DEFAULT_SEX = 'H';
	
    private final static int SOBREPESO = 1;
    private final static int INFRAPESO = -1;
    private final static int PESOIDEAL = 0;

    private String nombre;
    private int edad;
    private int DNI;
    private char letraDNI;
    private char sexo;
    private float peso;
    private float altura;

    public Persona(){
        nombre	= "";
        edad	= 0;
        DNI		= generaDNI();
        letraDNI= generaLetraDNI();
        sexo	= DEFAULT_SEX;
        peso	= 0;
        altura	= 0;
    }

    public Persona(String nombre,int edad,String sexo){
        this.nombre  = nombre;
        this.edad    = edad;
        DNI	     = generaDNI();
        letraDNI     = generaLetraDNI();
        this.sexo    = comprobarSexo(sexo.charAt(0));
        peso	     = 0;
        altura	     = 0;
    }

    public Persona(String nombre,int edad,String sexo, float peso, float altura){
        this.nombre  = nombre;
        this.edad    = edad;
        this.DNI     = generaDNI();
        letraDNI     = generaLetraDNI();
        this.sexo    = comprobarSexo(sexo.charAt(0));
        this.peso    = peso;
        this.altura  = altura;
    }

    public int calcularIMC(){
        float imc = this.peso/(int)Math.pow(this.altura/100,2);
        if (imc>=25) return SOBREPESO;
        else if (imc<18.5) return INFRAPESO;
        else return PESOIDEAL;
    }

    public boolean esMayorDeEdad(){
        return (this.edad>=18) ? true : false ;
    }

    public String toString(){
        return 	"Los datos de la persona son:\n" +
                "Nombre: " + this.nombre + "\n" +
                "Edad: " + this.edad + "\n" +
                "DNI : " + this.DNI + "-" + this.letraDNI + "\n" +
                "Sexo: " + ( (this.sexo=='H') ? "Hombre":"Mujer" ) + "\n" +
                "Peso: " + this.peso + "\n" +
                "Altura: " + this.altura + "\n";
    }

    private char comprobarSexo(char sexo){
        if(sexo=='M' || sexo=='m') return 'M';
        else return 'H';
    }

    private int generaDNI(){
        return (int)(Math.random()*100000000);
    }

    private char generaLetraDNI(){
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        return letras.charAt(this.DNI%23);
    }
    
}
