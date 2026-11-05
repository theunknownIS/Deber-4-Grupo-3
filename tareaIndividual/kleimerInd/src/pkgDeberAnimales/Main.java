package pkgDeberAnimales;

public class Main {
    public static void main(String[] args) {
        System.out.println("--EJEMPLOS DE FLORA--");
        Arbol arbol = new Arbol("Pino", "Arborea", "Acicular", 15.5);
        arbol.mostrarDetalles();

        System.out.println(" --EJEMPLOS DE FAUNA--");
        Vertebrado vertebrado = new Vertebrado("Llama", "Mamifero", "Andes", "Columna vertebral");
        vertebrado.mostrarDetalles();

        System.out.println("");
        Invertebrado invertebrado = new Invertebrado("Ameba", "Protozoario", "Agua dulce", "Membrana celular");
        invertebrado.mostrarDetalles();
    }
}