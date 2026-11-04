package pkgRecursion;

/**
 * R01. Factorial de n con recursion (sin ciclos).
 * Caso base: factorial(0) y factorial(1) valen 1.
 * Caso recursivo: factorial(n) = n * factorial(n - 1).
 * Limite: n maximo 20 (21! no cabe en un long).
 *
 * @author Santamaria.Axel
 */
public class R01Factorial {

    /**
     * Calcula el factorial de n.
     *
     * @param n numero del que se calcula el factorial (de 0 a 20)
     * @return el factorial de n, o -1 si n es negativo o supera el limite (muestra un aviso)
     */
    public long g3R01Factorial(int n) {
        final int limite = 20;
        if (n < 0) {
            return -1;
        }
        if (n > limite) {
            System.out.println("Límite del tipo de dato alcanzado (máximo n = " + limite + ")");
            return -1;
        }
        return g3R01Calcular(n);
    }

    /**
     * Metodo recursivo que hace el calculo.
     *
     * @param n numero actual
     * @return el factorial de n
     */
    private long g3R01Calcular(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * g3R01Calcular(n - 1);
    }
}
