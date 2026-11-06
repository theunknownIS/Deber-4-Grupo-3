package pkgHerencia;

public class Helecho extends Flora {

    private int numeroFrondas;                   // propiedad

    public Helecho(String nombre, int numeroFrondas) {
        super(nombre, "Flora - Helecho");
        this.numeroFrondas = numeroFrondas;
    }

    public int getNumeroFrondas() { return numeroFrondas; }
    public void setNumeroFrondas(int numeroFrondas) { this.numeroFrondas = numeroFrondas; }

    public void liberarEsporas() {               // método
        System.out.println(nombre + " tiene " + numeroFrondas + " frondas y libera esporas.");
    }
}
