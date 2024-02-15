package main;


public class Menu {
	
	//mostrarMenuPrincipal()
	static final int GESTIONAR_LIBROS = 1;
	static final int GESTIONAR_SOCIOS = 2;
	static final int GESTIONAR_PRESTAMOS = 3;
	
	static final int SALIR = 0;
	
	//mostrarMenuLibros()
	static final int INSERTAR_LIBROS = 1;
	static final int ELIMINAR_LIBROS = 2;
	static final int MODIFICAR_LIBROS = 3;
	static final int MOSTRAR_LIBROS = 4;
	static final int VER_LIBRO = 5;
	
	//mostrarMenuSocios()
	static final int INSERTAR_SOCIOS = 1;
	static final int ELIMINAR_SOCIOS = 2;
	static final int MODIFICAR_SOCIOS = 3;
	static final int MOSTRAR_SOCIOS = 4;
	
	//mostrarMenuPrestamos()
	static final int INSERTAR_PRESTAMOS = 1;
	static final int ELIMINAR_PRESTAMOS = 2;
	static final int MODIFICAR_PRESTAMOS = 3;
	static final int MOSTRAR_PRESTAMOS = 4;
	
	
	public static void mostarMenuPrincipal() {
	
		System.out.println("--MENU--");
		System.out.println(GESTIONAR_LIBROS + "- Gestionar los libros de la biblioteca");
		System.out.println(GESTIONAR_SOCIOS + "- Gestionar los socios de la biblioteca");
		System.out.println(GESTIONAR_PRESTAMOS + "- Gestionar los prestamos de la biblioteca");
		System.out.println(SALIR + "- Salir");
	}
	
	public static void mostarMenuLibros() {
		
		System.out.println("--MENU--");
		System.out.println(INSERTAR_LIBROS + "- Insertar libros");
		System.out.println(ELIMINAR_LIBROS + "- Eliminar libros");
		System.out.println(MODIFICAR_LIBROS + "-Modificar libros");
		System.out.println(MOSTRAR_LIBROS + "- Mostrar todos los libros");
		System.out.println(VER_LIBRO + "- Muestra un libro");
		System.out.println(SALIR + "- Salir");
		
	}
	
	public static void mostrarMenuSocios() {
		
		System.out.println("--MENU--");
		System.out.println(INSERTAR_SOCIOS +"- Insertar socios");
		System.out.println(ELIMINAR_SOCIOS + "- Eliminar socios");
		System.out.println(MODIFICAR_SOCIOS + "- Modificar socios");
		
	}
	
	public static void mostrarMenuPrestamos() {
		
		System.out.println("--MENU--");
		System.out.println(INSERTAR_PRESTAMOS + "- Insertar prestamos");
		System.out.println(ELIMINAR_PRESTAMOS + "- Eliminar prestamos");
		System.out.println(MODIFICAR_PRESTAMOS + "-Modificar prestamos");
		
	}
}
