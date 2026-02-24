package ejercicios;

import java.time.Duration;
import java.time.LocalDateTime;

public class Ejercicio4 {
    public static int maximoRecursivo(int[] array, int n) {
        if (n == 1) {
            return array[0];
        }

        int maxAnterior = maximoRecursivo(array, n - 1);

        return Math.max(maxAnterior, array[n - 1]);
    }

    public static void main(String[] args) {

        int[] array = {3, 8, 2, 10, 6};

        LocalDateTime inicio = LocalDateTime.now();

        int max = maximoRecursivo(array, array.length);

        LocalDateTime fin = LocalDateTime.now();

        System.out.println("Máximo: " + max);
        System.out.println("Tiempo ejecución: " + Duration.between(inicio, fin).toNanos() + " ns");
    }
}

/* -- Complejidad --
Temporal: O(n) (Hace n llamadas recursivas.)
Espacial: O(n) (Porque se guardan n llamadas en la pila.)

Aquí está la diferencia importante con el iterativo (que era O(1) en espacio).
*/