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
import pkgFiguras.FigurasController;
import pkgCadenas.CadenasController;
import pkgArrays.ArraysController;
import pkgLoading.LoadingController;
import pkgRecursion.RecursionController;
import pkgAutomatas.AutomatasController;

/**
 * GrupoController
 * <p>
 * Controlador general de todas las series.
 * Presenta al grupo, pide el parámetro y muestra las 36 series en grupos y en
 * orden.
 * 
 */
public class GrupoController {
    private Scanner scanner = new Scanner(System.in);
    private Utilidades utilidades = new Utilidades(scanner);
    private IsmaelSerie ismael = new IsmaelSerie();
    private CamilaSerie camila = new CamilaSerie();
    private KleimerSerie kleimer = new KleimerSerie();
    private StevenSerie steven = new StevenSerie();
    private int niveles;
    private String frase;
    private char vocal;
    private char letra;
    private String nombreCompleto;
    private int[] porcentajes;
    private int tamanioMatriz;
    private char caracterMatriz;
    private char caracterCarga;
    private int barrasSonido;
    private int numeroRecursion;
    private int numeroA;
    private int numeroB;
    private String[] cadenasAutomatas;

    /**
     * @return lector de consola compartido
     */
    public Scanner getScanner() {
        return scanner;
    }

    /**
     * @return utilidades para leer datos por consola
     */
    public Utilidades getUtilidades() {
        return utilidades;
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

    /**
     * Pide por consola todos los parámetros de los ejercicios de la parte 2
     * antes de ejecutarlos.
     * <p>
     * Se piden en orden: niveles de las figuras, frase, vocal y letra para
     * las cadenas, nombre completo, porcentajes de carga, tamaño y carácter
     * de la matriz, carácter de carga, cantidad de barras de sonido, números
     * de la recursión y una cadena por cada autómata. El C08 es el único que
     * pide datos durante su ejecución.
     */
    public void leerParametrosParte2() {
        System.out.println("=== Parámetros de figuras ===");
        niveles = utilidades.leerEntero("Ingrese el tamaño/niveles de las figuras (entero mayor a 0): ", 1);

        System.out.println("=== Parámetros de cadenas ===");
        frase = utilidades.leerTexto("Ingrese una frase: ");
        vocal = utilidades.leerVocal("Ingrese una vocal: ");
        letra = utilidades.leerLetra("Ingrese una letra: ");

        System.out.println("=== Parámetros de arrays y loading ===");
        nombreCompleto = utilidades.leerNombreCompleto("Ingrese su nombre completo (nombre y apellido): ");
        porcentajes = utilidades.leerPorcentajes(nombreCompleto);
        tamanioMatriz = utilidades.leerEntero("Ingrese el tamaño de la matriz de iniciales (entero mayor o igual a 3): ", 3);
        caracterMatriz = utilidades.leerCaracter("Ingrese el carácter de la matriz: ");
        caracterCarga = utilidades.leerCaracter("Ingrese el carácter de carga: ");
        barrasSonido = utilidades.leerEntero("Ingrese la cantidad de barras de sonido (entero mayor a 0): ", 1);

        System.out.println("=== Parámetros de recursión ===");
        numeroRecursion = utilidades.leerEntero("Ingrese n para el factorial y los conteos (entero mayor o igual a 0): ", 0);
        numeroA = utilidades.leerEntero("Ingrese el número a: ", Integer.MIN_VALUE);
        numeroB = utilidades.leerEntero("Ingrese el número b: ", Integer.MIN_VALUE);

        System.out.println("=== Parámetros de autómatas ===");
        cadenasAutomatas = new String[8];
        cadenasAutomatas[0] = utilidades.leerCadena("Ingrese una cadena para GA01 (a*b+c): ");
        cadenasAutomatas[1] = utilidades.leerCadena("Ingrese una cadena para GA02 (ab+ca): ");
        cadenasAutomatas[2] = utilidades.leerCadena("Ingrese una cadena para GA03 (a+/b+/c+): ");
        cadenasAutomatas[3] = utilidades.leerCadena("Ingrese una cadena para GA04 (1+/0+1*): ");
        cadenasAutomatas[4] = utilidades.leerCadena("Ingrese un número decimal para GA05: ");
        cadenasAutomatas[5] = utilidades.leerCadena("Ingrese una declaración de variable para GA06: ");
        cadenasAutomatas[6] = utilidades.leerCadena("Ingrese una palabra reservada para GA07: ");
        cadenasAutomatas[7] = utilidades.leerCadena("Ingrese una clave para GA08: ");
        System.out.println();
    }

    /**
     * Imprime las figuras desde la F01 hasta la F19 en orden.
     */
    public void imprimirFiguras() {
        new FigurasController().mostrarFiguras(niveles);
    }

    /**
     * Imprime los ejercicios de cadenas desde la C01 hasta la C09.
     */
    public void imprimirCadenas() {
        new CadenasController().mostrarCadenas(frase, vocal, letra, scanner);
    }

    /**
     * Imprime los ejercicios de arrays desde la A01 hasta la A05 en orden.
     */
    public void imprimirArrays() {
        new ArraysController().mostrarArrays(nombreCompleto, porcentajes, tamanioMatriz, caracterMatriz);
    }

    /**
     * Imprime las animaciones de carga desde la L01 hasta la L12 en orden.
     */
    public void imprimirLoading() {
        new LoadingController().mostrarLoading(caracterCarga, nombreCompleto, barrasSonido);
    }

    /**
     * Imprime los ejercicios de recursión desde la R01 hasta la R06 en orden.
     */
    public void imprimirRecursion() {
        new RecursionController().mostrarRecursion(numeroRecursion, numeroA, numeroB);
    }

    /**
     * Imprime el resultado de los autómatas desde el GA01 hasta el GA08 en
     * orden.
     */
    public void imprimirAutomatas() {
        new AutomatasController().mostrarAutomatas(cadenasAutomatas);
    }
}
