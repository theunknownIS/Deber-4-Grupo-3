package pkgDeberAnimales;

public class Flora extends ReinoAnimal {
    private String tipoHoja;

    public Flora(String nombre, String clasificacion, String tipoHoja) {
        super(nombre, clasificacion);
        this.tipoHoja = tipoHoja;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Tipo de hoja: " + tipoHoja);
    }
}
