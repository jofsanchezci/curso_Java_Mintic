import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la nota de 0 a 10: ");
		double nota = sc.nextDouble();
		if (nota >=0 && nota < 3) {
			System.out.println("Deficiente");
		}
		else if (nota >= 3 && nota <5) {
			System.out.println("Insuficiente");
		}
		else if(nota >= 5 && nota <6) {
			System.out.println("Suficiente");
		}
		else if(nota >= 6 && nota<7 ) {
			System.out.println("Bien");
		}
		else if(nota>=7 && nota<9) {
			System.out.println("Excelente");
		}
		else if(nota>=9 && nota<=10) {
			System.out.println("Sobresaliente");
		}
		else {
			System.out.println("Nota Valida");
		}

	}

}
