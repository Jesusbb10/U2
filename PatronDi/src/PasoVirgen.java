public class PasoVirgen extends Paso{
    private String estilo;
    public PasoVirgen(String nombre, String estilo) {
        super(nombre);
        this.estilo = estilo;
    }

    public String getEstilo() {
        return estilo;
    }

    public String setEstilo(String estilo) {
        return this.estilo = estilo;
    }

    public String mostrarEstilo() {
        return "Estilo del paso de Virgen";
    }

}
