package pkgFiguras;

/**
 * FigurasController
 * <p>
 * Ejecuta los ejercicios de figuras desde la F01 hasta la F19 en orden.
 */
public class FigurasController {

    /**
     * Dibuja todas las figuras con el mismo tamaño.
     *
     * @param n tamaño o número de niveles de las figuras
     */
    public void mostrarFiguras(int n) {
        System.out.println();
        System.out.println("=== Figuras ===");
        System.out.println("F01. Cuadrado hueco:");
        new F01CuadradoHueco().g3F01DibujarCuadradoHueco(n);
        System.out.println("F02. Cuadrado alternado:");
        new F02CuadradoAlternado().g3F02DibujarCuadradoAlternado(n);
        System.out.println("F03. Triángulo izquierdo:");
        new F03TrianguloIzquierdo().g3F03DibujarTrianguloIzquierdo(n);
        System.out.println("F04. Triángulo derecho:");
        new F04TrianguloDerecho().g3F04DibujarTrianguloDerecho(n);
        System.out.println("F05. Triángulo invertido:");
        new F05TrianguloInvertido().g3F05DibujarTrianguloInvertido(n);
        System.out.println("F06. Pirámide:");
        new F06Piramide().g3F06DibujarPiramide(n);
        System.out.println("F07. Escalera descendente:");
        new F07EscaleraDescendente().g3F07DibujarEscaleraDescendente(n);
        System.out.println("F08. Escalera ascendente:");
        new F08EscaleraAscendente().g3F08DibujarEscaleraAscendente(n);
        System.out.println("F09. Montaña:");
        new F09Montania().g3F09DibujarMontania(n);
        System.out.println("F10. Escalera de signos:");
        new F10EscaleraSignos().g3F10DibujarEscaleraSignos(n);
        System.out.println("F11. Escalera de guiones:");
        new F11EscaleraGuiones().g3F11DibujarEscaleraGuiones(n);
        System.out.println("F12. Números decrecientes:");
        new F12NumerosDecrecientes().g3F12DibujarNumerosDecrecientes(n);
        System.out.println("F13. Números crecientes:");
        new F13NumerosCrecientes().g3F13DibujarNumerosCrecientes(n);
        System.out.println("F14. Pascal centrado:");
        new F14PascalCentrado().g3F14DibujarPascalCentrado(n);
        System.out.println("F15. Pascal izquierdo:");
        new F15PascalIzquierdo().g3F15DibujarPascalIzquierdo(n);
        System.out.println("F16. X de signos:");
        new F16XSignos().g3F16DibujarXSignos(n);
        System.out.println("F17. X binaria:");
        new F17XBinaria().g3F17DibujarXBinaria(n);
        System.out.println("F18. Triángulo numérico:");
        new F18TrianguloNumerico().g3F18DibujarTrianguloNumerico(n);
        System.out.println("F19. Triángulo de símbolos:");
        new F19TrianguloSimbolos().g3F19DibujarTrianguloSimbolos(n);
    }

}
