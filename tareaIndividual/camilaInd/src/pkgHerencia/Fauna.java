package pkgHerencia;

public class Fauna extends ReinoAnimal {
    protected boolean nocturno;
    protected String habitat;

    public Fauna(String nombre, String clasificacion, int esperanzaVida, boolean nocturno, String habitat) {
        super(nombre, clasificacion, esperanzaVida);
        this.nocturno = nocturno;
        this.habitat = habitat;
    }

    public void nacidoPor() {
        System.out.println(nombre + " nace segun su especie.");
    }

    @Override
    public void respirar() {
        System.out.println(nombre + " respira segun su habitat: " + habitat + ".");
    }

    public void formaCazar() {
        System.out.println(nombre + " obtiene su alimento segun su especie.");
    }

    public void migrar() {
        System.out.println(nombre + " puede desplazarse a otros lugares.");
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Nocturno: " + (nocturno ? "Si" : "No"));
        System.out.println("Habitat: " + habitat);
    }
}
