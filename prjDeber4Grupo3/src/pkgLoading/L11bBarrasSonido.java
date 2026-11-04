package pkgLoading;

/**
 * L11b. Barras de sonido vectorial.
 * Genera n alturas aleatorias entre 0 y 8 y dibuja la figura columna a columna,
 * con una línea base siempre completa. El ciclo externo de la animación usa
 *
 * @author Salvatierra.Kleimer
 */
public class L11bBarrasSonido {

    /**
     * Anima las barras de sonido con n columnas.
     * Si n es menor que 1, muestra un aviso y no dibuja.
     *
     * @param n número de columnas (señales)
     */
    public void g3L11bAnimarBarrasSonido(int n) {
        final int alturaMax = 8;
        if (n < 1) {
            System.out.println("Error: n debe ser mayor a 0");
            return;
        }
        int[] alturas = new int[n];
        for (int c = 0; c < n; c++) {
            alturas[c] = (int) (Math.random() * (alturaMax + 1));
        }
        int k = 1;
        do {
            for (int f = alturaMax; f >= 1; f--) {
                for (int c = 0; c < k; c++) {
                    System.out.print(alturas[c] >= f ? "■ " : "  ");
                }
                System.out.println();
            }
            for (int c = 0; c < k; c++) {
                System.out.print("■ ");
            }
            System.out.println();
            if (k < n) {
                System.out.print("\u001B[" + (alturaMax + 1) + "A");
            }
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            k++;
        } while (k <= n);
    }
}
