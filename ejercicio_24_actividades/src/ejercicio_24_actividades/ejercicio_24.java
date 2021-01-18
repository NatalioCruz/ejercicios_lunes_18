package ejercicio_24_actividades;

import java.io.IOException;

public class ejercicio_24 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	trycatch e= new trycatch();
	int id=0; 
	String palabra;	

	System.out.println("Escribe la cadena");
	palabra= e.try_String();


	for(int i=0; i<palabra.length(); i++) {
	if(palabra.charAt(i)=='a'|| palabra.charAt(i)=='e'|| palabra.charAt(i)=='i'|| palabra.charAt(i)=='o'|| palabra.charAt(i)=='u') {
		id++;
	}

	}
	
	System.out.println("en la cadena "+palabra+" hay "+ id+" vocales");
	}

}
