package pkgHerencia;

/** Mamífero salvaje. */
public class Leon extends Vertebrado {

    private double pesoKg;                       // propiedad

    public Leon(String nombre, double pesoKg) {
        super(nombre, "Vertebrado - Mamífero salvaje", "Sabana");
        this.pesoKg = pesoKg;
    }

    public double getPesoKg() { return pesoKg; }
    public void setPesoKg(double pesoKg) { this.pesoKg = pesoKg; }

    public void rugir() {                        // método
        System.out.println(nombre + " (" + pesoKg + " kg) ruge: ¡GRRRAAAH!");
    }
}
