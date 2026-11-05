package pkgCadenas;
/**
 * C07: Pedir una frase y mostrarla en mayúsculas sin la letra J
 * Ejemplo: frase: mujeres
 * Salida: MUERES
 * @author Teran.Camila 
 */
public class C07MayusculasSinJ {
/**
 * @param frase texto que se convertirá a mayúsculas y se eliminará la letra J
 * @return resultado de la frase en mayúsculas sin la letra J
 */
    public String g3C07MayusculasSinJ(String frase) {
        String resultado = "";
        String texto = frase.toUpperCase();
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (letra != 'J') {
                resultado += letra;
            }
        }
        System.out.println("La frase \"" + frase + "\" en mayúsculas sin la letra J es: " + resultado);
        return resultado;
    }
}
