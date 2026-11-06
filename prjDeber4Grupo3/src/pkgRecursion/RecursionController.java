package pkgRecursion;

/**
 * RecursionController
 * <p>
 * Ejecuta los ejercicios de recursión desde la R01 hasta la R06 en orden.
 */
public class RecursionController {

    /**
     * Ejecuta todos los ejercicios de recursión con los datos ingresados al
     * inicio.
     *
     * @param n número para el factorial y los conteos
     * @param a primer número para la suma, la multiplicación y la potencia
     *          (base)
     * @param b segundo número para la suma, la multiplicación y la potencia
     *          (exponente)
     */
    public void mostrarRecursion(int n, int a, int b) {
        System.out.println();
        System.out.println("=== Recursión ===");
        System.out.print("R01. Factorial: ");
        long factorial = new R01Factorial().g3R01Factorial(n);
        if (factorial != -1) {
            System.out.println(n + "! = " + factorial);
        }
        System.out.print("R02. Suma: ");
        new R02Suma().g3R02Suma(a, b);
        System.out.print("R03. Multiplicación: ");
        System.out.println(a + " * " + b + " = " + new R03Multiplicacion().g3R03Multiplicar(a, b));
        System.out.print("R04. Potencia: ");
        new R04Potencia().g3R04MostrarPotencia(a, b);
        System.out.print("R05. Conteo progresivo: ");
        new R05ConteoProgresivo().g3R05ConteoProgresivo(n);
        System.out.print("R06. Conteo regresivo: ");
        new R06ConteoRegresivo().g3R06MostrarConteoRegresivo(n);
    }

}
