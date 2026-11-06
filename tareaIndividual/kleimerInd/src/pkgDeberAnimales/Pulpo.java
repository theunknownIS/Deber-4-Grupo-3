package pkgDeberAnimales;

public class Pulpo extends Invertebrado {
    private int numeroTentaculos;

    public Pulpo(String nombre, String clasificacion, String habitat, String tipoProteccion, int numeroTentaculos) {
        super(nombre, clasificacion, habitat, tipoProteccion);
        this.numeroTentaculos = numeroTentaculos;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Numero de tentaculos: " + numeroTentaculos);
    }
}
