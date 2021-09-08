package codigofonte;


public abstract class Pessoa {
	
	protected String nome;
	protected String email;
	protected String cpf;
	protected Telefone numtel;
	
	public Pessoa(String nome_, String email_, String cpf_, Telefone numtel_) {
		nome = nome_;
		email = email_;
		cpf = cpf_;
		numtel = numtel_;
	}

	public Pessoa() {
		Telefone telefone = new Telefone(61, 998869594);
		nome = "Felipe";
		email = "felipe@gmail.com";
		cpf = "05784232141";
		numtel = telefone;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Telefone getNumtel() {
		return numtel;
	}

	public void setNumtel(Telefone numtel) {
		this.numtel = numtel;
	}
	
}