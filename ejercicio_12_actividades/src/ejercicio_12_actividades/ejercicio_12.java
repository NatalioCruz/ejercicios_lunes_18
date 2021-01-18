package ejercicio_12_actividades;

import java.lang.reflect.Array;

public class ejercicio_12 {
	
private static Object[] arrays;

public static void main(String[] args) {
		
		int vector[] = new int[100];
		
		for (int i = 10; i < vector.length; i++) {
			vector[i]=(int)( Math.random()*80);
			System.out.println(vector[i]);
		}
		
		 int mayor, menor;
	        mayor = menor = vector [10];
	        int total = 0;
	       
	        for (int i = 10; i < vector.length; i++) {
	            if(vector [i] > mayor) {
	                mayor = vector[i];
	            }
	            if(vector[i]<menor) {
	                menor = vector[i];
	            }
	        }
	        
	        
	        System.out.println("El mayor valor es: "+ mayor);
	        System.out.println("El menor valor es: "+ menor);
	        System.out.println("");
	        
	      
	        double media;
	     	int suma = 0;
	     	for (int i=10; i<vector.length; i++) {
	         suma += vector[i];
	     	}
	     	
	     	media = (double)suma / vector.length;
	        System.out.println("");
	     	System.out.println("La media es: " +media);
	    }
	

}
