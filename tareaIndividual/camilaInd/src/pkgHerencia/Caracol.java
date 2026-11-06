package pkgHerencia;

public class Caracol extends Invertebrado {
    private boolean caparazon;
    private boolean baboso;

    public Caracol(String nombre, String clasificacion, int esperanzaVida, boolean nocturno, String habitat,
                   String sistemaDigestivo, String reproduccion, boolean caparazon, boolean baboso) {
        super(nombre, clasificacion, esperanzaVida, nocturno, habitat, sistemaDigestivo, reproduccion);
        this.caparazon = caparazon;
        this.baboso = baboso;
    }

    public void mover() {
        System.out.println(nombre + " se mueve arrastrandose lentamente.");
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Caparazon: " + (caparazon ? "Si" : "No"));
        System.out.println("Baboso: " + (baboso ? "Si" : "No"));
    }
}
