package desafioColeccionesV2.entidades;

import java.time.LocalDate;
import java.util.ArrayList;

public class Reserva {
    private Integer id, numHabitacion, cantidadPersonas, diasOcupacion;
    private ArrayList<LocalDate> fechas = new ArrayList<>();
    private ArrayList<Persona> personas = new ArrayList<>();
    private Habitacion habitacion;

    public Reserva() {
    }

    public Reserva(Integer id, Integer numHabitacion, Integer cantidadPersonas, Integer diasOcupacion, ArrayList<LocalDate> fechas, ArrayList<Persona> personas, Habitacion habitacion) {
        this.id = id;
        this.numHabitacion = numHabitacion;
        this.cantidadPersonas = cantidadPersonas;
        this.diasOcupacion = diasOcupacion;
        this.fechas = fechas;
        this.personas = personas;
        this.habitacion = habitacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumHabitacion() {
        return numHabitacion;
    }

    public void setNumHabitacion(Integer numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    public Integer getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(Integer cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public Integer getDiasOcupacion() {
        return diasOcupacion;
    }

    public void setDiasOcupacion(Integer diasOcupacion) {
        this.diasOcupacion = diasOcupacion;
    }

    public ArrayList<LocalDate> getFechas() {
        return fechas;
    }

    public void setFechas(ArrayList<LocalDate> fechas) {
        this.fechas = fechas;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", numHabitacion=" + numHabitacion +
                ", cantidadPersonas=" + cantidadPersonas +
                ", diasOcupacion=" + diasOcupacion +
                ", fechas=" + fechas +
                ", habitacion=" + habitacion.getNumHabitacion() +
                '}';
    }
}
