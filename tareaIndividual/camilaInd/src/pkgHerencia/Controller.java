package pkgHerencia;

import java.util.ArrayList;

public class Controller {
    private Cactus cactus;
    private VenusAtrapamoscas venus;
    private Mangle mangle;
    private Ballena ballena;
    private Murcielago murcielago;
    private Tortuga tortuga;
    private Abeja abeja;
    private Caracol caracol;
    private Sanguijuela sanguijuela;
    private ArrayList<ReinoAnimal> seres;

    public Controller() {
        crearSeres();
    }

    private void crearSeres() {
        cactus = new Cactus("Cactus", "Suculenta", 150, "Espinas", "Carnoso", 1, "Superficiales");
        venus = new VenusAtrapamoscas("Venus Atrapamoscas", "Carnivora", 20, "Trampa", "Corto",
                "Dos lobulos", true);
        mangle = new Mangle("Mangle Negro", "Arbustiva", 60, "Ovaladas", "Lenoso", "Aereas", true);

        ballena = new Ballena("Ballena jorobada", "Mamifero", 50, false, "Oceano", true, true, true, "Gris");
        murcielago = new Murcielago("Murcielago", "Mamifero", 20, true, "Cuevas", true, true, 2, 15,
                "Membranosa");
        tortuga = new Tortuga("Tortuga", "Reptil", 80, false, "Costas", false, true, true, false, true);

        abeja = new Abeja("Abeja", "Insecto", 1, false, "Colmena", "Tubo digestivo", "Huevos", 4, 1);
        caracol = new Caracol("Caracol", "Molusco", 5, true, "Jardin", "Con radula", "Huevos", true, true);
        sanguijuela = new Sanguijuela("Sanguijuela", "Anelido", 6, true, "Agua dulce", "Con buche",
                "Huevos", "Alargada", "Marron");

        seres = new ArrayList<>();
        seres.add(cactus);
        seres.add(venus);
        seres.add(mangle);
        seres.add(ballena);
        seres.add(murcielago);
        seres.add(tortuga);
        seres.add(abeja);
        seres.add(caracol);
        seres.add(sanguijuela);
    }

    public void mostrarFlora() {
        System.out.println("--EJEMPLOS DE FLORA--");
        cactus.mostrarDetalles();
        cactus.almacenarAgua();
        cactus.tiempoVida();

        System.out.println();
        venus.mostrarDetalles();
        venus.alimentarse();

        System.out.println();
        mangle.mostrarDetalles();
        mangle.respirar();
        mangle.excretarSal();
    }

    public void mostrarVertebrados() {
        System.out.println("--EJEMPLOS DE FAUNA: VERTEBRADOS--");
        ballena.mostrarDetalles();
        ballena.nadar();
        ballena.nacidoPor();
        ballena.formaCazar();

        System.out.println();
        murcielago.mostrarDetalles();
        murcielago.observar();
        murcielago.localizar();

        System.out.println();
        tortuga.mostrarDetalles();
        tortuga.migrar();
        tortuga.defecar();
    }

    public void mostrarInvertebrados() {
        System.out.println("--EJEMPLOS DE FAUNA: INVERTEBRADOS--");
        abeja.mostrarDetalles();
        abeja.volar();
        abeja.nacidoPor();

        System.out.println();
        caracol.mostrarDetalles();
        caracol.mover();

        System.out.println();
        sanguijuela.mostrarDetalles();
        sanguijuela.mover();
        sanguijuela.comer();
    }

    public void mostrarPolimorfismo() {
        System.out.println("--POLIMORFISMO--");
        for (ReinoAnimal ser : seres) {
            ser.alimentarse();
            ser.respirar();
            System.out.println("Tiempo de vida: " + ser.tiempoVida() + " anios");
            System.out.println();
        }
    }

    public void iniciar() {
        mostrarFlora();
        System.out.println();
        mostrarVertebrados();
        System.out.println();
        mostrarInvertebrados();
        System.out.println();
        mostrarPolimorfismo();
    }
}
