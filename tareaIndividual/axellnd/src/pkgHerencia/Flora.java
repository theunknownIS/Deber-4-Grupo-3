package pkgHerencia;

public class Flora extends ReinoAnimal {

    protected boolean haceFotosintesis = true;   // propiedad

    public Flora(String nombre, String clasificacion) {
        super(nombre, clasificacion);
    }

    public void hacerFotosintesis() {            // método
        System.out.println(nombre + " produce su alimento con la luz del sol.");
    }

    public boolean isHaceFotosintesis() { return haceFotosintesis; }
    public void setHaceFotosintesis(boolean haceFotosintesis) { this.haceFotosintesis = haceFotosintesis; }
}
