package Main;

import servicios.LibroService;

public class Main {
    public static void main(String[] args) {
        LibroService libroService = new LibroService();

        libroService.fabricaDeLibros(10);
        libroService.mostrarLibros();

    }
}
