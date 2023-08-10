package desafioColecciones;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Hotel {
    Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Habitacion> habitaciones = new ArrayList<>();
    private Set<Reserva> reservas = new HashSet<>();
    public void menu(){
        int opc=0;
        crearHabitaciones();
        do{
            System.out.println("Ingrese una opción: ");
            System.out.println("1.- Agregar reserva");
            System.out.println("2.- Mostrar reservas");
            System.out.println("3.- Mostrar alojamiento");
            System.out.println("4.- Salir");

            opc = scanner.nextInt();
            switch (opc){
                case 1:
                    crearReserva();
                    break;
                case 2:
                    mostrarReservas();
                    break;
                case 3:
                    mostrarAlojamiento();
                    break;
            }
        }while(opc != 4);
    }

    public void crearHabitaciones(){
        habitaciones.add(new Habitacion(1,2,null));
        habitaciones.add(new Habitacion(2,2,null));
        habitaciones.add(new Habitacion(3,2,null));
        habitaciones.add(new Habitacion(4,2,null));
        habitaciones.add(new Habitacion(5,2,null));
        habitaciones.add(new Habitacion(6,3,null));
        habitaciones.add(new Habitacion(7,3,null));
        habitaciones.add(new Habitacion(8,3,null));
        habitaciones.add(new Habitacion(9,1,null));
        habitaciones.add(new Habitacion(10,1,null));
    }

    public void crearReserva(){
        System.out.println("Ingrese el ID de la reserva");
        Integer id= scanner.nextInt();
        System.out.println("Ingrese el numero de habitación donde desea reservar");
        Integer numHabitacion= scanner.nextInt();
        System.out.println("Ingrese la cantidad de personas");
        Integer cantidadPersonas= scanner.nextInt();
        System.out.println("Ingrese la fecha de inicio (año, mes, dia)");

        LocalDate inicio = LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.println("Ingrese la fecha de fin (año, mes, dia)");
        LocalDate fin = LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        boolean ocupado = false;
        for (Reserva reserva : reservas) {
            if (!inicio.isBefore(reserva.getFechainicio())&&!inicio.isAfter(reserva.getFechafin()) &&
                  !fin.isBefore(reserva.getFechainicio())&&!fin.isAfter(reserva.getFechafin()) &&
                    numHabitacion==reserva.getNumHabitacion()){
                ocupado = true;
                break;
            }
        }
        if (!ocupado) reservas.add(new Reserva(id,numHabitacion,cantidadPersonas,inicio,fin));
    }
    
    public void mostrarReservas(){
        for (Reserva reserva : reservas) {
            System.out.println(reserva);
        }
    }
    public void mostrarAlojamiento(){
        for (Habitacion habitacion : habitaciones) {
            String ocupacion="Disponible";
            LocalDate hoy = LocalDate.now();

            for (Reserva reserva : reservas) {
                if (!hoy.isBefore(reserva.getFechainicio())&&!hoy.isAfter(reserva.getFechafin()) &&
                       reserva.getNumHabitacion()==habitacion.getNumHabitacion()){
                    ocupacion="Ocupado" + ", reserva ID: " + reserva.getId();
                    break;
                }
            }

            System.out.println("habitacion: " + habitacion.getNumHabitacion() + ", ocupación: " + ocupacion);
        }
    }

}
