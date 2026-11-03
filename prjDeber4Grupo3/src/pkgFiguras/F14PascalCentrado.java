package pkgFiguras;

/**
 * F14. Triángulo de Pascal centrado.
 * Cada número interior es la suma de los dos que tiene encima.
 * Requiere n >= 1.
 * Funciona hasta n = 34 porque la fila 35 contiene 2 333 606 220, que supera el máximo de int.
 *
 * @author Salvatierra.Kleimer
 */
public class F14PascalCentrado {

    /**
     * Dibuja las primeras n filas del triángulo de Pascal, centradas.
     *
     * @param n número de filas del triángulo
     */
    public void g3F14DibujarPascalCentrado(int n) {
        final int limite = 34;
        final int separacion = 4;
        if (n < 1) {
            System.out.println("Error: n debe ser mayor a 0");
            return;
        }
        if (n > limite) {
            System.out.println("Límite del tipo de dato alcanzado (máximo n = " + limite + ")");
            return;
        }
        int[][] pascal = new int[n][n];
        for (int i = 0; i < n; i++) {
            pascal[i][0] = 1;
            pascal[i][i] = 1;
            for (int j = 1; j < i; j++) {
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
        }
        int maxValor = 0;
        for (int j = 0; j < n; j++) {
            if (pascal[n - 1][j] > maxValor) {
                maxValor = pascal[n - 1][j];
            }
        }
        int ancho = String.valueOf(maxValor).length() + separacion;
        if (ancho % 2 != 0) {
            ancho++;
        }
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < (n - 1 - i) * ancho / 2; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                String numero = String.valueOf(pascal[i][j]);
                System.out.print(numero);
                for (int s = numero.length(); s < ancho; s++) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}