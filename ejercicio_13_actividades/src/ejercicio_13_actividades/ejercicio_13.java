package ejercicio_13_actividades;

import java.util.Scanner;

public class ejercicio_13 {
	
public static void main(String[] args){
		
		Scanner scn = new Scanner(System.in);

		 int vectorA[] = new int[15];
		 int vectorB[] = new int[15];
		 int vectorC[] = new int[15];
		 int i,j,mayor;

		 for (i=0 ; i<15 ; i++){
		 System.out.println("Introduce un numero en el vector A: ");
		 vectorA[i] = scn.nextInt();
		 }
		 for (j=0 ; j<15 ; j++){
		 System.out.println("Introduce un numero en el vector B: ");
		 vectorB[j] = scn.nextInt();
		 }
		 for (i=0 ; i<15 ; i++){
		 for (j=0 ; j<15 ; j++)
		 vectorC[i] = vectorA[i] + vectorB[j];
		 }
		 mayor = vectorC[1];
		 for (i=0 ; i<15 ; i++){
		 if(vectorC[i] > mayor)
		 mayor = vectorC[i];
		 }
		 System.out.println("El numero mayor del vector C es: "+mayor);
		 }
	
}

