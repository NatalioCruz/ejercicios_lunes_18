package ejercicio_20_actividades;

import java.util.Scanner;

public class ejercicio_20 {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		int array[] = new int[100];
		int contar_par=0;
		int contar_impar=0;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*100);
			System.out.println(array[i]);
			
			if (array[i] % 2==0) {
				contar_par++;
			}else {
				contar_impar++;
			}
		}
		//Creamos los arrays
		int par[] = new int[contar_par];
		int impar[] = new int[contar_impar];
		
		contar_par=0;
		contar_impar=0;
		
		//Cada numero va a su arreglo
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2==0) {
				par[contar_par] = array[i];
				contar_par++;
			}else {
				impar[contar_impar] = array[i];
				contar_impar++;
			}
		}
		
		System.out.println("");
		System.out.println("Los numeros pares: ");
		for(int i=0; i<contar_par;i++) {
			System.out.println(par[i]+" ");
			}
		System.out.println("");
		System.out.println("Los numeros impares: ");
		for(int i=0; i<contar_impar;i++) {
			System.out.println(impar[i]+" ");
			}
		
		
		
		}
	
}

