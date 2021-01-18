package ejercicio_4_actividades;

import java.util.Scanner;

public class ejercicio_4 {
	
	public static void main(String[] args) {
	       
        Scanner teclado = new Scanner(System.in);
        int media;
       
        System.out.print("Por favor ingrese el tamaño del array: ");
        int n = teclado.nextInt();
        int array [] = new int [n];
       
        for (int i = 0; i < array.length; i++) {
            System.out.print("Ingrese dato "+(i+1)+": ");
            array [i] = teclado.nextInt();
        }
       int mayor, menor;
        mayor = menor = array [0];
       
        for (int i = 0; i < array.length; i++) {
            if(array [i] > mayor) {
                mayor = array[i];
            }
        }
        media= (mayor + menor)/2;
        System.out.println("El mayor valor es: "+mayor);
        
	}

}
