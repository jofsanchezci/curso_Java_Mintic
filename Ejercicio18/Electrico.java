
public class Electrico extends Vehiculo{

	private double precio;
	
	public Electrico(int numplaca, double peso, double precio) {
		super(numplaca,peso);
		this.precio = precio;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return super.toString() + " - Electrico [precio=" + precio + "]";
	}
	
	public double impuestoBase() {
		return super.impuestoBase() + 0.09*precio;
	}
	
	
	
}
