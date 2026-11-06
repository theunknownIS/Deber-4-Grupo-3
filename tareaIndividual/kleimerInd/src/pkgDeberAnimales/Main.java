package pkgDeberAnimales;

public class Main {
    public static void main(String[] args) {
        System.out.println("--EJEMPLOS DE FLORA--");
        Arbol arbol = new Arbol("Pino", "Arborea", "Acicular", 15.5);
        arbol.mostrarDetalles();

        System.out.println();
        System.out.println("--EJEMPLOS DE FAUNA: VERTEBRADOS--");
        Vertebrado llama = new Vertebrado("Llama", "Mamifero", "Andes", "Columna vertebral");
        llama.mostrarDetalles();

        System.out.println();
        Vertebrado perro = new Perro("Firulais", "Mamifero", "Domestico", "Oseo", "Labrador");
        perro.mostrarDetalles();

        System.out.println();
        Vertebrado aguila = new Aguila("Aguila real", "Ave", "Montanas", "Oseo", 2.1);
        aguila.mostrarDetalles();

        System.out.println();
        Vertebrado pez = new Pez("Atun", "Pez oseo", "Oceano", "Oseo", "Salada");
        pez.mostrarDetalles();

        System.out.println();
        System.out.println("--EJEMPLOS DE FAUNA: INVERTEBRADOS--");
        Invertebrado ameba = new Ameba("Ameba", "Protozoario", "Agua dulce", "Membrana celular", "Seudopodos");
        ameba.mostrarDetalles();

        System.out.println();
        Invertebrado pulpo = new Pulpo("Pulpo comun", "Molusco", "Oceano", "Ninguna", 8);
        pulpo.mostrarDetalles();

        System.out.println();
        Invertebrado mariposa = new Mariposa("Monarca", "Insecto", "Bosques", "Exoesqueleto", "Naranja");
        mariposa.mostrarDetalles();
    }
}