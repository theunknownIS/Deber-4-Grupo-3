package pkgAxel;

/**
 * SN03. Fibonacci sobre impares: 0/1, 1/3, 1/5, 2/7, 3/9, 5/11, ...
 * Arriba va Fibonacci y abajo los impares (2i + 1). Usa while.
 */
public class SerieFibonacciImpares {

    /**
     * Muestra la serie de fracciones Fibonacci sobre impares.
     *
     * @param n numero de terminos a mostrar
     */
    public void g3Sn03MostrarFibonacciImpares(int n) {
        long a = 0;
        long b = 1;
        int i = 0;

        while (i < n) {
            long denominador = 2 * i + 1;
            System.out.print(a + "/" + denominador + (i < n - 1 ? ", " : "\n"));
            long suma = a + b;
            a = b;
            b = suma;
            i++;
        }
    }
}
