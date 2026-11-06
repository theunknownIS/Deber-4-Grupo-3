package pkgHerencia;

public class ReinoAnimal {
    protected String nombre;
    protected String clasificacion;
    protected int esperanzaVida;
    protected boolean vivo;

    public ReinoAnimal(String nombre, String clasificacion, int esperanzaVida) {
        this.nombre = nombre;
        this.clasificacion = clasificacion;
        this.esperanzaVida = esperanzaVida;
        this.vivo = true;
    }

    public void alimentarse() {
        System.out.println(nombre + " se alimenta.");
    }

    public void respirar() {
        System.out.println(nombre + " respira.");
    }

    public int tiempoVida() {
        return esperanzaVida;
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Clasificacion: " + clasificacion);
        System.out.println("Esperanza de vida: " + esperanzaVida + " anios");
        System.out.println("Vivo: " + (vivo ? "Si" : "No"));
    }
}
