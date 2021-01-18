package ejercicio_8_actividades;

import java.util.Scanner;

public class ejercicio_8 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int contador = 0;
		int n;		
		int array[] = new int [25];
		
		for (int i = 0; i < array.length; i++) {
			array[i]=(int)( Math.random()*20+1);
		}
		System.out.println("Dime un numero");
		n = scn.nextInt();
		for (int i = 0; i < array.length; i++) {
			if (n==array[i]) {
				contador++;
			}
		}
		System.out.println("Se repite " +contador+ " veces el numero " +n);
	}

}
