package desafioColecciones;

import java.time.LocalDate;

public class Habitacion {
    private Integer numHabitacion;
    private Integer capacidad;
    private LocalDate ocupacion;

    public Habitacion() {
    }

    public Habitacion(Integer numHabitacion, Integer capacidad, LocalDate ocupacion) {
        this.numHabitacion = numHabitacion;
        this.capacidad = capacidad;
        this.ocupacion = ocupacion;
    }

    public Integer getNumHabitacion() {
        return numHabitacion;
    }

    public void setNumHabitacion(Integer numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public LocalDate getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(LocalDate ocupacion) {
        this.ocupacion = ocupacion;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "numHabitacion=" + numHabitacion +
                ", capacidad=" + capacidad +
                ", ocupacion=" + ocupacion +
                '}';
    }
}
