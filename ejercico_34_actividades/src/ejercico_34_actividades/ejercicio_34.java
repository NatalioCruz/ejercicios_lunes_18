package ejercico_34_actividades;

public class ejercicio_34 {
	
	public static void main(String[] args) {
        int FILAS = 10;
        int COLS = 10;
        int matriz[][]= new int [FILAS][COLS];
       
        for (int fil = 0; fil < FILAS; fil++) {
            for (int col = 0; col < COLS; col++) {
                //si es la primera fila
                if (fil==0) matriz[fil][col]=col+1;
                //si no, si es la primera columna
                else if(col==0) matriz[fil][col]= matriz[fil-1][COLS-1];
                // para el resto de casos
                else matriz[fil][col]= matriz[fil-1][col-1];
            }
        }
       
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (matriz[i][j]<10) System.out.printf("   %d",matriz[i][j]);
                else System.out.printf("  %d",matriz[i][j]);
            }
            System.out.println();
        }
       
   
    }

}
