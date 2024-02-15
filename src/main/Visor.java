package main;

import java.util.ArrayList;
import java.util.Scanner;

import objetos.Libro;

public class Visor {
	
	public static void verLibros(ArrayList<Libro> libros) {
		for (Libro libro : libros) {
			System.out.println(libro);
		}
		
	}
	
	public static void mostrarLibro(Libro libro) {

		System.out.println(libro);
		
	}

	public static void mostrarMensaje(String mensaje) {
		
	}
	
}

