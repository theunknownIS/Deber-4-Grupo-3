package pkgLoading;

/**
 * L09. Muestra el nombre una letra por vez, en la misma línea,
 * con un porcentaje de 0 % a 100 %.
 *
 * @author Salvatierra.Kleimer
 */
public class L09LetraPorLetra {

    /**
     * Anima el nombre mostrando una sola letra en cada paso.
     * Si el nombre es null, vacío o solo espacios, muestra un aviso.
     *
     * @param nombre nombre completo que se desea mostrar
     */
    public void g3L09AnimarLetraPorLetra(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("Error: el nombre no puede estar vacío");
            return;
        }
        int n = nombre.length();
        for (int i = 0; i < n; i++) {
            int p = 100;
            if (n > 1) {
                p = i * 100 / (n - 1);
            }
            System.out.print("\r");
            for (int j = 0; j < n; j++) {
                if (j == i) {
                    System.out.print(nombre.charAt(i));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" " + p + "%");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
            }
        }
        System.out.println();
    }
}
