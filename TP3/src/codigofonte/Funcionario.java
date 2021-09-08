package codigofonte;

public class Funcionario extends Pessoa {
	private String datacontrat;

	public String getDatacontrat() {
		return this.datacontrat;
	}

	public void setDatacontrat(String datacontrat) {
		this.datacontrat = datacontrat;
	}

	public void cadatrarFuncionario(){

		numtel = new Telefone(61, 998689594);

		System.out.println("Digite o nome: ");
		this.setNome(Read.getString());

		System.out.println("Digite o email: ");
		this.setEmail(Read.getString());

		System.out.println("Digite o cpf: ");
		this.setCpf(Read.getString());

		System.out.println("Digite a data de nascimento: ");
		this.setDatacontrat(Read.getString());

		System.out.println("Digite o DDD do telefone: ");
		this.numtel.setDDD(Read.getInt());

		System.out.println("Digite o numero do telefone: ");
		this.numtel.setNumero(Read.getInt());

	}


	public String toString() {
		numtel = new Telefone(61, 998689594);

		return "Nome: " + nome + "\n"
			   + "Email: " + email + "\n"
			   + "CPF: " + cpf + "\n"
			   + "Data de Contratação: " + datacontrat + "\n"
			   + numtel;
	}		
}
