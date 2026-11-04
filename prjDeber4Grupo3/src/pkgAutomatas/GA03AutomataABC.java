package pkgAutomatas;

public class GA03AutomataABC {

    /**
     * GA03. Autómata para validar a+ | b+ | c+.
     * <p>
     * Valida si una cadena pertenece al lenguaje formado por una o más 'a',
     * una o más 'b' o una o más 'c', sin mezclarlas. Usa un autómata finito
     * determinista representado con una tabla de transiciones: cada fila es
     * un estado (q0, q1, q2, q3 y qe, el estado de error) y cada columna un
     * símbolo del alfabeto {a, b, c}. Los estados de aceptación son q1, q2
     * y q3.
     * <p>
     * Ejemplo: "aaa" y "cc" son aceptadas; "ab" y la cadena vacía son
     * rechazadas.
     *
     * @param cadena cadena que se va a validar
     * @return true si la cadena pertenece al lenguaje, false en caso contrario
     * @author Silva.Ismael
     */
    public boolean g3GA03ValidarCadenaConAutomata(String cadena) {

        int[][] tablaEstados = {
                { 1, 2, 3 },
                { 1, 4, 4 },
                { 4, 2, 4 },
                { 4, 4, 3 },
                { 4, 4, 4 }
        };
        int estado = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (caracter < 'a' || caracter > 'c') {
                return false;
            }
            int simbolo = caracter - 'a';
            estado = tablaEstados[estado][simbolo];
        }
        return estado == 1 || estado == 2 || estado == 3;

    }

}
