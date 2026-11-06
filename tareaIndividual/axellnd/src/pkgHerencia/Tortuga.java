package pkgHerencia;

public class Tortuga extends Vertebrado {

    private int edadAnios;                       // propiedad

    public Tortuga(String nombre, int edadAnios) {
        super(nombre, "Vertebrado - Reptil", "Islas");
        this.edadAnios = edadAnios;
    }

    public int getEdadAnios() { return edadAnios; }
    public void setEdadAnios(int edadAnios) { this.edadAnios = edadAnios; }

    public void esconderseEnCaparazon() {        // método
        System.out.println(nombre + " (" + edadAnios + " años) se esconde en su caparazón.");
    }
}
