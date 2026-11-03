package pkgArrays;

import java.util.Scanner;

public class A03PlanoFuncion {

    /**
     * A03. Plano y función f(x) = 2x con el nombre.
     * <p>
     * Pide el nombre del usuario y dibuja un plano de coordenadas positivo
     * usando una matriz. Cada letra del nombre se coloca una fila más arriba
     * y dos columnas más a la derecha que la anterior, formando una diagonal.
     * La fila 0 representa el eje horizontal y se dibuja con '_'.
     * <p>
     * La matriz se imprime de la última fila a la primera para que el eje y
     * crezca hacia arriba, como en un plano cartesiano.
     * <p>
     * Ejemplo: con el nombre "patmic" la letra 'p' queda en la fila 1 y la
     * letra 'c' en la fila 6.
     *
     * @param scanner Scanner para leer el nombre del usuario
     * @author Silva.Ismael
     */
    public void g3A03DibujarPlanoFuncionLetras(Scanner scanner) {

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        int k = nombre.length() + 1;

        String[][] matrizPlano = new String[k][(k * 2) - 1];

        for (int i = (k - 1); i >= 0; i--) {
            for (int j = 0; j < (k * 2) - 1; j++) {
                if (i == 0) {
                    matrizPlano[i][j] = "_";
                } else {
                    matrizPlano[i][j] = " ";
                }
            }
        }

        for (int m = 1; m <= nombre.length(); m++) {
            matrizPlano[m][(m * 2) - 1] = String.valueOf(nombre.charAt(m - 1));
        }

        for (int i = (k - 1); i >= 0; i--) {
            System.out.printf("%2d |", i);
            for (int j = 0; j < (k * 2) - 1; j++) {
                System.out.print(matrizPlano[i][j]);
            }
            System.out.println();
        }
    }

}
