package pkgcamila;

/**
 * Series asignadas a Teran.Camila:
 * SC03, SC05, SC07, SC09, SC13, SC015, SN17, SN19
 */

public class CamilaSerie {

    /**
     * SC03: Grupos de signos
     * <p>
     * Imprime ++ +++ +++++ ++++++++ .....
     *
     * @param n número de términos que se van a imprimir
     */
    public void g3Sc03ImprimirGruposDeSignos(int n){
        int numero = 2;
        while (numero <= n) {
            boolean esPrimo = true;
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                for (int i = 0; i < numero; i++) {
                    System.out.print("+");
                }
                System.out.print(" ");
            }           
            numero++;
        }
        System.out.println();
    }
    /**
     * SC05: Indicador direcional ciclico \ | / - |
     * <p>
     * Imprime ++ +++ +++++ ++++++++ .....
     *
     * @param n número de términos que se van a imprimir
     */

    public void g3Sc05ImprimirIndicadorDireccionalCiclico(int n){
        char[] simbolos = {'\\', '|', '/', '-', '|'};
        for (int i = 0; i < n; i++) {
            char simboloCorrecto = simbolos[i % 5];
            System.out.print(simboloCorrecto + " ");
        }
        System.out.println();
    }

}