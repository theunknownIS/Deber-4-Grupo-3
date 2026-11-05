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
        do {
            System.out.print("Ingrese un parámetro n (entero mayor a 0): ");
            while (!scanner.hasNextInt()) {
                System.out.println("ERROR: " + scanner.next() + " no es un número entero positivo.");
                System.out.print("Ingrese un parámetro n (entero mayor a 0): ");
            }
            n = scanner.nextInt();
            scanner.nextLine();
            if (n < 1) {
                System.out.println("ERROR: n debe ser mayor a cero");
            }
        } while (n < 1);
        System.out.println();
        return n;
    }

    /**
     * @return lector de consola compartido
     */
    public Scanner getScanner() {
        return scanner;
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
        niveles = leerEntero("Ingrese el tamaño/niveles de las figuras (entero mayor a 0): ", 1);

        System.out.println("=== Parámetros de cadenas ===");
        frase = leerTexto("Ingrese una frase: ");
        vocal = leerVocal("Ingrese una vocal: ");
        letra = leerLetra("Ingrese una letra: ");

        System.out.println("=== Parámetros de arrays y loading ===");
        nombreCompleto = leerNombreCompleto("Ingrese su nombre completo (nombre y apellido): ");
        porcentajes = leerPorcentajes(nombreCompleto);
        tamanioMatriz = leerEntero("Ingrese el tamaño de la matriz de iniciales (entero mayor o igual a 3): ", 3);
        caracterMatriz = leerCaracter("Ingrese el carácter de la matriz: ");
        caracterCarga = leerCaracter("Ingrese el carácter de carga: ");
        barrasSonido = leerEntero("Ingrese la cantidad de barras de sonido (entero mayor a 0): ", 1);

        System.out.println("=== Parámetros de recursión ===");
        numeroRecursion = leerEntero("Ingrese n para el factorial y los conteos (entero mayor o igual a 0): ", 0);
        numeroA = leerEntero("Ingrese el número a: ", Integer.MIN_VALUE);
        numeroB = leerEntero("Ingrese el número b: ", Integer.MIN_VALUE);

        System.out.println("=== Parámetros de autómatas ===");
        cadenasAutomatas = new String[8];
        cadenasAutomatas[0] = leerCadena("Ingrese una cadena para GA01 (a*b+c): ");
        cadenasAutomatas[1] = leerCadena("Ingrese una cadena para GA02 (ab+ca): ");
        cadenasAutomatas[2] = leerCadena("Ingrese una cadena para GA03 (a+/b+/c+): ");
        cadenasAutomatas[3] = leerCadena("Ingrese una cadena para GA04 (1+/0+1*): ");
        cadenasAutomatas[4] = leerCadena("Ingrese un número decimal para GA05: ");
        cadenasAutomatas[5] = leerCadena("Ingrese una declaración de variable para GA06: ");
        cadenasAutomatas[6] = leerCadena("Ingrese una palabra reservada para GA07: ");
        cadenasAutomatas[7] = leerCadena("Ingrese una clave para GA08: ");
        System.out.println();
    }

    /**
     * Pide un número entero por consola que debe ser mayor o igual a un
     * mínimo.
     * <p>
     * El bucle impide que el usuario ingrese algo que no sea un número entero
     * o un número menor al mínimo.
     *
     * @param mensaje texto que se muestra al pedir el número
     * @param minimo  valor mínimo permitido
     * @return número entero ingresado por el usuario
     */
    public int leerEntero(String mensaje, int minimo) {
        int numero = 0;
        do {
            System.out.print(mensaje);
            while (!scanner.hasNextInt()) {
                System.out.println("ERROR: " + scanner.next() + " no es un número entero.");
                System.out.print(mensaje);
            }
            numero = scanner.nextInt();
            scanner.nextLine();
            if (numero < minimo) {
                System.out.println("ERROR: el número debe ser mayor o igual a " + minimo);
            }
        } while (numero < minimo);
        return numero;
    }

    /**
     * Pide un texto por consola que no puede estar vacío.
     *
     * @param mensaje texto que se muestra al pedir el dato
     * @return texto ingresado por el usuario, sin espacios en los extremos
     */
    public String leerTexto(String mensaje) {
        String texto = "";
        do {
            System.out.print(mensaje);
            texto = scanner.nextLine().trim();
            if (texto.isEmpty()) {
                System.out.println("ERROR: el texto no puede estar vacío");
            }
        } while (texto.isEmpty());
        return texto;
    }

    /**
     * Pide una cadena por consola para validarla con un autómata. Puede estar
     * vacía, porque el autómata es el que decide si la acepta.
     *
     * @param mensaje texto que se muestra al pedir la cadena
     * @return cadena ingresada por el usuario, sin espacios en los extremos
     */
    public String leerCadena(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine().trim();
    }

    /**
     * Pide un solo carácter por consola. Si el usuario escribe más de uno,
     * se toma el primero.
     *
     * @param mensaje texto que se muestra al pedir el carácter
     * @return carácter ingresado por el usuario
     */
    public char leerCaracter(String mensaje) {
        return leerTexto(mensaje).charAt(0);
    }

    /**
     * Pide una letra por consola.
     * <p>
     * El bucle impide que el usuario ingrese un número o un símbolo.
     *
     * @param mensaje texto que se muestra al pedir la letra
     * @return letra ingresada por el usuario
     */
    public char leerLetra(String mensaje) {
        char caracter = ' ';
        do {
            caracter = leerCaracter(mensaje);
            if (!Character.isLetter(caracter)) {
                System.out.println("ERROR: " + caracter + " no es una letra");
            }
        } while (!Character.isLetter(caracter));
        return caracter;
    }

    /**
     * Pide una vocal por consola.
     * <p>
     * El bucle impide que el usuario ingrese una consonante, un número o un
     * símbolo.
     *
     * @param mensaje texto que se muestra al pedir la vocal
     * @return vocal ingresada por el usuario
     */
    public char leerVocal(String mensaje) {
        char caracter = ' ';
        do {
            caracter = leerCaracter(mensaje);
            if ("aeiouAEIOU".indexOf(caracter) == -1) {
                System.out.println("ERROR: " + caracter + " no es una vocal");
            }
        } while ("aeiouAEIOU".indexOf(caracter) == -1);
        return caracter;
    }

    /**
     * Pide el nombre completo por consola.
     * <p>
     * El bucle impide que el usuario ingrese menos de dos palabras, porque
     * los ejercicios necesitan al menos un nombre y un apellido.
     *
     * @param mensaje texto que se muestra al pedir el nombre
     * @return nombre completo ingresado por el usuario
     */
    public String leerNombreCompleto(String mensaje) {
        String nombre = "";
        do {
            nombre = leerTexto(mensaje);
            if (nombre.split(" +").length < 2) {
                System.out.println("ERROR: ingrese al menos un nombre y un apellido");
            }
        } while (nombre.split(" +").length < 2);
        return nombre;
    }

    /**
     * Pide el porcentaje de carga de cada palabra del nombre, una por una.
     * Solo se usan las primeras 4 palabras.
     * <p>
     * El bucle impide que el usuario ingrese un porcentaje mayor a 100.
     *
     * @param nombre nombre completo del que se toman las palabras
     * @return porcentajes ingresados por el usuario
     */
    public int[] leerPorcentajes(String nombre) {
        String[] palabras = nombre.split(" +");
        int cantidad = palabras.length;
        if (cantidad > 4) {
            cantidad = 4;
        }
        int[] valores = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            do {
                valores[i] = leerEntero("Ingrese el porcentaje de carga de " + palabras[i] + " (0 a 100): ", 0);
                if (valores[i] > 100) {
                    System.out.println("ERROR: el porcentaje no puede ser mayor a 100");
                }
            } while (valores[i] > 100);
        }
        return valores;
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
