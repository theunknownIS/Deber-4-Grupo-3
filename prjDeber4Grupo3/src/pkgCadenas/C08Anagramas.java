package pkgCadenas;

import java.util.Random;
import java.util.Scanner;

public class C08Anagramas {

    private String[] palabras1 = { "delira", "ballena", "alondra", "españa", "enrique" };
    private String[] palabras2 = { "lidera", "llenaba", "ladrona", "apañes", "quieren" };

    /**
     * C08. Mostrar palabra al azar.
     * <p>
     * Elige al azar una posición del conjunto y uno de los dos arreglos de
     * palabras. Muestra la palabra elegida y devuelve su anagrama, que está
     * en la misma posición del otro arreglo.
     *
     * @return el anagrama correcto de la palabra mostrada
     * @author Silva.Ismael
     */
    private String g3MostrarPalabra() {
        Random random = new Random();
        int x = random.nextInt(palabras1.length);
        int m = random.nextInt(2) + 1;

        if (m == 1) {
            System.out.println("Palabra: " + palabras1[x]);
            return palabras2[x];
        } else {
            System.out.println("Palabra: " + palabras2[x]);
            return palabras1[x];
        }
    }

    /**
     * C08. Anagramas de palabras.
     * <p>
     * Muestra una palabra al azar del conjunto y pide al usuario que ingrese
     * su anagrama. El usuario tiene 3 intentos; si falla los 3, se muestra
     * la respuesta correcta. La comparación no distingue mayúsculas de
     * minúsculas.
     * <p>
     * Ejemplo: palabra "delira" produce la respuesta "lidera".
     *
     * @param scanner Scanner para leer las respuestas del usuario
     * @author Silva.Ismael
     */
    public void g3C08JugarAnagrama(Scanner scanner) {
        String palabraCorrecta = g3MostrarPalabra();
        int intentos = 0;
        boolean comprobado;

        do {
            System.out.print("Ingrese el anagrama: ");
            String respuesta = scanner.nextLine().trim();
            comprobado = palabraCorrecta.equalsIgnoreCase(respuesta);
            intentos++;

            if (!comprobado && intentos < 3) {
                System.out.println("Incorrecto. Te quedan " + (3 - intentos) + " intentos.");
            }
        } while (!comprobado && intentos < 3);

        if (comprobado) {
            System.out.println("¡Correcto!");
        } else {
            System.out.println("Fallaste. La respuesta era: " + palabraCorrecta);
        }
    }
}
