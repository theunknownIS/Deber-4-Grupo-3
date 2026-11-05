package pkgGrupo;

import java.util.Scanner;

/**
 * Utilidades
 * <p>
 * Métodos para pedir y validar los datos que se ingresan por consola.
 * Usa el mismo scanner de GrupoController para no abrir dos lectores sobre
 * la consola.
 */
public class Utilidades {
    private Scanner scanner;

    /**
     * Crea las utilidades con el lector de consola compartido.
     *
     * @param scanner lector de consola de GrupoController
     */
    public Utilidades(Scanner scanner) {
        this.scanner = scanner;
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
}
