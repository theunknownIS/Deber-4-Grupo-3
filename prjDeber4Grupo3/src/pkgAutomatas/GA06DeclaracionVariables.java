package pkgAutomatas;

/**
 * GA06. Automata para validar la declaracion de una variable en Java.
 * Alfabeto: letras (a-z y A-Z), digitos, _ y $. Una declaracion valida es
 * un nombre que empieza con letra, _ o $, sigue con letras, digitos, _ o $,
 * puede tener espacios y termina con ; , o =. Ejemplos: edad;  edad ,  $EDAS=
 * Estados: 0 = inicio, 1 = nombre de la variable, 2 = espacios despues del
 * nombre, 3 = fin con ; , o = (aceptacion), -1 = error.
 *
 * @author Santamaria.Axel
 */
public class GA06DeclaracionVariables {

    /**
     * Valida la cadena.
     *
     * @param cadena texto a validar
     * @return true si es una declaracion valida
     */
    public boolean g3Ga06ValidarDeclaracionVariables(String cadena) {
        int estado = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            switch (estado) {
                case 0:
                    if (g3Ga06EsLetra(c) || c == '_' || c == '$') {
                        estado = 1;
                    } else {
                        estado = -1;
                    }
                    break;
                case 1:
                    if (g3Ga06EsLetra(c) || g3Ga06EsDigito(c) || c == '_' || c == '$') {
                        estado = 1;
                    } else if (c == ' ') {
                        estado = 2;
                    } else if (g3Ga06EsFin(c)) {
                        estado = 3;
                    } else {
                        estado = -1;
                    }
                    break;
                case 2:
                    if (c == ' ') {
                        estado = 2;
                    } else if (g3Ga06EsFin(c)) {
                        estado = 3;
                    } else {
                        estado = -1;
                    }
                    break;
                default:
                    estado = -1;
            }
        }
        return estado == 3;
    }

    private boolean g3Ga06EsLetra(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    private boolean g3Ga06EsDigito(char c) {
        return c >= '0' && c <= '9';
    }

    private boolean g3Ga06EsFin(char c) {
        return c == ';' || c == ',' || c == '=';
    }
}
