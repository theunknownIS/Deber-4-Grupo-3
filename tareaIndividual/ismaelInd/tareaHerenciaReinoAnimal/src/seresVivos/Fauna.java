package seresVivos;

/**
 * Seres vivos del reino animal.
 *
 * @author Silva.Ismael
 */
public abstract class Fauna extends ReinoAnimal {
    private String tipoComida;
    private Float velocidadMaxima;

    /**
     * Crea un animal. La velocidad máxima debe ser mayor a 0.
     *
     * @param nombre          nombre común del animal
     * @param clasificacion   nombre científico del animal
     * @param tipoComida      de qué se alimenta
     * @param velocidadMaxima velocidad máxima en km/h
     */
    public Fauna(String nombre, String clasificacion, String tipoComida, float velocidadMaxima) {
        super(nombre, clasificacion);
        this.tipoComida = tipoComida;
        if (velocidadMaxima > 0) {
            this.velocidadMaxima = velocidadMaxima;
        } else {
            System.out.println("ERROR: la velocidad máxima debe ser mayor a 0, se asigna 1 km/h");
            this.velocidadMaxima = 1.0f;
        }
    }

    /**
     * Muestra que el animal se desplaza.
     */
    public void desplazarse() {
        System.out.println(getNombre() + " se desplaza a una velocidad máxima de " + velocidadMaxima + " km/h");
    }

    /**
     * El animal se nutre comiendo.
     */
    @Override
    public void nutrirse() {
        System.out.println(getNombre() + " se alimenta de " + tipoComida);
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    public Float getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(float velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
}
