package ejercicios;

class Exponencial {
    static int fibonacci(int n) {
        if (n <= 1) return n;                   // O(1) caso base
        return fibonacci(n - 1) + fibonacci(n - 2);       // dos llamadas recursivas
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println("Fibonacci de " + n + ": " + fibonacci(n));
    }

    //fibonacci(n-1) + fibonacci (n-2) dos llamadas recursivas
    //complejidad final O (2n) exponencial

}

