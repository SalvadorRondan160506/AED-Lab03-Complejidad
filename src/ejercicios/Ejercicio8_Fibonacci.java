package ejercicios;

class Ejercicio8_Fibonacci {

    static int fibonacci(int n) {
        if (n <= 1) return n; // O(1)

        return fibonacci(n - 1) + fibonacci(n - 2); // exponencial
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println("Fibonacci de " + n + ": " + fibonacci(n)); // O(2^n)
    }
}