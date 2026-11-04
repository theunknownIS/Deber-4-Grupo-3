package pkgFiguras;

/**
 * F11. Escalera de guiones crecientes.
 * La fila i tiene el simbolo | y despues i guiones bajos. Cada fila empieza
 * donde termina la anterior, asi que el desplazamiento crece con el largo de
 * la fila anterior (1 + 2i). Usa un while para las filas y for adentro.
 *
 * @author Santamaria.Axel
 */
public class F11EscaleraGuiones {

    /**
     * Dibuja la escalera.
     *
     * @param n numero de filas de la escalera
     */
    public void g3F11DibujarEscaleraGuiones(int n) {
        int fila = 1;
        int desplazamiento = 0;

        while (fila <= n) {
            for (int e = 1; e <= desplazamiento; e++) {
                System.out.print(" ");
            }
            System.out.print("|");
            for (int g = 1; g <= fila; g++) {
                System.out.print(" _");
            }
            System.out.println();
            desplazamiento = desplazamiento + 1 + 2 * fila;
            fila++;
        }
    }
}
