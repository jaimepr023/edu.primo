package edu.numerosPrimos.servicios;

import java.util.Scanner;
/**
 * Implementacion de la interfaz
 * @authorjpr-16/11/23
 */
public class operaorImplementacion implements operaorInterfaz {

	public void primo(Scanner num) {
		int num1 = num.nextInt();
        int count = 0;
       
        for (int i = 2; ; i++) {
            boolean primo = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    primo = false;

                }
            }
            if (primo) {
                count++;
                System.out.println(i);
                if (count==num1) {
                	break;
                }
            }
        }
		}
		
	}

