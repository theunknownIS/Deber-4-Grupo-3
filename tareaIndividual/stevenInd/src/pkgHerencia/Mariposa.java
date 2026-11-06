package pkgHerencia;

/**
 * Clase que representa una mariposa y hereda de Invertebrado.
 * Establece que posee cuatro alas y permite describir su vuelo.
 * Sobrescribe el metodo comer() para indicar que se alimenta
 * de nectar utilizando su espiritrompa.
 *
 * @author Steven
 */
public class Mariposa extends Invertebrado {

    private final int numeroAlas = 4;

    public Mariposa(String nombre, String clasificacion) {
        super(nombre, clasificacion, "espiritrompa");
    }

    public void volar() {
        System.out.println(getNombre() + " vuela con sus " + numeroAlas + " alas");
    }

    @Override
    public void comer() {
        System.out.println(getNombre() + " toma nectar usando su " + getAparatoBucal());
    }
}