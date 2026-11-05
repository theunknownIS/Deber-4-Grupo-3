package pkgHerencia;

/**
 * Clase que representa a los animales vertebrados y hereda de Fauna.
 * Establece que los vertebrados poseen columna vertebral y permite
 * describir esta caracteristica mediante el metodo describirEsqueleto().
 * Sirve como clase padre de Loro.
 *
 * @author Steven
 */
public class Vertebrado extends Fauna {

    private final boolean columnaVertebral = true;

    public Vertebrado(String nombre, String clasificacion, String aparatoBucal) {
        super(nombre, clasificacion, aparatoBucal);
    }

    public void describirEsqueleto() {
        if (columnaVertebral) {
            System.out.println(getNombre() + " tiene columna vertebral");
        }
    }
}