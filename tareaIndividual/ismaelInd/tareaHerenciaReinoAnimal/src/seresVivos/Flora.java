package seresVivos;

/**
 * Seres vivos del reino vegetal.
 *
 * @author Silva.Ismael
 */
public abstract class Flora extends ReinoAnimal {
    private Float horasDeSol;
    private Float aguaNecesariaLitros;

    /**
     * Crea una planta. Las horas de sol deben estar entre 0 y 24 y el agua
     * debe ser mayor a 0.
     *
     * @param nombre              nombre común de la planta
     * @param clasificacion       nombre científico de la planta
     * @param horasDeSol          horas de sol que necesita al día
     * @param aguaNecesariaLitros litros de agua que necesita al día
     */
    public Flora(String nombre, String clasificacion, float horasDeSol, float aguaNecesariaLitros) {
        super(nombre, clasificacion);
        if (horasDeSol >= 0 && horasDeSol <= 24) {
            this.horasDeSol = horasDeSol;
        } else {
            System.out.println("ERROR: las horas de sol deben estar entre 0 y 24, se asigna 12");
            this.horasDeSol = 12.0f;
        }
        if (aguaNecesariaLitros > 0) {
            this.aguaNecesariaLitros = aguaNecesariaLitros;
        } else {
            System.out.println("ERROR: el agua necesaria debe ser mayor a 0, se asigna 1 litro");
            this.aguaNecesariaLitros = 1.0f;
        }
    }

    /**
     * Muestra que la planta hace fotosíntesis con sus horas de sol.
     */
    public void hacerFotosintesis() {
        System.out.println(getNombre() + " hace fotosíntesis con " + horasDeSol + " horas de sol");
    }

    /**
     * La planta se nutre haciendo fotosíntesis y absorbiendo agua.
     */
    @Override
    public void nutrirse() {
        hacerFotosintesis();
        System.out.println(getNombre() + " absorbe " + aguaNecesariaLitros + " litros de agua");
    }

    public Float getHorasDeSol() {
        return horasDeSol;
    }

    public void setHorasDeSol(float horasDeSol) {
        this.horasDeSol = horasDeSol;
    }

    public Float getAguaNecesariaLitros() {
        return aguaNecesariaLitros;
    }

    public void setAguaNecesariaLitros(float aguaNecesariaLitros) {
        this.aguaNecesariaLitros = aguaNecesariaLitros;
    }
}
