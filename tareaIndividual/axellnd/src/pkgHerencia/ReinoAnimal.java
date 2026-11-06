package pkgHerencia;

/**
 * Clase raíz de la jerarquía (Reino Animal).
 * Todas las clases heredan nombre y clasificación.
 */
public class ReinoAnimal {

    // Propiedades comunes (protected = "#" en UML, visibles en las hijas)
    protected String nombre;
    protected String clasificacion;
    // Propiedad propia del reino
    protected String reino = "Reino Animal";

    public ReinoAnimal(String nombre, String clasificacion) {
        this.nombre = nombre;
        this.clasificacion = clasificacion;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getClasificacion() { return clasificacion; }
    public void setClasificacion(String clasificacion) { this.clasificacion = clasificacion; }

    // Método propio del reino
    public void presentarse() {
        System.out.println("Soy " + nombre + " | Clasificación: " + clasificacion + " | " + reino);
    }

    public String getReino() { return reino; }
    public void setReino(String reino) { this.reino = reino; }
}
