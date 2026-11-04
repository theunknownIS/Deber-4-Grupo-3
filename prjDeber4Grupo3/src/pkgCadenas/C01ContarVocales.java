package pkgCadenas;

/**
 * C01. Contar las vocales de una frase.
 * Ejemplo: ballena -> tiene 3 vocales.
 * Pasa la frase a minusculas y recorre letra por letra con un for.
 *
 * @author Santamaria.Axel
 */
public class C01ContarVocales {

    /**
     * Cuenta las vocales y muestra el resultado.
     *
     * @param frase texto en el que se cuentan las vocales
     */
    public void g3C01ContarVocales(String frase) {
        String minusculas = frase.toLowerCase();
        int vocales = 0;

        for (int i = 0; i < minusculas.length(); i++) {
            char letra = minusculas.charAt(i);
            if ("aeiouáéíóú".indexOf(letra) >= 0) {
                vocales++;
            }
        }
        System.out.println("tiene " + vocales + " vocales");
    }
}
