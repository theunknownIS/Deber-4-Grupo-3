package pkgLoading;

/**
 * LoadingController
 * <p>
 * Ejecuta las animaciones de carga desde la L01 hasta la L12 en orden.
 */
public class LoadingController {

    /**
     * Ejecuta todas las animaciones de carga con los datos ingresados al
     * inicio.
     *
     * @param caracter       carácter de carga para el L02 y el L03
     * @param nombreCompleto nombre completo para el L08 y el L09
     * @param barras         cantidad de barras de sonido para el L11b
     */
    public void mostrarLoading(char caracter, String nombreCompleto, int barras) {
        System.out.println();
        System.out.println("=== Loading ===");
        System.out.println("L01. Indicador rotacional:");
        new L01IndicadorRotacional().g3L01AnimarIndicadorRotacional();
        System.out.println("L02. Barra con carácter:");
        new L02BarraCaracter().g3L02BarraCaracter(caracter);
        System.out.println("L03. Carácter que se desplaza:");
        new L03CaracterDesplazado().g3L03AnimarCaracterDesplazado(caracter);
        System.out.println("L04. Waiting:");
        new L04Waiting().g3L04AnimarWaiting();
        System.out.println("L05. Barra con punta alterna:");
        new L05BarraPuntaAlterna().g3L05AnimarBarraPuntaAlterna();
        System.out.println("L06. Bloque desplazado:");
        new L06BloqueDesplazado().g3L06AnimarBloqueDesplazado();
        System.out.println("L07. Barra con punta rotacional:");
        new L07BarraPuntaRotacional().g3L07BarraPuntaRotacional();
        System.out.println("L08. Carga letra a letra del nombre:");
        new L08CargaNombre().g3L08AnimarCargaNombre(nombreCompleto);
        System.out.println("L09. Una letra a la vez:");
        new L09LetraPorLetra().g3L09AnimarLetraPorLetra(nombreCompleto);
        System.out.println("L10. Descarga de archivo:");
        new L10DescargaArchivo().g3L10AnimarDescargaArchivo();
        System.out.println("L11a. Señal simétrica aleatoria:");
        new L11aSenalSimetrica().g3L11aDibujarSenalSimetrica();
        System.out.println("L11b. Barras de sonido:");
        new L11bBarrasSonido().g3L11bAnimarBarrasSonido(barras);
        System.out.println("L12. Figura desplazada:");
        new L12FiguraDesplazada().g3L12AnimarFiguraDesplazada();
    }

}
