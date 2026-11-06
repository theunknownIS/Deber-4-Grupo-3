package pkgHerencia;

public class Invertebrado extends Fauna {

    protected boolean tieneEsqueletoInterno = false;  // propiedad

    public Invertebrado(String nombre, String clasificacion, String habitat) {
        super(nombre, clasificacion, habitat);
    }

    public void describirCuerpo() {                   // método
        System.out.println(nombre + " no tiene columna vertebral.");
    }

    public boolean isTieneEsqueletoInterno() { return tieneEsqueletoInterno; }
    public void setTieneEsqueletoInterno(boolean tieneEsqueletoInterno) { this.tieneEsqueletoInterno = tieneEsqueletoInterno; }
}
