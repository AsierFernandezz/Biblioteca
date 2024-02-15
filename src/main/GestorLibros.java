package main;

import java.util.ArrayList;
import java.util.Scanner;

import objetos.Libro;

public class GestorLibros {


	public static void run (Scanner scan) {

		int opcion;
		
		GestorBBDD gestorbbdd = new GestorBBDD();
		
		do {
			
			Menu.mostarMenuLibros();
			opcion = Integer.parseInt(scan.nextLine());
			
			switch (opcion) {
			
			case Menu.INSERTAR_LIBROS: 
				gestorbbdd.conectar();
				gestorbbdd.insertarLibro(FormulariosDeDatos.pedirDatosLibro(scan));
				gestorbbdd.cerrar();
				break;
				
			case Menu.ELIMINAR_LIBROS:
				int id = FormulariosDeDatos.eliminarIdLibro(scan);
				gestorbbdd.conectar();
				gestorbbdd.eliminarLibro(id);
				gestorbbdd.cerrar();
				break;
				
			case Menu.MODIFICAR_LIBROS:
				//pedir id
				//mostrar info visor
				//pedirDatos
				break;
				
			case Menu.MOSTRAR_LIBROS:
				gestorbbdd.conectar();
				Visor.verLibros( gestorbbdd.mostrarLibros());
				gestorbbdd.cerrar();
				break;
				
			case Menu.VER_LIBRO:
				//pedir id y recoger en una variable
				id = FormulariosDeDatos.pedirIdLibro(scan);
				
				//con la id conectar, conseguir el libro y recoger en variable
				gestorbbdd.conectar();
				Libro libro = gestorbbdd.getLibro(id);
				gestorbbdd.cerrar();
				
				//visor.mostrar
				Visor.mostrarLibro(libro);
				break;
				
			case Menu.SALIR:
				break;
				
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcion);
			}
			
		}while(opcion != Menu.SALIR);
	}

}
