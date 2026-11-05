package pkgFiguras;

/**
 * F15. Triángulo de Pascal alineado a la izquierda.
 * Cada número es la suma de los dos que tiene encima y los extremos son 1.
 * La fila se guarda en un arreglo que se actualiza de derecha a izquierda.
 * Con long el máximo es n = 67; con más filas el valor se desborda.
 *
 * @author Robles.Steven
 */
public class F15PascalIzquierdo {

    /**
     * Dibuja las primeras n filas del triángulo de Pascal.
     *
     * @param n cantidad de filas (máximo 67)
     */
    public void g3F15DibujarPascalIzquierdo(int n) {
        final int limite = 67;
        if (n < 1) {
            System.out.println("El tamaño debe ser mayor a 0");
            return;
        }
        if (n > limite) {
            System.out.println("Límite del tipo de dato alcanzado (máximo n = " + limite + ")");
            return;
        }
        long[] fila = new long[n];
        fila[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = i - 1; j >= 1; j--) {
                fila[j] = fila[j] + fila[j - 1];
            }
            for (int j = 0; j < i; j++) {
                System.out.print(fila[j]);
                if (j < i - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}