import java.util.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nombre = new ArrayList<>(Arrays.asList("Gazpacho"));
        ArrayList<String> ingredientes = new ArrayList<>(Arrays.asList("tomate", "vinagre", "ajo"));
        ArrayList<String> pasos = new ArrayList<>(Arrays.asList("Batir los tomates", "Verter el vinagre", "Machacar los ajos"));
        CatalogoRecetas recetas = CatalogoRecetas.getReceta(nombre, ingredientes, pasos);

        recetas.aniadirReceta("Serranito");
        recetas.listarRecetas();
        System.out.println(recetas.buscarReceta("Gazpacho"));

    }
}