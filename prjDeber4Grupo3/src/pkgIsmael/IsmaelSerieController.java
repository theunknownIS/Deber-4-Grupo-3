package pkgIsmael;

public class IsmaelSerieController {

    public void mostrarIsmaelSerie(int n) {
        IsmaelSerie ismaelSerie = new IsmaelSerie();

        System.out.print("SN06 Cuadrados perfectos: ");
        ismaelSerie.g3Sn06ImprimirCuadradoPerfecto(n);
        System.out.print("SN12 Números triangulares: ");
        ismaelSerie.g3Sn06ImprimirNumerosTriangulares(n);
        System.out.print("SN13 Números factoriales: ");
        ismaelSerie.g3Sn13ImmprimirFactoriales(n);

    }

}
