package pkgRecursion;

/**
 * R04. Potencia de un número usando recursión.
 * potencia(a, 0) = 1 y potencia(a, b) = a * potencia(a, b - 1).
 * Requiere b >= 0. No usa ciclos.
 *
 * @author Salvatierra.Kleimer
 */
public class R04Potencia {

    /**
     * Calcula a elevado a b y muestra el resultado.
     * Si b es negativo o el resultado no cabe en long, muestra un aviso.
     *
     * @param a base
     * @param b exponente (entero mayor o igual a 0)
     */
    public void g3R04MostrarPotencia(long a, int b) {
        if (b < 0) {
            System.out.println("Error: el exponente debe ser mayor o igual a 0");
            return;
        }
        try {
            System.out.println(a + "^" + b + " = " + g3R04Potencia(a, b));
        } catch (ArithmeticException e) {
            System.out.println("Límite del tipo de dato alcanzado: el resultado no cabe en long");
        }
    }

    /**
     * Calcula la potencia de forma recursiva.
     *
     * @param a base
     * @param b exponente (entero mayor o igual a 0)
     * @return a elevado a b
     */
    public long g3R04Potencia(long a, int b) {
        if (b == 0) {
            return 1;
        }
        return Math.multiplyExact(a, g3R04Potencia(a, b - 1));
    }
}