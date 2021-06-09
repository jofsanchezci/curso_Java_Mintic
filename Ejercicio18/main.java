public class main {

	public static void main(String[] args) {
		
		Electrico e1 = new Electrico(123,800,20000);
		Electrico e2 = new Electrico(345,700,25000);
		Combustion c1 = new Combustion(222,1000,150);
		Combustion c2 = new Combustion(999,1200,180);
		
		System.out.println(e1.toString() + "Impuesto: " + e1.impuestoBase());
		System.out.println(e2.toString() + "Impuesto: " + e2.impuestoBase());
		System.out.println(c1.toString() + "Impuesto: " + c1.impuestoBase());
		System.out.println(c2.toString() + "Impuesto: " + c2.impuestoBase());
		

	}
