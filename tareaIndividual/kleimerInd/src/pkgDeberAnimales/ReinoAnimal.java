package pkgDeberAnimales;

public class ReinoAnimal {
    protected String nombre;
    protected String clasificacion;

    public ReinoAnimal(String nombre, String clasificacion) {
        this.nombre = nombre;
        this.clasificacion = clasificacion;
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Clasificacion: " + clasificacion);
    }
}