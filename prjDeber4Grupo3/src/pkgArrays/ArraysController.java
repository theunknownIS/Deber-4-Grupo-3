package pkgArrays;

/**
 * ArraysController
 * <p>
 * Ejecuta los ejercicios de arreglos y matrices desde la A01 hasta la A05 en
 * orden.
 */
public class ArraysController {

    /**
     * Ejecuta todos los ejercicios de arreglos con los datos ingresados al
     * inicio. El nombre es la primera palabra del nombre completo y el
     * apellido es la última.
     *
     * @param nombreCompleto nombre completo, con las palabras separadas por
     *                       espacios
     * @param porcentajes    porcentaje de carga de cada palabra para el A01
     * @param tamanio        tamaño de cada inicial para el A02
     * @param caracter       carácter con el que se dibujan las iniciales del
     *                       A02
     */
    public void mostrarArrays(String nombreCompleto, int[] porcentajes, int tamanio, char caracter) {
        String[] palabras = nombreCompleto.split(" +");
        String nombre = palabras[0];
        String apellido = palabras[palabras.length - 1];

        System.out.println();
        System.out.println("=== Arrays ===");
        System.out.println("A01. Barras de carga por palabra:");
        new A01BarrasNombre(nombreCompleto).g3A01MostrarBarrasNombre(porcentajes);
        System.out.println("A02. Matriz con las iniciales:");
        new A02MatrizIniciales().g3A02MatrizIniciales(nombreCompleto, tamanio, caracter);
        System.out.println("A03. Plano y f(x) = 2x con el nombre:");
        new A03PlanoFuncion().g3A03DibujarPlanoFuncionLetras(nombre);
        System.out.println("A04. X con el nombre y el apellido:");
        new A04XNombre(nombre, apellido).g3A04MostrarXNombre();
        System.out.println("A05. Nombre en posiciones aleatorias:");
        new A05NombreAleatorio().g3A05MostrarNombreAleatorio(nombre, apellido);
    }

}
