package pkgLoading;

/**
 * L04. Animación "Waiting" de 0 a 100 % con los signos o0o.
 * El 0 va y vuelve dentro de las tres posiciones, en la misma línea.
 * Los fotogramas se guardan en un arreglo y se recorren con el módulo.
 *
 * @author Salvatierra.Kleimer
 */
public class L04Waiting {

    /**
     * Muestra la animación de 0 a 100 %, redibujando la misma línea.
     */
    public void g3L04AnimarWaiting() {
        String[] cuadros = {"o0o", "oo0", "o0o", "0oo"};
        for (int p = 0; p <= 100; p++) {
            System.out.print("\r" + cuadros[p % 4] + " " + p + "%");
            try {
                Thread.sleep(80);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
    }
}