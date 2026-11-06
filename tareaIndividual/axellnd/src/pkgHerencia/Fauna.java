package pkgHerencia;

public class Fauna extends ReinoAnimal {

    protected String habitat;                    // propiedad

    public Fauna(String nombre, String clasificacion, String habitat) {
        super(nombre, clasificacion);
        this.habitat = habitat;
    }

    public String getHabitat() { return habitat; }
    public void setHabitat(String habitat) { this.habitat = habitat; }

    public void moverse() {                      // método
        System.out.println(nombre + " se mueve por su hábitat: " + habitat + ".");
    }

    // Sobrescritura (override) del método de la clase padre
    @Override
    public void presentarse() {
        super.presentarse();
        System.out.println("   Hábitat: " + habitat);
    }
}
