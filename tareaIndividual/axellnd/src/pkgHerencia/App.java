package pkgHerencia;

public class App {

    public static void main(String[] args) {

        // ---------- FLORA ----------
        Arbol arbol = new Arbol("Roble", 20.5);
        Flor flor = new Flor("Rosa", "rojo");
        Helecho helecho = new Helecho("Helecho común", 12);

        // ---------- FAUNA - VERTEBRADOS ----------
        Leon leon = new Leon("Simba", 190);
        Aguila aguila = new Aguila("Águila real", 2.1);
        Tortuga tortuga = new Tortuga("Galápago", 120);

        // ---------- FAUNA - INVERTEBRADOS ----------
        Ameba ameba = new Ameba("Ameba proteus", "irregular");
        Mariposa mariposa = new Mariposa("Monarca", "naranja");
        Medusa medusa = new Medusa("Medusa luna", false);

        // Polimorfismo: todos son ReinoAnimal
        ReinoAnimal[] seres = { arbol, flor, helecho, leon, aguila, tortuga, ameba, mariposa, medusa };

        System.out.println("===== PRESENTACIÓN (presentarse) =====");
        for (ReinoAnimal ser : seres) {
            ser.presentarse();
        }

        System.out.println("\n===== MÉTODOS PROPIOS DE CADA CLASE =====");
        arbol.hacerFotosintesis();      arbol.darSombra();
        flor.florecer();
        helecho.liberarEsporas();
        leon.moverse();                 leon.mostrarEsqueleto();    leon.rugir();
        aguila.volar();
        tortuga.esconderseEnCaparazon();
        ameba.describirCuerpo();        ameba.moverseConPseudopodos();
        mariposa.aletear();
        medusa.nadar();

        System.out.println("\n===== CADENA DE HERENCIA =====");
        mostrarCadena(ameba);
        mostrarCadena(leon);
        mostrarCadena(arbol);
    }

    // Recorre las clases padre hasta llegar a ReinoAnimal
    private static void mostrarCadena(ReinoAnimal ser) {
        StringBuilder cadena = new StringBuilder(ser.getNombre() + ": ");
        Class<?> c = ser.getClass();
        while (c != Object.class) {
            cadena.append(c.getSimpleName());
            c = c.getSuperclass();
            if (c != Object.class) cadena.append(" -> ");
        }
        System.out.println(cadena);
    }
}
