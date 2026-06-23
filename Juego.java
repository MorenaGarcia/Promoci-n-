package juegopromocion;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Juego {

	private int numeroSecreto;                      //atributos
    private int intentosMaximos;
    
    
    public Juego() {                                         //constructor
        numeroSecreto = (int)(Math.random() * 100) + 1;       //genera un número entre 1 y 100
        intentosMaximos = 5;                                 //el usuario tendrá 5 intentos para adivinar
    }
	
    public void jugar() {                           //método 

    	Scanner scn = new Scanner(System.in);
    	
    	int intento;
    	
    	System.out.println("\nTendrás que adivinar un número entre el 1 y el 100");
    	                                                                       //bucle que controla la cantidad de intentos
    	for (int i = 1; i <= intentosMaximos; i++) {

    	    System.out.println("\n* Intento " + i + " de " + intentosMaximos);

    	    System.out.println("Ingresar un número entre 1 y 100:");

    	    intento = obtenerInt(scn);
    	    scn.nextLine();
    	    
    	    if (intento < 1 || intento > 100) {                              //que el número ingresado esté entre 1 y 100

    	        System.out.println("Error: el número debe estar entre 1 y 100");

    	        i--;

    	        continue; }

    	    if (intento == numeroSecreto) {                     

    	        System.out.println("-- ¡Ganaste! --");

    	        return; }
    	    
    	    if (intento < numeroSecreto) {                             //indica si el número ingresado es menor al número secreto

    	        System.out.println("---> Tu número es demasiado bajo \n");
    	    }
    	  
    	    else {                                                       //indica si el número ingresado es mayor al número secreto
    	        System.out.println("---> Tu número es demasiado alto \n");
    	    }
    	} 
    	
    	System.out.println("¡Perdiste! ~ El número era: " + numeroSecreto);    //se ejecuta si el jugador pierde
    	
    } private int obtenerInt(Scanner scn) {                                          //método para que el usuario ingrese sólo números
    	    int i = -1;

    	    while (i == -1) {

    	        try {
    	            i = scn.nextInt();

    	        } catch (InputMismatchException e) {                          //error si se ingresan caracteres
    	            System.out.println("Por favor ingresar un valor numérico");
    	            scn.next();
    	        }
    	    }

    	  return i;
    	
    }
    
}
