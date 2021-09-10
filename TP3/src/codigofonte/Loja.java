package codigofonte;


public class Loja {
	
	String cnpj;
	String endereco;
	String nomefilial;
	
	public Loja (String cnpj_,String endereco_,String nomefilial_){
		nomefilial = nomefilial_;
		cnpj = cnpj_;
		endereco = endereco_;
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

	public String getNomefilial() {
		return nomefilial;
	}

	public void setNomefilial(String nomefilial) {
		this.nomefilial = nomefilial;
	}
	
	public void cadastrarLoja(){
		System.out.println("Digite o nome da filial: ");
		this.setNomefilial(Read.getString());

		System.out.println("Digite o endereco: ");
		this.setEndereco(Read.getString());

		System.out.println("Digite o cnpj da loja: ");
		this.setCnpj(Read.getString());

	}

	public void editarLoja(int seletor){
		switch (seletor) {
			case 1:
				System.out.println("Digite o novo nome da filial: ");
				this.setNomefilial(Read.getString());
				break;

			case 2:
				System.out.println("Digite o novo endereco: ");
				this.setEndereco(Read.getString());
				break;

			case 3:
				System.out.println("Digite o novo cnpj: ");
				this.setCnpj(Read.getString());
				break;
				

			default:
				System.out.println("Opção Inválida!");
				break;
		}
	}


	public String toString() {
		return "Nome da Filial: " + nomefilial + "\n" 
			 + "Endereço: " + endereco + "\n" 
			 + "CNPJ: " + cnpj ;
	}
}
