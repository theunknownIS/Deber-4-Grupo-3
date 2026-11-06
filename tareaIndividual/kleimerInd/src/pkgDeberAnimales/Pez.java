package pkgDeberAnimales;

public class Pez extends Vertebrado {
    private String tipoAgua;

    public Pez(String nombre, String clasificacion, String habitat, String tipoEsqueleto, String tipoAgua) {
        super(nombre, clasificacion, habitat, tipoEsqueleto);
        this.tipoAgua = tipoAgua;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Tipo de agua: " + tipoAgua);
    }
}