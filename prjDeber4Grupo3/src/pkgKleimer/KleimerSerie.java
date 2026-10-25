package pkgKleimer;

/**
 * Series asignadas a Salvatierra.kleimer:
 * SC02, SC04, SC06, SC08, SC10, SC12, SC14
 */
public class KleimerSerie {
    /**
     * SC02. Grupos de signos: +, ++, +++, ...
     * Imprime n grupos de signos +, donde el grupo i tiene i signos.
     * 
     * @param n numero de terminos a mostrar
     */
    public void g3Sc02GruposSignos(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("+");
            }
            System.out.print(i < n ? ", " : "\n");
        }
    }

    /**
     * SC04. Operadores cíclicos: +, -, *, /, +, -, *, /, ...
     * Imprime n operadores que se repiten en ciclo, eligiendo el operador
     * según el residuo de (i - 1) entre 4.
     *
     * @param n número de términos a mostrar
     */
    public void g3Sc04OperadoresCiclicos(int n) {
        String operadores = "+-*/";
        for (int i = 1; i <= n; i++) {
            System.out.print(operadores.charAt((i - 1) % 4));
            System.out.print(i < n ? ", " : "\n");
        }
    }

    /**
     * SC06. Letras consecutivas: a, b, c, d, ...
     * Imprime n letras consecutivas del alfabeto, empezando en a y avanzando una
     * letra por término.
     *
     * @param n número de términos a mostrar
     */
    public void g3Sc06LetrasConsecutivas(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print((char) ('a' + (i - 1)));
            System.out.print(i < n ? ", " : "\n");
        }
    }

    /**
     * SC08. Letras repetidas: aa, bbbb, cccccc, dddddddd, ...
     * Imprime n bloques de letras repetidas, donde la letra del término i se repite
     * 2i veces.
     *
     * @param n número de términos a mostrar
     */
    public void g3Sc08LetrasRepetidas(int n) {
        for (int i = 1; i <= n; i++) {
            char letra = (char) ('a' + (i - 1));
            for (int j = 1; j <= 2 * i; j++) {
                System.out.print(letra);
            }
            System.out.print(i < n ? ", " : "\n");
        }
    }

    /**
     * SC10. Letras con repetición: a, bb, ccc, dddd, ...
     * Imprime n bloques de letras repetidas, donde la letra del término i se repite
     * i veces.
     *
     * @param n número de términos a mostrar
     */
    public void g3Sc10LetrasConRepeticion(int n) {
        for (int i = 1; i <= n; i++) {
            char letra = (char) ('a' + (i - 1));
            for (int j = 1; j <= i; j++) {
                System.out.print(letra);
            }
            System.out.print(i < n ? ", " : "\n");
        }
    }

    /**
     * SC12. Vocales repetidas: a, ee, iii, oooo, uuuuu, ...
     * Imprime n bloques de vocales repetidas, donde la vocal del término i se
     * repite i veces. Después de la u, la vocal reinicia en a.
     *
     * @param n número de términos a mostrar
     */
    public void g3Sc12VocalesRepetidas(int n) {
        String vocales = "aeiou";
        int i = 1;
        while (i <= n) {
            char vocal = vocales.charAt((i - 1) % 5);
            int j = 1;
            while (j <= i) {
                System.out.print(vocal);
                j++;
            }
            System.out.print(i < n ? ", " : "\n");
            i++;
        }
    }


/**
     * SC14. Alfabeto: A, B, C, D, E, ...
     * Imprime las primeras n letras del alfabeto en mayúscula.
     *
     * @param n número de letras a mostrar
     */
    public void g3Sc14MostrarAlfabeto(int n) {
        int i = 1;
        do {
            System.out.print((char) ('A' + (i - 1)));
            System.out.print(i < n ? ", " : "\n");
            i++;
        } while (i <= n);
    }
}
