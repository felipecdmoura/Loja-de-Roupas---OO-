package codigofonte;


public class Telefone {
	
	private int DDD;
	private int numero;
	
	public Telefone (int ddd, int num) {
		DDD = ddd;
		numero = num;
	}

	public int getDDD() {
		return DDD;
	}

	public void setDDD(int dDD) {
		DDD = dDD;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String toString() {
		return "Telefone: (" + DDD + ") " + numero;
	}
}
