package pkgHerencia;

public class Mariposa extends Invertebrado {

    private String colorAlas;                    // propiedad

    public Mariposa(String nombre, String colorAlas) {
        super(nombre, "Invertebrado - Insecto", "Jardines");
        this.colorAlas = colorAlas;
    }

    public String getColorAlas() { return colorAlas; }
    public void setColorAlas(String colorAlas) { this.colorAlas = colorAlas; }

    public void aletear() {                      // método
        System.out.println(nombre + " aletea con alas de color " + colorAlas + ".");
    }
}
