package pkgAxel;

/**
 * Ejecuta las series de santamaria.axel:
 * SN01, SN03, SN04, SN05, SN07, SN09, SN11.
 */
public class AxelController {

    /**
     * Muestra todas las series asignadas, cada una con su titulo.
     *
     * @param n numero de terminos a generar
     */
    public void showSeries(int n) {
        SerieFibonacci fibonacci = new SerieFibonacci();
        SerieFibonacciImpares fibonacciImpares = new SerieFibonacciImpares();
        SerieFibonacciPares fibonacciPares = new SerieFibonacciPares();
        SeriePrimos primos = new SeriePrimos();
        SerieProgresionAritmetica progresion = new SerieProgresionAritmetica();
        SeriePotenciasDos potencias = new SeriePotenciasDos();
        SerieOblongos oblongos = new SerieOblongos();

        System.out.print("SN01. Fibonacci: ");
        fibonacci.g3Sn01MostrarFibonacci(n);

        System.out.print("SN03. Fibonacci sobre impares: ");
        fibonacciImpares.g3Sn03MostrarFibonacciImpares(n);

        System.out.print("SN04. Fibonacci sobre pares: ");
        fibonacciPares.g3Sn04MostrarFibonacciPares(n);

        System.out.print("SN05. Numeros primos: ");
        primos.g3Sn05MostrarPrimos(n);

        System.out.print("SN07. Progresion aritmetica: ");
        progresion.g3Sn07MostrarProgresionAritmetica(n);

        System.out.print("SN09. Potencias: ");
        potencias.g3Sn09MostrarPotencias(n);

        System.out.print("SN11. Numeros oblongos: ");
        oblongos.g3Sn11MostrarOblongos(n);
    }
}
