package ejercicio_16_actividades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio_16 {
	
	public static void main(String[] args) throws IOException{
		 int i,j,aux;
		 BufferedReader in=new BufferedReader(new InputStreamReader(System.in));

		 int vector[] = new int[5];

		 try{
		 for(i=0 ; i<5 ; i++){
		 System.out.println("Introduce un numero en el vector:");
		 vector[i] = Integer.valueOf(in.readLine().trim()).intValue();
		 if (vector[i] < 0)
		 throw new ejercicio_16("Error, numero negativo");
		 for (j=0 ; j<vector.length ; j++){
		 if (vector[i] < vector[j]){
		 aux = vector[i];
		 vector[i] = vector[j];
		 vector[j] = aux;
		 }
		 }
		 }
		 System.out.println("El vector ordenado es: ");
		 for (i=0 ; i<vector.length ; i++)
		 System.out.println(vector[i]);
		 }
		 catch(ejercicio_16 e){
		 System.out.println(e.getMessage());
		 }
		 
		 catch(Exception ex){
			 System.out.println("Error, se llama a la clase general Exception");
			 }
			 }

	private char[] getMessage() {
		return null;
	}
			}
			public class ejercicio_16 extends ejercicio_16{

			 
			 public void ejercicio_16(String mensaje) {
			 super(mensaje);
			 }

}
