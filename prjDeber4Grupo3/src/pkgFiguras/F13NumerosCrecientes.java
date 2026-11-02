package pkgFiguras;

public class F13NumerosCrecientes {
    /**
     * F03. Números Crecientes
     * <p>
     * Imprime un triángulo de números crecientes alineado hacia el lado izquierdo.
     * <p>
     * Usa un bucle for para controlar las filas y otro para controlar el número de
     * caracteres por fila.
     *
     * @author Silva.Ismael
     * @param n es el tamaño de la figura
     */
    public void g3F03DibujarTrianguloIzquierdo(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
