package pkgLoading;

public class L08CargaNombre {

    /**
     * L08. Carga letra a letra del nombre.
     * <p>
     * Simula una barra de carga del tamaño del nombre en la que las letras
     * aparecen de izquierda a derecha según el porcentaje de avance. La
     * cantidad de letras visibles se calcula con el porcentaje y el largo del
     * nombre; las casillas que aún no cargan se muestran como espacios.
     * <p>
     *
     * @param nombre nombre que se va cargando en la barra
     * @author Silva.Ismael
     */
    public void g3L08AnimarCargaNombre(String nombre) {
        char[] arrNombre = nombre.toCharArray();
        char[] arrBarra = new char[arrNombre.length];
        for (int i = 0; i < arrBarra.length; i++) {
            arrBarra[i] = ' ';
        }

        for (int porcentaje = 0; porcentaje <= 100; porcentaje += 5) {
            int letrasVisibles = (porcentaje * arrNombre.length) / 100;
            for (int i = 0; i < letrasVisibles; i++) {
                arrBarra[i] = arrNombre[i];
            }
            System.out.print("\r[" + new String(arrBarra) + "] " + porcentaje + "%");

            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
    }

}
