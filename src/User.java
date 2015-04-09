import java.util.ArrayList;
import java.util.List;


public class User {

	//	Atributo: Nombre del Usuario
	private	String username;
	//	Atributo: Posts del usuario
	private List<Post> posts;
	
	//	Constructor de User
	public	User(String nuevoNombre) {
		//	Inicializo los posts del usuario.
		this.posts = new ArrayList<Post>();
		//	Inicializamos el nombre del usuario
		this.username = nuevoNombre;
	}
	
	//	Creara un Post del Usuaro
	public void crearPost(String tituloDelPost, String contenidoDelPost) {
		//	Intento crear un nuevo post
		try {
			//	Creo un nuevo post
			Post nuevoPost = new Post(tituloDelPost, contenidoDelPost);
			//	Lo agrego al listado de Posts del usuario
			this.posts.add(nuevoPost);
		//	Si ocurrio un error
		} catch(Exception e) {
			//	Imprimo un aviso
			System.out.println("Ocurrio un error al crear un nuevo post");
		}
		//	Avisamos que se creo el post
		System.out.println("Post creado satisfactoriamente.");
	}

}
