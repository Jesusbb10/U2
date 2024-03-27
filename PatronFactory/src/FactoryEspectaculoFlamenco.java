public class FactoryEspectaculoFlamenco {

    public EspectaculoFlamenco crearEspectaculo(String tipo){
        switch (tipo) {
            case "baile":
                return new EspectaculoBaile();
            case "cante":
                return new EspectaculoCante();
            case "guitarra":
                return new EspectaculoGuitarra();
            default:
                return null;

        }


    }
}
