package pkgHerencia;

public class Medusa extends Invertebrado {

    private boolean esVenenosa;                  // propiedad

    public Medusa(String nombre, boolean esVenenosa) {
        super(nombre, "Invertebrado - Medusa", "Océano");
        this.esVenenosa = esVenenosa;
    }

    public boolean isEsVenenosa() { return esVenenosa; }
    public void setEsVenenosa(boolean esVenenosa) { this.esVenenosa = esVenenosa; }

    public void nadar() {                        // método
        System.out.println(nombre + " nada flotando" + (esVenenosa ? " y es venenosa." : " y es inofensiva."));
    }
}
