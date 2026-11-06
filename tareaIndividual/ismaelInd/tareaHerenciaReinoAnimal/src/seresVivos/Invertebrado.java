package seresVivos;

/**
 * Animales sin columna vertebral.
 *
 * @author Silva.Ismael
 */
public abstract class Invertebrado extends Fauna {
    private String estructuraSoporte;

    /**
     * Crea un invertebrado.
     *
     * @param nombre            nombre común del animal
     * @param clasificacion     nombre científico del animal
     * @param tipoComida        de qué se alimenta
     * @param velocidadMaxima   velocidad máxima en km/h
     * @param estructuraSoporte estructura que sostiene su cuerpo
     */
    public Invertebrado(String nombre, String clasificacion, String tipoComida, float velocidadMaxima,
            String estructuraSoporte) {
        super(nombre, clasificacion, tipoComida, velocidadMaxima);
        this.estructuraSoporte = estructuraSoporte;
    }

    /**
     * Muestra que el invertebrado renueva su estructura de soporte.
     */
    public void mudarEstructuraSoporte() {
        System.out.println(getNombre() + " renueva su estructura de soporte: " + estructuraSoporte);
    }

    public String getEstructuraSoporte() {
        return estructuraSoporte;
    }

    public void setEstructuraSoporte(String estructuraSoporte) {
        this.estructuraSoporte = estructuraSoporte;
    }
}
