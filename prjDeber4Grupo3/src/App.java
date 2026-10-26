import java.util.Scanner;
import pkgKleimer.KleimerController;
import pkgAxel.AxelController;
import pkgCamila.CamilaSerieController;
import pkgIsmael.IsmaelSerieController;
import pkgSteven.StevenController;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println();
        System.out.println(
                "grupo-03\nIntegrantes: \nRobles.Steven\nSalvatierra.Kleimer\nSantamaria.Axel\nSilva.Ismael\nTeran.Camila\n");
        int n = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese un parámetro n: ");
            n = scanner.nextInt();
            scanner.close();
        } while (n <= 1);

        IsmaelSerieController ismaelSerieController = new IsmaelSerieController();
        AxelController axelSerieController = new AxelController();
        CamilaSerieController camilaSerieController = new CamilaSerieController();
        KleimerController kleimerSerieController = new KleimerController();
        StevenController stevenSerieController = new StevenController();

        ismaelSerieController.mostrarIsmaelSerie(n);
        axelSerieController.showSeries(n);
        camilaSerieController.mostrarCamilaSerie(n);
        kleimerSerieController.showSeries(n);
        stevenSerieController.showSeries(n);

    }
}
