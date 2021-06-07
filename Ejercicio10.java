import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una nota: ");
		double nota = sc.nextDouble();
		double notaMayor = -1;
		double notaMenor = 11;
		while (nota > 0 && nota <= 10) {
			if (nota > notaMayor) {
				notaMayor = nota;
			}
			if (nota < notaMenor) {
				notaMenor = nota;
			}
			System.out.println("Introduce una nota: ");
			nota = sc.nextDouble();
		}
		System.out.println("La nota mayor es: " + notaMayor);
		System.out.println("La nota menor es: " + notaMenor);

	}

}
