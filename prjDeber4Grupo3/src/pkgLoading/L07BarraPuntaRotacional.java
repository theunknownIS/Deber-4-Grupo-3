package pkgLoading;
/**
 * Crear una barra de carga de 20 caracteres, la barra avanza cambiando la punta 
 * con movimiento rotacional de los signos \ | / - \
 * [===\    ]20%
*/
public class L07BarraPuntaRotacional {
    private int largoBarra = 20;
    private char[] simbolos = {'\\', '|', '/', '-', '|'};
    private int tiempoEspera = 400;

    public void g3L07BarraPuntaRotacional() {
        for (int porcentaje = 0; porcentaje <= 100; porcentaje++) {
            if (porcentaje % 5 == 0) {
                int numeroDibujo= porcentaje / 5;
                int posicionesLlenas = (porcentaje * largoBarra) / 100;
                String barra = "\r[";
                for (int posicion = 0; posicion < largoBarra; posicion++) {
                    if (posicion < posicionesLlenas) {
                        barra += "=";
                    } else if (posicion == posicionesLlenas && porcentaje < 100) {
                        barra += simbolos[numeroDibujo % 5];
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