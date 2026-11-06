package pkgDeberAnimales;
public class Arbusto extends Flora {
    private String tipoTallo;

    public Arbusto(String nombre, String clasificacion, String tipoHoja, String tipoTallo) {
        super(nombre, clasificacion, tipoHoja);
        this.tipoTallo = tipoTallo;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Tipo de tallo: " + tipoTallo);
    }
}