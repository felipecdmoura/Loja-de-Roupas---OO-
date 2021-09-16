package Objetos;


public abstract class Pessoa {

	//ATRIBUTOS
	protected String nome;
	protected String email;
	protected String cpf;
	protected Telefone numtel;
	
	//Construtor com parametros
	public Pessoa(String nome_, String email_, String cpf_, Telefone numtel_) {
		nome = nome_;
		email = email_;
		cpf = cpf_;
		numtel = numtel_;
	}

	//Construtor sem parametros
	public Pessoa() {
		Telefone telefone = new Telefone();
		nome = "";
		email = "";
		cpf = "";
		numtel = telefone;
	}
	
	//GETS E SETS
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