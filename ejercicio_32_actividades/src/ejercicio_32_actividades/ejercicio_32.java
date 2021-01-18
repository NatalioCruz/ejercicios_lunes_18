package ejercicio_32_actividades;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class ejercicio_32 {
	
	public static void main(String[] args) {
		 
        //Introducimos un numero
        String numero=JOptionPane.showInputDialog("Introduce un número");
 
        int digitos[]=convierteNumeroAArray(numero, numero.length());
 
        //Invocamos el metodo, segun el resultado mostramos un mensaje u otro
        if (EsCapicua(digitos)){
            System.out.println("El numero "+numero+" es capicua");
        }else{
            System.out.println("El numero "+numero+" no es capicua");
        }
    }
    public static int[] convierteNumeroAArray(String numero, int longitud){
 
        int digitos[]=new int[longitud];
 
        for(int i=0;i<digitos.length;i++){
            digitos[i]=Character.getNumericValue(numero.charAt(i));
        }
        return digitos;
    }
 
    public static boolean EsCapicua (int lista[]){
 
        //Creamos otro array
        int listaprueba[]=new int [lista.length];
 
       
        for (int i=0, j=1;j<=lista.length;i++, j++){
            listaprueba[i]=lista[lista.length-j];
        }
 
        //Usamos el metodo de java.util.Arrays para comparar los arrays
        if (Arrays.equals(lista, listaprueba)){
            return true;
        }
 
        return false;
 
    }
}
