package desafioColeccionesV2.entidades;

import java.util.ArrayList;

public class Alojamiento {
    private ArrayList<Habitacion> habitaciones;
    private ArrayList<Reserva> reservas;

    public Alojamiento() {
    }

    public Alojamiento(ArrayList<Habitacion> habitaciones, ArrayList<Reserva> reservas) {
        this.habitaciones = habitaciones;
        this.reservas = reservas;
    }

    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    @Override
    public String toString() {
        return "Alojamiento{" +
                "habitaciones=" + habitaciones +
                ", reservas=" + reservas +
                '}';
    }
}
