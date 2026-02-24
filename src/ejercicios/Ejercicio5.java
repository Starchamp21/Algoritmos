package ejercicios;

public class Ejercicio5 {
    /* 
    a) for (int i = 0; i < 3; i++)
    Resultado: 3 repeticiones -> O(1)

    b) for (int i = 0; i < array.length; i += 3)
    Resultado: n/3 iteraciones -> O(n)

    c) for (int i = 0; i < array.length; i *= 2)
    Resultado: ERROR. Si empieza en 0, se queda infinito.
    Si fuese:
    for (int i = 1; i < array.length; i *= 2)
    Resultado: log en base 2 (n) iteraciones -> O(log n)

    d) for (int i = array.length; i > 0; i/=3)
    Resultado: log en base 3 (n) -> O(log n)

    e) for(int i = 0; i < array.length; i++) { if (i % 2 == 0) i++; }
    Incrementa 2 posiciones cada vez.
    Resultado: n/2 iteraciones -> O(n)
    */
}