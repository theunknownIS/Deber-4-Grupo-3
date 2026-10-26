package pkgAxel;

/**
 * SN01. Fibonacci: 0, 1, 1, 2, 3, 5, 8, 13, ...
 * Cada numero es la suma de los dos anteriores. Usa for.
 * Limite: n maximo 93 (el termino 94 supera el maximo de long).
 */
public class SerieFibonacci {

    /**
     * Muestra la serie Fibonacci en una sola linea.
     *
     * @param n numero de terminos a mostrar (maximo 93; si se pasa, muestra un aviso y no ejecuta la serie)
     */
    public void g3Sn01MostrarFibonacci(int n) {
        final int limite = 93;
        if (n > limite) {
            System.out.println("Límite del tipo de dato alcanzado (máximo n = " + limite + ")");
            return;
        }
        long anterior = 0;
        long actual = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(anterior + (i < n ? ", " : "\n"));
            long suma = anterior + actual;
            anterior = actual;
            actual = suma;
        }
    }
}
