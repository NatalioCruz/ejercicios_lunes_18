package ejercicio_27_actividades;

import java.io.IOException;

public class ejercicio_27 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String cadena;
		String aux = null;
		trycatch excepcion= new trycatch();
		
		int a=0;
		int o=0;
		int e=0;
		
		System.out.println("Dame una cadena de caracteres:");
		cadena=excepcion.try_String();
		String invertida = "";
		
		// Recorremos la original del final al inicio
		
		for (int indice = cadena.length() - 1; indice >= 0; indice--) {
			
			// Y vamos concatenando cada carácter a la nueva cadena
			
			invertida += cadena.charAt(indice);
		}
		System.out.println("Cadena original: " + cadena);
		System.out.println("Cadena invertida: " + invertida);
		
		
		
		for(int i=0; i<cadena.length(); i++){
			if(cadena.charAt(i)=='a') {
				a++;
			}else if( cadena.charAt(i)=='o') {
				o++;
			}else if(cadena.charAt(i)=='e') {
				e++;
			}
			
		}
		System.out.println();
		if(a>10) {
			System.out.println("Exceso de a");
		}else if(o>5) {
			System.out.println("Exceso de o");
		}else if(e>3) {
			System.out.println("Exceso de e");
		}
		
		
		System.out.println("palabra a buscar");
		aux=excepcion.try_String();
		
		if(cadena.contains(aux)) {
			System.out.println("se encuentra");
		}else {
			System.out.println("no se encuentra");
		}
		
		
			}

}
