package pkgFiguras;
/**
 * F17. X Binaria
 * Imprime una X utilizando 1 y 0 
 * @author Teran.Camila
 * @param n tamaño de la X
 */

public class F17XBinaria {
    public void g3F17DibujarXBinaria(int n) {
        if (n <= 0) {
            System.out.println("El tamaño debe ser mayor que 0.");
            return;
        }
        for (int fila = 0; fila < n; fila++) {
            for (int columna = 0; columna < n; columna++) {
                if (columna == fila || fila + columna == n - 1) {
                    System.out.print(fila % 2 == 0 ? "1 " : "0 ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
