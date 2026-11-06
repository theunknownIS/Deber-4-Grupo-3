package pkgHerencia;

/**
 * Clase principal para ejecutar el ejercicio de herencia.
 * Crea una rosa, un loro y una mariposa.
 * Demuestra los metodos propios, heredados y sobrescritos
 * de cada clase mediante su ejecucion en consola.
 *
 * @author Steven
 */
public class Controller {

    public static void main(String[] args) {

        Rosa rosita = new Rosa("Rosita", "Flora / Angiosperma", "raices fibrosas", "rojo");
        rosita.mostrarDatos();
        rosita.absorberAgua();
        rosita.florecer();

        System.out.println();

        Loro paco = new Loro("Paco", "Fauna / Vertebrado / Ave", "verdes");
        paco.mostrarDatos();
        paco.comer();
        paco.describirEsqueleto();
        paco.imitarSonidos();

        System.out.println();

        Mariposa luna = new Mariposa("Luna", "Fauna / Invertebrado / Insecto");
        luna.mostrarDatos();
        luna.comer();
        luna.describirCuerpo();
        luna.volar();
    }
}