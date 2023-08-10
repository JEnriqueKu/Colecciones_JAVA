
package ejercicioextra2;

public class CantanteFamoso {
    /*atributos*/
    private String nombre, discoMasVendido;
    
    /*constructor vacio*/
    public CantanteFamoso() {
    }
    /*constructor x parametro*/

    public CantanteFamoso(String nombre, String discoMasVendido) {
        this.nombre = nombre;
        this.discoMasVendido = discoMasVendido;
    }
    
    /*getters*/

    public String getNombre() {
        return nombre;
    }

    public String getDiscoMasVendido() {
        return discoMasVendido;
    }
    
    /*setters*/

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDiscoMasVendido(String discoMasVendido) {
        this.discoMasVendido = discoMasVendido;
    }
    
    /*toString*/

    @Override
    public String toString() {
        return "CantanteFamoso{" + "nombre=" + nombre + ", discoMasVendido=" + discoMasVendido + '}';
    }
    
    
}
