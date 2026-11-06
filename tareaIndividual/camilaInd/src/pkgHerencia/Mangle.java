package pkgHerencia;

public class Mangle extends Flora {
    private String raices;
    private boolean aguaSalada;

    public Mangle(String nombre, String clasificacion, int esperanzaVida, String hojasForma, String talloForma,
                  String raices, boolean aguaSalada) {
        super(nombre, clasificacion, esperanzaVida, hojasForma, talloForma);
        this.raices = raices;
        this.aguaSalada = aguaSalada;
    }

    @Override
    public void respirar() {
        System.out.println(nombre + " respira por sus raices aereas.");
    }

    public void excretarSal() {
        System.out.println(nombre + " excreta el exceso de sal por sus hojas.");
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Raices: " + raices);
        System.out.println("Vive en agua salada: " + (aguaSalada ? "Si" : "No"));
    }
}
