package desafioColeccionesV2.entidades;

import java.time.LocalDate;
import java.util.ArrayList;

public class Habitacion {
    private Integer numHabitacion;
    private String capacidadMaxima;
    private LocalDate fechaOcupacion;
    private ArrayList<Persona> huespedes = new ArrayList<>();

    public Habitacion() {
    }

    public Habitacion(Integer numHabitacion, String capacidadMaxima, LocalDate fechaOcupacion, ArrayList<Persona> huespedes) {
        this.numHabitacion = numHabitacion;
        this.capacidadMaxima = capacidadMaxima;
        this.fechaOcupacion = fechaOcupacion;
        this.huespedes = huespedes;
    }

    public Integer getNumHabitacion() {
        return numHabitacion;
    }

    public void setNumHabitacion(Integer numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    public LocalDate getFechaOcupacion() {
        return fechaOcupacion;
    }

    public void setFechaOcupacion(LocalDate fechaOcupacion) {
        this.fechaOcupacion = fechaOcupacion;
    }

    public ArrayList<Persona> getHuespedes() {
        return huespedes;
    }

    public void setHuespedes(ArrayList<Persona> huespedes) {
        this.huespedes = huespedes;
    }

    public String getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(String capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "numHabitacion=" + numHabitacion +
                ", capacidadMaxima='" + capacidadMaxima + '\'' +
                ", fechaOcupacion=" + fechaOcupacion +
                ", huespedes=" + huespedes +
                '}';
    }
}
