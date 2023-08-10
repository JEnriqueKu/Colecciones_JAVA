
package ejercicioextra2;
import java.util.ArrayList;
import java.util.Scanner;

public class CantanteFamosoService {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public void menu(ArrayList <CantanteFamoso> lista){
        int respuesta;
        do{
            System.out.println("Seleccione una opcion");
            System.out.println("---------------------");
            System.out.println("1- Agregar cantantes");
            System.out.println("2- Mostrar cantantes");
            System.out.println("3- Eliminar cantantes");
            System.out.println("4- Salir");
           respuesta = read.nextInt();
            
            switch (respuesta){
                case 1:
                    crearCantante(lista);
                    break;
                case 2:
                    mostrarCantante(lista);
                    break;
                case 3:
                    eliminarCantante(lista);
                    break;
            }
            
        } while (respuesta < 4);
    }
    public void crearCantante(ArrayList <CantanteFamoso> lista){
        CantanteFamoso cantante = new CantanteFamoso();
        System.out.println("Ingrese el nombre del cantante");
        cantante.setNombre(read.next());
        System.out.println("Ingresa el disco mas vendido del cantante");
        cantante.setDiscoMasVendido(read.next());
        lista.add(cantante);     
    }
    
    public void mostrarCantante(ArrayList <CantanteFamoso> lista){
        for(CantanteFamoso cantantes:lista){
            System.out.println(cantantes);
        }
        
    }
    
    public void eliminarCantante(ArrayList <CantanteFamoso> lista){
        System.out.println("Ingrese el cantante que desea eliminar");
        String eliminar = read.next(); 
        for (CantanteFamoso cantanteFamoso : lista) {
            if(cantanteFamoso.getNombre().equalsIgnoreCase(eliminar)){
               lista.remove(cantanteFamoso);
            }
        }
    }
}
