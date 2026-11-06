package pkgAutomatas;

/**
 * GA08. Validador de clave. Una clave es válida si tiene al menos una
 * mayúscula, una minúscula y un número. Se recorre la clave una sola vez
 * con tres banderas que pasan a verdadero cuando aparece cada tipo; al
 * final deben estar las tres en verdadero.
 *
 * @author Robles.Steven
 */
public class GA08ValidadorClave {

    /**
     * Valida si la clave cumple los tres requisitos.
     *
     * @param clave texto que se quiere validar
     * @return true si la clave es válida, false si no lo es
     */
    public boolean g3Ga08ValidarValidadorClave(String clave) {
        boolean tieneMayus = false;
        boolean tieneMinus = false;
        boolean tieneNumero = false;
        for (int i = 0; i < clave.length(); i++) {
            char c = clave.charAt(i);
            if (Character.isUpperCase(c)) {
                tieneMayus = true;
            } else if (Character.isLowerCase(c)) {
                tieneMinus = true;
            } else if (Character.isDigit(c)) {
                tieneNumero = true;
            }
        }
        return tieneMayus && tieneMinus && tieneNumero;
    }
}