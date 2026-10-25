package pkgAxel;

/**
 * SN01. Fibonacci: 0, 1, 1, 2, 3, 5, 8, 13, ...
 * Cada numero es la suma de los dos anteriores. Usa for.
 */
public class SerieFibonacci {

    /**
     * Muestra la serie Fibonacci en una sola linea.
     *
     * @param n numero de terminos a mostrar
     */
    public void g3Sn01MostrarFibonacci(int n) {
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
