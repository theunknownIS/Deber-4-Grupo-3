package pkgHerencia;

/**
 * Clase que representa una rosa y hereda de Flora.
 * Almacena el color de la flor y permite describir
 * como florece utilizando dicho atributo.
 * Hereda las caracteristicas y metodos de Flora
 * y ReinoAnimal.
 *
 * @author Steven
 */
public class Rosa extends Flora {

    private final String colorFlor;

    public Rosa(String nombre, String clasificacion,
                String raices, String colorFlor) {
        super(nombre, clasificacion, raices);
        this.colorFlor = colorFlor;
    }

    public void florecer() {
        System.out.println(getNombre() + " florece con petalos de color " + colorFlor);
    }
}