
public class Ejercicio14 {

	public static void main(String[] args) {


		String[][] informacion = {{"andres","5.5","7.5","8"},{"maria","3","7.5","7"},{"juan","3.5","4.5","4"}};
		boolean[] resultados = new boolean[informacion.length];
		for (int i=0; i<informacion.length; i++) {
			for(int j=0; j<informacion[i].length; j++) {
				double notaTeoria = (Double.parseDouble(informacion[i][1]) + Double.parseDouble(informacion[i][2]))/2;
				double notaFinal = notaTeoria*0.4 + Double.parseDouble(informacion[i][3])*0.6;
				if (notaFinal >= 5) {
					resultados[i] = true;
				}
				else {
					resultados[i] = false;
				}
			}
		}
		for (int i=0; i< resultados.length; i++) {
			if (resultados[i]) {
				System.out.println("El alumno " + informacion[i][0] + " ha aprobado");
			}
			else {
				System.out.println("El alumno " + informacion[i][0] + " no ha aprobado");
			}
		}
	}

}
