package pkgDeberAnimales;

public class Aguila extends Vertebrado {
    private double envergadura; // en metros

    public Aguila(String nombre, String clasificacion, String habitat, String tipoEsqueleto, double envergadura) {
        super(nombre, clasificacion, habitat, tipoEsqueleto);
        this.envergadura = envergadura;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Envergadura: " + envergadura + " m");
    }
}
