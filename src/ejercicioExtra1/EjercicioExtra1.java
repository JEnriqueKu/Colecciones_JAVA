package ejercicioExtra1;

import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioExtra1 {

        ArrayList<Integer> valoresA = new ArrayList();
        Scanner leer = new Scanner(System.in);

        public void introducirValores(){
            System.out.println("Ingrese los valores que desee y para terminar solo ingrese -99 ");
            int numero;
            while ((numero =leer.nextInt())!= -99){
                valoresA.add(numero);
            }
        }
        public int sumarValores(){
            int suma = 0;
            for (int num:valoresA){
                suma+= num;
            }
            return suma;
        }
        public void proValores(){
            int suma=sumarValores();
            System.out.println("El promedio de los valores ingresados es: ");
            double promedio = suma / valoresA.size();
            System.out.println(promedio);
        }

}
