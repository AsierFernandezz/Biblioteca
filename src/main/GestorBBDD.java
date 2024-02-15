package main;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import objetos.Conector;
import objetos.Libro;

public class GestorBBDD extends Conector{

	public void insertarLibro(Libro libro) {
		
		Scanner scan = new Scanner(System.in);
		String sql = "INSERT INTO libros (titulo,autor,num_pag) VALUES (?,?,?)";
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, libro.getTitulo());
			pst.setString(2, libro.getAutor());
			pst.setInt(3, libro.getNum_pag());
			
			pst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public  void eliminarLibro(int id) {
		Scanner scan = new Scanner(System.in);
		
		String sql = "DELETE FROM libros WHERE id = ?";
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, id);
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Se ha eliminado el libro correctamente");
	}
	
	public  Libro getLibro(int id) {
		Scanner  scan = new Scanner(System.in);
		
		String sql = "select * from libros where id = ?";
		
		Libro libro = new Libro();
		try {
			
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			
			rs.next();
			libro.setId(rs.getInt("id"));
			libro.setTitulo(rs.getString("titulo"));
			libro.setAutor(rs.getString("autor"));
			libro.setNum_pag(rs.getInt("num_pag"));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return libro;
	}
	
	public ArrayList<Libro> mostrarLibros() {
		
		ArrayList<Libro> libros = new ArrayList<Libro>();
		String sql = "select * from libros";
		
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			
			while(rs.next()) {
				Libro l = new Libro();
				
				l.setId(rs.getInt("id"));
				l.setTitulo(rs.getString("titulo"));
				l.setAutor(rs.getString("autor"));
				l.setNum_pag(rs.getInt("num_pag"));
				
				libros.add(l);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return libros;
		
	}
	
	public void modificarDatos() {
		
	}
	
}
	

