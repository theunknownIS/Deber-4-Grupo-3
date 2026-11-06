package pkgHerencia;

public class Cactus extends Flora {
    private int tallo;
    private String raices;

    public Cactus(String nombre, String clasificacion, int esperanzaVida, String hojasForma, String talloForma,
                  int tallo, String raices) {
        super(nombre, clasificacion, esperanzaVida, hojasForma, talloForma);
        this.tallo = tallo;
        this.raices = raices;
    }

    public void almacenarAgua() {
        System.out.println(nombre + " almacena agua en su tallo.");
    }

    @Override
    public int tiempoVida() {
        System.out.println("Un cactus puede vivir hasta " + esperanzaVida + " anios.");
        return esperanzaVida;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Tallos: " + tallo);
        System.out.println("Raices: " + raices);
    }
}
