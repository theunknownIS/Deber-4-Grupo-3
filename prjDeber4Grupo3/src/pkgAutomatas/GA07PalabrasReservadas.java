package pkgAutomatas;
/**
 * GA07. Valida el lenguaje L = {for, if, else, ifelse, foreach}.
 * estados: INICIO, PALABRA, ESPACIO, ACEPTADO y ERROR.
 *
 * @author Teran.Camila
 */
public class GA07PalabrasReservadas {
    /**
     * @param cadena texto a validar
    */

    private static final int INICIO = 0;
    private static final int PALABRA = 1;
    private static final int ESPACIO = 2;
    private static final int ACEPTADO = 3;
    private static final int ERROR = 4;

    private String[] lenguaje = { "for", "if", "else", "ifelse", "foreach" };

    public boolean g3Ga07ValidarPalabrasReservadas(String cadena) {
        int estado = INICIO;
        String palabra = "";

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            switch (estado) {
                case INICIO:
                    if (Character.isLetter(c)) {
                        palabra += c;
                        estado = PALABRA;
                    } else if (c != ' ') {
                        estado = ERROR;
                    }
                    break;
                case PALABRA:
                    if (Character.isLetter(c)) {
                        palabra += c;
                    } else if (!perteneceAlLenguaje(palabra)) {
                        estado = ERROR;
                    } else if (c == ' ') {
                        estado = ESPACIO;
                    } else if (c == '(' && !palabra.equals("else")) {
                        estado = ACEPTADO;
                    } else if (c == '{' && palabra.equals("else")) {
                        estado = ACEPTADO;
                    } else {
                        estado = ERROR;
                    }
                    break;
                case ESPACIO:
                    if (c == '(' && !palabra.equals("else")) {
                        estado = ACEPTADO;
                    } else if (c == '{' && palabra.equals("else")) {
                        estado = ACEPTADO;
                    } else if (c != ' ') {
                        estado = ERROR;
                    }
                    break;
                default:
                    break;
            }
        }

        if (estado == ACEPTADO) {
            return true;
        }
        return palabra.equals("else") && (estado == PALABRA || estado == ESPACIO);
    }

    private boolean perteneceAlLenguaje(String palabra) {
        for (int i = 0; i < lenguaje.length; i++) {
            if (lenguaje[i].equals(palabra)) {
                return true;
            }
        }
        return false;
    }
}