package ejercicio5;

import java.util.*;

public class PaisService {
    Set<Pais> paises = new TreeSet<>();
    Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    public void crearPaises(){
        String respuesta;
        do {
            System.out.println("Ingrese el nombre del pais");
            String nombre = scanner.next();
            Pais p1 = new Pais(nombre);
            paises.add(p1);

            System.out.println("¿Desea agregar otro pais?");
            respuesta= scanner.next();

        } while (respuesta.equalsIgnoreCase("si"));

        mostrarPaises();
    }

    public void mostrarPaises(){
        for (Pais pais : paises) {
            System.out.println(pais);
        }
    }

    public void eliminarPais(){
        Iterator<Pais> pais = paises.iterator();
        boolean esta=false;

        System.out.println("Ingrese el pais que desea eliminar");
        String eliminar=scanner.next();

        while (pais.hasNext()){
            Pais p1 = pais.next();
            if (p1.getNombre().equalsIgnoreCase(eliminar)){
                pais.remove();
                esta=true;
            }
        }

        if (esta){
            System.out.println("\nDespues de eliminar:");
        } else System.out.println("El pais no se encuentra en la lista");

        mostrarPaises();

    }
}
