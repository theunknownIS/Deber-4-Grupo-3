package pkgRecursion;

public class R03Multiplicacion {

    /**
     * R03. Multiplicación recursiva.
     * <p>
     * Calcula a · b como una suma repetida: suma a tantas veces como indica b.
     * El caso base es b = 0, que devuelve 0. Si b es negativo, se usa
     * a · b = -(a · (-b)) para que la recursión llegue a 0. El signo de a
     * se maneja solo con la suma, por lo que funciona con cualquier
     * combinación de signos.
     * <p>
     * Ejemplo: g3R03Multiplicar(2, 4) = 2 + 2 + 2 + 2 + 0 = 8.
     *
     * @param a número que se suma repetidamente
     * @param b cantidad de veces que se suma a
     * @return el producto de a por b
     * @author Silva.Ismael
     */
    public int g3R03Multiplicar(int a, int b) {
        if (b == 0) {
            return 0;
        }
        if (b < 0) {
            return -g3R03Multiplicar(a, -b);
        }
        return a + g3R03Multiplicar(a, b - 1);

    }

}
