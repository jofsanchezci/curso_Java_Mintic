
public class Ejercicio13 {

	public static void main(String[] args) {

		
		int[] array = new int[10];
		for (int i=0;i<array.length; i++) {
			array[i] = (int)Math.floor(Math.random()*10+1);
		}
		
		int suma = 0;
		for (int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
			suma = suma + array[i];
		}
		System.out.println();
		System.out.println("La suma de los elementos del array es " + suma);

	}

}
