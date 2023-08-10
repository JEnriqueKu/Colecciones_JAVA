package desafioColeccionesV2.entidades;

public class Persona {
    private String nombre, pais;
    private Integer dni, edad;

    public Persona() {
    }

    public Persona(String nombre, String pais, Integer dni, Integer edad) {
        this.nombre = nombre;
        this.pais = pais;
        this.dni = dni;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", dni=" + dni +
                ", edad=" + edad +
                '}';
    }
}
