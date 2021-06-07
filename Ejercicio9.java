import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int numero = sc.nextInt();
		int cont_pares = 0;
		int cont_impares = 0;
		while (numero != 0) {
			if (numero % 2 == 0) {
				cont_pares++;
			}
			else {
				cont_impares++;
			}
			System.out.println("Introduce un numero");
			numero = sc.nextInt();
		}
		
		System.out.println("Cantidad de numeros pares introducidos: " + cont_pares);
		System.out.println("Cantidad de numeros impares introducidos: " + cont_impares);


	}

}
