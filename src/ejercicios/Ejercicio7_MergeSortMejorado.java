package ejercicios;

import java.util.Arrays; // O(1)

public class Ejercicio7_MergeSortMejorado { // O(1)

    public static void mergeSort(int[] arr, int izquierda, int derecha) {
        if (izquierda < derecha) { // O(1)
            int medio = (izquierda + derecha) / 2; // O(1)

            mergeSort(arr, izquierda, medio);   // T(n/2)
            mergeSort(arr, medio + 1, derecha); // T(n/2)

            if (arr[medio] <= arr[medio + 1]) { // O(1)
                return; // O(1), evita merge innecesario
            }

            merge(arr, izquierda, medio, derecha); // O(n)
        }
    }

    public static void merge(int[] arr, int izquierda, int medio, int derecha) {
        int n1 = medio - izquierda + 1; // O(1)
        int n2 = derecha - medio;       // O(1)

        int[] L = new int[n1];          // O(n1)
        int[] R = new int[n2];          // O(n2)

        for (int i = 0; i < n1; i++) {  // O(n1)
            L[i] = arr[izquierda + i];  // O(1)
        }

        for (int j = 0; j < n2; j++) {  // O(n2)
            R[j] = arr[medio + 1 + j];  // O(1)
        }

        int i = 0, j = 0, k = izquierda; // O(1)

        while (i < n1 && j < n2) {       // O(n)
            if (L[i] <= R[j]) {          // O(1)
                arr[k++] = L[i++];       // O(1)
            } else {
                arr[k++] = R[j++];       // O(1)
            }
        }

        while (i < n1) {                 // O(n1)
            arr[k++] = L[i++];           // O(1)
        }

        while (j < n2) {                 // O(n2)
            arr[k++] = R[j++];           // O(1)
        }
    }

    public static void main(String[] args) { // O(1)
        int[] datos = {1, 2, 3, 4, 5, 6, 7}; // O(1)

        mergeSort(datos, 0, datos.length - 1); // O(n log n)

        System.out.println("Arreglo ordenado: " + Arrays.toString(datos)); // O(n)
    }
}