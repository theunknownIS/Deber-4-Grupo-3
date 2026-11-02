package pkgFiguras;

public class F18TrianguloNumerico {
    /**
     * F18. Triángulo numérico
     * <p>
     * Imprime un triángulo numérico cuyas cuyos elementos son la suma de dos
     * términos de la fila anterior.
     * <p>
     * Usa un bucle for para recorrer las filas y otro bucle for para recorrer los
     * elementos de cada fila. En cada iteración, se calcula el valor del elemento
     * actual como la suma de los dos elementos de la fila anterior que están
     * directamente encima de él, y se guarda en un arreglo temporal. Luego, se
     * imprime el arreglo temporal para mostrar la fila actual del triángulo.
     *
     * @author Silva.Ismael
     * @param n es el tamaño de la figura
     */
    public void g3F18DibujarTrianguloNumerico(int n) {

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = 2;
            for (int j = i - 1; j >= 1; j--) {
                arr[j] = arr[j - 1] + arr[j];
            }
            if (i > 0) {
                arr[0] = 1;
            }

            for (int k = 0; k <= i; k++) {
                System.out.printf(" %4d", arr[k]);
            }
            System.out.println();
        }
    }

}
