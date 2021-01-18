package ejercicio_22_actividades;

import java.util.Scanner;

public class ejercicio_22 {
	
	public static void llenar (int matriz [] [], int d) {
		  
		  Scanner Leer = new Scanner(System.in);
	    
		    for (int i = 1 ; i <= d ; i++){
		        for (int j = 1 ; j <= d ; j++){
		        System.out.print("Introduzca la posicion[" + i + "][" + j + "]: ");
		        matriz [i] [j] = Leer.nextInt();
		        }
		    }
		  }
		  
	  	public static void mostrar (int matriz [] [], int d){
		    for (int i = 1 ; i <= d ; i++){
		        System.out.println ("");
		        for (int j = 1 ; j <= d ; j++){
		        System.out.print("[" + matriz [i] [j] + "]");
		        }
		    }
		   }
	  	
	  	public static void invierte (int matriz [] [], int d){
		    int fin = d;
		    
		    for (int i = 1 ; i <= d / 2 ; i++){
		        int aux = matriz [i] [i];
		        matriz [i] [i] = matriz [d] [d];
		        matriz [d] [d] = aux;
		        fin--;
		    }
		    }
	  	
		public static void main (String args []){
			
		    Scanner Leer = new Scanner(System.in);
		    int matriz [] [] = new int [20] [20];
		    System.out.print("Inserte la dimension de la matriz cuadrada: ");
		    int d = Leer.nextInt();
		    llenar (matriz, d);
		    System.out.println("");
		    System.out.print("MATRIZ CON LA DIAGONAL PRINCIPAL INVERTIDA: ");
		    invierte (matriz, d);
		    mostrar (matriz, d);
		    }
		
}
