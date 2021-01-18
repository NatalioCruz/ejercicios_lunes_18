package ejercicio_31_actividades;

import java.io.IOException;
import java.util.StringTokenizer;

public class ejercicio_31 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String notas="8.5\n4.9\n3.8\n6.3";
		StringTokenizer tokens=new StringTokenizer(notas, "\n");
	        int nDatos=tokens.countTokens();
	        double[] datos=new double[nDatos];
	        int i=0;
	        while(tokens.hasMoreTokens()){
	            String str=tokens.nextToken();
	            datos[i]=Double.valueOf(str).doubleValue();
	            System.out.println(datos[i]);
	            i++;
	        }
	}

}
