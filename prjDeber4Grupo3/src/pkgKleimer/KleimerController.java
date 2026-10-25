package pkgKleimer;

/**
 * Ejecuta las series de Salvatierra.kleimer.
 */
public class KleimerController {

    /**
     * Muestra todas las series asignadas.
     *
     * @param n número de términos a generar
     */
    public void showSeries(int n) {
        KleimerSerie serie = new KleimerSerie();
        System.out.println("SC02. Grupos de signos:");
        serie.g3Sc02GruposSignos(n);
        System.out.println("SC04. Operadores cíclicos:");
        serie.g3Sc04OperadoresCiclicos(n);
         System.out.println("SC06. Letras consecutivas:");
        serie.g3Sc06LetrasConsecutivas(n);
    }
}
