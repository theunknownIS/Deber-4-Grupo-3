package pkgDeberAnimales;

public class Arbol extends Flora {
    private double altura;

    public Arbol(String nombre, String clasificacion, String tipoHoja, double altura) {
        super(nombre, clasificacion, tipoHoja);
        this.altura = altura;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Altura: " + altura + " metros");
    }
}