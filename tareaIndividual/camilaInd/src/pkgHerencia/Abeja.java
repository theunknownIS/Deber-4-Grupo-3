package pkgHerencia;

public class Abeja extends Invertebrado {
    private int alas;
    private int aguijon;

    public Abeja(String nombre, String clasificacion, int esperanzaVida, boolean nocturno, String habitat,
                 String sistemaDigestivo, String reproduccion, int alas, int aguijon) {
        super(nombre, clasificacion, esperanzaVida, nocturno, habitat, sistemaDigestivo, reproduccion);
        this.alas = alas;
        this.aguijon = aguijon;
    }

    public void volar() {
        System.out.println(nombre + " vuela de flor en flor.");
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Alas: " + alas);
        System.out.println("Aguijon: " + aguijon);
    }
}
