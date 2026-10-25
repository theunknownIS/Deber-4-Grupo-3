package pkgKleimer;
/**
 * Series asignadas a Salvatierra.kleimer:
 * SC02, SC04, SC06, SC08, SC10, SC12, SC14 
 */
public class KleimerSerie {
    /**
     * SC02. Grupos de signos: +, ++, +++, ...
     *Imprime n grupos de signos +, donde el grupo i tiene i signos.
     * 
     * @param n numero de terminos a mostrar
     */
 public void g3Sc02GruposSignos(int n) {
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print("+");
        }
        System.out.print(i < n ? ", " : "\n");
    }
  }

 /**
     * SC04. Operadores cíclicos: +, -, *, /, +, -, *, /, ...
     * Imprime n operadores que se repiten en ciclo, eligiendo el operador
     * según el residuo de (i - 1) entre 4.
     *
     * @param n número de términos a mostrar
     */
    public void g3Sc04OperadoresCiclicos(int n) {
        String operadores = "+-*/";
        for (int i = 1; i <= n; i++) {
            System.out.print(operadores.charAt((i - 1) % 4));
            System.out.print(i < n ? ", " : "\n");
        }
    }
}