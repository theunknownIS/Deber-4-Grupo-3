package pkgHerencia;

public class Murcielago extends Vertebrado {
    private int alas;
    private int tamano;
    private String formaAlas;

    public Murcielago(String nombre, String clasificacion, int esperanzaVida, boolean nocturno, String habitat,
                      boolean sangreCaliente, boolean esqueletoOseo, int alas, int tamano, String formaAlas) {
        super(nombre, clasificacion, esperanzaVida, nocturno, habitat, sangreCaliente, esqueletoOseo);
        this.alas = alas;
        this.tamano = tamano;
        this.formaAlas = formaAlas;
    }

    public void observar() {
        System.out.println(nombre + " observa su entorno durante la noche.");
    }

    @Override
    public void formaCazar() {
        System.out.println(nombre + " caza insectos en pleno vuelo.");
    }

    @Override
    public void localizar() {
        System.out.println(nombre + " se localiza usando la ecolocalizacion.");
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Alas: " + alas);
        System.out.println("Tamano: " + tamano + " cm");
        System.out.println("Forma de las alas: " + formaAlas);
    }
}
