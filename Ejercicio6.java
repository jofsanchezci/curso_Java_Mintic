import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce precio de producto: ");
		double precio = sc.nextDouble();
		System.out.println("Introduce el numero de unidades: ");
		int unidades = sc.nextInt();
		
		double precioCompra = precio*unidades;
		double descuento;
		if (precioCompra < 100) {
			descuento = 0;
		}
		else if (precioCompra > 200) {
			descuento = (15*precioCompra)/100;
		}
		else {
			descuento = (10*precioCompra)/100;
		}
		double precioFinal = precioCompra - descuento;
		System.out.println("Precio Final: " + precioFinal);

	}

}
