package codigofonte;


public class Telefone {
	
	//ATRIBUTOS
	private int DDD;
	private int numero;
	
	//Construtor com parametros
	public Telefone (int ddd, int num) {
		DDD = ddd;
		numero = num;
	}

	//Construtor sem parametros
	public Telefone () {
		DDD = 00;
		numero = 00000000;
	}

	//GETS E SETS
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

	//toString de Telefone
	public String toString() {
		return "Telefone: (" + DDD + ") " + numero;
	}
}
