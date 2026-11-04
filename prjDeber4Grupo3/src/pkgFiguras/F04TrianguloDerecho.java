package pkgFiguras;

/**
 * F04. Triángulo rectángulo derecho de asteriscos.
 * En la fila i se imprimen n - i espacios y luego i asteriscos, con dos ciclos for anidados dentro del ciclo de filas.
 *
 * @author Salvatierra.Kleimer
 */
public class F04TrianguloDerecho {

    /**
     * Dibuja el triángulo rectángulo alineado a la derecha.
     *
     * @param n tamaño del triángulo (número de filas)
     */
    public void g3F04DibujarTrianguloDerecho(int n) {
           if (n < 1) {
            System.out.println("Error: n debe ser mayor a 0");
            return;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
