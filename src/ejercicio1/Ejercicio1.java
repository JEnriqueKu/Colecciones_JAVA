package ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio1 {
    /*
    Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
     */

    /*
    Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
     */

    public static void main(String[] args) {
        ArrayList<String> perros = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        String salir;

        do {
            System.out.println("Ingrese un nombre para su perro");
            perros.add(scanner.next());

            System.out.println("¿Desea guardar otro nombre de perro?");
            salir=scanner.next();

        } while (salir.equalsIgnoreCase("si"));

        System.out.println(perros);

        //Ejercicio 2

        System.out.println("Ingrese el nombre de un perro de la lista");
        String perroB = scanner.next();

        Iterator perro = perros.iterator();

        boolean bandera=false;

        while (perro.hasNext()){
            if (perro.next().equals(perroB)){
                perro.remove();
                bandera=true;
            }
        }

        if (!bandera) System.out.println("Su perro no está en la lista");

        System.out.println(perros);

    }
}
