package pkgFiguras;

/**
 * F16. X formada con signos + y -.
 * Es una matriz cuadrada de n x n. Una posicion (i, j) esta en una diagonal
 * si i == j o si i + j == n - 1. El signo depende de la fila: las filas
 * 0, 2, 4... llevan + y las filas 1, 3, 5... llevan -. Cada columna ocupa
 * 4 caracteres. Usa un for dentro de otro for.
 *
 * @author Santamaria.Axel
 */
public class F16XSignos {

    /**
     * Dibuja la X.
     *
     * @param n tamano de la matriz cuadrada
     */
    public void g3F16DibujarXSignos(int n) {
        for (int i = 0; i < n; i++) {
            String linea = "";
            char signo = (i % 2 == 0) ? '+' : '-';
            for (int j = 0; j < n; j++) {
                boolean enDiagonal = i == j || i + j == n - 1;
                linea = linea + (enDiagonal ? signo : ' ') + "   ";
            }
            System.out.println(linea.replaceAll("\\s+$", ""));
        }
    }
}
