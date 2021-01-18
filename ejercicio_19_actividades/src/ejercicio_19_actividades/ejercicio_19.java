package ejercicio_19_actividades;

public class ejercicio_19 {
	
	public static void main(String[] args){
		 
		int array[] = {1,3,6,8,10,13,15,25,32};
		int i,cont=0;
	
		 for (i= 0; i < array.length; i++) {
			
			 int div = 0;
			 for (int j=1 ; j <=array[i]; j++) {
				if (array[i]%j==0) {
					div++;
				}
				
				if(div==2) {
				System.out.println("Numero: "+array[i]);
				cont++;
				}
		 }
		 }
		System.out.println("Hay: "+cont+ " numeros primos");
				
		}


}
