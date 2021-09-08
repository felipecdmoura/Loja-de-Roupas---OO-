package codigofonte;

public class Cliente extends Pessoa{
	private String datanasc;
	
	public Cliente(String nome_, String email_, String cpf_, Telefone numtel_, String dNasc){
		super(nome_, email_, cpf_, numtel_);
		datanasc = dNasc;
	}

	public Cliente() {
		super();
		datanasc = "17/03/2002";
	}

	public String getData(){
		return datanasc;
	}

	public void setData(String datanasc){
		this.datanasc = datanasc;
	}

	public void cadatrarCliente(){

		numtel = new Telefone(61, 998689594);

		System.out.println("Digite o nome: ");
		this.setNome(Read.getString());

		System.out.println("Digite o email: ");
		this.setEmail(Read.getString());

		System.out.println("Digite o cpf: ");
		this.setCpf(Read.getString());

		System.out.println("Digite a data de nascimento: ");
		this.setData(Read.getString());

		System.out.println("Digite o DDD do telefone: ");
		this.numtel.setDDD(Read.getInt());

		System.out.println("Digite o numero do telefone: ");
		this.numtel.setNumero(Read.getInt());

	}

	public String toString() {

		return "Nome: " + nome + "\n"
			   + "Email: " + email + "\n"
			   + "CPF: " + cpf + "\n"
			   + "Data de nascimento: " + datanasc + "\n"
			   + numtel;
	}			
}
