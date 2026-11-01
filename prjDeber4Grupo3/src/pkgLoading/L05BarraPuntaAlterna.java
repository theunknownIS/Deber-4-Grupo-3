package pkgLoading;

/**
 * L05. Barra de 20 caracteres que avanza una casilla por paso (5 %).
 * Las casillas ya recorridas se llenan con =, la casilla actual lleva la
 * punta, que alterna entre > (paso impar) y - (paso par), y el resto
 * queda vacío. El \r vuelve al inicio de la línea para redibujar la barra
 * en el mismo lugar.
 *
 * @author Robles.Steven
 */
public class L05BarraPuntaAlterna {

    /**
     * Anima la barra de 0 % a 100 %.
     *
     * @throws InterruptedException si se interrumpe la pausa entre cuadros
     */
    public void g3L05AnimarBarraPuntaAlterna() throws InterruptedException {
        int largo = 20;
        for (int k = 0; k <= largo; k++) {
            System.out.print("\r[");
            for (int i = 1; i <= largo; i++) {
                if (i < k) {
                    System.out.print("=");
                } else if (i == k) {
                    System.out.print(k % 2 != 0 ? ">" : "-");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("] " + (k * 100 / largo) + "%");
            Thread.sleep(80);
        }
        System.out.println();
    }
}