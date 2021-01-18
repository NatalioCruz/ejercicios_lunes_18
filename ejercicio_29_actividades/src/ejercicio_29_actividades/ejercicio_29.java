package ejercicio_29_actividades;

import java.io.IOException;

public class ejercicio_29 {
	
	public static void main(String[] args) throws IOException {
		
	trycatch e = new trycatch();
	dni d= new dni();
	
	String nif;
	
	
	System.out.println("Introduzca su dni");
	nif=e.try_String();
	
	d.nif(nif);
	
	}

}
