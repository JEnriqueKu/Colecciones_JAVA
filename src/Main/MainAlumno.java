package Main;

import java.util.Scanner;

import entidades.Alumno;
import servicios.AlumnoServicio;

public class MainAlumno {

	public static void main(String[] args) {
		AlumnoServicio alumnoServicio = new AlumnoServicio();

		alumnoServicio.crearAlumno();
		System.out.println("Ingrese el nombre del alumno del cual desea calcular su nota final");
		Scanner scanner = new Scanner(System.in);
		String nombreAlumno = scanner.nextLine();
		boolean verificacion = false;
		
		for (Alumno alumno : alumnoServicio.getListaAlumnos()) {
			if (alumno.getNombre().equals(nombreAlumno)) {
				alumnoServicio.notaFinal(alumno);
				verificacion = true;
			}
		}


		
		if (!verificacion) {
			System.out.println("El alumno ingresado no se encuentra en la lista");
		}
		
	}

}
