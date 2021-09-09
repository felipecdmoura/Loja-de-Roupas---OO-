package codigofonte;

public class Camisa extends Roupa {
    private String tamanho;
   
    public Camisa (String nome_,String descricao_,char genero_,float preco_,String marca_,String cor_,String tamanho_){
		nome = nome_;
		descricao = descricao_;
        genero= genero_;
		preco = preco_;
        marca = marca_;
        cor = cor_;
        tamanho = tamanho_;
	}

	public Camisa() {
		super();
	}
    public String getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void cadastrarcamisa(){

		System.out.println("Digite o nome da camisa : ");
		this.setNome(Read.getString());

		System.out.println("Digite a descrição do produto: ");
		this.setDescricao(descricao);

		System.out.println("Digite o Genero da Camisa: ");
		this.setGenero(Read.getChar());

		System.out.println("Digite o preço da Camisa: ");
		this.setPreco(Read.getFloat());

		System.out.println("Digite a marca da camisa: ");
		this.setMarca(Read.getString());
        
        System.out.println("Digite a cor da camisa: ");
		this.setCor(Read.getString());

        System.out.println("Digite o tamanho da camisa: ");
		this.setTamanho(Read.getString());

	}

	public void editarCamisa(int seletor){

		switch (seletor) {
			case 1:
                System.out.println("Digite o nome da camisa : ");
                this.setNome(Read.getString());
				break;

			case 2:
                System.out.println("Digite a descrição da camisa: ");
                this.setDescricao(descricao);
				break;

			case 3:
                System.out.println("Digite o Genero da Camisa: ");
                this.setGenero(Read.getChar());
				break;

			case 4:
                System.out.println("Digite o preço da Camisa: ");
                this.setPreco(Read.getFloat());
				break;
            case 5:
                System.out.println("Digite a marca da camisa: ");
                this.setMarca(Read.getString());
                break;
			case 6:
                System.out.println("Digite a cor da camisa: ");
                this.setCor(Read.getString());
		
            case 7:
                System.out.println("Digite o tamanho da camisa: ");
                this.setTamanho(Read.getString());
				break;
		
			default:
				System.out.println("Opção Inválida!");
				break;
		}
	}

    public String toString() {
        return    "Nome: " + nome + "\n"
                + "Descrição: " + descricao + "\n"
                + "Gênero: " + genero + "\n"
                + "Marca: " + marca + "\n"
                + "Cor: " + cor + "\n"
                + "Tamano: " + tamanho + "\n"
                + "Preço: " + preco;
    }

}
