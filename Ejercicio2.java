import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca los dolares a convertir: ");
		double dolar = sc.nextDouble();
		
		double peso = dolar * 3500;
		
		System.out.println(dolar + " dolares = " + peso + " pesos");
		

	}

}
