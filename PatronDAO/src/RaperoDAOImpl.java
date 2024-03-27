import java.util.ArrayList;
import java.util.List;

public class RaperoDAOImpl implements RaperoDAO{
    List<Rapero> listaRaperos = new ArrayList<Rapero>();

    public RaperoDAOImpl() {
        Rapero rapero2pac = new Rapero(001, "Lesane", "2Pac", "Rap", 1990);
        Rapero raperoEminem = new Rapero(002, "Marshall", "Eminem", "Rap", 1999);
        Rapero raperoZatu = new Rapero(003, "Luis", "Zatu", "Rap", 1993);
        listaRaperos.add(raperoEminem);
        listaRaperos.add(rapero2pac);
        listaRaperos.add(raperoZatu);
    }
    @Override
    public void anyadirRapero(Rapero rapero) {
        listaRaperos.add(rapero);
        System.out.println("Rapero Añadido");
    }

    @Override
    public void actualizarRapero(Rapero rapero, int id) {
        for (int i = 0; i < listaRaperos.size(); i++) {
            if(listaRaperos.get(i).id==id){
                listaRaperos.set(i, rapero);
                System.out.println("Cambio realizado");
            }
        }
    }

    @Override
    public void buscarRaperoPorNombre(String nombre) {
        for (int i = 0; i < listaRaperos.size(); i++) {
            if(listaRaperos.get(i).nombre==nombre){
                System.out.println(listaRaperos.get(i));
            }
        }
    }

    @Override
    public void eliminarRapero(int id) {
        for (int i = 0; i < listaRaperos.size(); i++) {
            if (listaRaperos.get(i).id == id) {
                listaRaperos.remove(i);
            }
        }
        System.out.println("Rapero eliminado");
    }

    @Override
    public void obtenerTodosLosRaperos() {
        for (int i = 0; i < listaRaperos.size(); i++) {
            System.out.println(listaRaperos.get(i).toString());
            }
    }
}
