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

            System.out.println("SN08. Progresión aritmética:");
        serie.g3Sn08MostrarProgresionAritmetica(n);
                System.out.println("SN10. Potencias:");
        serie.g3Sn10MostrarPotencias(n);
                System.out.println("SC01. Signos alternos:");
        serie.g3Sc01MostrarSignosAlternos(n);
                System.out.println("SC11. Grupos de #:");
        serie.g3Sc11MostrarGruposNumeral(n);
    }

}