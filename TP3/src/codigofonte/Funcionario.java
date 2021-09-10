package codigofonte;

public class Funcionario extends Pessoa {
	private String datacontrat;

	public Funcionario(String nome_, String email_, String cpf_, Telefone numtel_, String dContract) {
		super(nome_, email_, cpf_, numtel_);
		datacontrat = dContract;
	}

	public Funcionario() {
		super();
		datacontrat = "";
	}

	public String getDatacontrat() {
		return this.datacontrat;
	}

	public void setDatacontrat(String datacontrat) {
		this.datacontrat = datacontrat;
	}

	public void cadatrarFuncionario(){

		numtel = new Telefone();

		System.out.println("Digite o nome do funcionario: ");
		this.setNome(Read.getString());

		System.out.println("Digite o email: ");
		this.setEmail(Read.getString());

		System.out.println("Digite o cpf: ");
		this.setCpf(Read.getString());

		System.out.println("Digite a data de contratação: ");
		this.setDatacontrat(Read.getString());

		System.out.println("Digite o DDD do telefone: ");
		this.numtel.setDDD(Read.getInt());

		System.out.println("Digite o numero do telefone: ");
		this.numtel.setNumero(Read.getInt());

	}

	public void editarFuncionario(int seletor){

		numtel = new Telefone(61,339);

		switch (seletor) {
			case 1:
				System.out.println("Digite o novo nome do funcionario: ");
				this.setNome(Read.getString());
				break;

			case 2:
				System.out.println("Digite o novo email: ");
				this.setEmail(Read.getString());
				break;

			case 3:
				System.out.println("Digite o novo CPF: ");
				this.setCpf(Read.getString());
				break;

			case 4:
				System.out.println("Digite a data de contrataçao: ");
				this.setDatacontrat(Read.getString());
				break;

			case 5:
				System.out.println("Digite o DDD do telefone: ");
				this.numtel.setDDD(Read.getInt());
		
				System.out.println("Digite o numero do telefone: ");
				this.numtel.setNumero(Read.getInt());	
				break;
		
			default:
				System.out.println("Opção Inválida!");
				break;
		}
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
