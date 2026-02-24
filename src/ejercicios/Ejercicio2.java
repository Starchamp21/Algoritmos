package ejercicios;

import java.time.LocalDateTime;
import java.time.Duration;

public class Ejercicio2 {
    public static boolean estarOrdenado(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        LocalDateTime inicio = LocalDateTime.now();

        boolean ordenado = estarOrdenado(array);

        LocalDateTime fin = LocalDateTime.now();

        System.out.println("¿Está ordenado? " + ordenado);
        System.out.println("Tiempo ejecución: " + Duration.between(inicio, fin).toNanos() + " ns");
    }
}

/* -- Complejidad --
Mejor caso → O(1)
Si el primer par ya está mal ordenado → sale inmediatamente.

Peor caso → O(n)
Si está completamente ordenado → recorre todo.

Espacial → O(1)
*/