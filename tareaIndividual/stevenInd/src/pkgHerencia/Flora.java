package pkgHerencia;

/**
 * Clase que representa la flora y hereda de ReinoAnimal.
 * Almacena el tipo de raices de una planta y permite
 * describir como absorbe agua mediante sus raices.
 * Utiliza el nombre y la clasificacion heredados.
 *
 * @author Steven
 */
public class Flora extends ReinoAnimal {

    private String raices;

    public Flora(String nombre, String clasificacion, String raices) {
        super(nombre, clasificacion);
        this.raices = raices;
    }

    public void absorberAgua() {
        System.out.println(getNombre() + " absorbe agua mediante sus " + raices);
    }
}