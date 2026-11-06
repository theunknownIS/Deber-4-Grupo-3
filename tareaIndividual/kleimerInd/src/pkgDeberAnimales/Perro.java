package pkgDeberAnimales;

public class Perro extends Vertebrado {
    private String raza;

    public Perro(String nombre, String clasificacion, String habitat, String tipoEsqueleto, String raza) {
        super(nombre, clasificacion, habitat, tipoEsqueleto);
        this.raza = raza;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Raza: " + raza);
    }
}