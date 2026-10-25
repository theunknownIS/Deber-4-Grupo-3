package pkgAxel;

/**
 * SN05. Numeros primos: 2, 3, 5, 7, 11, 13, 17, 19, ...
 * Un numero es primo si solo se divide exacto entre 1 y el mismo.
 * Usa un while para avanzar de numero en numero y un for para probar divisores.
 */
public class SeriePrimos {

    /**
     * Muestra los primeros n numeros primos.
     *
     * @param n numero de terminos a mostrar
     */
    public void g3Sn05MostrarPrimos(int n) {
        int encontrados = 0;
        int numero = 2;

        while (encontrados < n) {
            boolean esPrimo = true;

            for (int divisor = 2; divisor < numero; divisor++) {
                if (numero % divisor == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                encontrados++;
                System.out.print(numero + (encontrados < n ? ", " : "\n"));
            }
            numero++;
        }
    }
}
