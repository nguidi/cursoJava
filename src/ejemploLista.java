import java.util.ArrayList;
import java.util.List;


public class ejemploLista {
	
	/**
	* @param args
	*/
	public static void main(String[] args) {
		
		// Creamos una collecion del tipo Array que contendra Strings
		List<String> l = new ArrayList<String>();

		/**
		 *  - Inicia en el indice 0
		 *  - Los elementos de la lista estan incluidos en el atributo elementData
		 */

		// la funcion "add" del objeto list agrega elementos al final del List (Push)
		l.add("uno");
		l.add("dos");
		l.add("tres");

		// Imprimo la lista. La salida es de la forma ["uno","dos","tres"]
		System.out.println(l);

		/**
		 * Detalles del ciclo for:
		 * 
		 *	for (int i=0; i < 10; i++) {
		 *		l.add("Indice "+i);
		 *	}
		 *
		 * Simil foreach. Recorro cada string de la lista l:
		 *
		 *	for (String str : l) {
		 *		system.out.println(str);
		 *	}
		 */

		// la funcion get obtiene el valor en la lista en el indice dado
		l.get(0);

		// la funcion size devuelve la longitud de la lista
		l.size();

		// la funcion remove elimina el objeto en el indice
		l.remove(0);

		// la funcion remove tambien acepta como parametro un objeto a buscar y eliminar (TENER CUIDADO CON ESTO)
		l.remove("Indice 3");
		
	}
	
}
