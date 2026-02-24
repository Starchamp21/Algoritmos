package ejercicios;

import java.time.Duration;
import java.time.LocalDateTime;

public class Ejercicio3 {
    public static void mostrarMatriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n = 1000;
        int[][] matriz = new int[n][n];

        LocalDateTime inicio = LocalDateTime.now();

        mostrarMatriz(matriz);

        LocalDateTime fin = LocalDateTime.now();

        System.out.println("Tiempo ejecución: " +
                Duration.between(inicio, fin).toMillis() + " ms");
    }
}

/* Si la matriz es N x N:
Temporal → O(n²)
Espacial → O(1) (solo variables auxiliares)

Aquí N es el número total de elementos = filas × columnas
*/