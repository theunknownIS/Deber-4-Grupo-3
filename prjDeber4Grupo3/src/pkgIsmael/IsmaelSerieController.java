package pkgIsmael;

/**
 * Ejecuta las series de Silva.Ismael.
 */
public class IsmaelSerieController {

    /**
     * Muestra todas las series asignadas.
     *
     * @param n número de términos a generar
     */
    public void mostrarIsmaelSerie(int n) {
        IsmaelSerie ismaelSerie = new IsmaelSerie();

        System.out.print("SN06. Cuadrados perfectos: ");
        ismaelSerie.g3Sn06ImprimirCuadradoPerfecto(n);
        System.out.print("SN12. Números triangulares: ");
        ismaelSerie.g3Sn12ImprimirNumerosTriangulares(n);
        System.out.print("SN13. Números factoriales: ");
        ismaelSerie.g3Sn13ImprimirFactoriales(n);
        System.out.print("SN14. Signos alternos: ");
        ismaelSerie.g3Sn14ImprimirSignosAlternos(n);
        System.out.print("SN15. Cuadrados desplazados: ");
        ismaelSerie.g3Sn15ImprimirCuadradosDesplazados(n);
        System.out.print("SN16. Repetir unidades: ");
        ismaelSerie.g3Sn16RepetirUnidades(n);
        System.out.print("SN18. Números crecientes: ");
        ismaelSerie.g3Sn18ImprimirCreciente(n);

    }

}
