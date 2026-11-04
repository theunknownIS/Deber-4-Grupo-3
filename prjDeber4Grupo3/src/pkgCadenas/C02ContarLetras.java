package pkgCadenas;
/**
 * C02: Pedir una frase y contador de letras
 * Ejemplo: frase: ballena
 * Salida: tiene 4 letras es decir cuenta las consonates
 * @author Teran.Camila
 * @param frase texto en el que se cuentan las consonantes
 */
public class C02ContarLetras {
    public int g3C02ContarLetras(String frase) {
        int consonantes = 0;
        String texto = frase.toLowerCase();

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (Character.isLetter(letra) && !esVocal(letra)) {
                consonantes++;
            }
        }
        System.out.println("La frase \"" + frase + "\" tiene " + consonantes + " consonantes.");
        return consonantes;
    }

    private boolean esVocal(char letra) {
        if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            return true;
        }
        if(letra == 'á' || letra == 'é' || letra == 'í' || letra == 'ó' || letra == 'ú'|| letra == 'ü') {
            return true;
        }
        return false;
    }

}
