package ejercicio6;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Tienda {
    Map<Integer,Producto> productos = new HashMap<>();
    Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    public void menu() {
        int respuesta;
        do {
            System.out.println("Seleccione una opcion del siguiente menú");
            System.out.println("---------------");
            System.out.println("1.- Ingresar elemento");
            System.out.println("2.- Modificar elemento");
            System.out.println("3.- Eliminar elemento");
            System.out.println("4.- Mostrar elementos");
            System.out.println("5.- Salir");
            respuesta = scanner.nextInt();

            switch (respuesta) {
                case 1:
                    introducirElemento();
                    break;
                case 2:
                    modificarPrecio();
                    break;
                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    mostrarProductos();
            }

        } while (respuesta < 5);
        System.out.println("Gracias hasta luego");
    }
    public void introducirElemento(){

        System.out.println("Ingrese el nombre del producto");
        String nombre = scanner.next();
        System.out.println("Ingrese el key del producto");
        Integer key = scanner.nextInt();
        System.out.println("Ingrese el precio del producto");
        Double precio = scanner.nextDouble();
        Producto p1 = new Producto(key,nombre,precio);

        productos.put(key,p1);
    }

    public void mostrarProductos(){
        for (Entry<Integer, Producto> aux : productos.entrySet()) {
            System.out.println(aux);
        }
    }

    public void modificarPrecio(){
        System.out.println("Ingrese la key del producto que desee modificar");
        Integer key = scanner.nextInt();
        System.out.println("Ingrese el precio nuevo del producto");
        Double precio = scanner.nextDouble();

        for (Entry<Integer,Producto> aux : productos.entrySet()){

            if (aux.getKey()==key) aux.getValue().setPrecio(precio);
        }
    }

    public void eliminarProducto(){
        System.out.println("Ingrese la key del producto que desee eliminar");
        Integer key = scanner.nextInt();

        for (Entry<Integer,Producto> aux : productos.entrySet()){
            if (aux.getKey()==key) productos.remove(aux.getKey());
        }
    }
}
