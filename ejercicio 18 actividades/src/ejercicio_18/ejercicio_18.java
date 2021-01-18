package ejercicio_18;

import java.util.Scanner;

public class ejercicio_18 {
	
	public static void main(String[] args){
		 
		Scanner scn = new Scanner(System.in);

		 int vector[] = new int[20];
		 int i , suma=0 , mayor=0;

		 for(i=0 ; i<20 ; i++){
		 vector[i]=(int)( Math.random()*20);
		 System.out.println(vector[i]);
		 }

		 for(i=0 ; i<20 ; i++){
		 if (((vector[i]) % 2) == 0);
		 suma = suma + vector[i];
		 }
		 for(i=0 ; i<20 ; i++){
		 if (vector[i] > mayor)
		 mayor = vector[i];
		 }
		 System.out.println("Los numeros pares del vector suman: "+suma);
		 System.out.println("El numero mayor de los impares es el: "+mayor);
		 }


}
