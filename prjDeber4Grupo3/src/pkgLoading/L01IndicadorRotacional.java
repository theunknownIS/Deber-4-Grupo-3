package pkgLoading;

/**
 * L01. Indicador de carga de 0 a 100% con los signos \ | / - girando.
 * El signo de cada paso es signos[porcentaje % 4]. Usa for, una pausa
 * (Thread.sleep) y \r para escribir siempre en la misma linea.
 *
 * @author Santamaria.Axel
 */
public class L01IndicadorRotacional {

    /**
     * Anima el indicador de 0 a 100%.
     */
    public void g3L01AnimarIndicadorRotacional() {
        char[] signos = {'\\', '|', '/', '-'};

        try {
            for (int porcentaje = 0; porcentaje <= 100; porcentaje++) {
                System.out.print("\r" + signos[porcentaje % 4] + " " + porcentaje + "%   ");
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println();
    }
}
