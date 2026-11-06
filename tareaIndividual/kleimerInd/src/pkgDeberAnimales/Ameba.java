package pkgDeberAnimales;

public class Ameba extends Invertebrado {
    private String tipoMovimiento;

    public Ameba(String nombre, String clasificacion, String habitat, String tipoProteccion, String tipoMovimiento) {
        super(nombre, clasificacion, habitat, tipoProteccion);
        this.tipoMovimiento = tipoMovimiento;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Tipo de movimiento: " + tipoMovimiento);
    }
}