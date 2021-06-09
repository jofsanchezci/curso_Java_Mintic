
public class Vehiculo {
	
	private int numplaca;
	private double peso;
	
	public Vehiculo(int numplaca, double peso) {
		this.numplaca = numplaca;
		this.peso = peso;
	}

	public int getNumPlaca() {
		return numplaca;
	}

	public void setNumPlaca(int numplaca) {
		this.numplaca = numplaca;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Vehiculo [numplaca=" + numplaca + ", peso=" + peso + "]";
	}
	
	public double impuestoBase() {
		return 0.45*peso;
	}

}
