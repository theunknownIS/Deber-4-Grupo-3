package pkgArrays;

/**
 * A01. Barras de carga por cada palabra del nombre (maximo 4: dos nombres y
 * dos apellidos).
 * Se separa el nombre con split en un arreglo de palabras y cada palabra usa
 * el porcentaje de carga que ingresa el usuario, en el mismo orden. Ejemplo:
 * con 100 75 50 25 la primera palabra carga al 100% y la ultima al 25%.
 * La barra mide 15 caracteres: llenos = 15 * porcentaje / 100
 * redondeado (con > en la punta) y de la palabra se muestran
 * largo * porcentaje / 100 letras. Usa for.
 *
 * @author Santamaria.Axel
 */
public class A01BarrasNombre {

    private String nombre;

    /**
     * Crea el ejercicio con el nombre por defecto.
     */
    public A01BarrasNombre() {
        this.nombre = "Axel Santamaria";
    }

    /**
     * Crea el ejercicio con el nombre indicado.
     *
     * @param nombre nombre completo, con las palabras separadas por espacios
     */
    public A01BarrasNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Muestra una barra por palabra del nombre con el porcentaje ingresado
     * para cada una. Si el nombre tiene mas de 4 palabras, solo se usan las
     * primeras 4. Si hay menos porcentajes que palabras, solo se muestran
     * las palabras que tienen porcentaje.
     *
     * @param porcentajes porcentaje de carga de cada palabra (0 a 100)
     */
    public void g3A01MostrarBarrasNombre(int[] porcentajes) {
        final int longitud = 15;
        final int maximo = 4;
        String[] palabras = nombre.trim().split("\\s+");
        int cantidad = Math.min(Math.min(palabras.length, porcentajes.length), maximo);

        for (int i = 0; i < cantidad; i++) {
            if (porcentajes[i] < 0 || porcentajes[i] > 100) {
                System.out.println("Error: el porcentaje debe estar entre 0 y 100");
                return;
            }
        }

        for (int i = 0; i < cantidad; i++) {
            int llenos = (int) Math.round(longitud * porcentajes[i] / 100.0);
            int letras = palabras[i].length() * porcentajes[i] / 100;

            String barra = "";
            for (int k = 1; k <= longitud; k++) {
                if (k < llenos) {
                    barra = barra + "=";
                } else if (k == llenos) {
                    barra = barra + ">";
                } else {
                    barra = barra + " ";
                }
            }
            System.out.println("[" + barra + "] " + porcentajes[i] + "% " + palabras[i].substring(0, letras));
        }
    }
}
