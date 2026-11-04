package pkgFiguras;

/**
 * F10. Escalera con signos _+_ y _-_ alternados.
 * Cada escalón se corre 4 columnas a la derecha del anterior (4(i - 1)
 * espacios). El primero es "_+_" y los demás "|_x_", con el signo + en los
 * escalones impares y - en los pares. Al final queda una barra sola.
 *
 * @author Robles.Steven
 */
public class F10EscaleraSignos {

    /**
     * Dibuja la escalera de n escalones.
     *
     * @param n cantidad de escalones
     */
    public void g3F10DibujarEscaleraSignos(int n) {
        for (int i = 1; i <= n; i++) {
            for (int e = 1; e <= 4 * (i - 1); e++) {
                System.out.print(" ");
            }
            if (i > 1) {
                System.out.print("|");
            }
            System.out.print("_");
            System.out.print(i % 2 != 0 ? "+" : "-");
            System.out.println("_");
        }
        for (int e = 1; e <= 4 * n; e++) {
            System.out.print(" ");
        }
        System.out.println("|");
    }
}