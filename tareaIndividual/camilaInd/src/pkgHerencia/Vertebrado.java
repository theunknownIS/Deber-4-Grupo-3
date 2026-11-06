package pkgHerencia;

public class Vertebrado extends Fauna {
    protected boolean sangreCaliente;
    protected boolean esqueletoOseo;

    public Vertebrado(String nombre, String clasificacion, int esperanzaVida, boolean nocturno, String habitat,
                      boolean sangreCaliente, boolean esqueletoOseo) {
        super(nombre, clasificacion, esperanzaVida, nocturno, habitat);
        this.sangreCaliente = sangreCaliente;
        this.esqueletoOseo = esqueletoOseo;
    }

    @Override
    public void migrar() {
        System.out.println(nombre + " migra siguiendo el clima y el alimento.");
    }

    @Override
    public void formaCazar() {
        System.out.println(nombre + " caza usando sus sentidos y su esqueleto para moverse.");
    }

    public void localizar() {
        System.out.println(nombre + " se localiza en: " + habitat + ".");
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Sangre caliente: " + (sangreCaliente ? "Si" : "No"));
        System.out.println("Esqueleto oseo: " + (esqueletoOseo ? "Si" : "No"));
    }
}
