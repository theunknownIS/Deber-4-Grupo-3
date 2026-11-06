package seresVivos;

/**
 * Plantas con flores y frutos.
 *
 * @author Silva.Ismael
 */
public abstract class Angiosperma extends Flora {
    private Short diasFloracion;

    /**
     * Crea una angiosperma. Los días de floración deben ser mayores a 0.
     *
     * @param nombre              nombre común de la planta
     * @param clasificacion       nombre científico de la planta
     * @param horasDeSol          horas de sol que necesita al día
     * @param aguaNecesariaLitros litros de agua que necesita al día
     * @param diasFloracion       días que dura en flor
     */
    public Angiosperma(String nombre, String clasificacion, float horasDeSol, float aguaNecesariaLitros,
            short diasFloracion) {
        super(nombre, clasificacion, horasDeSol, aguaNecesariaLitros);
        if (diasFloracion > 0) {
            this.diasFloracion = diasFloracion;
        } else {
            System.out.println("ERROR: los días de floración deben ser mayores a 0, se asigna 1");
            this.diasFloracion = 1;
        }
    }

    /**
     * Muestra que la planta florece.
     */
    public void florecer() {
        System.out.println(getNombre() + " florece durante " + diasFloracion + " días");
    }

    /**
     * Muestra que la planta da fruto.
     */
    public void darFruto() {
        System.out.println(getNombre() + " da fruto con semillas");
    }

    /**
     * La angiosperma se reproduce floreciendo y dando fruto.
     */
    @Override
    public void reproducirse() {
        super.reproducirse();
        florecer();
        darFruto();
    }

    public Short getDiasFloracion() {
        return diasFloracion;
    }

    public void setDiasFloracion(short diasFloracion) {
        this.diasFloracion = diasFloracion;
    }
}
