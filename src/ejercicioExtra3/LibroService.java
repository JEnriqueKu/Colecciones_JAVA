package ejercicioExtra3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LibroService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Set<Libro> libros = new HashSet();

    public void agregarLibros(){
        String opc = "";
        do{
            System.out.println("Ingrese el titulo: ");
            String titulo = leer.next();
            System.out.println("Ingrese el autor : ");
            String autor = leer.next();
            System.out.println("Ingrese el numero de ejemplares: ");
            int ejemplares = leer.nextInt();


            libros.add(new Libro(titulo, autor, ejemplares));

            System.out.println("Desea agregar un nuevo elemento: ");
            opc = leer.next();

        }while(opc.equalsIgnoreCase("Si"));
    }


    public boolean prestamo(){
        System.out.println("Ingrese el libro deseado: ");
        String libro = leer.next();
        for (Libro x : libros) {
            if(x.getTitulo().equalsIgnoreCase(libro) && x.getEjemplares() > x.getPrestados()){
                    x.setPrestados(x.getPrestados() + 1);
                    return true;
                }
            }

        System.out.println("No hay libros disponibles");
        return false;
    }

    public boolean devolucion(){
        System.out.println("Ingrese el libro deseado: ");
        String libro = leer.next();
        for (Libro x : libros) {
            if(x.getTitulo().equalsIgnoreCase(libro) && x.getPrestados() > 0 ){
                    x.setPrestados(x.getPrestados() - 1);
                    return true;
            }
        }
        System.out.println("No hay libros prestados");
        return false;
    }

    public void mostrarLibros(){
        for (Libro libro : libros) {
            System.out.println("Libro: " + libro.getTitulo() + " Ejemplares: " + libro.getEjemplares() + " Prestados: " + libro.getPrestados());

        }
    }
    public void menu(){
        int opc=0;

        do{
            System.out.println("1.- Agregar libro ");
            System.out.println("2.- Solicitar Libro");
            System.out.println("3.- Devolver Libro");
            System.out.println("4.- Mostrar Libros");
            System.out.println("5.- Salir");
            System.out.println("Ingrese una opción: ");
            opc = leer.nextInt();
            switch (opc){
                case 1:
                    agregarLibros();
                    break;
                case 2:
                    System.out.println(prestamo());
                    break;
                case 3:
                    System.out.println(devolucion());
                    break;
                case 4:
                    mostrarLibros();
                    break;
            }
        }while(opc != 5);
    }


}
