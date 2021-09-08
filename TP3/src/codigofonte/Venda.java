package codigofonte;


public class Venda {
	private int valorcompra;
	private int numident;
	private Cliente nome, nomef;//seria o nome do funcionario no caso
	private Telefone numtel;
	
	

	public int getValorcompra() {
		return valorcompra;
	}
	public void setValorcompra(int string) {
		this.valorcompra = string;
	}
	public int getNumident() {
		return numident;
	}
	public void setNumident(int numident) {
		this.numident = numident;
	}
	public Cliente getNome() {
		return nome;
	}
	public void setNome(Cliente string) {
		this.nome = string;
	}

	
	public void cadatrarVenda(){
		nome = new Cliente(null, null, null, numtel, null);
		
		

		System.out.println("Digite o nome do cliente: ");
		this.nome.setNome(Read.getString());

		//nomef = new Funcionario();

		//System.out.println("Digite o nome do funcionario: ");
		//this.nomef.setNome(Read.getString());

		System.out.println("Digite o valor da compra: ");
		this.setValorcompra(Read.getInt());

		System.out.println("Digite o Numero de identificação: ");
		this.setNumident(Read.getInt());


	}

	
	public String toString() {
		numtel = new Telefone(61, 998689594);

		return //"Nome Funcionario: " + nomef + "\n"
			    "Nome Cliente: " + nome + "\n"
			   + "Valor da compra: " + valorcompra + "\n"
			   + "Numero de identificação da compra: " + numident + "\n"
			   + numtel;
	}			

}
