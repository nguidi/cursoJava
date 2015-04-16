package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import domain.Post;
import domain.User;

public class MyApp {

	private List<User> users;
	
	public MyApp() {
		
		this.users = new ArrayList<User>();
		
	}
	
	public void run() {
		
		System.out.println("Bienvenido al Foro gato:");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("¿Quien te conoce gato?");
				
		User user = this.nuevoUsuario(scan.next());
		
		System.out.println("Hola don gato, alias "+user.getUsername());
		
		System.out.println("Como se va a llamar tu Post maestro:");
		
		String titulo = scan.next();
		
		System.out.println("Metele algo pa leer:");
		
		String contenido = scan.next();
		
		Post nuevoPost = user.crearPost(titulo,contenido);
		
		nuevoPost.imprimite();
		
		
	}
	
	public User nuevoUsuario(String nombreUsuario) {
		
		User nuevoGato = new User(nombreUsuario);
		
		this.users.add(nuevoGato);
		
		return	nuevoGato;
		
	}

}
