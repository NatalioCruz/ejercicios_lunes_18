package ejercicio_2_actividades;

public class ejercicio_2_suma {
	
	public static void main(String[] args) {
		
		 
	       int arreglo[] = {3, 5, 6, 8, 15 };
	       int total = 0;

	       for (int contador = 0; contador < arreglo.length; contador++) {
		          total += arreglo[contador];
		          System.out.println(arreglo[contador]+"->"+total);
	        }
		        
		 }

}
