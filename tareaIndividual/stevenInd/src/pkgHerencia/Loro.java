package pkgHerencia;

/**
 * Clase que representa a un loro y hereda de Vertebrado.
 * Almacena el color de sus plumas y permite imitar sonidos.
 * Sobrescribe el metodo comer() para indicar que se alimenta
 * de semillas utilizando su pico.
 *
 * @author Steven
 */
public class Loro extends Vertebrado {

    private final String colorPlumas;

    public Loro(String nombre, String clasificacion, String colorPlumas) {
        super(nombre, clasificacion, "pico");
        this.colorPlumas = colorPlumas;
    }

    @Override
    public void comer() {
        System.out.println(getNombre() + " come semillas usando su " + getAparatoBucal());
    }

    public void imitarSonidos() {
        System.out.println(getNombre() + " de plumas " + colorPlumas + " imita: Hola, hola!");
    }
}