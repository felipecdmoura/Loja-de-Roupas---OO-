package codigofonte;

public class Calca extends Roupa {
    private float tamanhocintura;
    private int estoqueCalca;

    public Calca (String id_, String nome_,String descricao_,char genero_,float preco_,String marca_,String cor_,float tamanhocintura_, int estoqueCalca_){
		super(id_, nome_, descricao_, genero_, preco_, marca_, cor_);
        tamanhocintura = tamanhocintura_;
        estoqueCalca = estoqueCalca_;
	}

	public Calca() {
		super();
        tamanhocintura = 0;
        estoqueCalca = 0;
	}

    public float getTamanhocintura() {
        return this.tamanhocintura;
    }

    public void setTamanhocintura(Float tamanhocintura) {
        this.tamanhocintura = tamanhocintura;
    }

    public int getEstoqueCalca() {
        return estoqueCalca;
    }

    public void setEstoqueCalca(int estoqueCalca) {
        this.estoqueCalca = estoqueCalca;
    }

    public void cadastrarcalca(){
        System.out.println("Digite o Id da Calça : ");
		this.setId(Read.getString());

		System.out.println("Digite o nome da Calça : ");
		this.setNome(Read.getString());

		System.out.println("Digite a descrição da Calça: ");
		this.setDescricao(Read.getString());

		System.out.println("Digite o Genero da Calça: ");
		this.setGenero(Read.getChar());

		System.out.println("Digite o preço da Calça: ");
		this.setPreco(Read.getFloat());

		System.out.println("Digite a marca da Calça: ");
		this.setMarca(Read.getString());
        
        System.out.println("Digite a cor da Calça: ");
		this.setCor(Read.getString());

        System.out.println("Digite o tamanho da cintura da Calça: ");
		this.setTamanhocintura(Read.getFloat());

        System.out.println("Digite a quantidade em estoque: ");
		this.setEstoqueCalca(Read.getInt());

	}

	public void editarCalca(int seletor){

		switch (seletor) {
            case 1:
                System.out.println("Digite o id da Calça : ");
                this.setId(Read.getString());
                break;

			case 2:
                System.out.println("Digite o nome da Calça : ");
                this.setNome(Read.getString());
				break;

			case 3:
                System.out.println("Digite a descrição da Calça: ");
                this.setDescricao(Read.getString());
				break;

			case 4:
                System.out.println("Digite o Genero da Calça: ");
                this.setGenero(Read.getChar());
				break;

			case 5:
                System.out.println("Digite o preço da Calça: ");
                this.setPreco(Read.getFloat());
                break;
            case 6:
                System.out.println("Digite a marca da Calça: ");
                this.setMarca(Read.getString());
                break;
			case 7:
                System.out.println("Digite a cor da Calça: ");
                this.setCor(Read.getString());
		
            case 8:
                System.out.println("Digite o tamanho da cintura da Calça: ");
                this.setTamanhocintura(Read.getFloat());
				break;
            
            case 9:
                System.out.println("Digite a quantidade em estoque: ");
                this.setEstoqueCalca(Read.getInt());
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
                + "Tamano da Cintura: " + tamanhocintura + "\n"
                + "Preço: " + preco + "\n"
                + "Estoque: " + estoqueCalca;
    }
}
