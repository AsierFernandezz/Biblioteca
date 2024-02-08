package main;

import java.util.ArrayList;
import java.util.Scanner;

import objetos.Libro;

public class GestorLibros {

	public static void run (Scanner scan) {
		
		int opcion;
		
		do {
			
			Menu.mostarMenuLibros();
			opcion = Integer.parseInt(scan.nextLine());
			
			switch (opcion) {
			
			case Menu.INSERTAR_LIBROS: 
				System.out.println("Insertar socio");
				break;
				
			case Menu.ELIMINAR_LIBROS:
				System.out.println("insertar socio");
				break;
				
			case Menu.MODIFICAR_LIBROS:
				System.out.println("insertar socio");
				break;
				
			case Menu.MOSTRAR_LIBROS:
				ArrayList<Libro> libros = GestorBBDD.getLibro(id);
				
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcion);
			}
			
		}while(opcion != Menu.SALIR);
	}

}
