package desafioColecciones;

import java.time.LocalDate;
import java.util.Objects;

public class Reserva {
    private Integer id;
    private Integer numHabitacion;
    private Integer cantidadPersonas;
    private LocalDate fechainicio;
    private LocalDate fechafin;

    public Reserva() {
    }

    public Reserva(Integer id, Integer numHabitacion, Integer cantidadPersonas, LocalDate fechainicio, LocalDate fechafin) {
        this.id = id;
        this.numHabitacion = numHabitacion;
        this.cantidadPersonas = cantidadPersonas;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
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

    public LocalDate getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(LocalDate fechainicio) {
        this.fechainicio = fechainicio;
    }

    public LocalDate getFechafin() {
        return fechafin;
    }

    public void setFechafin(LocalDate fechafin) {
        this.fechafin = fechafin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Reserva reserva)) return false;
        return Objects.equals(getId(), reserva.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", numHabitacion=" + numHabitacion +
                ", cantidadPersonas=" + cantidadPersonas +
                ", fechainicio=" + fechainicio +
                ", fechafin=" + fechafin +
                '}';
    }
}
