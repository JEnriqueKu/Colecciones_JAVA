package ejercicio6;

public class Producto {
    private Integer key;
    private String nombre;
    private Double precio;

    public Producto() {
    }

    public Producto(Integer key, String nombre, Double precio) {
        this.key = key;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "key=" + key +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
