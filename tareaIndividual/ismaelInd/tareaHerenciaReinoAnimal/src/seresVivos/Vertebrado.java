package seresVivos;

/**
 * Animales con esqueleto interno y columna vertebral.
 *
 * @author Silva.Ismael
 */
public abstract class Vertebrado extends Fauna {
    private Short numeroHuesos;

    /**
     * Crea un vertebrado. El número de huesos debe ser mayor a 0.
     *
     * @param nombre          nombre común del animal
     * @param clasificacion   nombre científico del animal
     * @param tipoComida      de qué se alimenta
     * @param velocidadMaxima velocidad máxima en km/h
     * @param numeroHuesos    cantidad de huesos
     */
    public Vertebrado(String nombre, String clasificacion, String tipoComida, float velocidadMaxima,
            short numeroHuesos) {
        super(nombre, clasificacion, tipoComida, velocidadMaxima);
        if (numeroHuesos > 0) {
            this.numeroHuesos = numeroHuesos;
        } else {
            System.out.println("ERROR: el número de huesos debe ser mayor a 0, se asigna 1");
            this.numeroHuesos = 1;
        }
    }

    /**
     * Muestra que el vertebrado mueve su espina dorsal.
     */
    public void moverEspinaDorsal() {
        System.out.println(getNombre() + " mueve su espina dorsal, sostenida por " + numeroHuesos + " huesos");
    }

    public Short getNumeroHuesos() {
        return numeroHuesos;
    }

    public void setNumeroHuesos(short numeroHuesos) {
        this.numeroHuesos = numeroHuesos;
    }
}
