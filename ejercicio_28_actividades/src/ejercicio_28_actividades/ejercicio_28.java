package ejercicio_28_actividades;

import java.io.IOException;
import java.util.Scanner;

public class ejercicio_28 {
	
	public static void main(String[] args) throws IOException {
		
		 Scanner sc= new Scanner(System.in);
	        System.out.print("Introduce una cadena de caracteres: ");
	        String s=sc.nextLine();	  
	        System.out.print(s);
	        int fin = s.length()-1;
	        int ini=0;
	        boolean espalin=true;
	        
	        while(ini < fin){
	            if(s.charAt(ini)!=s.charAt(fin)){
	                espalin=false;
	            }
	        ini++;
	        fin--;
	        }
	        if(espalin)
	            System.out.print("\nEs palindromo.");
	        else
	            System.out.print("\nNo es palindromo.");
	        
	    }

}
