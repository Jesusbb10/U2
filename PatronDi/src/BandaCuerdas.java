public class BandaCuerdas implements BandaMusical{

    public String tipoBanda ="";
    public BandaCuerdas(String tipoBanda) {
        this.tipoBanda = tipoBanda;
    }

    public String getTipoBanda() {
        return tipoBanda;
    }

    public void setTipoBanda(String tipoBanda) {
        this.tipoBanda = tipoBanda;
    }

    @Override
    public void tocarMarcha() {
        System.out.println("Banda de cuerdas");

    }
}
