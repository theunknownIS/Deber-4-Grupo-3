package pkgAutomatas;
/**
 * GA02: Automatas para validar ab+ca
 * Debe empezar en a despues tener al menos una b, despues una c y terminar en a
 * si no cumple -1 y es error
 * @author Teran.Camila
*/
public class GA02AutomataAbCa {
/**
 * @param cadena texto a validar
*/
public boolean g3Ga02ValidarAutomataAbCa(String cadena) {
        if (cadena == null) {
            return false;
        }
        int estado = 0;
        for (int i = 0; i < cadena.length() && estado != -1; i++) {
            char c = cadena.charAt(i);
            switch (estado) {
                case 0:
                    estado = (c == 'a') ? 1 : -1;
                    break;
                case 1:
                    estado = (c == 'b') ? 2 : -1;
                    break;
                case 2:
                    if (c == 'b') {
                        estado = 2;
                    } else if (c == 'c') {
                        estado = 3;
                    } else {
                        estado = -1;
                    }
                    break;
                case 3:
                    estado = (c == 'a') ? 4 : -1;
                    break;
                default:
                    estado = -1;
            }
        }
        return estado == 4;
    }
}