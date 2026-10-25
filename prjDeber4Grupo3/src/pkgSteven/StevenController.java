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
                System.out.print("SN02. Impares alternos con cero: ");
                serie.g3Sn02MostrarImparesAlternosCero(n);

                System.out.print("SN08. Progresión aritmética: ");
                serie.g3Sn08MostrarProgresionAritmetica(n);
                System.out.print("SN10. Potencias: ");
                serie.g3Sn10MostrarPotencias(n);
                System.out.print("SC01. Signos alternos: ");
                serie.g3Sc01MostrarSignosAlternos(n);
                System.out.print("SC11. Grupos de #: ");
                serie.g3Sc11MostrarGruposNumeral(n);
                System.out.print("SC16. Alternancia: ");
                serie.g3Sc16MostrarAlternancia(n);
                System.out.print("SC17. Símbolos: ");
                serie.g3Sc17MostrarSimbolos(n);
        }

}