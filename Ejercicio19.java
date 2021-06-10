import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		
		Map<String,Integer> alumnos = new HashMap<String,Integer>();
		Scanner sc = new Scanner(System.in);
		
		int opcion = -1;
		
		while (opcion != 2) {
			System.out.println("Introduzca la opcion que deseas: ");
			System.out.println("1- Introduzca asignatura y creditos");
			System.out.println("2- Salir");
			opcion = sc.nextInt();
			sc.nextLine();
			if (opcion == 1) {
				System.out.println("Introduzca el nombre de la asignatura");
				String asignatura = sc.nextLine();
				System.out.println("Introduzca los creditos de la asignatura");
				int creditos = sc.nextInt();
				alumnos.put(asignatura, creditos);
			}
		}
		
		int totalCreditos = 0;
		
		for (String asig: alumnos.keySet()) {
			totalCreditos += alumnos.get(asig);
		}
		
		System.out.println("El numero de creditos que esta cursando es: " + totalCreditos);
		
		

	}

}
