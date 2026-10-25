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
     * Imprime \ | / - | \ | / - | \ | / - | \ | / - | \ | / - |
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
    /**
     * SC07: Letra y signo alternos a + c - e + g -
     * <p>
     * Imprime a + c - e + g - i + k - m + o
     * @param n número de términos que se van a imprimir
     */

    public void g3Sc07ImprimirLetraYSignoAlternos(int n){
        char letraMinuscula = 'a';
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(letraMinuscula + " ");
                letraMinuscula += 2;
            } else {
                int masMenos= (i / 2) % 2 ;
               int simbolo = masMenos == 1 ? '+' : '-';
                System.out.print((char) simbolo + " ");
                    
            }
        }
        System.out.println();
    }
    /**
     * SC013: Letra repetida creciente: A BB CCC DDDD
     * <p>
     * Imprime A BB CCC DDDD EEEEE FFFFFF GGGGGGG 
     * @param n número de términos que se van a imprimir
     */

    public void g3Sc013ImprimirLetraRepetidaCreciente(int n){
        char letraInicial = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(letraInicial);
            }
            System.out.print(" ");
            letraInicial++;
        }
        System.out.println();
    }
    /**
     * SC09: Letras repetidas a bbb ccccc ddddddd
     * <p>
     * Imprime a bb ccccc ddddddd eeeeeee
     * @param n número de términos que se van a imprimir
     */

    public void g3Sc09ImprimirLetrasRepetidas(int n){
        char letraInicial = 'a';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (2*i-1); j++) {
                System.out.print(letraInicial);
            }
            System.out.print(" ");
            letraInicial++;
        }
        System.out.println();
    }

}