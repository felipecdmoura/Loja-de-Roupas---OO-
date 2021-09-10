package codigofonte;

public class Camisa extends Roupa {
    private String tamanho;
    private int estoqueCamisa;

    public Camisa (String id_, String nome_,String descricao_,char genero_,float preco_,String marca_,String cor_,String tamanho_, int estoqueCamisa_){
		super(id_, nome_, descricao_, genero_, preco_, marca_, cor_);
        tamanho = tamanho_;
        estoqueCamisa = estoqueCamisa_;
	}

	public Camisa() {
		super();
        tamanho = "";
        estoqueCamisa = 0;
	}

    public String getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public int getEstoqueCamisa() {
        return estoqueCamisa;
    }

    public void setEstoqueCamisa(int estoqueCamisa) {
        this.estoqueCamisa = estoqueCamisa;
    }

    public void cadastrarcamisa(){

        System.out.println("Digite o Id da camisa : ");
		this.setId(Read.getString());

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

        System.out.println("Digite a quantidade em estoque: ");
		this.setEstoqueCamisa(Read.getInt());

	}

	public void editarCamisa(int seletor){
		switch (seletor) {
            case 1:
                System.out.println("Digite o Id da camisa : ");
                this.setId(Read.getString());
                break;

			case 2:
                System.out.println("Digite o nome da camisa : ");
                this.setNome(Read.getString());
				break;

			case 3:
                System.out.println("Digite a descrição da camisa: ");
                this.setDescricao(descricao);
				break;

			case 4:
                System.out.println("Digite o Genero da Camisa: ");
                this.setGenero(Read.getChar());
				break;

			case 5:
                System.out.println("Digite o preço da Camisa: ");
                this.setPreco(Read.getFloat());
				break;
            case 6:
                System.out.println("Digite a marca da camisa: ");
                this.setMarca(Read.getString());
                break;
			case 7:
                System.out.println("Digite a cor da camisa: ");
                this.setCor(Read.getString());
		
            case 8:
                System.out.println("Digite o tamanho da camisa: ");
                this.setTamanho(Read.getString());
				break;
            case 9:
                System.out.println("Digite a quantidade em estoque: ");
                this.setEstoqueCamisa(Read.getInt());
                break;
		
			default:
				System.out.println("Opção Inválida!");
				break;
		}
	}

    public String toString() {
        return    "Id: " + id + "\n"
                + "Nome: " + nome + "\n"
                + "Descrição: " + descricao + "\n"
                + "Gênero: " + genero + "\n"
                + "Marca: " + marca + "\n"
                + "Cor: " + cor + "\n"
                + "Tamano: " + tamanho + "\n"
                + "Preço: " + preco + "\n"
                + "Estoque: " + estoqueCamisa;
    }

}
