package pkgFiguras;

/**
 * F09. Montaña formada por escalones que suben y bajan.
 * La fila 1 es la cima (___). Desde la fila 2 hay un escalón izquierdo (___|)
 * y uno derecho (|___), separados por espacios que crecen 8 por fila.
 * Requiere n >= 1.
 *
 * @author Salvatierra.Kleimer
 */
public class F09Montania {

    /**
     * Dibuja la montaña de n filas.
     *
     * @param n número de filas de la montaña
     */
    public void g3F09DibujarMontania(int n) {
        if (n < 1) {
            System.out.println("Error: n debe ser mayor a 0");
            return;
        }
        for (int k = 1; k <= n; k++) {
            for (int j = 1; j <= 4 * (n - k); j++) {
                System.out.print(" ");
            }
            if (k == 1) {
                System.out.print("___");
            } else {
                System.out.print("___|");
                for (int j = 1; j <= 8 * k - 13; j++) {
                    System.out.print(" ");
                }
                System.out.print("|___");
            }
            System.out.println();
        }
    }
}
