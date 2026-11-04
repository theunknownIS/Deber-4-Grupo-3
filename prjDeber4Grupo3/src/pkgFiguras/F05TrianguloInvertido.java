package pkgFiguras;

/**
 * F05. Triángulo invertido centrado de asteriscos.
 * En la fila i hay 2(n - i) + 1 asteriscos y i - 1 espacios iniciales,
 * por eso la figura queda centrada y cada fila tiene 2 asteriscos menos.
 *
 * @author Robles.Steven
 */
public class F05TrianguloInvertido {

    /**
     * Dibuja el triángulo invertido centrado.
     *
     * @param n cantidad de niveles (filas) de la figura
     */
    public void g3F05DibujarTrianguloInvertido(int n) {
        for (int i = 1; i <= n; i++) {
            for (int e = 1; e <= i - 1; e++) {
                System.out.print(" ");
            }
            for (int a = 1; a <= 2 * (n - i) + 1; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}