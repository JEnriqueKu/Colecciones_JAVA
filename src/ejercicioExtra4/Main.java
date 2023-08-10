package ejercicioExtra4;

public class Main {
    public static void main(String[] args) {
        CodigoPostalService cps = new CodigoPostalService();

        cps.crearCP();
        cps.mostrarCodigosPostales();
        cps.buscarCiudad();
        cps.eliminarCiudad();
        cps.eliminarCiudad();
        cps.mostrarCodigosPostales();
    }
}
