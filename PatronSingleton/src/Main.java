import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        CatalogoRecetas recetas = CatalogoRecetas.getReceta();
        boolean terminar = false;

        recetas.aniadirReceta(new Receta("Gazpacho", List.of("Tomate", "Pepino", "Pimiento", "Cebolla", "Ajo", "Vinagre", "Aceite de oliva", "Sal", "Pan"), List.of("Batir los tomates", "Verter el vinagre", "Machacar los ajos")));
        recetas.aniadirReceta(new Receta("Chipirones Rebozados", List.of("400 gramos de chipirón fresco o congelado", " 1 taza de harina de trigo", "1 taza de harina de maíz", " 3 vasos de aceite de girasol", "sal al gusto"), List.of("Pon los chipirones ya limpios sobre un papel secante", "Prepara un taza de maíz y otra de harina de trigo", "En una bolsa de plástico, introduce los chipirones y las 2 tazas de harina", " Fríe los chipirones durante 4 minutos", "Saca los chipirones")));

        while(terminar != true) {
            System.out.println("Elija una opción:");
            System.out.println("-----------------");
            System.out.println("1.- Listar recetas");
            System.out.println("2.- Añadir receta");
            System.out.println("3.- Buscar receta");
            System.out.println("4.- Salir");
            String opc = sc.nextLine();

            switch(opc) {
                case "1":
                    recetas.listarRecetas();
                break;
                case "2":
                    System.out.println("Nombre de la receta:");
                    String nombreReceta = sc.nextLine();
                    System.out.println("Ingrese los ingredientes de la receta:");
                    String ingredientes = sc.nextLine();
                    System.out.println("Redactame los pasos de preparación:");
                    String preparacion = sc.nextLine();
                    recetas.aniadirReceta(new Receta(nombreReceta, List.of(ingredientes), List.of(preparacion)));
                    break;
                case "3":
                    System.out.println("Nombre de la receta a buscar:");
                    String recetaBuscar = sc.nextLine();
                    Receta recetaParaBuscar = recetas.buscarReceta(recetaBuscar);
                    if (recetaParaBuscar != null) {
                        System.out.println("Receta: " + recetaParaBuscar);
                    } else {
                        System.out.println("No hay ninguna receta con ese nombre");
                    }
                    break;
                case "4":
                    terminar = true;
                    break;
            }
        }
    }
}