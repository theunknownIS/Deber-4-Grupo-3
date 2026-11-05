package pkgHerencia;

/**
 * Clase que representa a los animales invertebrados y hereda de Fauna.
 * Establece que los invertebrados no poseen columna vertebral y permite
 * describir esta caracteristica mediante el metodo describirCuerpo().
 * Sirve como clase padre de Mariposa.
 *
 * @author Steven
 */
public class Invertebrado extends Fauna {

    private final boolean tieneColumnaVertebral = false;

    public Invertebrado(String nombre, String clasificacion, String aparatoBucal) {
        super(nombre, clasificacion, aparatoBucal);
    }

    public void describirCuerpo() {
        if (!tieneColumnaVertebral) {
            System.out.println(getNombre() + " no tiene columna vertebral");
        }
    }
}