package ejercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PeliculaService {

    ArrayList<Pelicula> peliculas = new ArrayList<>();
    Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    public void crearPeliculas(){
        String respuesta;

        do {


            System.out.println("Ingrese el título de la pelicula");
            String titulo = scanner.next();
            System.out.println("Ingrese el director de la pelicula");
            String director = scanner.next();
            System.out.println("Ingrese la duración de la pelicula");
            Double duracion = scanner.nextDouble();
            Pelicula p1 = new Pelicula(titulo,director,duracion);

            peliculas.add(p1);

            System.out.println("¿Desea agregar otra pelicula?");
            respuesta = scanner.next();


        } while (respuesta.equalsIgnoreCase("si"));

    }

    public void mostrarPeliculas(){
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }

    public void mostrarPeliculasMayoresHora(){
        System.out.println("\nLas peliculas mayores a una hora son: ");
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracion()>1) System.out.println(pelicula);
        }
    }

    public void ordenarPeliculasDescendente(){
        Collections.sort(peliculas,Comparators.compararDuracionDescendente);
    }

    public void ordenarPeliculasAscendente(){
        Collections.sort(peliculas,Comparators.compararDuracionAscendente);
    }

    public void ordenarPeliculasTitulo(){
        Collections.sort(peliculas,Comparators.compararTitulo);
    }

    public void ordenarPeliculasDirector(){
        Collections.sort(peliculas,Comparators.compararDirector);
    }
}
