package seresVivos;

/**
 * Familia de plantas con flores que dependen de un polinizador.
 *
 * @author Silva.Ismael
 */
public abstract class Orquidea extends Angiosperma {
    private String colorFlor;

    /**
     * Crea una orquídea.
     *
     * @param nombre              nombre común de la planta
     * @param clasificacion       nombre científico de la planta
     * @param horasDeSol          horas de sol que necesita al día
     * @param aguaNecesariaLitros litros de agua que necesita al día
     * @param diasFloracion       días que dura en flor
     * @param colorFlor           color de la flor
     */
    public Orquidea(String nombre, String clasificacion, float horasDeSol, float aguaNecesariaLitros,
            short diasFloracion, String colorFlor) {
        super(nombre, clasificacion, horasDeSol, aguaNecesariaLitros, diasFloracion);
        this.colorFlor = colorFlor;
    }

    /**
     * Muestra que la orquídea atrae a su polinizador.
     */
    public void atraerPolinizador() {
        System.out.println(getNombre() + " atrae polinizadores con su flor " + colorFlor);
    }

    /**
     * Muestra que la orquídea es polinizada a mano por una persona.
     */
    public void polinizarPorHumano() {
        System.out.println("Una persona poliniza " + getNombre() + " a mano");
    }

    public String getColorFlor() {
        return colorFlor;
    }

    public void setColorFlor(String colorFlor) {
        this.colorFlor = colorFlor;
    }
}
