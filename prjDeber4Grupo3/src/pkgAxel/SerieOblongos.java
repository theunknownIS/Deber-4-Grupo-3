package pkgAxel;

/**
 * SN11. Numeros oblongos: 2, 6, 12, 20, 30, 42, ...
 * El termino i es i * (i + 1). Usa do-while.
 */
public class SerieOblongos {

    /**
     * Muestra los numeros oblongos.
     *
     * @param n numero de terminos a mostrar (1 o mas)
     */
    public void g3Sn11MostrarOblongos(int n) {
        if (n < 1) {
            return;
        }
        int posicion = 1;

        do {
            long termino = (long) posicion * (posicion + 1);
            System.out.print(termino + (posicion < n ? ", " : "\n"));
            posicion++;
        } while (posicion <= n);
    }
}
