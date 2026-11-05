package pkgDeberAnimales;

public class Fauna extends ReinoAnimal {
    private String habitat;

    public Fauna(String nombre, String clasificacion, String habitat) {
        super(nombre, clasificacion);
        this.habitat = habitat;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Habitat: " + habitat);
    }
}