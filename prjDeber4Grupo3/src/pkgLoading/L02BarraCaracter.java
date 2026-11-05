package pkgLoading;
/**
 * L02: Pedir un caracter para simular la carga y la longitud de la barra es 20
 * [###       ]20%
 * @author Teran.Camila
*/
public class L02BarraCaracter {

    private int largoBarra = 20;
    private int tiempoEspera = 400;

    /**
     * @param caracter caracter para dibujar la barra
     */
    public void g3L02BarraCaracter(char caracter) {
        for (int porcentaje = 0; porcentaje <= 100; porcentaje++) {
            if (porcentaje % 5 == 0) {
                int posicionesLlenas = (porcentaje * largoBarra) / 100;
                String barra = "\r[";
                for (int posicion = 0; posicion < largoBarra; posicion++) {
                    if (posicion < posicionesLlenas) {
                        barra += caracter;
                    } else {
                        barra += " ";
                    }
                }
                barra += "] " + porcentaje + "%";
                System.out.print(barra);
                System.out.flush();
                g3Esperar(tiempoEspera);
            }
        }
        System.out.println();
    }

    private void g3Esperar(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException exception) {
            Thread.currentThread().interrupt();
        }
    }
}