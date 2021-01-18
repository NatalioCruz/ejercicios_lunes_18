package ejercicio_29_actividades;

import java.io.IOException;

public class dni {
	
public String nif(String s) throws IOException {
		
		trycatch e = new trycatch();
		String respuesta=s;

		boolean error = false;

		char c;		

		do {

			error=false;

			while(respuesta.length()!=9) {

				System.out.println("Longitud del DNI incorrecta, vuelva a introducirlo");

				respuesta=e.try_String();

			}

			for (int i = 0; i < 8; i++) {

				c = respuesta.charAt(i);

				if (!Character.isDigit(c)) {

					error = true;

					break;

				}

			}

			if(!Character.isAlphabetic(respuesta.charAt(8)))

				error=true;

			if (error) {

				System.out.println("DNI no válido. Vuélvalo a introducir");

				respuesta =e.try_String();

			}

		} while (error);

		return respuesta;

	}

}
