package pkgCadenas;

/**
 * C06. Frase invertida con las consonantes en mayuscula.
 * Ejemplo: ballena -> aNeLLaB.
 * Recorre la frase de atras hacia adelante con un for. Si el caracter es una
 * letra que no es vocal, se pasa a mayuscula; las vocales y los demas
 * caracteres quedan igual.
 *
 * @author Santamaria.Axel
 */
public class C06InvertirConsonantesMayus {

    /**
     * Muestra la frase invertida con sus consonantes en mayuscula.
     *
     * @param frase texto que se va a invertir
     */
    public void g3C06InvertirConsonantesMayus(String frase) {
        String resultado = "";

        for (int i = frase.length() - 1; i >= 0; i--) {
            char letra = frase.charAt(i);
            boolean esVocal = "aeiouáéíóúAEIOUÁÉÍÓÚ".indexOf(letra) >= 0;
            if (Character.isLetter(letra) && !esVocal) {
                resultado = resultado + Character.toUpperCase(letra);
            } else {
                resultado = resultado + letra;
            }
        }
        System.out.println("salida: " + resultado);
    }
}
