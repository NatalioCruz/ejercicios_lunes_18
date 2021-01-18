package ejercicio_6_actividades;

import java.util.Scanner;

public class ejercicio_6 {
	
	static Scanner num=new Scanner(System.in);
	static int x;
    static int search(int arr[], int n, int x) 
    { 
    	for (int i = 0; i < n; i++) { 
            if (arr[i] == x) 
                return i; 
        } return -1; 
    } 
  
    public static void main(String[] args) 
    {  int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; 
        int n = arr.length; 
        
        System.out.println("¿Que numero desea buscar?");
        x=num.nextInt(); 
  
        int index = search(arr, n, x); 
        if (index == -1) 
            System.out.println("El numero no se encuentra en el array."); 
        else
            System.out.println("El numero se encuentra en la posicion " + index); 
    } 

}
