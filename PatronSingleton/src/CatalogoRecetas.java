
import java.util.ArrayList;
public class CatalogoRecetas {
    private static CatalogoRecetas recetas;

   private ArrayList <String> nombre = new ArrayList<>();
    private ArrayList<String> listaIngredientes = new ArrayList<>();
    private ArrayList <String> pasosPreparacion = new ArrayList<>();

    public static CatalogoRecetas getReceta(ArrayList<String> nombre, ArrayList<String> listaIngredientes, ArrayList<String> pasosPreparacion) {
        if (recetas == null) {
            recetas = new CatalogoRecetas(nombre, listaIngredientes, pasosPreparacion);
        }
        return recetas;
    }
    private CatalogoRecetas(ArrayList<String> nombre, ArrayList<String> listaIngredientes, ArrayList<String> pasosPreparacion){
       this.nombre = nombre;
       this.listaIngredientes = listaIngredientes;
       this.pasosPreparacion = pasosPreparacion;
    }

    public void aniadirReceta(String content) {
        nombre.add(content);
        System.out.println("Receta añadida");
    }

    public String buscarReceta(String recetaBuscada) {
        for (int i = 0; i < nombre.size(); i++) {
            if(nombre.get(i) == recetaBuscada) {
                return nombre.get(i);
            }

        }
        return "No se ha encontrado la receta";
    }

    public void listarRecetas() {
        for (int i = 0; i < nombre.size(); i++) {
            System.out.println("Nombre receta: " + nombre.get(i));
        }
    }



}
