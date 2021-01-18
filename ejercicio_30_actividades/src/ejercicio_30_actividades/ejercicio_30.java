package ejercicio_30_actividades;

import java.util.StringTokenizer;

public class ejercicio_30 {
	

	public static void main(String[] args) {
		
	StringTokenizer st=new StringTokenizer("Juan Carlos ha sacado un 8.5,Andrés ha sacado un 4.9,Pedro ha sacado un 3.8,Juan ha sacado un 6.3", ",");
	
	while (st.hasMoreTokens())
	    System.out.println(st.nextToken());
	}

}
