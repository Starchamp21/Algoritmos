package ejercicios;

public class Ejercicio1Extra {
    public static int minDesde(int[] array, int primero) {
        int minimo = array[primero];
        int pos_min = primero;

        for (int i = primero; i < array.length; i++) {
            if (array[i] < minimo) {
                minimo = array[i];
                pos_min = i;
            }
        }
        return pos_min;
    }

    /*  Complejidad de selectionSort:
    O(n^2), porque tengo dos bucles anidados.
    */
    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int pos_min = minDesde(array, i);

            int aux = array[i];
            array[i] = array[pos_min];
            array[pos_min] = aux;
        }

        return array;
    }

    /*  Complejidad de bubbleSort:
    O(n^2), porque tengo dos bucles for.
    */
    public static int[] bubbleSort(int[] array) {
        for (int i = 1; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    int aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }

        return array;
    }

    /*  Complejidad de insertionSort:
    Mejor caso O(n).
    Peor caso O(n^2).
    */
    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = key;
        }

        return array;
    }

    /*  Complejidad de mergeSort:
    O(n log n).
    */
    public static int[] mergeSort(int[] array) {
        merge(array, 0, array.length);
        return array;
    }

    public static void merge(int[] array, int izq, int drcha) {
        if (drcha - izq <= 1) {
            return;
        }

        int medio = (izq + drcha) / 2;

        merge(array, izq, medio);
        merge(array, medio, drcha);

        int voy_1 = izq;
        int drcha_1 = medio;

        int voy_2 = medio;
        int drcha_2 = drcha;

        int[] temp = new int[drcha - izq];
        int indice = 0;

        while (voy_1 < drcha_1 || voy_2 < drcha_2) {
            if (voy_1 >= drcha_1) {
                temp[indice] = array[voy_2];
                voy_2++;
            }

            else if (voy_2 >= drcha_2) {
                temp[indice] = array[voy_1];
                voy_1++;
            }

            else {
                if (array[voy_1] <= array[voy_2]) {
                    temp[indice] = array[voy_1];
                    voy_1++;
                } else {
                    temp[indice] = array[voy_2];
                    voy_2++;
                }

            }

            indice++;
        }

        indice = 0;

        for (int i = izq; i < drcha; i++) {
            array[i] = temp[indice];
            indice++;
        }
    }

    /*  Complejidad de quickSort:
    Caso promedio: O(n log n).
    Caso peor: O(n^2).
    */
    public static int[] quickSort(int[] array) {
        quick(array, 0, array.length - 1);
        return array;
    }

    public static void quick(int[] array, int izq, int der) {
        if (izq >= der) {
            return;
        }

        int pivote = array[(izq + der) / 2];

        int i = izq;
        int j = der;

        while (i <= j) {
            while (array[i] < pivote) {
                i++;
            }

            while (array[j] > pivote) {
                j--;
            }

            if (i <= j) {
                int aux = array[i];
                array[i] = array[j];
                array[j] = aux;

                i++;
                j--;
            }
        }

        quick(array, izq, j);
        quick(array, i, der);
    }

    public static void main(String[] args) {
        int[] array = {1, 8, 6, 4, 5, 10, 2, 7, 9, 3};

        quickSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}