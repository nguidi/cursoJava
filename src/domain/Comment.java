package domain;

/**
 * @class	Comment
 * @type	Model
 * @desc	Comentarios de un Post
 * @attr
 * 		content		::String
 */

public class Comment {

	// Atributo: Contenido del Comentario.
	private String content;

	// Constructor del comentario
	public Comment(String nuevoContenido) {
		// Setea el nuevo comentario al Comment
		this.content = nuevoContenido;

	}

}
