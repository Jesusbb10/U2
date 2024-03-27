public interface RaperoDAO {
    public void anyadirRapero(Rapero rapero);
    public void actualizarRapero(Rapero rapero, int id);
    public void eliminarRapero(int id);
    public void buscarRaperoPorNombre(String nombre);

    public void obtenerTodosLosRaperos();
}
