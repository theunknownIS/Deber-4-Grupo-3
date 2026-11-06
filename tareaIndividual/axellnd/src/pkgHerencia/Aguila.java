package pkgHerencia;

public class Aguila extends Vertebrado {

    private double envergaduraMetros;            // propiedad

    public Aguila(String nombre, double envergaduraMetros) {
        super(nombre, "Vertebrado - Ave", "Montañas");
        this.envergaduraMetros = envergaduraMetros;
    }

    public double getEnvergaduraMetros() { return envergaduraMetros; }
    public void setEnvergaduraMetros(double envergaduraMetros) { this.envergaduraMetros = envergaduraMetros; }

    public void volar() {                        // método
        System.out.println(nombre + " vuela con alas de " + envergaduraMetros + " m de envergadura.");
    }
}
