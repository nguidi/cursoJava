package domain;
import java.util.ArrayList;
import java.util.List;

/**
 * @class	Post
 * @type	Model
 * @desc	Post de un Usuario
 * @attr
 * 		points		::int
 * 		content		::String
 * 		title		::String
 * 		comments	::List<Comment>
 */

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
		this.setPoints(0);
		// Inicializo el titulo del post.
		this.setTitle(tituloDelPost);
		// Inicializo el contenido del post.
		this.setContent(contenidoDelPost);
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
	
	public void imprimite() {
		System.out.println(this.getTitle());
		System.out.println(this.getContent());
		System.out.println(this.getPoints());
	}
	
	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
}
