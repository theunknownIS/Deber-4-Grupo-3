package pkgHerencia;

public class Tortuga extends Vertebrado {
    private boolean marina;
    private boolean domestica;
    private boolean caparazon;

    public Tortuga(String nombre, String clasificacion, int esperanzaVida, boolean nocturno, String habitat,
                   boolean sangreCaliente, boolean esqueletoOseo, boolean marina, boolean domestica,
                   boolean caparazon) {
        super(nombre, clasificacion, esperanzaVida, nocturno, habitat, sangreCaliente, esqueletoOseo);
        this.marina = marina;
        this.domestica = domestica;
        this.caparazon = caparazon;
    }

    @Override
    public void formaCazar() {
        System.out.println(nombre + " se alimenta lentamente de plantas y pequenos animales.");
    }

    @Override
    public void migrar() {
        System.out.println(nombre + " migra largas distancias para desovar.");
    }

    public void defecar() {
        System.out.println(nombre + " expulsa sus desechos.");
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Marina: " + (marina ? "Si" : "No"));
        System.out.println("Domestica: " + (domestica ? "Si" : "No"));
        System.out.println("Caparazon: " + (caparazon ? "Si" : "No"));
    }
}
