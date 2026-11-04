package pkgAutomatas;

/**
 * GA05. Autómata que valida si una cadena es un número decimal:
 * signo opcional (+ o -), uno o más dígitos, un punto y uno o más dígitos.
 * Los estados son q0 (inicio), q1 (leí el signo), q2 (dígitos de la parte
 * entera), q3 (leí el punto) y q4 (decimales, estado final). La tabla guarda
 * a qué estado se pasa según el tipo de carácter (dígito, signo, punto u
 * otro); -1 significa error.
 *
 * @author Robles.Steven
 */
public class GA05NumeroDecimal {

    /**
     * Valida si la cadena es un número decimal.
     *
     * @param cadena texto que se quiere validar
     * @return true si la cadena es un número decimal, false si no lo es
     */
    public boolean g3Ga05ValidarNumeroDecimal(String cadena) {
        int[][] tabla = {
            //  d   s   p  otro
            {  2,  1, -1, -1 },   // q0
            {  2, -1, -1, -1 },   // q1
            {  2, -1,  3, -1 },   // q2
            {  4, -1, -1, -1 },   // q3
            {  4, -1, -1, -1 }    // q4
        };
        int estado = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            int tipo = (c >= '0' && c <= '9') ? 0
                     : (c == '+' || c == '-') ? 1
                     : (c == '.') ? 2 : 3;
            estado = tabla[estado][tipo];
            if (estado == -1) {
                return false;
            }
        }
        return estado == 4;
    }
}