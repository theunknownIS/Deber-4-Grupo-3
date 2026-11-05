package pkgAutomatas;

/**
 * AutomatasController
 * <p>
 * Ejecuta los autómatas desde el GA01 hasta el GA08 en orden y muestra si
 * cada cadena es aceptada o rechazada.
 */
public class AutomatasController {

    /**
     * Valida cada cadena con su autómata.
     *
     * @param cadenas cadenas a validar, una por autómata y en orden del GA01
     *                al GA08
     */
    public void mostrarAutomatas(String[] cadenas) {
        System.out.println();
        System.out.println("=== Autómatas ===");
        System.out.print("GA01. a*b+c: " + cadenas[0]);
        imprimirResultado(new GA01AutomataAbC().g3Ga01ValidarAutomataAbC(cadenas[0]));
        System.out.print("GA02. ab+ca: " + cadenas[1]);
        imprimirResultado(new GA02AutomataAbCa().g3Ga02ValidarAutomataAbCa(cadenas[1]));
        System.out.print("GA03. a+/b+/c+: " + cadenas[2]);
        imprimirResultado(new GA03AutomataABC().g3GA03ValidarCadenaConAutomata(cadenas[2]));
        System.out.print("GA04. 1+/0+1*: " + cadenas[3]);
        imprimirResultado(new GA04AutomataBinario().g3Ga04ValidarAutomataBinario(cadenas[3]));
        System.out.print("GA05. Número decimal: " + cadenas[4]);
        imprimirResultado(new GA05NumeroDecimal().g3Ga05ValidarNumeroDecimal(cadenas[4]));
        System.out.print("GA06. Declaración de variables: " + cadenas[5]);
        imprimirResultado(new GA06DeclaracionVariables().g3Ga06ValidarDeclaracionVariables(cadenas[5]));
        System.out.print("GA07. Palabras reservadas: " + cadenas[6]);
        imprimirResultado(new GA07PalabrasReservadas().g3Ga07ValidarPalabrasReservadas(cadenas[6]));
        System.out.print("GA08. Validador de clave: " + cadenas[7]);
        imprimirResultado(new GA08ValidadorClave().g3Ga08ValidarValidadorClave(cadenas[7]));
    }

    /**
     * Imprime si la cadena fue aceptada o rechazada por el autómata.
     *
     * @param aceptada resultado del autómata
     */
    private void imprimirResultado(boolean aceptada) {
        if (aceptada) {
            System.out.println(" -> aceptada");
        } else {
            System.out.println(" -> rechazada");
        }
    }

}
