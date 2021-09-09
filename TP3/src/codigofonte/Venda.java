package codigofonte;


public class Venda {
	private String numident;
	private int valorcompra;
	private Pessoa nomec;
	private Pessoa nomef;//seria o nome do funcionario no caso
	private Telefone numtel;
	
	public Venda (int valorcompra_,String numident_,Pessoa nomec_,Pessoa nomef_,Telefone numtel_){
		valorcompra = valorcompra_;
		numident = numident_;
		nomec = nomec_;
		nomef = nomef_;
		numtel = numtel_;
	}

	public Venda() {
		super();
	}


	public int getValorcompra() {
		return valorcompra;
	}
	public void setValorcompra(int string) {
		this.valorcompra = string;
	}
	public String getNumident() {
		return this.numident;
	}

	public void setNumident(String numident) {
		this.numident = numident;
	}


	public void cadatrarVenda(){

		nomec = new Cliente();
		nomef = new Funcionario();
		numtel = new Telefone();

		System.out.println("Digite o numero de identificação da venda: ");
		this.setNumident(Read.getString());

		System.out.println("Digite o valor da venda: ");
		this.setValorcompra(Read.getInt());

		System.out.println("Digite o nome do cliente: ");
		this.nomec.setNome(Read.getString());

		System.out.println("Digite o nome do funcionario: ");
		this.nomef.setNome(Read.getString());

		System.out.println("Digite o DDD do telefone: ");
		this.numtel.setDDD(Read.getInt());

		System.out.println("Digite o numero do telefone: ");
		this.numtel.setNumero(Read.getInt());
	}

	public void editarVenda(int seletor){

		numtel = new Telefone(61,339);

		switch (seletor) {
			case 1:
				System.out.println("Digite o numero de identificação da venda: ");
				this.setNumident(Read.getString());
				break;

			case 2:
				System.out.println("Digite o valor da venda: ");
				this.setValorcompra(Read.getInt());
				break;

			case 3:
				System.out.println("Digite o nome do cliente: ");
				this.nomec.setNome(Read.getString());
				break;
			case 4:
				System.out.println("Digite o nome do funcionario: ");
				this.nomef.setNome(Read.getString());
				break;
			case 5:
				System.out.println("Digite o DDD do telefone do cliente: ");
				this.nomec.numtel.setDDD(Read.getInt());
		
				System.out.println("Digite o numero do telefone do cliente: ");
				this.nomec.numtel.setNumero(Read.getInt());	
				break;
		
			default:
				System.out.println("Opção Inválida!");
				break;
		}
	}
	
	
	
	public String toString() {
		numtel = new Telefone(61, 998689594);

		return //"Nome Funcionario: " + nomef + "\n"
			    "Nome Cliente: " + nomec + "\n"
			   + "Valor da compra: " + valorcompra + "\n"
			   + "Numero de identificação da compra: " + numident + "\n"
			   + numtel;
	}			

}
