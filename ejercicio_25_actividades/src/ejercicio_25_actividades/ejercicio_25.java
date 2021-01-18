package ejercicio_25_actividades;

import java.io.IOException;

public class ejercicio_25 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		trycatch e = new trycatch();
		String palabra;
		String sustituir;
		String aux;
	 System.out.println("Escribe la cadena de caracteres:");
	 palabra=e.try_String();
	 System.out.println("¿Que palabra vas a sustituir?");	 
	sustituir=e.try_String();
	System.out.println("Por cual la quieres sustituir");
	aux=e.try_String();	
	System.out.println(palabra.replaceAll(sustituir, aux));
	 
		}

}
