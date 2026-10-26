package pkgAxel;

/**
 * SN04. Fibonacci sobre pares: 0/2, 1/4, 1/6, 2/8, 3/10, 5/12, ...
 * Arriba va Fibonacci y abajo los pares (2 * (i + 1)). Usa do-while.
 * Limite: n maximo 93 (el numerador (Fibonacci) en el termino 94 supera el maximo de long).
 */
public class SerieFibonacciPares {

    /**
     * Muestra la serie de fracciones Fibonacci sobre pares.
     *
     * @param n numero de terminos a mostrar (maximo 93; si se pasa, muestra un aviso y no ejecuta la serie)
     */
    public void g3Sn04MostrarFibonacciPares(int n) {
        final int limite = 93;
        if (n > limite) {
            System.out.println("Límite del tipo de dato alcanzado (máximo n = " + limite + ")");
            return;
        }
        if (n < 1) {
            return;
        }
        long a = 0;
        long b = 1;
        int i = 0;

        do {
            long denominador = 2 * (i + 1);
            System.out.print(a + "/" + denominador + (i < n - 1 ? ", " : "\n"));
            long suma = a + b;
            a = b;
            b = suma;
            i++;
        } while (i < n);
    }
}
