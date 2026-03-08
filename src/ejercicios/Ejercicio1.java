package ejercicios;

import java.time.LocalDateTime;
import java.time.Duration;
import java.util.Random;

public class Ejercicio1 {
    public static int max(int [] array) {
        int maximo = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maximo) {
                maximo = array[i];
            }
        }

        return maximo;
    }

    public static void main (String[] args) {
        int size = 1000000;
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1000000);
        }

        LocalDateTime inicio = LocalDateTime.now();

        int max = max(array);

        LocalDateTime fin = LocalDateTime.now();

        System.out.println("Máximo: " + max);
        System.out.println("Tiempo ejecución: " + Duration.between(inicio, fin).toMillis() + " ms");
        System.out.println("Fecha y hora de inicio: " + inicio);
        System.out.println("Fecha y hora de fin: " + fin);
    }
}

/* -- Complejidad --
Temporal: O(n) (Recorre todo el array una vez.)
Espacial: O(1) (Solo usa una variable extra (max).)

-- ¿Cambiaría si fuese ArrayList? --
No.
Si uso ArrayList<Integer>:
Acceso por índice → O(1)
Se recorre igual.

Complejidad sigue siendo:
Temporal: O(n)
Espacial: O(1)
*/