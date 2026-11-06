package seresVivos;

/**
 * Mamífero marino de la especie Phoca vitulina.
 *
 * @author Silva.Ismael
 */
public class FocaComun extends Mamifero {
    private Float pesoKg;
    private String patronPelaje;
    private String nivelGrasa;

    /**
     * Crea una foca común. Los datos de la especie se pasan fijos a las clases
     * padre. El peso debe ser mayor a 0.
     *
     * @param pesoKg       peso en kilogramos
     * @param patronPelaje patrón de manchas del pelaje
     * @param nivelGrasa   nivel de grasa corporal
     */
    public FocaComun(float pesoKg, String patronPelaje, String nivelGrasa) {
        super("Foca común", "Phoca vitulina", "peces y calamares", 35.0f, (short) 200, "gris", (byte) 11);
        this.patronPelaje = patronPelaje;
        this.nivelGrasa = nivelGrasa;
        if (pesoKg > 0) {
            this.pesoKg = pesoKg;
        } else {
            System.out.println("ERROR: el peso debe ser mayor a 0, se asigna 80 kg");
            this.pesoKg = 80.0f;
        }
    }

    /**
     * Muestra que la foca nada.
     */
    public void nadar() {
        System.out.println(getNombre() + " de " + pesoKg + " kg y pelaje " + patronPelaje + " nada protegida por grasa "
                + nivelGrasa);
    }

    /**
     * Muestra que la foca cierra sus fosas nasales para sumergirse.
     */
    public void cerrarFosasNasales() {
        System.out.println(getNombre() + " cierra sus fosas nasales para sumergirse");
    }

    public Float getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(float pesoKg) {
        this.pesoKg = pesoKg;
    }

    public String getPatronPelaje() {
        return patronPelaje;
    }

    public void setPatronPelaje(String patronPelaje) {
        this.patronPelaje = patronPelaje;
    }

    public String getNivelGrasa() {
        return nivelGrasa;
    }

    public void setNivelGrasa(String nivelGrasa) {
        this.nivelGrasa = nivelGrasa;
    }
}
