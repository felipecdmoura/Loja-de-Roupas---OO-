package codigofonte;


public class Loja {
	
	String cnpj;
	String endereco;
	Estoque estoque;
	String nomefilial;
	
	
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

}
