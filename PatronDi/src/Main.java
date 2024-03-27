class Procesion {
    private Paso paso;
    private Costalero[] costaleros;
    private BandaMusical bandaMusical;

    Procesion(Paso paso, Costalero[] costaleros, BandaMusical bandaMusical) {
        this.paso = paso;
        this.costaleros = costaleros;
        this.bandaMusical = bandaMusical;
    }

    void comenzarProcesion() {
        System.out.println("Comienza la procesión");
        System.out.println("Estilo del paso: " + paso.mostrarEstilo());
        for (Costalero costalero : costaleros) {
            costalero.soportarPaso();
        }
        bandaMusical.tocarMarcha();
    }
}
public class Main {
    public static void main(String[] args) {
        // Crear instancias de Paso, Costalero y BandaMusical
        Paso pasoCristo = new PasoCristo("Cristo Crucificado");
        Costalero[] costaleros = {new Costalero(), new Costalero()};
        BandaMusical bandaCornetasYTambores = new BandaCornetasYTambores("Banda de cornetas y tambores");

        // Crear instancia de Procesion e iniciar la procesión
        Procesion procesion = new Procesion(pasoCristo, costaleros, bandaCornetasYTambores);
        procesion.comenzarProcesion();
    }
}