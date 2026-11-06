package seresVivos;

/**
 * Invertebrados de cuerpo blando.
 *
 * @author Silva.Ismael
 */
public abstract class Molusco extends Invertebrado {
    private String cantidadMoco;

    /**
     * Crea un molusco.
     *
     * @param nombre            nombre común del animal
     * @param clasificacion     nombre científico del animal
     * @param tipoComida        de qué se alimenta
     * @param velocidadMaxima   velocidad máxima en km/h
     * @param estructuraSoporte estructura que sostiene su cuerpo
     * @param cantidadMoco      cantidad de moco que produce
     */
    public Molusco(String nombre, String clasificacion, String tipoComida, float velocidadMaxima,
            String estructuraSoporte, String cantidadMoco) {
        super(nombre, clasificacion, tipoComida, velocidadMaxima, estructuraSoporte);
        this.cantidadMoco = cantidadMoco;
    }

    /**
     * Muestra que el molusco produce moco.
     */
    public void producirMoco() {
        System.out.println(getNombre() + " produce moco en cantidad " + cantidadMoco);
    }

    public String getCantidadMoco() {
        return cantidadMoco;
    }

    public void setCantidadMoco(String cantidadMoco) {
        this.cantidadMoco = cantidadMoco;
    }
}
