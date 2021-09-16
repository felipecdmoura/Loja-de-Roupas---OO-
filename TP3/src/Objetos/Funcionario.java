package Objetos;

import App.Read;

public class Funcionario extends Pessoa {

	//SUBCLASSE DE PESSOA

	//ATRIBUTOS
	private String datacontrat;

	//Construtor com parametros
	public Funcionario(String nome_, String email_, String cpf_, Telefone numtel_, String dContract) {
		super(nome_, email_, cpf_, numtel_);
		datacontrat = dContract;
	}

	//Construtor sem parametros
	public Funcionario() {
		super();
		datacontrat = "";
	}

	//GETS E SETS
	public String getDatacontrat() {
		return this.datacontrat;
	}

	public void setDatacontrat(String datacontrat) {
		this.datacontrat = datacontrat;
	}

	//Metodo de cadastro de funcionarios
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

	//Metodo de edicao de funcinario
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

	//toString de Funcionario
	public String toString() {
		return "Nome: " + nome + "\n"
			   + "Email: " + email + "\n"
			   + "CPF: " + cpf + "\n"
			   + "Data de Contratação: " + datacontrat + "\n"
			   + numtel;
	}		
}
