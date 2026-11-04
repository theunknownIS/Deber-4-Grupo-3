package pkgRecursion;

/**
 * R05. Conteo progresivo hasta n con un método recursivo (sin ciclos).
 * El caso base es k == 0 y el caso recursivo cuenta primero hasta k - 1 y
 * después imprime k; como se imprime al regresar de la llamada, los números
 * salen en orden creciente. Se limita n a 5000 para no desbordar la pila
 * de llamadas (StackOverflowError).
 *
 * @author Robles.Steven
 */
public class R05ConteoProgresivo {

    /**
     * Muestra el conteo de 1 hasta n, separado por comas.
     *
     * @param n número hasta el que se cuenta (máximo 5000)
     */
    public void g3R05ConteoProgresivo(int n) {
        final int limite = 5000;
        if (n > limite) {
            System.out.println("Límite de recursión alcanzado (máximo n = " + limite + ")");
            return;
        }
        g3R05Contar(n);
        System.out.println();
    }

    /**
     * Método recursivo: cuenta hasta k imprimiendo al regresar de la llamada.
     *
     * @param k número hasta el que se cuenta en esta llamada
     */
    private void g3R05Contar(int k) {
        if (k == 0) {
            return;
        }
        g3R05Contar(k - 1);
        if (k > 1) {
            System.out.print(", ");
        }
        System.out.print(k);
    }
}