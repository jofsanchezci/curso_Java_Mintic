import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introzca la base del triangulo: ");
		double base = sc.nextDouble();
		System.out.println("Introduzca la altura del triangulo: ");
		double altura = sc.nextDouble();
		
		
		
		System.out.println("El area del triangulo de base " + base 
				+ " y altura " + altura + " es: " + (base * altura)/2);

	}

}
