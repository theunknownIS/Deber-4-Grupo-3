package pkgLoading;

import java.util.Random;

public class L11aSenalSimetrica {

    /**
     * L11a. Pausa la ejecución.
     *
     * @param ms milisegundos de espera
     * @author Silva.Ismael
     */
    private void g3Esperar(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    /**
     * L11a. Señal simétrica aleatoria.
     * <p>
     * Dibuja 50 niveles de una señal. En cada nivel genera un número
     * aleatorio n entre 0 y 10 e imprime n guiones a la izquierda, un eje
     * central '|' y n guiones a la derecha. La señal se centra con espacios
     * y su color depende de n.
     * <p>
     * Ejemplo: con n = 3 produce " ---|---".
     *
     * @author Silva.Ismael
     */
    public void g3L11aDibujarSenalSimetrica() {
        Random random = new Random();
        String reset = "\u001B[0m";

        for (int i = 1; i <= 50; i++) {
            int n = random.nextInt(11);
            String color;
            switch (n) {
                case 0:
                    color = "\u001B[90m";
                    break;
                case 1:
                    color = "\u001B[34m";
                    break;
                case 2:
                    color = "\u001B[94m";
                    break;
                case 3:
                    color = "\u001B[36m";
                    break;
                case 4:
                    color = "\u001B[96m";
                    break;
                case 5:
                    color = "\u001B[32m";
                    break;
                case 6:
                    color = "\u001B[92m";
                    break;
                case 7:
                    color = "\u001B[33m";
                    break;
                case 8:
                    color = "\u001B[93m";
                    break;
                case 9:
                    color = "\u001B[31m";
                    break;
                default:
                    color = "\u001B[91m";
                    break;
            }
            System.out.print(color);
            for (int j = 0; j < 10 - n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {

                System.out.print("-");
                g3Esperar(15);
            }
            System.out.print("|");
            for (int j = 0; j < n; j++) {
                System.out.print("-");
                g3Esperar(15);
            }
            System.out.println(reset);
            g3Esperar(100);
        }
        System.out.println();
    }

}
