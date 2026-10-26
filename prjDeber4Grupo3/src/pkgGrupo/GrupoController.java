package pkgGrupo;

import pkgIsmael.IsmaelSerie;

import java.util.Scanner;

import pkgCamila.CamilaSerie;
import pkgKleimer.KleimerSerie;
import pkgSteven.StevenSerie;
import pkgAxel.SerieFibonacci;
import pkgAxel.SerieFibonacciImpares;
import pkgAxel.SerieFibonacciPares;
import pkgAxel.SerieOblongos;
import pkgAxel.SeriePotenciasDos;
import pkgAxel.SeriePrimos;
import pkgAxel.SerieProgresionAritmetica;

/**
 * GrupoController
 * <p>
 * Controlador general de todas las series.
 * Presenta al grupo, pide el parámetro y muestra las 36 series en grupos y en
 * orden.
 * 
 */
public class GrupoController {
    private IsmaelSerie ismael = new IsmaelSerie();
    private CamilaSerie camila = new CamilaSerie();
    private KleimerSerie kleimer = new KleimerSerie();
    private StevenSerie steven = new StevenSerie();

    /**
     * Pide un parámetro por consola a través de un scanner.
     * <p>
     * El parámetro ingresado solo sera válido si es un número entero mayor a cero.
     * El bucle impide que el usuario ingrese un parámetro negativo o que no sea un
     * número entero positivo.
     * 
     * @return parámetro n ingresado por el usuario
     */
    public int leerParametroN() {
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Ingrese un parámetro n (entero mayor a 0): ");
            while (!scanner.hasNextInt()) {
                System.out.println("ERROR: " + scanner.next() + "no es un número entero positivo.");
            }
            n = scanner.nextInt();
            if (n < 1) {
                System.out.println("ERROR: n debe ser mayor a cero");
            }
        } while (n < 1);
        scanner.close();
        System.out.println();
        return n;
    }

    /**
     * Imprime el nombre del grupo y sus integrantes (apellido.nombre)
     */
    public void imprimirPresentacion() {
        System.out.println();
        System.out.println(
                "grupo-03\nIntegrantes: \nRobles.Steven\nSalvatierra.Kleimer\nSantamaria.Axel\nSilva.Ismael\nTeran.Camila\n");
        System.out.println();
    }

    /**
     * Imprime las series de numéricas desde la SN01 hasta la SN019 en orden.
     * 
     * @param n número de términos a generar.
     */
    public void imprimirSeriesNumericas(int n) {
        System.out.println();
        System.out.println("=== Series numéricas ===");
        System.out.print("SN01. Fibonacci: ");
        new SerieFibonacci().g3Sn01MostrarFibonacci(n);
        System.out.print("SN02. Impares alternados con cero: ");
        steven.g3Sn02MostrarImparesAlternosCero(n);
        System.out.print("SN03. Fibonacci sobre impares: ");
        new SerieFibonacciImpares().g3Sn03MostrarFibonacciImpares(n);
        System.out.print("SN04. Fibonacci sobre pares: ");
        new SerieFibonacciPares().g3Sn04MostrarFibonacciPares(n);
        System.out.print("SN05. Números primos: ");
        new SeriePrimos().g3Sn05MostrarPrimos(n);
        System.out.print("SN06. Cuadrados perfectos: ");
        ismael.g3Sn06ImprimirCuadradoPerfecto(n);
        System.out.print("SN07. Progresión aritmética: ");
        new SerieProgresionAritmetica().g3Sn07MostrarProgresionAritmetica(n);
        System.out.print("SN08. Progresión aritmética: ");
        steven.g3Sn08MostrarProgresionAritmetica(n);
        System.out.print("SN09. Potencias: ");
        new SeriePotenciasDos().g3Sn09MostrarPotencias(n);
        System.out.print("SN10. Potencias: ");
        steven.g3Sn10MostrarPotencias(n);
        System.out.print("SN11. Números oblongos: ");
        new SerieOblongos().g3Sn11MostrarOblongos(n);
        System.out.print("SN12. Triangulares: ");
        ismael.g3Sn12ImprimirNumerosTriangulares(n);
        System.out.print("SN13. Factoriales: ");
        ismael.g3Sn13ImprimirFactoriales(n);
        System.out.print("SN14. Signos alternos: ");
        ismael.g3Sn14ImprimirSignosAlternos(n);
        System.out.print("SN15. Cuadrados desplazados: ");
        ismael.g3Sn15ImprimirCuadradosDesplazados(n);
        System.out.print("SN16. Repunidades: ");
        ismael.g3Sn16RepetirUnidades(n);
        System.out.print("SN17. Números de Lucas: ");
        camila.g3Sn17ImprimirNumeroDeLucas(n);
        System.out.print("SN18. Crecientes: ");
        ismael.g3Sn18ImprimirCreciente(n);
        System.out.print("SN19. Alternancias: ");
        camila.g3Sn19ImprimirAlternancias(n);
    }

    /**
     * Imprime las series de caracteres desde la SC01 hasta la SC17 en orden.
     * 
     * @param n número de términos a generar.
     */
    public void imprimirSeriesCaracteres(int n) {
        System.out.println();
        System.out.println("=== Series de caracteres ===");
        System.out.print("SC01. Signos alternados: ");
        steven.g3Sc01MostrarSignosAlternos(n);
        System.out.print("SC02. Grupos de signos: ");
        kleimer.g3Sc02GruposSignos(n);
        System.out.print("SC03. Grupos de signos: ");
        camila.g3Sc03ImprimirGruposDeSignos(n);
        System.out.print("SC04. Operadores cíclicos: ");
        kleimer.g3Sc04OperadoresCiclicos(n);
        System.out.print("SC05. Indicador direccional cíclico: ");
        camila.g3Sc05ImprimirIndicadorDireccionalCiclico(n);
        System.out.print("SC06. Letras consecutivas: ");
        kleimer.g3Sc06LetrasConsecutivas(n);
        System.out.print("SC07. Letra y signo alternados: ");
        camila.g3Sc07ImprimirLetraYSignoAlternos(n);
        System.out.print("SC08. Letras repetidas: ");
        kleimer.g3Sc08LetrasRepetidas(n);
        System.out.print("SC09. Letras repetidas: ");
        camila.g3Sc09ImprimirLetrasRepetidas(n);
        System.out.print("SC10. Letras con repetición: ");
        kleimer.g3Sc10LetrasConRepeticion(n);
        System.out.print("SC11. Grupos de #: ");
        steven.g3Sc11MostrarGruposNumeral(n);
        System.out.print("SC12. Vocales repetidas: ");
        kleimer.g3Sc12VocalesRepetidas(n);
        System.out.print("SC13. Letra repetida creciente: ");
        camila.g3Sc13ImprimirLetraRepetidaCreciente(n);
        System.out.print("SC14. Alfabeto: ");
        kleimer.g3Sc14MostrarAlfabeto(n);
        System.out.print("SC15. Bloques: ");
        camila.g3Sc15ImprimirBloques(n);
        System.out.print("SC16. Alternancia: ");
        steven.g3Sc16MostrarAlternancia(n);
        System.out.print("SC17. Símbolos: ");
        steven.g3Sc17MostrarSimbolos(n);
        System.out.println();
    }
}
