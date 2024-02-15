package main;

import java.util.Scanner;

import objetos.Libro;

public class FormulariosDeDatos {
	
	public static Libro pedirDatosLibro(Scanner scan) {
		
		Libro libro = new Libro();
		
		System.out.println("Introduce el titulo del libro");
		libro.setTitulo(scan.nextLine());
		
		System.out.println("Introduce el autor");
		libro.setAutor(scan.nextLine());
		
		System.out.println("Introduce el numero de paginas");
		libro.setNum_pag(Integer.parseInt(scan.nextLine()));
		
		return libro;
		
	}
	public static Libro modificarDatosLibro(Libro libro, Scanner Scan) {
		return libro;
		
	}
	
	public static int pedirIdLibro(Scanner scan) {
		
		System.out.println("Introduce el Id");
		int id = Integer.parseInt(scan.nextLine());
		
		return id;
		
	}
	
	public static int eliminarIdLibro(Scanner scan) {
	
		System.out.println("Introduce el id");
		int id = Integer.parseInt(scan.nextLine());
		
		return id;
		
	}
	
}
