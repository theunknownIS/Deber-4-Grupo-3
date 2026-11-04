package pkgCadenas;

/**
 * C04. Elimina de una frase todas las apariciones de una letra.
 * No distingue mayúsculas de minúsculas: eliminar 'l' también quita 'L'.
 * Requiere una frase no vacía y una letra válida.
 *
 * @author Salvatierra.Kleimer
 */
public class C04EliminarLetra {

    /**
     * Muestra la frase sin la letra indicada.
     * Si la frase es null o vacía, o si el carácter no es una letra,
     * muestra un aviso y no procesa.
     *
     * @param frase frase original
     * @param letra letra que se desea eliminar
     */
    public void g3C04EliminarLetra(String frase, char letra) {
        if (frase == null || frase.isEmpty()) {
            System.out.println("Error: la frase no puede estar vacía");
            return;
        }
        if (!Character.isLetter(letra)) {
            System.out.println("Error: el carácter ingresado no es una letra");
            return;
        }
        StringBuilder resultado = new StringBuilder();
        char buscada = Character.toLowerCase(letra);
        for (int i = 0; i < frase.length(); i++) {
            char actual = frase.charAt(i);
            if (Character.toLowerCase(actual) != buscada) {
                resultado.append(actual);
            }
        }
        System.out.println(resultado);
    }
}