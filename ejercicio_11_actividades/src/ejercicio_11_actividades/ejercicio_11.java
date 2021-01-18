package ejercicio_11_actividades;

import java.util.Arrays;

public class ejercicio_11 {
	
	public static void main(String[] args) {
		
        int array [] = new int[1000];
        
        for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*10000);
			System.out.println(array[i]);
        }
        
        
        Arrays.sort(array);
       System.out.println("Los numeros mayores son: ");
        for (int i = 990; i < array.length; i++) {
			System.out.println(array[i]);
		}
        
        }

}
