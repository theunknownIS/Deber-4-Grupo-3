package pkgHerencia;

public class Flor extends Flora {

    private String color;                        // propiedad

    public Flor(String nombre, String color) {
        super(nombre, "Flora - Flor");
        this.color = color;
    }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public void florecer() {                     // método
        System.out.println(nombre + " florece con pétalos de color " + color + ".");
    }
}
