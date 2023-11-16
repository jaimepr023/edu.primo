package edu.numerosPrimos.servicios;

import java.util.Scanner;

public class operaorImplementacion implements operaorInterfaz {

	public void primo(Scanner num) {
		int num1 = num.nextInt();
		 boolean primo = true;
		  for (int i = 2; i <= num1 / 2; i++) {
	            if (num1 % i == 0) {
	                primo = false;
	            }
	        }
	   
	        if (primo) {
	            System.out.println(num1 + "--> Es un numero primo");
	        } else {
	            System.out.println(num1 + "--> No es un numero primo.");
	        }
				
		}
		
	}

