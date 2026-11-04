package pkgArrays;

/**
 * A02: Crea una matriz solicitando el tamaño y caracter para almacenar
 * las iniciales de un nombre y apellido y presentar en matriz
 * Ejemplo nombre: Patricio Pacha --PP
 * Ingrese el tamaño: 5
 * Ingrese el caracter: *
 * @author Teran.Camila
 */
public class A02MatrizIniciales {
/**
 * @param tamanio tamaño de la matriz
 * @param caracter caracter para dibujar las iniciales
*/
    private String nombre = "Patricio";
    private String apellido = "Pacha";

    public void g3A02MatrizIniciales(int tamanio, char caracter) {
        if (tamanio < 3) {
            System.out.println("El tamaño debe ser 3 o mayor.");
            return;
        }

        char inicialNombre = Character.toUpperCase(nombre.charAt(0));
        char inicialApellido = Character.toUpperCase(apellido.charAt(0));

        char[][] letra1 = construirLetra(inicialNombre, tamanio, caracter);
        char[][] letra2 = construirLetra(inicialApellido, tamanio, caracter);

        System.out.println("Iniciales: " + inicialNombre + inicialApellido);
        for (int f = 0; f < tamanio; f++) {
            for (int c = 0; c < tamanio; c++) {
                System.out.print(letra1[f][c]);
            }
            System.out.print("   ");
            for (int c = 0; c < tamanio; c++) {
                System.out.print(letra2[f][c]);
            }
            System.out.println();
        }
    }

    private char[][] construirLetra(char letra, int n, char caracter) {
        char[][] matriz = new char[n][n];
        for (int f = 0; f < n; f++) {
            for (int c = 0; c < n; c++) {
                if (estaPintada(letra, f, c, n)) {
                    matriz[f][c] = caracter;
                } else {
                    matriz[f][c] = ' ';
                }
            }
        }
        return matriz;
    }

    private boolean estaPintada(char letra, int f, int c, int n) {
        int ultimo = n - 1;
        int medio = n / 2;
        switch (letra) {
            case 'A':
                return f == 0 || f == medio || c == 0 || c == ultimo;
            case 'B':
                return c == 0 || f == 0 || f == medio || f == ultimo || c == ultimo;
            case 'C':
                return f == 0 || f == ultimo || c == 0;
            case 'D':
                return c == 0 || (f == 0 && c < ultimo) || (f == ultimo && c < ultimo) || c == ultimo;
            case 'E':
                return c == 0 || f == 0 || f == medio || f == ultimo;
            case 'F':
                return c == 0 || f == 0 || f == medio;
            case 'G':
                return f == 0 || f == ultimo || c == 0 || (c == ultimo && f >= medio);
            case 'H':
                return c == 0 || c == ultimo || f == medio;
            case 'I':
                return f == 0 || f == ultimo || c == medio;
            case 'J':
                return f == 0 || c == medio || (f == ultimo && c <= medio);
            case 'K':
                return c == 0 || f + c == medio || f - c == medio;
            case 'L':
                return c == 0 || f == ultimo;
            case 'M':
                return c == 0 || c == ultimo || (f == c && f <= medio) || (f + c == ultimo && f <= medio);
            case 'N':
                return c == 0 || c == ultimo || f == c;
            case 'O':
                return f == 0 || f == ultimo || c == 0 || c == ultimo;
            case 'P':
                return c == 0 || f == 0 || f == medio || (c == ultimo && f <= medio);
            case 'Q':
                return f == 0 || f == ultimo || c == 0 || c == ultimo || (f == c && f >= medio);
            case 'R':
                return c == 0 || f == 0 || f == medio || (c == ultimo && f <= medio) || f - c == medio;
            case 'S':
                return f == 0 || f == medio || f == ultimo || (c == 0 && f <= medio) || (c == ultimo && f >= medio);
            case 'T':
                return f == 0 || c == medio;
            case 'U':
                return c == 0 || c == ultimo || f == ultimo;
            case 'V':
                return c == f / 2 || c == ultimo - f / 2;
            case 'W':
                return c == 0 || c == ultimo || (f == c && f >= medio) || (f + c == ultimo && f >= medio);
            case 'X':
                return f == c || f + c == ultimo;
            case 'Y':
                return (f == c && f <= medio) || (f + c == ultimo && f <= medio) || (c == medio && f >= medio);
            case 'Z':
                return f == 0 || f == ultimo || f + c == ultimo;
            default:
                return false;
        }
    }
}