abstract class Paso {
    public String nombre="";

    public Paso(String nombre) {
        this.nombre= nombre;

    }
    public abstract String mostrarEstilo();


    public String getNombre() {
        return nombre;
    }

}
