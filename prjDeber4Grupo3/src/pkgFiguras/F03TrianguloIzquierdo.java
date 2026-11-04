package pkgFiguras;

public class F03TrianguloIzquierdo {

    /**
     * F03. Triángulo izquierdo.
     * <p>
     * Imprime un triángulo alineado hacia el lado izquierdo.
     * <p>
     * Usa un bucle for para controlar las filas y otro para controlar el número de
     * caracteres por fila.
     *
     * @author Silva.Ismael
     * @param n es el tamaño de la figura
     */
    public void g3F03DibujarTrianguloIzquierdo(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
