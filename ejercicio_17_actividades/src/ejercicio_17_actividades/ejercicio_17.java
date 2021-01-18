package ejercicio_17_actividades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio_17 {
	
	public static void main(String[] args) throws IOException{
		 BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		 int vector[][] = new int[3][3];
		 int mayor[][] = new int[1][1];
		 int fil , col;

		 for(fil=0 ; fil<3 ; fil++)
		 for(col=0 ; col<3; col++){
		 System.out.println("Vector1. Fila: "+fil+" Columna: "+col);
		 vector[fil][col] = Integer.valueOf(in.readLine().trim()).intValue();
		 }
		 
		 for(fil=0 ; fil<3 ; fil++)
			 for(col=0 ; col<3; col++){
				 if (vector[fil][col] > mayor[fil][col])
				 vector[fil][col] = mayor[fil][col];
				 System.out.println(mayor[fil][col]);
				 }
				 } 

}
