package seresVivos;

/**
 * Prueba uno por uno los métodos de las tres especies.
 *
 * @author Silva.Ismael
 */
public class SeresVivosController {

    /**
     * Prueba los métodos de la vainilla y de sus clases padre: ReinoAnimal,
     * Flora, Angiosperma y Orquidea.
     */
    public void probarVainilla() {
        System.out.println("Vainilla");
        Vainilla vainilla = new Vainilla("dulce", "México", "repostería", 20.0f);
        vainilla.mostrarInformacion();
        vainilla.crecer(0.5f);
        vainilla.reproducirse();
        vainilla.nutrirse();
        vainilla.hacerFotosintesis();
        vainilla.florecer();
        vainilla.darFruto();
        vainilla.atraerPolinizador();
        vainilla.polinizarPorHumano();
        vainilla.extraerEsencia();
        vainilla.cultivar();

        vainilla.setNombre("Vainilla bourbon");
        System.out.println("nombre: " + vainilla.getNombre());
        vainilla.setClasificacion("Vanilla planifolia var. bourbon");
        System.out.println("clasificacion: " + vainilla.getClasificacion());
        vainilla.setEstaVivo(true);
        System.out.println("estaVivo: " + vainilla.getEstaVivo());
        vainilla.setHorasDeSol(8.0f);
        System.out.println("horasDeSol: " + vainilla.getHorasDeSol());
        vainilla.setAguaNecesariaLitros(3.0f);
        System.out.println("aguaNecesariaLitros: " + vainilla.getAguaNecesariaLitros());
        vainilla.setDiasFloracion((short) 2);
        System.out.println("diasFloracion: " + vainilla.getDiasFloracion());
        vainilla.setColorFlor("blanco");
        System.out.println("colorFlor: " + vainilla.getColorFlor());
        vainilla.setAroma("intenso");
        System.out.println("aroma: " + vainilla.getAroma());
        vainilla.setPaisOrigen("Madagascar");
        System.out.println("paisOrigen: " + vainilla.getPaisOrigen());
        vainilla.setUso("helados");
        System.out.println("uso: " + vainilla.getUso());
        vainilla.setTamanioVainaCm(22.5f);
        System.out.println("tamanioVainaCm: " + vainilla.getTamanioVainaCm());

        vainilla.morir();
        vainilla.mostrarInformacion();
        System.out.println();
    }

    /**
     * Prueba los métodos de la foca común y de sus clases padre: ReinoAnimal,
     * Fauna, Vertebrado y Mamifero.
     */
    public void probarFocaComun() {
        System.out.println("Foca común");
        FocaComun foca = new FocaComun(85.5f, "moteado", "alto");
        foca.mostrarInformacion();
        foca.crecer(0.2f);
        foca.reproducirse();
        foca.nutrirse();
        foca.desplazarse();
        foca.moverEspinaDorsal();
        foca.gestar();
        foca.mudarPelaje();
        foca.lactar();
        foca.nadar();
        foca.cerrarFosasNasales();

        foca.setTipoComida("peces");
        System.out.println("tipoComida: " + foca.getTipoComida());
        foca.setVelocidadMaxima(30.0f);
        System.out.println("velocidadMaxima: " + foca.getVelocidadMaxima());
        foca.setNumeroHuesos((short) 210);
        System.out.println("numeroHuesos: " + foca.getNumeroHuesos());
        foca.setColorPelaje("marrón");
        System.out.println("colorPelaje: " + foca.getColorPelaje());
        foca.setMesesGestacion((byte) 10);
        System.out.println("mesesGestacion: " + foca.getMesesGestacion());
        foca.setPesoKg(92.0f);
        System.out.println("pesoKg: " + foca.getPesoKg());
        foca.setPatronPelaje("liso");
        System.out.println("patronPelaje: " + foca.getPatronPelaje());
        foca.setNivelGrasa("medio");
        System.out.println("nivelGrasa: " + foca.getNivelGrasa());

        foca.morir();
        foca.mostrarInformacion();
        System.out.println();
    }

    /**
     * Prueba los métodos del pulpo de anillos azules y de sus clases padre:
     * ReinoAnimal, Fauna, Invertebrado y Molusco.
     */
    public void probarPulpoAnillosAzules() {
        System.out.println("Pulpo de anillos azules");
        PulpoAnillosAzules pulpo = new PulpoAnillosAzules((short) 60, "muy alto");
        pulpo.mostrarInformacion();
        pulpo.crecer(0.1f);
        pulpo.reproducirse();
        pulpo.nutrirse();
        pulpo.desplazarse();
        pulpo.mudarEstructuraSoporte();
        pulpo.producirMoco();
        pulpo.mostrarAnillos();
        pulpo.inyectarVeneno();

        pulpo.setEstructuraSoporte("cuerpo blando");
        System.out.println("estructuraSoporte: " + pulpo.getEstructuraSoporte());
        pulpo.setCantidadMoco("abundante");
        System.out.println("cantidadMoco: " + pulpo.getCantidadMoco());
        pulpo.setNumeroAnillos((short) 55);
        System.out.println("numeroAnillos: " + pulpo.getNumeroAnillos());
        pulpo.setNivelVeneno("mortal");
        System.out.println("nivelVeneno: " + pulpo.getNivelVeneno());

        pulpo.morir();
        pulpo.mostrarInformacion();
        pulpo.crecer(0.3f);
    }

}
