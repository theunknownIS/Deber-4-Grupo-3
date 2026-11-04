package pkgCadenas;

/**
 * C09. Alterna mayúscula y minúscula letra a letra.
 * Se cuentan solo las letras: la 1.ª, 3.ª, 5.ª... van en mayúscula y la 2.ª,
 * 4.ª, 6.ª... en minúscula. Los espacios y otros caracteres se imprimen igual
 * y no cuentan, por eso se usa un contador de letras y no la posición.
 *
 * @author Robles.Steven
 */
public class C09AlternarMayusculas {

    /**
     * Muestra la frase alternando mayúsculas y minúsculas.
     *
     * @param frase texto ingresado por el usuario
     */
    public void g3C09AlternarMayusculas(String frase) {
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (Character.isLetter(c)) {
                contador++;
                if (contador % 2 != 0) {
                    System.out.print(Character.toUpperCase(c));
                } else {
                    System.out.print(Character.toLowerCase(c));
                }
            } else {
                System.out.print(c);
            }
        }
        System.out.println();
    }
}