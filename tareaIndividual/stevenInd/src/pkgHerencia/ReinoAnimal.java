package pkgHerencia;

/**
 * Clase principal del sistema de clasificacion de seres vivos.
 * Almacena el nombre y la clasificacion de cada ser vivo.
 * Permite consultar sus atributos y mostrar la ruta completa
 * de clasificacion mediante el metodo mostrarDatos().
 *
 * @author Steven
 */
public class ReinoAnimal {

    private final String nombre;
    private final String clasificacion;

    public ReinoAnimal(String nombre, String clasificacion) {
        this.nombre = nombre;
        this.clasificacion = clasificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void mostrarDatos() {
        System.out.println("ReinoAnimal / " + clasificacion + " / " + nombre);
    }
}