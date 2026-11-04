package pkgFiguras;

/**
 * F19. Patron triangular con bordes de simbolos (+ y *) y valores internos.
 * Cada valor interno es la suma de los dos valores que tiene arriba
 * (el + vale 1 y el * vale 2).
 * Requiere n >= 1.
 * 
 * @author Salvatierra.Kleimer
 */
public class F19TriangulosSimbolos {

    /**
     * Dibuja el patron numerico y de simbolos de n filas.
     * 
     * @param n numero de filas del patron
     */
    public void g3F19DibujarPatronNumerico(int n) {
        if (n < 1) {
            System.out.println("Error: n debe ser mayor a 0");
            return;
        }

        int[][] valores = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int valor = valores[i - 1][j - 1] + valores[i - 1][j];
                if (j == 1) {
                    valor = 1;
                }
                if (j == i) {
                    valor = 2;
                }
                valores[i][j] = valor;

                String celda = String.valueOf(valor);
                if (j == 1) {
                    celda = "+";
                }
                if (j == i) {
                    celda = "*";
                }
                System.out.print(celda + " ");
            }
            System.out.println();
        }
    }
}