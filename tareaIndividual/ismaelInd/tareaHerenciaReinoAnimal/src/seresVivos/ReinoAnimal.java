package seresVivos;

/**
 * Clase base de todos los seres vivos del reino.
 *
 * @author Silva.Ismael
 */
public abstract class ReinoAnimal {
    private String nombre;
    private String clasificacion;
    private Boolean estaVivo;

    /**
     * Crea un ser vivo. Todo ser vivo empieza vivo.
     *
     * @param nombre        nombre común del ser vivo
     * @param clasificacion nombre científico del ser vivo
     */
    public ReinoAnimal(String nombre, String clasificacion) {
        this.nombre = nombre;
        this.clasificacion = clasificacion;
        this.estaVivo = true;
    }

    /**
     * Hace crecer al ser vivo si está vivo y el tamaño es mayor a 0.
     *
     * @param tamanio metros que crece
     */
    public void crecer(float tamanio) {
        if (!estaVivo) {
            System.out.println("ERROR: " + nombre + " no puede crecer porque está muerto");
        } else if (tamanio <= 0) {
            System.out.println("ERROR: el tamaño que crece debe ser mayor a 0");
        } else {
            System.out.println(nombre + " creció " + tamanio + " metros");
        }
    }

    /**
     * Muestra que el ser vivo se reproduce.
     */
    public void reproducirse() {
        System.out.println(nombre + " se reproduce");
    }

    /**
     * Muestra el nombre, la clasificación y si el ser vivo está vivo.
     */
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + " \nClasificación: " + clasificacion + " \nEstá vivo: " + estaVivo);
    }

    /**
     * Marca al ser vivo como muerto.
     */
    public void morir() {
        estaVivo = false;
        System.out.println(nombre + " ha muerto");
    }

    /**
     * Muestra que el ser vivo se nutre.
     */
    public void nutrirse() {
        System.out.println(nombre + " se nutre");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public Boolean getEstaVivo() {
        return estaVivo;
    }

    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }
}
