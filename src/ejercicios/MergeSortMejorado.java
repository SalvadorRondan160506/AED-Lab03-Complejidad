package ejercicios;

public class MergeSortMejorado {
    /*
    la recurrencia sigue siendo T(n) = 2T (n/2)+O(n)
    por lo tanto  O (n logn)
    aplicando las reglas asintoticas  O(n) + O(n) = O(n)
    regla del producto: O(n)*O(log n) = O(n log n)

     */

    private static final int UMBRAL = 10;

    public static void mergeSort(int[] arr) {
        int[] aux = new int[arr.length];
        mergeSort(arr, aux, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int[] aux, int left, int right) {
        if (right - left <= UMBRAL) {
            insertionSort(arr, left, right);
            return;
        }

        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, aux, left, mid);
            mergeSort(arr, aux, mid + 1, right);

            // evitar merge si ya está ordenado
            if (arr[mid] <= arr[mid + 1]) return;

            merge(arr, aux, left, mid, right);
        }
    }

    private static void merge(int[] arr, int[] aux, int left, int mid, int right) {
        System.arraycopy(arr, left, aux, left, right - left + 1);

        int i = left, j = mid + 1, k = left;

        while (i <= mid && j <= right) {
            if (aux[i] <= aux[j]) {
                arr[k++] = aux[i++];
            } else {
                arr[k++] = aux[j++];
            }
        }

        while (i <= mid) {
            arr[k++] = aux[i++];
        }
    }

    private static void insertionSort(int[] arr, int left, int right) {
        for (int i = left + 1; i <= right; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= left && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};

        mergeSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
