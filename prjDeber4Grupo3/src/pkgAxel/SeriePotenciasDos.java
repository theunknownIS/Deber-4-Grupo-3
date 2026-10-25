package pkgAxel;

/**
 * SN09. Potencias: 2, 4, 8, 16, 32, 64, ...
 * Cada numero es el doble del anterior. Usa while.
 */
public class SeriePotenciasDos {

    /**
     * Muestra las potencias de 2.
     *
     * @param n numero de terminos a mostrar
     */
    public void g3Sn09MostrarPotencias(int n) {
        long potencia = 2;
        int contador = 1;

        while (contador <= n) {
            System.out.print(potencia + (contador < n ? ", " : "\n"));
            potencia = potencia * 2;
            contador++;
        }
    }
}
