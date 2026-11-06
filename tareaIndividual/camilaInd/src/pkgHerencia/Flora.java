package pkgHerencia;

public class Flora extends ReinoAnimal {
    protected String hojasForma;
    protected String talloForma;

    public Flora(String nombre, String clasificacion, int esperanzaVida, String hojasForma, String talloForma) {
        super(nombre, clasificacion, esperanzaVida);
        this.hojasForma = hojasForma;
        this.talloForma = talloForma;
    }

    public void fotosintesis() {
        System.out.println(nombre + " realiza la fotosintesis.");
    }

    @Override
    public int tiempoVida() {
        System.out.println("Las plantas viven segun su especie: " + esperanzaVida + " anios.");
        return esperanzaVida;
    }

    @Override
    public void alimentarse() {
        System.out.println(nombre + " se alimenta de luz, agua y minerales.");
    }

    public void regularClima() {
        System.out.println(nombre + " ayuda a regular el clima de su entorno.");
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Forma de las hojas: " + hojasForma);
        System.out.println("Forma del tallo: " + talloForma);
    }
}
