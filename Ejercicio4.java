import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int numero = sc.nextInt();
		
		if (numero < 0 && numero%3 == 0) {
			System.out.println("El numero " + numero + " es negativo y multiplo de 3");
		}
		if (numero < 0 && numero%3 != 0){
			System.out.println("El numero " + numero + " es negativo y  no es multiplo de 3");
		}

		if (numero > 0 && numero%3 == 0){
			System.out.println("El numero " + numero + " no es negativo y es multiplo de 3");
		}
		if (numero > 0 && numero%3 != 0){
			System.out.println("El numero " + numero + " no negativo y  no es multiplo de 3");
		}

	}

}
