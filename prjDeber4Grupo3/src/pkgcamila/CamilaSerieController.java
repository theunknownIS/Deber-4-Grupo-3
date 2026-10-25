package pkgCamila;

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
        System.out.print("SC07. Letra y signo alternos: ");
        camilaSerie.g3Sc07ImprimirLetraYSignoAlternos(n);
        System.out.print("SC013. Letra repetida creciente: ");
        camilaSerie.g3Sc013ImprimirLetraRepetidaCreciente(n);
        System.out.print("SC09. Letras repetidas: ");
        camilaSerie.g3Sc09ImprimirLetrasRepetidas(n);
        System.out.print("SC015. Bloques: ");
        camilaSerie.g3Sc015ImprimirBloques(n);
        System.out.print("SN17. úmero de Lucas: ");
        camilaSerie.g3Sn17ImprimirNumeroDeLucas(n);
        System.out.print("SN19. Alternancias: ");
        camilaSerie.g3Sn19ImprimirAlternancias(n);  
    }
    

}
