package entidades;

public class Libro {
    private String titulo;
    private String autor;
    private int year;

    public Libro() {
    }

    public Libro(String titulo, String autor, int year) {
        this.titulo = titulo;
        this.autor = autor;
        this.year = year;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", year=" + year +
                '}';
    }
}
