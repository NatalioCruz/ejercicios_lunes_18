package ejercicio_9_actividades;

import java.util.Scanner;

public class ejercicio_9 {
	
public static void main(String [] args) {
		
		Scanner sc= new Scanner(System.in);
		int array[] = new int[20];
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Los numeros son: ");
			array[i]=(int)( Math.random()*100+1);
			System.out.println(array[i]);
		}
		
		System.out.println("Los numeros en orden inverso son: ");
		int j=19;
		while(j>=0) {
			System.out.println(array[j]);
			j--;
		}
		
	}

}
