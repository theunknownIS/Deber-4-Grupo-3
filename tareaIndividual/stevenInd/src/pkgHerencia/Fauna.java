package pkgHerencia;

/**
 * Clase que representa la fauna y hereda de ReinoAnimal.
 * Almacena el aparato bucal de los animales y permite
 * consultar como se alimentan mediante el metodo comer().
 * Sirve como clase padre de Vertebrado e Invertebrado.
 *
 * @author Steven
 */
public class Fauna extends ReinoAnimal {

    private final String aparatoBucal;

    public Fauna(String nombre, String clasificacion, String aparatoBucal) {
        super(nombre, clasificacion);
        this.aparatoBucal = aparatoBucal;
    }

    public String getAparatoBucal() {
        return aparatoBucal;
    }

    public void comer() {
        System.out.println(getNombre() + " come utilizando " + getAparatoBucal());
    }
}