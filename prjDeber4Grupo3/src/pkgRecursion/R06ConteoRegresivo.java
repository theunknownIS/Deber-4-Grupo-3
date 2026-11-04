package pkgRecursion;

/**
 * R06. Conteo regresivo recursivo hasta 0, imprimiendo el avance.
 * Requiere n >= 0. Funciona hasta n = 5000 para evitar StackOverflowError
 * por demasiadas llamadas recursivas. No usa ciclos.
 *
 * @author Salvatierra.Kleimer
 */
public class R06ConteoRegresivo {

    /**
     * Valida n y muestra el conteo regresivo desde n hasta 0.
     *
     * @param n número desde el que se cuenta (entre 0 y 5000)
     */
    public void g3R06MostrarConteoRegresivo(int n) {
        final int limite = 5000;
        if (n < 0) {
            System.out.println("Error: n debe ser mayor o igual a 0");
            return;
        }
        if (n > limite) {
            System.out.println("Límite alcanzado: la recursión solo soporta hasta n = " + limite);
            return;
        }
        g3R06ConteoRegresivo(n);
        System.out.println();
    }

    /**
     * Imprime n y se llama con n - 1 hasta llegar a 0.
     *
     * @param n número actual del conteo
     */
    public void g3R06ConteoRegresivo(int n) {
        System.out.print(n);
        if (n > 0) {
            System.out.print(", ");
            g3R06ConteoRegresivo(n - 1);
        }
    }
}
