package actividades;

public class Lab03_Actividades {

    //1a - funcion max(x,y)
    //su complejidad O(1), usa condicionales, no hay bucles
    static int max(int x, int y) {
        int result;
        if (x == y) {
            result = x;
        } else {
            if (x > y) {
                result = x;
            } else {
                result = y;
            }
        }
        return result;
    }

    //1b - funcion suma(v,tamaño)
    // Complejidad: O(n) — un bucle que recorre el vector

    static int suma(int[] v, int tamanio) {
        int result = 0;

        if (tamanio <= 0) {
            return 0;
        }

        for (int i = 0; i < tamanio; i++) {
            if (v[i] >= 0) {
                result = result + v[i];
            } else {
                result = result + v[i];
            }
        }

        return result;
    }


    //1c- ordenar, complejidad O(n2) bucles anidados

    static void ordenar(int[] v, int tamanio) {
        int aux;

        if (tamanio <= 1) {
            return;
        }

        for (int i = 0; i < tamanio - 1; i++) {
            for (int j = 0; j < tamanio - 1 - i; j++) {
                if (v[j] > v[j + 1]) {
                    aux      = v[j];
                    v[j]     = v[j + 1];
                    v[j + 1] = aux;
                }
            }
        }
    }

    // actividad 2
    //funcion potencia(x,y) recursiva
    //complejidad O(lñog y) mejor caso  O(y) peor caso

    static int llamadasRecursivas = 0; // contador para verificar complejidad

    static double potencia(double x, int y) {
        llamadasRecursivas++; // contar cuantas veces se llama

        if (y == 0) {
            return 1.0;                          // caso base — O(1)
        }
        if (y % 2 == 1) {
            return x * potencia(x, y - 1);      // y impar — T(y-1) + O(1)
        } else {
            double t = potencia(x, y / 2);       // y par   — T(y/2) + O(1)
            return t * t;
        }
    }

    static void imprimirArreglo(int[] v) {
        System.out.print("[");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i]);
            if (i < v.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
