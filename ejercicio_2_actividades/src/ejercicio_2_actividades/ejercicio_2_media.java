package ejercicio_2_actividades;

import java.io.IOException;

public class ejercicio_2_media {
	
	public static void main(String[] args) throws IOException{
		
		int[] numeros = {3, 5, 6, 8, 15 };
	 	double media;
	 	int suma = 0;
	 	for (int i=0; i<numeros.length; i++) {
	     suma += numeros[i];
	 	}
	 	media = (double)suma / numeros.length;
	 	
	 	System.out.println("La media es: " +media);
	}

}
