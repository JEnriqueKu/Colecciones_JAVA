package desafioColeccionesV2;

import desafioColeccionesV2.entidades.Alojamiento;
import desafioColeccionesV2.entidades.Habitacion;
import desafioColeccionesV2.entidades.Persona;
import desafioColeccionesV2.entidades.Reserva;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Hotel {
    Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Reserva> reservas = new ArrayList<>();
    ArrayList<Habitacion> habitaciones = new ArrayList<>();
    Alojamiento alojamiento = new Alojamiento(habitaciones, reservas);


    public void mostrarAlojamiento(){

        for (Habitacion habitaciones : alojamiento.getHabitaciones()) {
            for (Reserva reserva : alojamiento.getReservas()) {
                if (reserva.getFechas().contains(LocalDate.now()) &&
                        Objects.equals(reserva.getNumHabitacion(), habitaciones.getNumHabitacion())) {
                    habitaciones.setFechaOcupacion(reserva.getFechas().get(0));
                    habitaciones.setHuespedes(reserva.getPersonas());
                }
            }
        }

        for (Habitacion habitaciones : alojamiento.getHabitaciones()) {
            System.out.println(habitaciones);
        }
    }

    public void crearHabitaciones(){
        habitaciones.add(new Habitacion(1,"Hasta 2 personas",null,null));
        habitaciones.add(new Habitacion(2,"Hasta 2 personas",null,null));
        habitaciones.add(new Habitacion(3,"Hasta 2 personas",null,null));
        habitaciones.add(new Habitacion(4,"Hasta 2 personas",null,null));
        habitaciones.add(new Habitacion(5,"Hasta 2 personas",null,null));
        habitaciones.add(new Habitacion(6,"Hasta 3 personas",null,null));
        habitaciones.add(new Habitacion(7,"Hasta 3 personas",null,null));
        habitaciones.add(new Habitacion(8,"Hasta 3 personas",null,null));
        habitaciones.add(new Habitacion(9,"Hasta 1 personas",null,null));
        habitaciones.add(new Habitacion(10,"Hasta 1 personas",null,null));
    }

    public void crearReserva(){
        Reserva reserva = new Reserva();
        System.out.println("Ingrese el ID de la reserva");
        reserva.setId(scanner.nextInt());
        System.out.println("Ingrese el número de habitación");
        reserva.setNumHabitacion(scanner.nextInt());
        reserva.setHabitacion(habitaciones.get(reserva.getNumHabitacion()-1));
        System.out.println("Ingrese la cantidad de personas " + "(" +reserva.getHabitacion().getCapacidadMaxima()+ ")");
        reserva.setCantidadPersonas(scanner.nextInt());
        agregarPersonasAReserva(reserva.getCantidadPersonas(),reserva);
        System.out.println("Ingrese la fecha de ocupación (año, mes y día)");
        reserva.getFechas().add(LocalDate.of(scanner.nextInt(),scanner.nextInt(), scanner.nextInt()));
        System.out.println("Ingrese los dias que se ocupará la habitación");
        reserva.setDiasOcupacion(scanner.nextInt());
        for (int i = 1; i < reserva.getDiasOcupacion(); i++) {
            reserva.getFechas().add(reserva.getFechas().get(0).plusDays(i));
        }
        reservas.add(reserva);
    }

    public void agregarPersonasAReserva(int numeroPersonas, Reserva reserva){
        for (int i = 0; i < numeroPersonas; i++) {
            Persona p1 = new Persona();
            System.out.println("Ingrese el nombre de la persona "+(i+1));
            p1.setNombre(scanner.next());
            System.out.println("Ingrese la edad de la persona "+(i+1));
            p1.setEdad(scanner.nextInt());
            System.out.println("Ingrese el DNI de la persona "+(i+1));
            p1.setDni(scanner.nextInt());
            System.out.println("Ingrese el pais de la persona "+(i+1));
            p1.setPais(scanner.next());
            reserva.getPersonas().add(p1);
        }
    }

    public void mostrarReservas(){
        for (Reserva reserva : reservas) {
            System.out.println(reserva);
        }
    }

    public void mostrarHabitaciones(){
        for (Habitacion habitaciones : habitaciones) {
            System.out.println(habitaciones);
        }
    }

    public void menu(){
        int opc=0;
        crearHabitaciones();
        do{
            System.out.println("Ingrese una opción: ");
            System.out.println("1.- Agregar reserva");
            System.out.println("2.- Mostrar reservas");
            System.out.println("3.- Mostrar alojamiento");
            System.out.println("4.- Mostrar habitaciones");
            System.out.println("5.- Salir");

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
                case 4:
                    mostrarHabitaciones();
                    break;
                case 5:
                    break;
            }
        }while(opc != 5);
    }
}
