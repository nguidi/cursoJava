package domain;
import java.util.ArrayList;
import java.util.List;

/**
 * @class	User
 * @type	Model
 * @desc	Usuario del sistema
 * @attr
 * 		username	::String
 * 		posts		::List<Post>
 */

public class User {

	// Atributo: Nombre del Usuario
	private String username;
	// Atributo: Posts del usuario
	private List<Post> posts;

	// Constructor de User
	public User(String nuevoNombre) {
		// Inicializo los posts del usuario.
		this.setPosts(new ArrayList<Post>());
		// Inicializamos el nombre del usuario
		this.setUsername(nuevoNombre);
	}

	// Creara un Post del Usuaro
	public Post crearPost(String tituloDelPost, String contenidoDelPost) {
		// Creo un nuevo post
		Post nuevoPost = new Post(tituloDelPost, contenidoDelPost);
		// Lo agrego al listado de Posts del usuario
		this.posts.add(nuevoPost);
		
		return nuevoPost;
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
