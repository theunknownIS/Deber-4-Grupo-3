package pkgSteven;

/**
 * Ejecuta las series de Robles.Steven.
 */
public class StevenController {

    /**
     * Muestra todas las series asignadas.
     *
     * @param n número de términos a generar
     */
    public void showSeries(int n) {
        StevenSerie serie = new StevenSerie();
        System.out.println("SN02. Impares alternos con cero:");
        serie.g3Sn02MostrarImparesAlternosCero(n);
    }
}