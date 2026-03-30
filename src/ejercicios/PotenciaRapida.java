package ejercicios;
/*
public class PotenciaRapida {
    FUNCIÓN potenciaRapida(x : ENTERO, y : ENTERO) : ENTERO
        SI y = 0 ENTONCES              // O(1)  evaluar condición
            DEVOLVER 1                 // O(1)  caso base

        SINO SI y % 2 = 0 ENTONCES     // O(1)  evaluar condición
            mitad := potenciaRapida(x, y/2)   //  llamada recursiva
            DEVOLVER mitad * mitad            // O(1)  una multiplicación

        SINO
            DEVOLVER x * potenciaRapida(x, y-1)  → T(y-1) + O(1)
        FINSI
    FINFUNCION

}

// complejidad final es el peor caso O(y)
*/
