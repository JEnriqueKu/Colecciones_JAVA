package servicios;

import entidades.Libro;

import java.util.ArrayList;
import java.util.Scanner;

public class LibroService {

    Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    private ArrayList<Libro> libros = new ArrayList<>();
    public Libro crearLibro(){
        System.out.println("Ingrese el título del libro");
        String nombre = scanner.next();
        System.out.println("Ingrese el autor del libro");
        String autor = scanner.next();
        System.out.println("Ingrese la fecha de publicación del libro");
        int fecha = scanner.nextInt();
        Libro libro = new Libro(nombre,autor,fecha);
        libros.add(libro);

        return libro;
    }

    public void fabricaDeLibros(int cantidad){
        for (int i = 0; i < cantidad; i++) {
            Libro libro = new Libro("Libro","Autor",1995);
            libros.add(libro);
        }
    }

    public void mostrarLibros(){
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
}
