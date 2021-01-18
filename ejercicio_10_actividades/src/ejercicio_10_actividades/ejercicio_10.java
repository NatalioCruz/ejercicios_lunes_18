package ejercicio_10_actividades;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio_10 {
	
public static void main(String[] args){
		
		Scanner scn = new Scanner(System.in);

		 int array[] = new int[15];
		 int i;
		 
		 for (i=0 ; i<15 ; i++){
		 System.out.println("Introduce un numero: ");
		 array[i] = scn.nextInt();
		
		 }
		
		 Arrays.sort(array);
			 
		 System.out.println("El mayor es "+array[14]);
		 System.out.println("El segundo mayor es " +array[13]);
	}

}
