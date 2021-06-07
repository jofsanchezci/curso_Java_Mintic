import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la contrasena a validar");
		String pass = sc.nextLine();
		
		if (pass.length() >= 10 && pass.length() <= 20) {
			
			boolean valida = false;
			
			for (int i=0; i<pass.length(); i++) {
				
				if (pass.charAt(i) == '*' || pass.charAt(i) == '-' 
						|| pass.charAt(i) == '_') {
					valida = true;
				}
			}
			
			if (valida) {
				System.out.println("La contrasena es valida");
			}
			else {
				System.out.println("La contrasena no tiene los caracteres necesarios");
			}
		}
		else {
			System.out.println("La contrasena no tiene la longitud correcta");
		}

	}

}
