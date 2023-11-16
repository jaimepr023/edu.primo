package edu.numerosPrimos.controladores;

import java.util.Scanner;

import edu.numerosPrimos.servicios.operaorImplementacion;
import edu.numerosPrimos.servicios.operaorInterfaz;

public class inicioApp {

	public static void main(String[] args) {
		operaorInterfaz oi = new operaorImplementacion();
		Scanner op = new Scanner(System.in);
		String afirmacion;
	do {
		System.out.println("Bienvenido, dime un numero que sea primo:");
		oi.primo(op);
		System.out.println("¿Quieres volver a pedir un numero primo?. Elige entre si o no.");
		 afirmacion=op.next();
		
	}while(afirmacion.equals("si"));
	
	
			
	

	
	

	}

}
