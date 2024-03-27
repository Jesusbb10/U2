public class Rapero {
    public int id;
    public String nombre;
    public String nombreArtistico;
    public String generoMusical;
    public int anyoDeInicio;

    public Rapero(int id, String nombre, String nombreArtistico, String generoMusical, int anyoDeInicio) {
        this.id = id;
        this.nombre = nombre;
        this.nombreArtistico = nombreArtistico;
        this.generoMusical = generoMusical;
        this.anyoDeInicio = anyoDeInicio;

    }

    public String toString() {
        return "-Id: " + this.id + "\n -Nombre: " +this.nombre + "\n -Nombre Artistico: " + this.nombreArtistico + "\n -Genero musical: " +this.generoMusical + "\n -Año inicio: " +this.anyoDeInicio;
    }
}
