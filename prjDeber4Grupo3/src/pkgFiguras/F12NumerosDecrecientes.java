package pkgFiguras;
/**
 * F12. Números decrecientes en triangulo invertido
 * Imprime los números de manera decreciente en forma de triángulo invertido
 * @author Teran.Camila
 * @param n tamaño del triángulo
 */
public class F12NumerosDecrecientes {
    public void g3F12DibujarNumerosDecrecientes(int n) {
        if (n <= 0) {
            System.out.println("El tamaño debe ser mayor que 0.");
            return;
        }
        for (int fila = n; fila >= 1; fila--) {
            for (int numero = 1; numero <= fila; numero++) {
                System.out.print(numero + " ");
            }
            System.out.println();
        }
    }

}
