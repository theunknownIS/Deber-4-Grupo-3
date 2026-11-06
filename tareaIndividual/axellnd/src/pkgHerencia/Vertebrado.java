package pkgHerencia;

public class Vertebrado extends Fauna {

    protected boolean tieneColumnaVertebral = true;   // propiedad

    public Vertebrado(String nombre, String clasificacion, String habitat) {
        super(nombre, clasificacion, habitat);
    }

    public void mostrarEsqueleto() {                  // método
        System.out.println(nombre + " tiene columna vertebral y esqueleto interno.");
    }

    public boolean isTieneColumnaVertebral() { return tieneColumnaVertebral; }
    public void setTieneColumnaVertebral(boolean tieneColumnaVertebral) { this.tieneColumnaVertebral = tieneColumnaVertebral; }
}
