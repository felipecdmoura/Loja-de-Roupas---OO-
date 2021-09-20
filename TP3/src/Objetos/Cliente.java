package Objetos;

import App.Read;

public class Cliente extends Pessoa{

	//SUBCLASSE DE PESSOA

	//ATRIBUTOS
	private String datanasc;
	
	//Construtor com parametros
	public Cliente(String nome_, String email_, String cpf_, Telefone numtel_, String dNasc){
		super(nome_, email_, cpf_, numtel_);
		datanasc = dNasc;
	}

	//Construtor sem parametros
	public Cliente() {
		super();
		datanasc = "";
	}

	//GETS E SETS
	public String getData(){
		return datanasc;
	}

	public void setData(String datanasc){
		this.datanasc = datanasc;
	}

	//Metodo de cadastro de clientes
	public void cadatrarCliente(){
		String cpf;
		numtel = new Telefone();

		System.out.println("Digite o nome: ");
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

		System.out.println("Digite a data de nascimento: ");
		this.setData(Read.getString());

		System.out.println("Digite o DDD do telefone: ");
		this.numtel.setDDD(Read.getInt());

		System.out.println("Digite o numero do telefone: ");
		this.numtel.setNumero(Read.getInt());

	}

	//Metodo de edicao de clientes
	public void editCliente(int seletor){
		String cpfedit;
		numtel = new Telefone(61,339);

		switch (seletor) {
			case 1:
				System.out.println("Digite o novo nome: ");
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
				System.out.println("Digite a data de nascimento: ");
				this.setData(Read.getString());
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

	//toString de Cliente
	public String toString() {
		return "Nome: " + nome + "\n"
			   + "Email: " + email + "\n"
			   + "CPF: " + cpf + "\n"
			   + "Data de nascimento: " + datanasc + "\n"
			   + numtel;
	}			
}
