package ejercicio4;

public class Main {
    public static void main(String[] args) {
        PeliculaService ps = new PeliculaService();

        ps.crearPeliculas();
        ps.mostrarPeliculas();
        ps.mostrarPeliculasMayoresHora();

        ps.ordenarPeliculasDescendente();
        ps.mostrarPeliculas();

        ps.ordenarPeliculasAscendente();
        ps.mostrarPeliculas();

        ps.ordenarPeliculasTitulo();
        ps.mostrarPeliculas();

        ps.ordenarPeliculasDirector();
        ps.mostrarPeliculas();
    }
}
