package pkgHerencia;

public class Arbol extends Flora {

    private double alturaMetros;                 // propiedad

    public Arbol(String nombre, double alturaMetros) {
        super(nombre, "Flora - Árbol");
        this.alturaMetros = alturaMetros;
    }

    public double getAlturaMetros() { return alturaMetros; }
    public void setAlturaMetros(double alturaMetros) { this.alturaMetros = alturaMetros; }

    public void darSombra() {                    // método
        System.out.println(nombre + " mide " + alturaMetros + " m y da mucha sombra.");
    }
}
