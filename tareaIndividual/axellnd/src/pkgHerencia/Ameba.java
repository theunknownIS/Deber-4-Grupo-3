package pkgHerencia;

public class Ameba extends Invertebrado {

    private String forma;                        // propiedad

    public Ameba(String nombre, String forma) {
        super(nombre, "Invertebrado - Ameba", "Agua dulce");
        this.forma = forma;
    }

    public String getForma() { return forma; }
    public void setForma(String forma) { this.forma = forma; }

    public void moverseConPseudopodos() {        // método
        System.out.println(nombre + " tiene forma " + forma + " y se mueve con pseudópodos.");
    }
}
