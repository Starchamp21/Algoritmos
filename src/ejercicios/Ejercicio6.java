package ejercicios;

import java.time.LocalDateTime;
import java.time.Duration;

public class Ejercicio6 {
    public static int fibonacci(int n) {
        if (n <= 1)
            return n;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        int n = 40; // Cuidado: números grandes tardan mucho.

        LocalDateTime inicio = LocalDateTime.now();

        int resultado = fibonacci(n);

        LocalDateTime fin = LocalDateTime.now();

        System.out.println("Fibonacci de " + n + " = " + resultado);
        System.out.println("Tiempo ejecución: " + Duration.between(inicio, fin).toMillis() + " ms");
    }
}

/* -- Fibonacci clásico --
public static int fibonacci(int n) {
    if (n <= 1) return n;
    return fibonacci(n - 1) + fibonacci(n - 2);
}

Complejidad temporal:
T(n) = T(n-1) + T(n-2)

Resultado: O(2ⁿ)
Es exponencial.

-- Ejercicio alternativo --

Si fuese:
return fibonacci(n - 1) + fibonacci(n - 1);

Entonces:
T(n) = 2T(n-1)

Resultado: También O(2ⁿ)
Pero aquí el árbol es perfectamente binario.
*/