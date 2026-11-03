package pkgArrays;

/**
 * A04. Forma una X con el nombre y el apellido dentro de una matriz cuadrada.
 * El nombre va en la diagonal principal y el apellido en la diagonal contraria.
 * Si ambas diagonales se cruzan en la misma casilla, queda la letra del nombre.
 *
 * @author Salvatierra.Kleimer
 */
public class A04XNombre {

    private String nombre;
    private String apellido;

    /**
     * Crea el objeto con los datos a mostrar.
     *
     * @param nombre   nombre que va en la diagonal principal
     * @param apellido apellido que va en la diagonal contraria
     */
    public A04XNombre(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    /**
     * Muestra la matriz con la X formada por el nombre y el apellido.
     * Si el nombre o el apellido es null o vacío, muestra un aviso y no procesa.
     */
    public void g3A04MostrarXNombre() {
        if (nombre == null || nombre.isEmpty() || apellido == null || apellido.isEmpty()) {
            System.out.println("Error: el nombre y el apellido no pueden estar vacíos");
            return;
        }
        int n = Math.max(nombre.length(), apellido.length());
        char[][] matriz = new char[n][n];

        for (int fila = 0; fila < n; fila++) {
            for (int col = 0; col < n; col++) {
                matriz[fila][col] = ' ';
            }
        }
        for (int i = 0; i < apellido.length(); i++) {
            matriz[i][n - 1 - i] = apellido.charAt(i);
        }
        for (int i = 0; i < nombre.length(); i++) {
            matriz[i][i] = nombre.charAt(i);
        }

        for (int fila = 0; fila < n; fila++) {
            for (int col = 0; col < n; col++) {
                System.out.print(matriz[fila][col] + " ");
            }
            System.out.println();
        }
    }
}