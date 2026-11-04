package pkgArrays;

/**
 * A01. Barras de carga por cada palabra del nombre (maximo 4: dos nombres y
 * dos apellidos).
 * Se separa el nombre con split en un arreglo de palabras y el porcentaje de
 * cada una se reparte en partes iguales segun cuantas palabras hay:
 * porcentaje de la palabra i = 100 * (i + 1) / cantidad (la ultima siempre
 * queda en 100). Con 2 palabras: 50 y 100. Con 3: 33, 67 y 100. Con 4: 25, 50,
 * 75 y 100. La barra mide 15 caracteres: llenos = 15 * porcentaje / 100
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
     * Muestra una barra por palabra del nombre. Si el nombre tiene mas de 4
     * palabras, solo se usan las primeras 4.
     */
    public void g3A01MostrarBarrasNombre() {
        final int longitud = 15;
        final int maximo = 4;
        String[] palabras = nombre.trim().split("\\s+");
        int cantidad = Math.min(palabras.length, maximo);
        int[] porcentajes = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            porcentajes[i] = (int) Math.round(100.0 * (i + 1) / cantidad);
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
