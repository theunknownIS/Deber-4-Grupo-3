package pkgLoading;

/**
 * L10. Descarga de archivo simulada. El tamaño total se genera al azar
 * entre 10 y 100 kB. En cada paso llegan entre 1 y 5 kB y la barra de 20
 * casillas se llena según la fracción descargada, en color verde. La
 * descarga se detiene cuando se completa el tamaño total.
 *
 * @author Robles.Steven
 */
public class L10DescargaArchivo {

    /**
     * Anima la descarga hasta completar el archivo.
     *
     * @throws InterruptedException si se interrumpe la pausa entre cuadros
     */
    public void g3L10AnimarDescargaArchivo() {
        final String VERDE = "\u001B[32m";
        final String RESET = "\u001B[0m";
        int largo = 20;
        double total = 10 + Math.random() * 90;
        double descargado = 0;
        System.out.println("Downloading Archivo.whl (" + (int) total + " kB)");
        while (descargado < total) {
            descargado += 1 + Math.random() * 4;
            if (descargado > total) {
                descargado = total;
            }
            int lleno = (int) (descargado / total * largo);
            System.out.print("\r" + VERDE);
            for (int i = 1; i <= lleno; i++) {
                System.out.print("━");
            }
            System.out.print(RESET);
            for (int i = lleno + 1; i <= largo; i++) {
                System.out.print(" ");
            }
            System.out.print(String.format(" %.1f / %.1f kB", descargado, total));
            try {
                Thread.sleep(80);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
    }
}
