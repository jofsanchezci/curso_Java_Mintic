public class main {

	public static void main(String[] args) {
		
		Fecha f1 = new Fecha(7,4,1995);
		Fecha f2 = new Fecha(17,11,2005);
		Fecha f3 = new Fecha(20,2,2012);
		Persona p1 = new Persona("Juan","Rodriguez",f1);
		Persona p2 = new Persona("Ana","Martinez",f2);
		Persona p3 = new Persona("Cris","Alfonso",f3);
		
		Persona[] personas = {p1,p2,p3};
		
		for (Persona p: personas) {
			System.out.println(p.getFecha_nacimiento());
		}

	}

}
