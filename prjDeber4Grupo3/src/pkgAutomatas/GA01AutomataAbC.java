package pkgAutomatas;

/**
 * GA01. Automata para validar el lenguaje a*b+c:
 * cero o mas a, despues una o mas b y al final una sola c.
 * Estados: 0 = leyendo a (inicial), 1 = leyendo b, 2 = termino con c (aceptacion),
 * -1 = error. El estado actual es un int y se recorre la cadena con un switch.
 *
 * @author Santamaria.Axel
 */
public class GA01AutomataAbC {

    /**
     * Valida la cadena.
     *
     * @param cadena texto a validar
     * @return true si la cadena pertenece a a*b+c
     */
    public boolean g3Ga01ValidarAutomataAbC(String cadena) {
        int estado = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            switch (estado) {
                case 0:
                    if (c == 'a') {
                        estado = 0;
                    } else if (c == 'b') {
                        estado = 1;
                    } else {
                        estado = -1;
                    }
                    break;
                case 1:
                    if (c == 'b') {
                        estado = 1;
                    } else if (c == 'c') {
                        estado = 2;
                    } else {
                        estado = -1;
                    }
                    break;
                default:
                    estado = -1;
            }
        }
        return estado == 2;
    }
}
