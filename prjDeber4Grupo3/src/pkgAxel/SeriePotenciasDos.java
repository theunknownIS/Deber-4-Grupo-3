package pkgAxel;

/**
 * SN09. Potencias: 2, 4, 8, 16, 32, 64, ...
 * Cada numero es el doble del anterior. Usa while.
 * Limite: n maximo 62 (2 elevado a 63 no cabe en un long).
 */
public class SeriePotenciasDos {

    /**
     * Muestra las potencias de 2.
     *
     * @param n numero de terminos a mostrar (maximo 62; si se pasa, muestra un aviso y no ejecuta la serie)
     */
    public void g3Sn09MostrarPotencias(int n) {
        final int limite = 62;
        if (n > limite) {
            System.out.println("Límite del tipo de dato alcanzado (máximo n = " + limite + ")");
            return;
        }
        long potencia = 2;
        int contador = 1;

        while (contador <= n) {
            System.out.print(potencia + (contador < n ? ", " : "\n"));
            potencia = potencia * 2;
            contador++;
        }
    }
}
