package ejercicioExtra4;

public class CodigoPostal {
    private String pais;
    private Integer codigoPostal;

    public CodigoPostal() {
    }

    public CodigoPostal(String pais, Integer codigoPostal) {
        this.pais = pais;
        this.codigoPostal = codigoPostal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Integer getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(Integer codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        return "CodigoPostal{" + "pais='" + pais + '\'' + ", codigoPostal=" + codigoPostal + '}';
    }
}
