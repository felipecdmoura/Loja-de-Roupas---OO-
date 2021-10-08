package Objetos;

import App.Read;
/**
 * classe responsavel pela implementação dos atributos e dos metodos da Calça
 * @author Felipe e João
 * @version TP5 (Outubro 2021)
 */
public class Calca extends Roupa {

    //SUBCLASSE DE ROUPA

    //ATRIBUTOS
    private float tamanhocintura;
    private int estoqueCalca;

    //Construtor com parametros
    public Calca (String id_, String nome_,String descricao_,char genero_,float preco_,String marca_,String cor_,float tamanhocintura_, int estoqueCalca_){
		super(id_, nome_, descricao_, genero_, preco_, marca_, cor_);
        tamanhocintura = tamanhocintura_;
        estoqueCalca = estoqueCalca_;
	}

    //Construtor sem parametros
	public Calca() {
		super();
        tamanhocintura = 0;
        estoqueCalca = 0;
	}

    //GETS E SETS
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

    /**
     * Metodo responsavel pelo cadastro dos dados da calça.
     * @deprecated 
     */

    public void cadastrarcalca(){
        System.out.println("Digite o Id da Calça : ");
		this.setId(Read.getString());

		System.out.println("Digite o nome da Calça : ");
		this.setNome(Read.getString());

		System.out.println("Digite a descrição da Calça: ");
		this.setDescricao(Read.getString());

		System.out.println("Digite o genero da Calça: ");
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

    
    /** 
     * Metodo responsavel pela edição dos dados da calça
     * @param seletor de qual calca do arraylist devera ser alterada.
     * @deprecated
     */

	public void editarCalca(int seletor){

		switch (seletor) {
            case 1:
                System.out.println("Digite o Id da Calça : ");
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
                System.out.println("Digite o genero da Calça: ");
                this.setGenero(Read.getChar());
				break;

			case 5:
                System.out.println("Digite o tamanho da cintura da Calça: ");
                this.setTamanhocintura(Read.getFloat());
				break;
                
            case 6:
                System.out.println("Digite a marca da Calça: ");
                this.setMarca(Read.getString());
                break;
			case 7:
                System.out.println("Digite a cor da Calça: ");
                this.setCor(Read.getString());
                break;

            case 8:
                System.out.println("Digite o preço da Calça: ");
                this.setPreco(Read.getFloat());
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

    
    /** 
     * Metodo responsavel por mostrar os dados da calça atraves do toString
     * @return toString com as infos de Calca
     */

    public String toString() {
        return    "Id: " + id + "\n"  
                + "Nome: " + nome + "\n"
                + "Descrição: " + descricao + "\n"
                + "Gênero: " + genero + "\n"
                + "Tamano da Cintura: " + tamanhocintura+ "\n"
                + "Marca: " + marca + "\n"
                + "Cor: " + cor + "\n"
                + "Preço: " + preco + "\n"
                + "Estoque: " + estoqueCalca;
    }
}
