import pkgGrupo.GrupoController;

public class App {
    public static void main(String[] args) throws Exception {
        GrupoController controladorGrupal = new GrupoController();
        int n = 0;
        controladorGrupal.imprimirPresentacion();
        n = controladorGrupal.leerParametroN();
        controladorGrupal.imprimirSeriesNumericas(n);
        controladorGrupal.imprimirSeriesCaracteres(n);

    }
}
