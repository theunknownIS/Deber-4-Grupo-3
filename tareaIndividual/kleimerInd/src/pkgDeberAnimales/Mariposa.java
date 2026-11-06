package pkgDeberAnimales;

public class Mariposa extends Invertebrado {
    private String colorAlas;

    public Mariposa(String nombre, String clasificacion, String habitat, String tipoProteccion, String colorAlas) {
        super(nombre, clasificacion, habitat, tipoProteccion);
        this.colorAlas = colorAlas;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Color de alas: " + colorAlas);
    }
}
