
public class Telefone {
	
	public static int cadastrar;
	int DDD;
	int numero;
	
	
	
	public Telefone (int id,int num) {
		DDD = id;
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
