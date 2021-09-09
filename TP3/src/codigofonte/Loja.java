package codigofonte;


public class Loja {
	
	String cnpj;
	String endereco;
	Estoque estoque;
	String nomefilial;
	
	public Loja (String cnpj_,String endereco_,Estoque estoque_,String nomefilial_){
		cnpj = cnpj_;
		endereco = endereco_;
		estoque = estoque_;
	}

	public Loja() {
		super();
	}

	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Estoque getEstoque() {
		return estoque;
	}
	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}
	public String getNomefilial() {
		return nomefilial;
	}
	public void setNomefilial(String nomefilial) {
		this.nomefilial = nomefilial;
	}
	
	public void cadastrarLoja(){


		estoque = new Estoque();

		System.out.println("Digite o nome da filial: ");
		this.setNomefilial(Read.getString());

		System.out.println("Digite o endereco: ");
		this.setEndereco(Read.getString());

		System.out.println("Digite o estoque de calça: ");
		this.estoque.setEstoqueCalca(Read.getInt());

		System.out.println("Digite o estoque de camisa: ");
		this.estoque.setEstoqueCamisa(Read.getInt());

		System.out.println("Digite o cnpj da loja: ");
		this.setCnpj(Read.getString());

	}

	public void editarLoja(int seletor){

		estoque = new Estoque();

		switch (seletor) {
			case 1:
				System.out.println("Digite o novo cnpj: ");
				this.setCnpj(Read.getString());
				break;

			case 2:
				System.out.println("Digite o novo endereco: ");
				this.setEndereco(Read.getString());
				break;

			case 3:
				System.out.println("Digite o novo estoque de calça: ");
				this.estoque.setEstoqueCalca(Read.getInt());
				break;

			case 4:
				System.out.println("Digite o novo estoque de camisa: ");
				this.estoque.setEstoqueCamisa(Read.getInt());
				break;

			case 5:
				System.out.println("Digite o novo nome da filial: ");
				this.setNomefilial(Read.getString());
		
			default:
				System.out.println("Opção Inválida!");
				break;
		}
	}


	public String toString() {
		return "Nome da Filial: " + nomefilial + "\n" 
			 + "CNPJ: " + cnpj + "\n" 
			 + "Endereço: " + endereco + "\n" 
			 + estoque;
	}
}
