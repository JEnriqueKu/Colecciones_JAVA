import java.util.Objects;

public class PersonaEjemplo implements Comparable<PersonaEjemplo>{
    private String name;
    private Integer edad;

    public PersonaEjemplo() {
    }

    public PersonaEjemplo(String name, Integer edad) {
        this.name = name;
        this.edad = edad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonaEjemplo that)) return false;
        return Objects.equals(getName(), that.getName()) && Objects.equals(getEdad(), that.getEdad());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getEdad());
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public int compareTo(PersonaEjemplo o) {
        return this.name.compareTo(o.getName());
    }
}
