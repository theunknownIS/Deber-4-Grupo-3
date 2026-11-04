package pkgFiguras;

public class F08EscaleraAscendente {

    /**
     * F08. Escalera ascendente.
     * <p>
     * Imprime una escalera que asciende de n peldaños.
     * <p>
     * Utiliza un bucle for para controlar las filas y otro para los espacios y
     * peldaños (___|).
     * 
     * @author Silva.Ismael
     * @param n tamaño de la escalera (peldaños)
     */
    public void g3F08DibujarEscaleraAscendente(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= (n - 1 - i); j++) {
                if ((j == (n - 1 - i)) && (i == 0)) {
                    System.out.print("___");
                } else if (j == (n - 1 - i)) {
                    System.out.print("___|");
                } else {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
    }

}
