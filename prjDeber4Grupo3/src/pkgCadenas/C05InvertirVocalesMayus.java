package pkgCadenas;

/**
 * C05. Frase invertida con las vocales en mayúscula.
 * Se recorre la frase desde la última posición hasta la primera; cada vocal
 * se imprime en mayúscula y las demás letras y los espacios quedan igual.
 *
 * @author Robles.Steven
 */
public class C05InvertirVocalesMayus {

    /**
     * Muestra la frase invertida con las vocales en mayúscula.
     *
     * @param frase texto ingresado por el usuario
     */
    public void g3C05InvertirVocalesMayus(String frase) {
        for (int i = frase.length() - 1; i >= 0; i--) {
            char c = frase.charAt(i);
            if ("aeiouáéíóúAEIOUÁÉÍÓÚ".indexOf(c) >= 0) {
                System.out.print(Character.toUpperCase(c));
            } else {
                System.out.print(c);
            }
        }
        System.out.println();
    }
}