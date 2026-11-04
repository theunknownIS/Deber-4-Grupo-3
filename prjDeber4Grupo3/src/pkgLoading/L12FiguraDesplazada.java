package pkgLoading;

/**
 * L12. Figura ASCII que se desplaza hacia la derecha y regresa. La figura
 * se guarda en un arreglo de 3 líneas. En cada cuadro se antepone d espacios
 * a cada línea: d sube de 0 a 20 (ida) y baja de 20 a 0 (vuelta). El código
 * \u001B[3A sube el cursor 3 líneas para dibujar encima del cuadro anterior
 * y \u001B[K borra lo que sobra a la derecha de cada línea.
 *
 * @author Robles.Steven
 */
public class L12FiguraDesplazada {

    /**
     * Anima la figura de ida y vuelta.
     *
     * @throws InterruptedException si se interrumpe la pausa entre cuadros
     */
    public void g3L12AnimarFiguraDesplazada() throws InterruptedException {
        String[] figura = { "   \\|||/", "   (> <)", "ooO-(_)-Ooo" };
        int max = 20;
        for (int k = 0; k <= 2 * max; k++) {
            int d = (k <= max) ? k : 2 * max - k;
            if (k > 0) {
                System.out.print("\u001B[3A");
            }
            for (int f = 0; f < figura.length; f++) {
                for (int e = 1; e <= d; e++) {
                    System.out.print(" ");
                }
                System.out.print(figura[f] + "\u001B[K\n");
            }
            Thread.sleep(80);
        }
    }
}