package pkgFiguras;

/**
 * F01. Cuadrado hueco de asteriscos.
 * Una posicion (fila i, columna j) lleva asterisco solo si esta en el borde:
 * primera o ultima fila, o primera o ultima columna. Si no, lleva espacio.
 * Usa un for dentro de otro for.
 *
 * @author Santamaria.Axel
 */
public class F01CuadradoHueco {

    /**
     * Dibuja el cuadrado hueco.
     *
     * @param n tamano del cuadrado (lado)
     */
    public void g3F01DibujarCuadradoHueco(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean esBorde = i == 0 || i == n - 1 || j == 0 || j == n - 1;
                System.out.print(esBorde ? "*" : " ");
                if (j < n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
