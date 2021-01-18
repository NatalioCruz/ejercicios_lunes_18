package ejercicio_25_actividades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class trycatch {
	
BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
	
	public String try_String() throws IOException  {
		String n = null;
		boolean aux;
		do {
			try {
				n=(teclado.readLine());
				aux=true;
				
			}catch(NumberFormatException e) {
				aux=false;
				System.out.println("Valor incorrecto");
		}
		
	}while(!aux);
		return n;

	}

}
