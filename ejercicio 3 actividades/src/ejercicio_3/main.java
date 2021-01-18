package ejercicio_3;

import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            int i;
            
            int[] numeros = new int[10]; 

            System.out.println("Indique los números del array: ");

            for (i = 0; i < numeros.length; i++) {
                System.out.print("posición " +i+ " = ");
                numeros[i]=scan.nextInt();
            }
            
            int j = 0;
            int k = 0;

        
            for (i = 0; i < numeros.length; i+=2) {

                j=numeros[i];
                k=numeros[i+1];

                numeros[i]=k;
                numeros[i+1]=j;

                System.out.print("posición " +i+ " intercambiada = " +numeros[i]+ "\n");
                System.out.print("posición " +(i+1)+ " intercambiada = " +numeros[i+1]+ "\n");

            }
            
        }
      
	}

}


