package ejercicio_7_actividades;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_7 {
	
	 static int busca (int t[], int elem, int primero, int ultimo) {
	        int pos;
	        if(primero >= ultimo)
	            if (t[primero]==elem)
	                pos =primero;
	            else
	                pos =-1;
	        else
	        {
	            int pos1, pos2;
	            
	            pos1 = busca (t, elem, primero, (primero+ultimo)/2);
	            
	            pos2 = busca (t, elem, (primero+ultimo)/2+1, ultimo);
	            if (pos1 != -1)
	            pos =pos1;
	            else
	            pos =pos2;  }
	        return(pos);  }
	    static int busca (int t[], int elem)
	    {return (busca (t, elem, 0, t.length-1));
	    }public static void main(String[] args) {
	        int datos[];
	        int num;
	        int pos;
	        datos = new int[10];
	        for (int i = 0; i < datos.length; i++)
	        datos[i] = (int) (Math.random()*1000+1);
	        System.out.println("Los datos son:");
	        for (int i = 0; i < datos.length; i++)
	        System.out.print(datos[i] + " ");
	        System.out.print("\n\nElemento a buscar: ");
	        num=entero();
	        pos=busca(datos, num);
	        if (pos == -1)
	            System.out.println("\n\nNo encontrado");
	        else
	            System.out.println("\n\nEncontrado en la posición: " +pos);
	    } static int entero(){
	        int valor=Integer.parseInt(inicializar());
	        return valor;
	    }static String inicializar(){
	        String buzon="";
	        InputStreamReader flujo=new InputStreamReader(System.in);
	        BufferedReader teclado=new BufferedReader(flujo);
	        try{
	            buzon=teclado.readLine();}
	        catch(Exception e){
	            System.out.append("Entrada incorrecta)"); }
	        return buzon;}
}


