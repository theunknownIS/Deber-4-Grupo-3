package pkgArrays;

/**
 * A05. Matriz cuadrada con las letras del nombre completo en posiciones
 * aleatorias. El tamaño es la cantidad de letras del nombre (Steven: 6 x 6). Cada
 * letra se coloca en una fila y columna al azar; si la casilla ya estaba
 * ocupada se pone un *. Después de cada letra se muestra la matriz y se
 * espera medio segundo para ver el proceso.
 *
 * @author Robles.Steven
 */
public class A05NombreAleatorio {

    /**
     * Muestra paso a paso cómo se colocan las letras en la matriz.
     *
     * @param nombre   nombre de la persona; su largo define el tamaño
     * @param apellido apellido de la persona
     */
    public void g3A05MostrarNombreAleatorio(String nombre, String apellido) {
        String letras = apellido + nombre;
        int tam = nombre.length();
        char[][] m = new char[tam][tam];
        for (int f = 0; f < tam; f++) {
            for (int c = 0; c < tam; c++) {
                m[f][c] = ' ';
            }
        }
        for (int k = 0; k < letras.length(); k++) {
            int f = (int) (Math.random() * tam);
            int c = (int) (Math.random() * tam);
            if (m[f][c] == ' ') {
                m[f][c] = letras.charAt(k);
            } else {
                m[f][c] = '*';
            }
            for (int i = 0; i < tam; i++) {
                for (int j = 0; j < tam; j++) {
                    System.out.print(m[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}