package model;
import java.util.ArrayList;
import java.util.List;

public class Post {

	// Atributo: Puntos del Post
	private int points;
	// Atributo: Contenido del Post
	private String content;
	// Atributo: Titulo del Post
	private String title;
	// Atributo: Listado de Comentarios
	private List<Comment> comments = new ArrayList<Comment>();

	// Constructor del Post
	public Post(String tituloDelPost, String contenidoDelPost) {
		// Inicializo el puntaje del post a 0.
		this.points = 0;
		// Inicializo el titulo del post.
		this.title = tituloDelPost;
		// Inicializo el contenido del post.
		this.content = contenidoDelPost;
	}

	// Comentar un post
	public void comentarPost(String contenidoDelComentario) {

		// Crea un nuevo comentario.
		Comment nuevoComentario = new Comment(contenidoDelComentario);
		// Agrega el nuevo comentario al listado de comentarios.
		this.comments.add(nuevoComentario);

	}

	// Puntuar un post
	public void puntuarPost(int nuevoPuntaje) {

		// Suma el Nuevo Puntaje al ya existente.
		this.points += nuevoPuntaje;

	}

}
