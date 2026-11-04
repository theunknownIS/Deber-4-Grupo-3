package pkgLoading;

/**
 * L06. Barra de 20 caracteres con un bloque <=> que se desplaza de izquierda
 * a derecha. El bloque ocupa 3 posiciones, asi que su inicio va de 0 a 17:
 * inicio = porcentaje * 17 / 100. Usa for, una pausa (Thread.sleep) y \r.
 *
 * @author Santamaria.Axel
 */
public class L06BloqueDesplazado {

    /**
     * Anima el bloque de 0 a 100% de 5 en 5.
     */
    public void g3L06AnimarBloqueDesplazado() {
        final int longitud = 20;
        final String bloque = "<=>";

        try {
            for (int porcentaje = 0; porcentaje <= 100; porcentaje += 5) {
                int inicio = porcentaje * (longitud - bloque.length()) / 100;
                String barra = "";
                for (int i = 0; i < longitud; i++) {
                    if (i == inicio) {
                        barra = barra + bloque;
                        i = i + bloque.length() - 1;
                    } else {
                        barra = barra + " ";
                    }
                }
                System.out.print("\r[" + barra + "] " + porcentaje + "%   ");
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println();
    }
}
