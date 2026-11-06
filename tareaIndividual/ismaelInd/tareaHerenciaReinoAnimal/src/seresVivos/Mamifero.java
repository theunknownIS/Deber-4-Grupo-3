package seresVivos;

/**
 * Vertebrados que alimentan a sus crías con leche.
 *
 * @author Silva.Ismael
 */
public abstract class Mamifero extends Vertebrado {
    private String colorPelaje;
    private Byte mesesGestacion;

    /**
     * Crea un mamífero. Los meses de gestación deben estar entre 1 y 24.
     *
     * @param nombre          nombre común del animal
     * @param clasificacion   nombre científico del animal
     * @param tipoComida      de qué se alimenta
     * @param velocidadMaxima velocidad máxima en km/h
     * @param numeroHuesos    cantidad de huesos
     * @param colorPelaje     color del pelaje
     * @param mesesGestacion  meses que dura la gestación
     */
    public Mamifero(String nombre, String clasificacion, String tipoComida, float velocidadMaxima,
            short numeroHuesos, String colorPelaje, byte mesesGestacion) {
        super(nombre, clasificacion, tipoComida, velocidadMaxima, numeroHuesos);
        this.colorPelaje = colorPelaje;
        if (mesesGestacion >= 1 && mesesGestacion <= 24) {
            this.mesesGestacion = mesesGestacion;
        } else {
            System.out.println("ERROR: los meses de gestación deben estar entre 1 y 24, se asigna 9");
            this.mesesGestacion = 9;
        }
    }

    /**
     * Muestra que el mamífero gesta a su cría.
     */
    public void gestar() {
        System.out.println(getNombre() + " gesta a su cría durante " + mesesGestacion + " meses");
    }

    /**
     * Muestra que el mamífero muda su pelaje.
     */
    public void mudarPelaje() {
        System.out.println(getNombre() + " muda su pelaje de color " + colorPelaje);
    }

    /**
     * Muestra que el mamífero alimenta a su cría con leche.
     */
    public void lactar() {
        System.out.println(getNombre() + " alimenta a su cría con leche");
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    public Byte getMesesGestacion() {
        return mesesGestacion;
    }

    public void setMesesGestacion(byte mesesGestacion) {
        this.mesesGestacion = mesesGestacion;
    }
}
