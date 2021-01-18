package ejercicio_26_actividades;

import java.io.IOException;
import java.util.Scanner;

public class ejercicio_26 {
	
	 public static void main(String[] args) throws IOException {
		 Scanner sc = new Scanner(System.in);
	        String texto;
	        int codigo;
	        char opcion;
	        do {
	            System.out.print("Introduce un texto: ");
	            texto = sc.nextLine();
	        } while (texto.isEmpty());
	        do {
	            System.out.print("¿Cuantas veces deseas desplazarlo?");
	            codigo = sc.nextInt();
	        } while (codigo < 1);
	        do {
	            sc.nextLine();
	            System.out.print("Desea Cifrarlo? Pulse C");
	            opcion = (char) System.in.read();
	        } while (Character.toUpperCase(opcion) != 'C');                   
	        if (Character.toUpperCase(opcion) == 'C') {
	            System.out.println("Texto cifrado: " + cifradoCesar(texto, codigo));
	        }
	    }

	    public static String cifradoCesar(String texto, int codigo) {
	        StringBuilder cifrado = new StringBuilder();
	        codigo = codigo % 26;
	        for (int i = 0; i < texto.length(); i++) {
	            if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
	                if ((texto.charAt(i) + codigo) > 'z') {
	                    cifrado.append((char) (texto.charAt(i) + codigo - 26));
	                } else {
	                    cifrado.append((char) (texto.charAt(i) + codigo));
	                }
	            } else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
	                if ((texto.charAt(i) + codigo) > 'Z') {
	                    cifrado.append((char) (texto.charAt(i) + codigo - 26));
	                } else {
	                    cifrado.append((char) (texto.charAt(i) + codigo));
	                }
	            }
	        }
	        return cifrado.toString();}

}
