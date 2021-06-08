
public class Fecha {
	
	private int dia;
	private int mes;
	private int anyo;
	
	public Fecha(int dia, int mes, int anyo) {
		this.dia = dia;
		this.mes = mes;
		this.anyo = anyo;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	@Override
	public String toString() {
		String resultado = "";
		if (dia < 10) {
			resultado = resultado + "0" + dia;
		}
		else {
			resultado = resultado + dia;
		}
		resultado = resultado + "/";
		if (mes < 10) {
			resultado = resultado + "0" + mes;
		}
		else {
			resultado += mes;
		}
		resultado += "/" + anyo;
		
		return resultado;
		
	}
	
	
}
