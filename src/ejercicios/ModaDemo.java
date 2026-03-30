package ejercicios;

import java.util.HashMap;
import java.util.Map;

public class ModaDemo {
    public static int moda(int[] v) {
        Map<Integer, Integer> frecuencia = new HashMap<>();     // O(1)
        int maxFrecuencia = 0;                                  // O(1)
        int moda = v[0];                                        // O(1)

        for (int num : v) {                                             // iteraciones una x elemento
            int f = frecuencia.getOrDefault(num, 0) + 1;     // O(1)
            frecuencia.put(num, f);                                     // O(1)
            if (f > maxFrecuencia) {                                    // O(1)
                maxFrecuencia = f;
                moda = num;
            }
        }
        return moda;
    }

    public static void main(String[] args){
        int[] datos={1,3,2,3,4,3,2,1,3};
        int resultado = moda(datos);
        System.out.println("La moda es: "+ resultado);
    }
}

// complejidad final n x O(1) = O(n)