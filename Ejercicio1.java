import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Introduzca la edad: ");
		int edad = sc.nextInt();
		
		System.out.println("Hola " + nombre + " tienes " + edad + " anos");
		
	}

}
