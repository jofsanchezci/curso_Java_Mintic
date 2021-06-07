import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una cadena");
		String cadena = sc.nextLine();
		int contador_espacios = 0;
		
		for (int i=0; i<cadena.length(); i++) {
			if (cadena.charAt(i) == ' ') {
				contador_espacios++;
			}
		}
		
		System.out.println("El numero de espacios en blanco de la cadena es: " + contador_espacios);

	}

}
