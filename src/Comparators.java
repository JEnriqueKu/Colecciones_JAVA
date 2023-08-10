import java.util.Comparator;

public class Comparators {

    public static Comparator<PersonaEjemplo> compararEdad = new Comparator<PersonaEjemplo>() {
        @Override
        public int compare(PersonaEjemplo o1, PersonaEjemplo o2) {
            return o1.getEdad().compareTo(o2.getEdad());
        }
    };

    public static Comparator<PersonaEjemplo> compararEdadInvertida = new Comparator<PersonaEjemplo>() {
        @Override
        public int compare(PersonaEjemplo o1, PersonaEjemplo o2) {
            return o2.getEdad().compareTo(o1.getEdad());
        }
    };

    public static Comparator<PersonaEjemplo> compararNombre = new Comparator<PersonaEjemplo>() {
        @Override
        public int compare(PersonaEjemplo o1, PersonaEjemplo o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
}
