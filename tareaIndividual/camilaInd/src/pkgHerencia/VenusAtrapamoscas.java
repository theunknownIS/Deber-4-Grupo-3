package pkgHerencia;

public class VenusAtrapamoscas extends Flora {
    private String hojas;
    private boolean pelosSensibles;

    public VenusAtrapamoscas(String nombre, String clasificacion, int esperanzaVida, String hojasForma,
                             String talloForma, String hojas, boolean pelosSensibles) {
        super(nombre, clasificacion, esperanzaVida, hojasForma, talloForma);
        this.hojas = hojas;
        this.pelosSensibles = pelosSensibles;
    }

    @Override
    public void alimentarse() {
        System.out.println(nombre + " atrapa insectos con sus hojas para alimentarse.");
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Hojas: " + hojas);
        System.out.println("Pelos sensibles: " + (pelosSensibles ? "Si" : "No"));
    }
}
