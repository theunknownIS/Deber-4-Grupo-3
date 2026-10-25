package pkgAxel;

/**
 * SN07. Progresion aritmetica: 1, 4, 7, 10, 13, ...
 * Empieza en 1 y sube de 3 en 3: termino = 1 + 3 * i. Usa for.
 */
public class SerieProgresionAritmetica {

    /**
     * Muestra la progresion aritmetica que empieza en 1 y suma 3.
     *
     * @param n numero de terminos a mostrar
     */
    public void g3Sn07MostrarProgresionAritmetica(int n) {
        for (int i = 0; i < n; i++) {
            long termino = 1 + 3L * i;
            System.out.print(termino + (i < n - 1 ? ", " : "\n"));
        }
    }
}
