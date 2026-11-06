package pkgHerencia;

public class Ballena extends Vertebrado {
    private boolean pulmones;
    private String color;

    public Ballena(String nombre, String clasificacion, int esperanzaVida, boolean nocturno, String habitat,
                   boolean sangreCaliente, boolean esqueletoOseo, boolean pulmones, String color) {
        super(nombre, clasificacion, esperanzaVida, nocturno, habitat, sangreCaliente, esqueletoOseo);
        this.pulmones = pulmones;
        this.color = color;
    }

    @Override
    public void formaCazar() {
        System.out.println(nombre + " caza filtrando pequenos organismos del agua.");
    }

    @Override
    public void nacidoPor() {
        System.out.println(nombre + " nace por parto (es mamifero).");
    }

    public void nadar() {
        System.out.println(nombre + " nada en el oceano.");
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Pulmones: " + (pulmones ? "Si" : "No"));
        System.out.println("Color: " + color);
    }
}
