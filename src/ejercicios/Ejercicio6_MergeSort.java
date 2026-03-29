package ejercicios;

import java.util.Arrays;

public class Ejercicio6_MergeSort {

    public static void mergeSort(int[] arr, int izquierda, int derecha) {
        if (izquierda < derecha) { // O(1)
            int medio = (izquierda + derecha) / 2; // O(1)

            mergeSort(arr, izquierda, medio);      // T(n/2)
            mergeSort(arr, medio + 1, derecha);    // T(n/2)

            merge(arr, izquierda, medio, derecha); // O(n)
        }
    }

    public static void merge(int[] arr, int izquierda, int medio, int derecha) {
        int n1 = medio - izquierda + 1;
        int n2 = derecha - medio;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[izquierda + i];
        }

        for (int j = 0; j < n2; j++) {
            R[j] = arr[medio + 1 + j];
        }

        int i = 0, j = 0, k = izquierda;

        while (i < n1 && j < n2) { // O(n)
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1) { // O(n)
            arr[k++] = L[i++];
        }

        while (j < n2) { // O(n)
            arr[k++] = R[j++];
        }
    }

    public static void main(String[] args) {
        int[] datos = {8, 3, 1, 7, 0, 10, 2};

        mergeSort(datos, 0, datos.length - 1); // O(n log n)

        System.out.println("Arreglo ordenado: " + Arrays.toString(datos));
    }
}