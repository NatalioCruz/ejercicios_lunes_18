package ejercicio_14_actividades;

import java.util.Scanner;

public class ejercicio_14 {
	
	public static void main(String[] args){
		 
		boolean encontrado = false;
		 int i , pos=-1;
		
		 Scanner scn=new Scanner(System.in);

		 System.out.println("¿Cuantos numeros vas a introducir en el vector:?");
		 int longitud = scn.nextInt();

		 int vector[] = new int[longitud];

		 for(i=0 ; i<vector.length ; i++){
		 System.out.println("Introduce un numero en el vector: ");
		 vector[i] = scn.nextInt();
		 }

		 System.out.println("¿Que numero deseas buscar?:");
		 int num = scn.nextInt();
		 
		 for (i=0 ; i<vector.length ; i++){
		 if (vector[i] == num){
		 encontrado = true;
		 pos = vector[i];
		 }
		 }
		 if (encontrado == true)
		 System.out.println("El numero existe y su posicion es:"+pos);
		 else
		 System.out.println("El numero no existe");
		 }

}
