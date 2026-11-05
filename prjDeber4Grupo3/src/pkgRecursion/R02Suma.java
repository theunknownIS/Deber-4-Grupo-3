package pkgRecursion;
/**
 * R02: Crear un método recursivo que calcule la suma (a, b)
 * donde no se saben si son positivos o negativos los números a y b.
 * @author Teran.Camila
*/
public class R02Suma {
/**
 * @param a primer número
 * @param b segundo número
*/
    public void g3R02Suma(int primerNumero, int segundoNumero) {
        int resultado = g3R02SumaRecursiva(primerNumero, segundoNumero);
        System.out.println("La suma de " + primerNumero + " y " + segundoNumero + " es: " + resultado);
    }   
    public int g3R02SumaRecursiva(int primerNumero, int segundoNumero) { 
        if (segundoNumero == 0) {
            return primerNumero;
        } else if (segundoNumero > 0) {
            return g3R02SumaRecursiva(primerNumero , segundoNumero - 1) + 1;
        } else {
            return g3R02SumaRecursiva(primerNumero, segundoNumero + 1) - 1;
        }
    }
}
