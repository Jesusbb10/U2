public class Main {
    public static void main(String[] args) {
        FactoryEspectaculoFlamenco factory = new FactoryEspectaculoFlamenco();

        EspectaculoFlamenco espectaculoBaile = factory.crearEspectaculo("baile");
        EspectaculoFlamenco espectaculoGuitarra = factory.crearEspectaculo("guitarra");
        EspectaculoFlamenco espectaculoCante = factory.crearEspectaculo("cante");

        System.out.println(espectaculoBaile.mostrarInformacion());
        System.out.println(espectaculoCante.mostrarInformacion());
        System.out.println(espectaculoGuitarra.mostrarInformacion());
    }
}