package pkgcamila;

/**
 * Ejecuta las series de Teran.Camila.
 * CamilaSerieController
 */

public class CamilaSerieController {
    /**
     * Muestra todas las series asignadas.
     * @param n numero de términos a generar
     */
    public void mostrarCamilaSerie(int n) {
        CamilaSerie camilaSerie = new CamilaSerie();
        System.out.print("SC03. Grupos de signos: ");
        camilaSerie.g3Sc03ImprimirGruposDeSignos(n);
        System.out.print("SC05. Indicador direcional ciclico: ");
        camilaSerie.g3Sc05ImprimirIndicadorDireccionalCiclico(n);
    }
    

}
