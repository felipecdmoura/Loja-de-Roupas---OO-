package Objetos;

/**
 * classe responsavel pela implementação dos atributos e dos metodos da Venda
 * @author Felipe e João
 * @version TP5 (Outubro 2021)
 */
public class Venda {

	//ATRIBUTOS
	private Cliente cliente;
	private Roupa produto;
	private Funcionario funcionario;
	private float precoTotal;
	private String protocolo;

	//Construtor com parametros
	public Venda (Cliente cliente_, Roupa produto_, Funcionario funcionario_, Float precoTotal_,  String protocolo_){
		cliente = cliente_;
		produto = produto_;
		funcionario = funcionario_;
		precoTotal = precoTotal_;
		protocolo = protocolo_;
	}

	//Construtor sem parametros
	public Venda() {	
	}

	//GETS E SETS
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Roupa getProduto() {
		return produto;
	}

	public void setProduto(Roupa produto) {
		this.produto = produto;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public float getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(float precoTotal) {
		this.precoTotal = precoTotal;
	}

	public String getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(String protocolo) {
		this.protocolo = protocolo;
	}
	
	
	/** 
	 * Metodo que imprime os dados da Venda utilizando o toString
	 * @return toString com as infos de Venda.
	 */
	
	public String toString() {
		return    "-----Funcionário-----" + "\n"
				+ "Nome: " + funcionario.getNome() + "\n"
				+ "CPF: " + funcionario.getCpf() + "\n"
				+ "-----Cliente-----" + "\n"
				+ "Nome: " + cliente.getNome() + "\n"
				+ "CPF: " + cliente.getCpf() + "\n"
				+ "-----Informações da Compra-----"  + "\n"
				+ "ID do Produto: " +  produto.getId() + "\n"
				+ "Nome do Produto: " + produto.getNome() + "\n"
				+ "Preço Total: " + precoTotal + "\n"
				+ "Número de Protocolo: " + protocolo;

	}			

}
