package pkgIsmael;

/**
 * Series asignadas a Silva.Ismael:
 * SN06, SN12, SN13, SN14, SN15, SN16, SN18
 */
public class IsmaelSerie {

    /**
     * SN06: Cuadrados perfectos.
     * <p>
     * Imprime los primeros n cuadrados perfectos: 1, 4, 9, 16, ...
     *
     * @param n número de términos que se van a imprimir
     */
    public void g3Sn06ImprimirCuadradoPerfecto(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i * i);
            if (i < n) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    /**
     * SN12: Números triangulares.
     * <p>
     * Imprime los primeros n números triangulares: 1, 3, 6, 10, 15, 21, ...
     * 
     * @param n número de números triangulares que se van a imprimir
     */
    public void g3Sn06ImprimirNumerosTriangulares(int n) {

        int actual = 0;
        for (int i = 1; i <= n; i++) {
            actual = actual + i;
            System.out.print(actual);
            if (i < n) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    /**
     * SN13: Números Factoriales.
     * <p>
     * Imprime los primeros n números factoriales: 1, 2, 6, 24, 120, 720, ...
     * 
     * @param n número de números factoriales que se van a imprimir
     */
    public void g3Sn13ImprimirFactoriales(int n) {
        long actual = 1L;
        for (int i = 0; i < n; i++) {
            actual = actual + (i * actual);
            System.out.print(actual);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

    }

    /**
     * SN14: Signos Alternos.
     * <p>
     * Imprime los primeros n números naturales alternando el singo en los pares: 1,
     * -2, 3, -4, 5, -6, ...
     * 
     * @param n número de números que se van a imprimir
     */
    public void g3Sn14ImprimirSignosAlternos(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(-1 * i);
            } else {
                System.out.print(i);
            }
            if (i < n) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
