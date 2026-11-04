package pkgAutomatas;

/**
 * GA04. Autómata que valida el lenguaje 1+/0+1*:
 * una o más unos, o una o más ceros seguidos de cero o más unos.
 * Estados: 0 inicio, 1 unos, 2 ceros, 3 ceros seguidos de unos, 4 error.
 *
 * @author Salvatierra.Kleimer
 */
public class GA04AutomataBinario {

    /**
     * Indica si la cadena pertenece al lenguaje 1+/0+1*.
     *
     * @param cadena cadena a validar
     * @return true si es válida, false si no
     */
    public boolean g3Ga04ValidarAutomataBinario(String cadena) {
        if (cadena == null || cadena.isEmpty()) {
            return false;
        }
        int estado = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            switch (estado) {
                case 0:
                    estado = (c == '1') ? 1 : (c == '0') ? 2 : 4;
                    break;
                case 1:
                    estado = (c == '1') ? 1 : 4;
                    break;
                case 2:
                    estado = (c == '0') ? 2 : (c == '1') ? 3 : 4;
                    break;
                case 3:
                    estado = (c == '1') ? 3 : 4;
                    break;
                default:
                    return false;
            }
        }
        return estado == 1 || estado == 2 || estado == 3;
    }
}