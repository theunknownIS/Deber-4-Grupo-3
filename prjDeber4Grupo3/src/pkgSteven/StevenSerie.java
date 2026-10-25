package pkgSteven;

/**
 * Series asignadas a Robles.Steven:
 * SN02, SN08, SN10, SC01, SC11, SC16, SC17
 */
public class StevenSerie {

    /**
     * SN02. Impares alternos con cero: 1, 0, 3, 0, 5, 0, 7, ...
     * En las posiciones impares va el siguiente impar (empieza en 1 y suma 2)
     * y en las posiciones pares va siempre 0.
     *
     * @param n número de términos a mostrar
     */
    public void g3Sn02MostrarImparesAlternosCero(int n) {
        int impar = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(impar);
                impar += 2;
            } else {
                System.out.print(0);
            }
            System.out.print(i < n ? ", " : "\n");
        }
    }

        /**
     * SN08. Progresión aritmética: 3, 8, 13, 18, 23, ...
     * Empieza en 3 y cada término suma 5 al anterior.
     *
     * @param n número de términos a mostrar
     */
    public void g3Sn08MostrarProgresionAritmetica(int n) {
        int termino = 3;
        for (int i = 1; i <= n; i++) {
            System.out.print(termino);
            termino += 5;
            System.out.print(i < n ? ", " : "\n");
        }
    }

        /**
     * SN10. Potencias: 3, 9, 27, 81, 243, 729, ...
     * Empieza en 3 y cada término multiplica por 3 al anterior.
     *
     * @param n número de términos a mostrar
     */
    public void g3Sn10MostrarPotencias(int n) {
        long termino = 3;
        for (int i = 1; i <= n; i++) {
            System.out.print(termino);
            termino *= 3;
            System.out.print(i < n ? ", " : "\n");
        }
    }

        /**
     * SC01. Signos alternos: +, -, +, -, +, -, ...
     * Empieza en + y cada término cambia de signo respecto al anterior.
     *
     * @param n número de términos a mostrar
     */
    public void g3Sc01MostrarSignosAlternos(int n) {
        int signo = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(signo > 0 ? "+" : "-");
            signo *= -1;
            System.out.print(i < n ? ", " : "\n");
        }
    }

        /**
     * SC11. Grupos de #: ##, ####, ######, ########, ...
     * El grupo i tiene 2i símbolos # (empieza con 2 y aumenta de 2 en 2).
     *
     * @param n número de grupos a mostrar
     */
    public void g3Sc11MostrarGruposNumeral(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * i; j++) {
                System.out.print("#");
            }
            System.out.print(i < n ? ", " : "\n");
        }
    }

        /**
     * SC16. Alternancia: a, B, c, D, e, F, ...
     * Las letras siguen el abecedario; en las posiciones impares van en
     * minúscula y en las pares en mayúscula.
     *
     * @param n número de letras a mostrar
     */
    public void g3Sc16MostrarAlternancia(int n) {
        for (int i = 1; i <= n; i++) {
            char letra = (char) ('a' + i - 1);
            if (i % 2 == 0) {
                letra = Character.toUpperCase(letra);
            }
            System.out.print(letra);
            System.out.print(i < n ? ", " : "\n");
        }
    }
}