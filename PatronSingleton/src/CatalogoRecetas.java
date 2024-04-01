
import java.util.ArrayList;
import java.util.List;
public class CatalogoRecetas {
    private static CatalogoRecetas recetas;
   private List<Receta> nombre;


    private CatalogoRecetas(){
        nombre = new ArrayList<>();

    }
    public static CatalogoRecetas getReceta() {
        if (recetas == null) {
            recetas = new CatalogoRecetas();
        }
        return recetas;
    }


    public void aniadirReceta(Receta receta) {
        nombre.add(receta);
        System.out.println("Receta añadida!!");
    }

    public Receta buscarReceta(String recetaBuscada) {
        for (Receta receta : nombre) {
            if(receta.getNombre().equals(recetaBuscada)) {
                return receta;
            }

        }
        return null;
    }

    public void listarRecetas() {
        System.out.println("-------- Recetas --------");

        for (Receta receta : nombre) {
            System.out.println(receta);
        }
    }
}

class Receta {
    private String nombre;
    private List<String> listaIngredientes;
    private List <String> pasosPreparacion;

    public Receta(String nombre, List<String> listaIngredientes, List<String> pasosPreparacion) {
        this.nombre = nombre;
        this.listaIngredientes = listaIngredientes;
        this.pasosPreparacion = pasosPreparacion;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "-Nombre: " + nombre + "\n -Ingredientes: "+ listaIngredientes + "\n Pasos de preparación: " + pasosPreparacion;
    }
}
