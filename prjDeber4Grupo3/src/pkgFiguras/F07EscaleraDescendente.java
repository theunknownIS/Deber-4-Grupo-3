package pkgFiguras;
/**
 * F07. Escalera descendente
 * Imprime los simbolos | --- de manera desendente 
 * 
 * @author Teran.Camila
 * @param n tamaño de la escalera
 */
public class F07EscaleraDescendente {
    public void g3F07DibujarEscaleraDescendente(int n) {
        if (n <= 0) {
            System.out.println("El tamaño debe ser mayor que 0.");
            return;
        }
        System.out.println("___");
        for (int fila = 1; fila < n; fila++) {
            for (int columna = 0; columna < fila; columna++) {
                System.out.print("   ");
            }
            System.out.println("|___");
        }
    }
}
