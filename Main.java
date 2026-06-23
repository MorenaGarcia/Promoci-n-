package juegopromocion;

import java.util.Scanner;

public class Main {                                                     

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Scanner scn = new Scanner(System.in);

	    String opcion;
	    
	    do {                                                        //menú principal
	    	System.out.println("\n--- Menú del juego ---");
	    	System.out.println("1. Jugar");
	    	System.out.println("2. Salir");
	    
	    	opcion = scn.nextLine();                              
	    
	    switch(opcion) {
	    
	     case "1":                                              //selección de opción, inicia el juego
	        Juego juego = new Juego();
	        juego.jugar();
	        break;
	   
	     case "2":                                             //finaliza el juego
	        System.out.println("Saliendo del juego...");
	        break;

	    default:                       
	        System.out.println("Opción inválida");
	        break; 
	    }
	    } while (!opcion.equals("2"));
	    scn.close(); 
	    }
	}


	
