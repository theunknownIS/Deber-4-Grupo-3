package pkgFiguras;

/**
 * F06. Piramide centrada de asteriscos.
 * En la fila i van (n - i) espacios y (2i - 1) asteriscos.
 * Usa un do-while para las filas y for para espacios y asteriscos.
 *
 * @author Santamaria.Axel
 */
public class F06Piramide {

    /**
     * Dibuja la piramide.
     *
     * @param n numero de niveles (filas) de la piramide
     */
    public void g3F06DibujarPiramide(int n) {
        if (n < 1) {
            return;
        }
        int fila = 1;

        do {
            for (int e = 1; e <= n - fila; e++) {
                System.out.print(" ");
            }
            for (int a = 1; a <= 2 * fila - 1; a++) {
                System.out.print("*");
            }
            System.out.println();
            fila++;
        } while (fila <= n);
    }
}
