package seresVivos;

/**
 * Molusco venenoso de la especie Hapalochlaena lunulata.
 *
 * @author Silva.Ismael
 */
public class PulpoAnillosAzules extends Molusco {
    private Short numeroAnillos;
    private String nivelVeneno;

    /**
     * Crea un pulpo de anillos azules. Los datos de la especie se pasan fijos
     * a las clases padre. El número de anillos debe ser mayor a 0.
     *
     * @param numeroAnillos cantidad de anillos azules
     * @param nivelVeneno   nivel de su veneno
     */
    public PulpoAnillosAzules(short numeroAnillos, String nivelVeneno) {
        super("Pulpo de anillos azules", "Hapalochlaena lunulata", "cangrejos y camarones", 3.0f,
                "esqueleto hidrostático", "moderada");
        this.nivelVeneno = nivelVeneno;
        if (numeroAnillos > 0) {
            this.numeroAnillos = numeroAnillos;
        } else {
            System.out.println("ERROR: el número de anillos debe ser mayor a 0, se asigna 50");
            this.numeroAnillos = 50;
        }
    }

    /**
     * Muestra que el pulpo enseña sus anillos como advertencia.
     */
    public void mostrarAnillos() {
        System.out.println(getNombre() + " muestra sus " + numeroAnillos + " anillos azules como advertencia");
    }

    /**
     * Muestra que el pulpo inyecta su veneno.
     */
    public void inyectarVeneno() {
        System.out.println(getNombre() + " inyecta veneno de nivel " + nivelVeneno);
    }

    public Short getNumeroAnillos() {
        return numeroAnillos;
    }

    public void setNumeroAnillos(short numeroAnillos) {
        this.numeroAnillos = numeroAnillos;
    }

    public String getNivelVeneno() {
        return nivelVeneno;
    }

    public void setNivelVeneno(String nivelVeneno) {
        this.nivelVeneno = nivelVeneno;
    }
}
