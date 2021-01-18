package ejercicio_15_actividades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio_15 {
	
	public static void main(String[] args) throws IOException{
		 boolean encontrado = false;
		 int i , pos=0;
		 BufferedReader in=new BufferedReader(new InputStreamReader(System.in));

		 System.out.println("¿Cuantos numeros vas a introducir en el vector:?");
		 int longitud = Integer.valueOf(in.readLine().trim()).intValue();

		 int vector[] = new int[longitud];

		 for(i=0 ; i<vector.length ; i++){
		 System.out.println("Introduce un numero en el vector: ");
		 vector[i] = Integer.valueOf(in.readLine().trim()).intValue();
		 }

		 System.out.println("¿Que numero deseas buscar?:");
		 int num = Integer.valueOf(in.readLine().trim()).intValue();

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
