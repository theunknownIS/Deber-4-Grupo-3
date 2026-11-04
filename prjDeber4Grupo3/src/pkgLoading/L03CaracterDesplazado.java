package pkgLoading;

public class L03CaracterDesplazado {

    /**
     * L03. Carácter que se desplaza.
     * <p>
     * Simula una barra de carga de 20 casillas en la que un solo carácter
     * avanza de izquierda a derecha. En cada paso se borra la casilla
     * anterior y se coloca el carácter en la siguiente, mostrando el
     * porcentaje de avance desde 0% hasta 100%.
     *
     * @param caracter carácter que se desplaza por la barra
     * @author Silva.Ismael
     */
    public void g3L03AnimarCaracterDesplazado(char caracter) {
        char[] arrBarra = new char[20];
        for (int i = 0; i < 20; i++) {
            arrBarra[i] = ' ';
        }

        for (int i = 0; i < 20; i++) {
            if (i > 0) {
                arrBarra[i - 1] = ' ';
            }
            arrBarra[i] = caracter;
            int porcentaje = (i * 100) / 19;
            System.out.print("\r[" + new String(arrBarra) + "] " + porcentaje + "%");

            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

        }
        System.out.println();
    }

}
