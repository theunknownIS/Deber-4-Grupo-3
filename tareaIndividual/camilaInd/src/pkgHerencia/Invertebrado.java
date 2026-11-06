package pkgHerencia;

public class Invertebrado extends Fauna {
    protected String sistemaDigestivo;
    protected String reproduccion;

    public Invertebrado(String nombre, String clasificacion, int esperanzaVida, boolean nocturno, String habitat,
                        String sistemaDigestivo, String reproduccion) {
        super(nombre, clasificacion, esperanzaVida, nocturno, habitat);
        this.sistemaDigestivo = sistemaDigestivo;
        this.reproduccion = reproduccion;
    }

    @Override
    public void nacidoPor() {
        System.out.println(nombre + " nace por reproduccion: " + reproduccion + ".");
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Sistema digestivo: " + sistemaDigestivo);
        System.out.println("Reproduccion: " + reproduccion);
    }
}
