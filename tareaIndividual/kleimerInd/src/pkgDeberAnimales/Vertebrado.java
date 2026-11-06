package pkgDeberAnimales;

public class Vertebrado extends Fauna {
    private String tipoEsqueleto;

    public Vertebrado(String nombre, String clasificacion, String habitat, String tipoEsqueleto) {
        super(nombre, clasificacion, habitat);
        this.tipoEsqueleto = tipoEsqueleto;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Tipo de esqueleto: " + tipoEsqueleto);
    }
}