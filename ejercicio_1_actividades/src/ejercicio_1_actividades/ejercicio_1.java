package ejercicio_1_actividades;

import java.util.Scanner;

public class ejercicio_1 {
	
	 Scanner scn = new Scanner(System.in);

	 int vector[] = new int[5];{
		 

	 int i = 0;
	for(int i1=0 ; i<5 ; i++){
	 System.out.println("Introduzca un numero: ");
	 vector[i1] = scn.nextInt();
	 }
	 for(int i1=0 ; i1<5 ; i1++)
	 System.out.println("Posicion: "+i1+" Numero: "+vector[i1]);
	 }

}
