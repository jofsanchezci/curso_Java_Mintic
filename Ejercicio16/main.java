
public class main {

	public static void main(String[] args) {
		
		Libro l1 = new Libro("isbn 1","libro 1","autor 1", 400);
		Libro l2 = new Libro("isbn 2","libro 2", "autor 2", 200);
		Libro l3 = new Libro("isbn 3","libro 3","autor 3", 300);
		
 		Libro[] libros = new Libro[3];
		libros[0] = l1;
		libros[1] = l2;
		libros[2] = l3;
		Libro mayorPaginas = l1;
		for (Libro l: libros) {
			System.out.println(l.toString());
			if (l.getPaginas() > mayorPaginas.getPaginas()) {
				mayorPaginas = l;
			}
		}
		System.out.println("El libro con mas paginas es: " + mayorPaginas.getTitulo());

	}

}
