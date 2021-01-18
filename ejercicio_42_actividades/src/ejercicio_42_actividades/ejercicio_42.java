package ejercicio_42_actividades;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio_42 {
	
	public static void main(String[] args) {
		Scanner S = new Scanner (System.in);
		
		int matriz[][] = new int[5][5];
		try {
		System.out.println("Proceda a intrucir numeros");

		for(int i = 0; i < 5; i++) {
			for(int j = 0; j< 5; j++) {
				matriz[i][j] = S.nextInt();
			}
		}
		System.out.println("Su matriz es:");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println(" | ");
		}
		}catch(InputMismatchException e) {
			System.out.println("ERROR, no ha introducido un valor númerico, reinicie el programa");
		}


		try {
		System.out.println("Introduzca la columna a ordenar");
		int columna = S.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("ERROR, no ha introducido una columna numérica. Reinicie el programa");
		}

		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				for(int r = 0; r < 5; r++) {
					for(int h = 0; h < 5; h++) {
						if(matriz[i][j] >= matriz[r][h]) {
							matriz[i][j] = matriz[i][j];
						}else {
							int temp = matriz[r][h];
							matriz[r][h] = matriz [i][j];
							matriz[i][j] = temp;
						}
					}
				}
			}
		}
		
		System.out.println("Su matriz ordenada es esta: ");
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println("");
		}
	}


}
