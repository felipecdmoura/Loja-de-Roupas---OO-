
public abstract class Pessoa {
	
	static String nome[] = new String[50];
	static String email[] = new String[50];
	static int cpf[] = new int[50];
	public Telefone numtel;
	
	
	
	public String[] getNome() {
		return nome;
	}

	public void setNome(String[] nome) {
		this.nome = nome;
	}

	public String[] getEmail() {
		return email;
	}

	public void setEmail(String[] email) {
		this.email = email;
	}

	public int[] getCpf() {
		return cpf;
	}

	public void setCpf(int[] cpf) {
		this.cpf = cpf;
	}

	public Telefone getNumtel() {
		return numtel;
	}

	public void setNumtel(Telefone numtel) {
		this.numtel = numtel;
	}
	

}