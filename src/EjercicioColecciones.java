import java.util.*;

public class EjercicioColecciones {

    public static void main(String[] args) {
        // ArrayList

        ArrayList<Character> letters = new ArrayList<>();
        letters.add('E');
        letters.add('C');
        //System.out.println(letters);

        Iterator letter = letters.iterator();

        while (letter.hasNext()){
            Character c = (Character) letter.next();
            //if (c.equals('E')) System.out.println(c);
        }

        ArrayList<PersonaEjemplo> personas = new ArrayList<>();
        PersonaEjemplo enrique = new PersonaEjemplo("Enrique",27);
        PersonaEjemplo celeste = new PersonaEjemplo("Celeste",24);
        PersonaEjemplo angel = new PersonaEjemplo("Angel",28);
        personas.add(enrique);
        personas.add(celeste);
        personas.add(angel);

        //Collections.sort(personas,Comparators.compararEdad);
        for (PersonaEjemplo persona : personas) {
            //System.out.println(persona);
        }

        // Set

        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        numbers.add(9);
        numbers.add(5);
        //System.out.println(numbers);

        Iterator<Integer> number = numbers.iterator();

        while (number.hasNext()){
            Integer num = number.next();
            //if (num==3) System.out.println(num);
        }

        Set<PersonaEjemplo> personasSet = new HashSet<>();
        personasSet.addAll(personas);
        ArrayList<PersonaEjemplo> personaSetAL = new ArrayList<>(personasSet);
        Collections.sort(personaSetAL,Comparators.compararEdadInvertida);

        for (PersonaEjemplo persona : personaSetAL) {
            //System.out.println(persona);
        }

        Set<PersonaEjemplo> personasTreeSet = new TreeSet<>(Comparators.compararEdad);
        personasTreeSet.addAll(personas);

        for (PersonaEjemplo personaEjemplo : personasTreeSet) {
            System.out.println(personaEjemplo);
        }

        // Maps

        HashMap<Integer,String> nombres = new HashMap<>();
        nombres.put(141195,"Enrique");
        nombres.put(80898,"Janeth");
        nombres.put(140195,"Angel");
        nombres.put(60799,"Celeste");
        //System.out.println(nombres);


    }
}
