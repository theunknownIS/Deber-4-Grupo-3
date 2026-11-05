package pkgCadenas;

import java.util.Scanner;

/**
 * CadenasController
 * <p>
 * Ejecuta los ejercicios de cadenas de caracteres desde la C01 hasta la C09
 * en orden.
 */
public class CadenasController {

    /**
     * Ejecuta todos los ejercicios de cadenas con los datos ingresados al
     * inicio.
     * <p>
     * El C08 recibe el scanner porque necesita mostrar la palabra antes de
     * pedir cada intento del anagrama.
     *
     * @param frase   frase con la que se trabajan los ejercicios
     * @param vocal   vocal que se elimina en el C03
     * @param letra   letra que se elimina en el C04
     * @param scanner lector de consola compartido para el C08
     */
    public void mostrarCadenas(String frase, char vocal, char letra, Scanner scanner) {
        System.out.println();
        System.out.println("=== Cadenas de caracteres ===");
        System.out.print("C01. Contar vocales: ");
        new C01ContarVocales().g3C01ContarVocales(frase);
        System.out.print("C02. Contar letras: ");
        new C02ContarLetras().g3C02ContarLetras(frase);
        System.out.print("C03. Eliminar la vocal " + vocal + ": ");
        new C03EliminarVocal().g3C03EliminarVocal(frase, vocal);
        System.out.print("C04. Eliminar la letra " + letra + ": ");
        new C04EliminarLetra().g3C04EliminarLetra(frase, letra);
        System.out.print("C05. Invertida con vocales en mayúsculas: ");
        new C05InvertirVocalesMayus().g3C05InvertirVocalesMayus(frase);
        System.out.print("C06. Invertida con consonantes en mayúsculas: ");
        new C06InvertirConsonantesMayus().g3C06InvertirConsonantesMayus(frase);
        System.out.print("C07. Mayúsculas sin la J: ");
        new C07MayusculasSinJ().g3C07MayusculasSinJ(frase);
        System.out.print("C09. Alternar mayúsculas: ");
        new C09AlternarMayusculas().g3C09AlternarMayusculas(frase);
        System.out.println("C08. Anagramas:");
        new C08Anagramas().g3C08JugarAnagrama(scanner);
    }

}
