package main;

import java.util.Scanner;

import objetos.Libro;

public class GestorBiblioteca {

	public static void run() {

		Scanner scan = new Scanner(System.in);
		
		int menu;
		
		do {
			
			Menu.mostarMenuPrincipal();
			menu = Integer.parseInt(scan.nextLine());
			
			switch (menu) {
			case Menu.GESTIONAR_LIBROS:
				GestorLibros.run(scan);
				break;
			
			case Menu.GESTIONAR_SOCIOS:
				break;
			
			case Menu.GESTIONAR_PRESTAMOS:
				break;
			
			case Menu.SALIR:
				break;
				
			default:
				throw new IllegalArgumentException("Unexpected value: " + menu);
			}
			
		}while(menu != Menu.SALIR);
		
	}

	
	
}
