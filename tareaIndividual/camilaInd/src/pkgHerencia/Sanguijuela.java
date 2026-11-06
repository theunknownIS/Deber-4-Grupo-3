package pkgHerencia;

public class Sanguijuela extends Invertebrado {
    private String forma;
    private String color;

    public Sanguijuela(String nombre, String clasificacion, int esperanzaVida, boolean nocturno, String habitat,
                       String sistemaDigestivo, String reproduccion, String forma, String color) {
        super(nombre, clasificacion, esperanzaVida, nocturno, habitat, sistemaDigestivo, reproduccion);
        this.forma = forma;
        this.color = color;
    }

    public void mover() {
        System.out.println(nombre + " se mueve contrayendo su cuerpo.");
    }

    public void comer() {
        System.out.println(nombre + " se alimenta succionando sangre.");
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Forma: " + forma);
        System.out.println("Color: " + color);
    }
}
