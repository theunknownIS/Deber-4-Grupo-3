package pkgArrays;

import java.util.Scanner;

public class A03PlanoFuncion {

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
