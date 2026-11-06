package seresVivos;

/**
 * Orquídea de la que se obtiene la esencia de vainilla.
 *
 * @author Silva.Ismael
 */
public class Vainilla extends Orquidea {
    private String aroma;
    private String paisOrigen;
    private String uso;
    private Float tamanioVainaCm;

    /**
     * Crea una vainilla. Los datos de la especie se pasan fijos a las clases
     * padre. El tamaño de la vaina debe ser mayor a 0.
     *
     * @param aroma          aroma de la vainilla
     * @param paisOrigen     país de origen
     * @param uso            uso principal
     * @param tamanioVainaCm tamaño de la vaina en centímetros
     */
    public Vainilla(String aroma, String paisOrigen, String uso, float tamanioVainaCm) {
        super("Vainilla", "Vanilla planifolia", 6.0f, 2.0f, (short) 1, "amarillo verdoso");
        this.aroma = aroma;
        this.paisOrigen = paisOrigen;
        this.uso = uso;
        if (tamanioVainaCm > 0) {
            this.tamanioVainaCm = tamanioVainaCm;
        } else {
            System.out.println("ERROR: el tamaño de la vaina debe ser mayor a 0, se asigna 15 cm");
            this.tamanioVainaCm = 15.0f;
        }
    }

    /**
     * Muestra que se extrae la esencia de la vainilla.
     */
    public void extraerEsencia() {
        System.out.println("Se extrae esencia de aroma " + aroma + " para " + uso);
    }

    /**
     * Muestra que se cultiva la vainilla.
     */
    public void cultivar() {
        System.out.println("Se cultiva vainilla de " + paisOrigen + " con vainas de " + tamanioVainaCm + " cm");
    }

    public String getAroma() {
        return aroma;
    }

    public void setAroma(String aroma) {
        this.aroma = aroma;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public Float getTamanioVainaCm() {
        return tamanioVainaCm;
    }

    public void setTamanioVainaCm(float tamanioVainaCm) {
        this.tamanioVainaCm = tamanioVainaCm;
    }
}
