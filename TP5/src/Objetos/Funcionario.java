package Objetos;

import App.Read;

/**
 * classe responsavel pela implementação dos atributos e dos metodos do Funcionario
 * @author Felipe e João
 * @version TP5 (Outubro 2021)
 */
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

	/**
	 * Metodo responsavel pelo cadastro do funcionario
	 * @deprecated
	 */
	public void cadatrarFuncionario(){
		String cpf;
		numtel = new Telefone();

		System.out.println("Digite o nome do funcionario: ");
		this.setNome(Read.getString());

		System.out.println("Digite o email: ");
		this.setEmail(Read.getString());

		do{
			System.out.println("Digite o cpf: ");
			cpf = Read.getString();
		
			if(cpf.length() == 11){ 
				this.setCpf(cpf);
				break;
			}else{
				System.out.println();
				System.out.println("Cpf Inválido!");
				System.out.println();
			}	
		}while(true);

		System.out.println("Digite a data de contratação: ");
		this.setDatacontrat(Read.getString());

		System.out.println("Digite o DDD do telefone: ");
		this.numtel.setDDD(Read.getInt());

		System.out.println("Digite o numero do telefone: ");
		this.numtel.setNumero(Read.getInt());

	}

	
	/** 
	 * Metodo responsavel pela edição dos dados do funcionario
	 * @param seletor de qual funcionario devera ser alterado.
	 * @deprecated
	 */

	public void editarFuncionario(int seletor){
		String cpfedit;
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
				do{
					System.out.println("Digite o novo cpf: ");
					cpfedit = Read.getString();
				
					if(cpfedit.length() == 11){ 
						this.setCpf(cpfedit);
						break;
					}else{
						System.out.println();
						System.out.println("Cpf Inválido!");
						System.out.println();
					}	
				}while(true);
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

	
	/** 
	 * Metodo responsavel por mostrar os dados do funcionario atraves do toString
	 * @return toString com as infos de Funcionario.
	 */
	
	public String toString() {
		return "Nome: " + nome + "\n"
			   + "Email: " + email + "\n"
			   + "CPF: " + cpf + "\n"
			   + "Data de Contratação: " + datacontrat + "\n"
			   + numtel;
	}		
}
