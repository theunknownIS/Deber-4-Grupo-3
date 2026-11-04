package pkgCadenas;

public class C03EliminarVocal {

    /**
     * C03. Eliminar vocal de una frase.
     * <p>
     * Recorre la frase como un arreglo de caracteres y reemplaza por un
     * espacio cada aparición de la vocal indicada. Luego imprime la frase
     * resultante.
     * <p>
     * Ejemplo: frase "ballena azul" y vocal 'a' produce "b ll n z l".
     *
     * @param frase frase ingresada por el usuario
     * @param vocal vocal que se va a eliminar de la frase
     * @author Silva.Ismael
     */
    public void g3C03EliminarVocal(String frase, char vocal) {
        char[] arrFrase = frase.toCharArray();
        for (int i = 0; i < arrFrase.length; i++) {
            if (Character.toLowerCase(arrFrase[i]) == Character.toLowerCase(vocal)) {
                arrFrase[i] = ' ';
            }
        }
        String nuevaFrase = new String(arrFrase);
        System.out.println(nuevaFrase);
    }
}
