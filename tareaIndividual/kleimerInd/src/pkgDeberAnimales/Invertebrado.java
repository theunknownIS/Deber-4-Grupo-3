package pkgDeberAnimales;

public class Invertebrado extends Fauna {
    private String tipoProteccion;

    public Invertebrado(String nombre, String clasificacion, String habitat, String tipoProteccion) {
        super(nombre, clasificacion, habitat);
        this.tipoProteccion = tipoProteccion;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Tipo de proteccion: " + tipoProteccion);
    }
}