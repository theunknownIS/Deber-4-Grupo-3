package pkgDeberAnimales;

public class PlantaConFlor extends Flora {
    private String colorFlor;

    public PlantaConFlor(String nombre, String clasificacion, String tipoHoja, String colorFlor) {
        super(nombre, clasificacion, tipoHoja);
        this.colorFlor = colorFlor;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Color de flor: " + colorFlor);
    }
}