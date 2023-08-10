package servicios;

import entidades.Alumno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class AlumnoServicio {

	private List<Alumno> listaAlumnos;

	public AlumnoServicio() {
		this.listaAlumnos = new ArrayList<Alumno>();
	}

	public List<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}

	public void setListaAlumnos(List<Alumno> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}
	
	public void crearAlumno() {
		Scanner sc = new Scanner(System.in);
		String respuesta = "";
		do {
		List<Integer> listaNotas = new ArrayList<>();
		System.out.println("Vamos a crear un alumno, para ello necesitamos su nombre y sus 3 notas");
		System.out.println("Ingrese el nombre del alumno");
		String nombre = sc.next();
		System.out.println("Ingrese la nota n� 1");
		int notaUno = sc.nextInt();
		System.out.println("Ingrese la nota n� 2");
		int notaDos = sc.nextInt();
		System.out.println("Ingrese la nota n� 3");
		int notaTres = sc.nextInt();
		listaNotas.add(notaUno);
		listaNotas.add(notaDos);
		listaNotas.add(notaTres);
		Alumno alumno = new Alumno(nombre, listaNotas);
		listaAlumnos.add(alumno);
		System.out.println("Desea crear otro alumno? (S/N)");
		respuesta = sc.next();
		} while (respuesta.equalsIgnoreCase("S"));
		System.out.println(listaAlumnos);
	}
	
	public void notaFinal(Alumno alumno) {
		int contador = 0;
		int sumatoria = 0;
		for (Integer nota : alumno.getListaNotas()) {
			sumatoria += nota;
			contador += 1;
		}
		double promedio = (double) sumatoria/contador;
		
		System.out.println("El promedio final de las notas de este alumno es: "+ promedio);
	}
}
