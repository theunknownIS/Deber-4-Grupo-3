package pkgFiguras;
/**
 * F02. Cuadrado hueco que alterna * y + en el borde.
 * Los símbolos de cada fila van separados por un espacio. En el borde el 
 * debe ir alternando * y +
 * el interior se rellena con espacios.
 * 
 * @author Teran.Camila
 * @param n tamaño del cuadrado
 */
public class F02CuadradoAlternado {
    public void g3F02DibujarCuadradoAlternado(int n) {
        if (n <= 0) {
            System.out.println("El tamaño debe ser mayor que 0.");
            return;
        }
        for (int fila = 0; fila < n; fila++) {
            for (int columna = 0; columna < n; columna++) {
                boolean parteCuadrado = fila == 0 || fila == n - 1 || columna == 0 || columna == n - 1;
                if (parteCuadrado) {
                    System.out.print((fila + columna) % 2 == 0 ? "*" : "+");
                } else {
                    System.out.print(" ");
                }
                System.out.print(" "); 
            }
            System.out.println();
        }
    }
}
