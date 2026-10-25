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
    public void g3Sn06MostrarCuadradoPerfecto(int n) {
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
    public void g3Sn06MostrarNumerosTriangulares(int n) {

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
}
