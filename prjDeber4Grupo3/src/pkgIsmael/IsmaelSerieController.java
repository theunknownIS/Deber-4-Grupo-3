package pkgIsmael;

public class IsmaelSerieController {

    public void mostrarIsmaelSerie(int n) {
        IsmaelSerie ismaelSerie = new IsmaelSerie();

        System.out.print("SN06 Cuadrados perfectos: ");
        ismaelSerie.g3Sn06MostrarCuadradoPerfecto(n);
        System.out.print("SN12 Números triangulares: ");
        ismaelSerie.g3Sn06MostrarNumerosTriangulares(n);

    }

}
