package ejercicioExtra4;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class CodigoPostalService {
    Map<Integer, CodigoPostal> codigosPostales = new HashMap<>();
    Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    public void crearCP() {
        String opc = "";
        do {
            System.out.println("Ingrese el pais: ");
            String pais = scanner.next();
            System.out.println("Ingrese el código postal : ");
            Integer codigoPostal = scanner.nextInt();


            CodigoPostal codigoPostal1 = new CodigoPostal(pais, codigoPostal);
            codigosPostales.put(codigoPostal1.getCodigoPostal(), codigoPostal1);

            System.out.println("Desea agregar un nuevo elemento: ");
            opc = scanner.next();

        } while (opc.equalsIgnoreCase("Si"));

    }

    public void mostrarCodigosPostales(){
        for (Entry<Integer, CodigoPostal> aux : codigosPostales.entrySet()) {
            System.out.println("Pais: " + aux.getValue().getPais() + ", " + "código postal: " + aux.getKey());
        }
    }

    public void buscarCiudad(){
        System.out.println("Ingrese el codigo póstal del pais que desea buscar");
        int cp = scanner.nextInt();
        boolean encontro = false;

        for (Entry<Integer, CodigoPostal> aux : codigosPostales.entrySet()) {
            if (aux.getKey()==cp){
                System.out.println(aux.getValue().getPais());
                encontro=true;
                break;
            }
        }
        if (!encontro) System.out.println("No se encontró el código postal");

    }

    public void eliminarCiudad(){
        System.out.println("Ingrese el pais que desea eliminar");
        String pais = scanner.next();
        boolean encontro = false;


        for (Entry<Integer, CodigoPostal> aux : codigosPostales.entrySet()) {
            if (aux.getValue().getPais().equalsIgnoreCase(pais)){
                codigosPostales.remove(aux.getKey());
                System.out.println("Se eliminó " + aux.getValue().getPais());
                encontro=true;
                break;
            }
        }
        if (!encontro) System.out.println("No se encontró el pais");
    }
}