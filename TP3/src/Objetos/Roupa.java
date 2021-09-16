package Objetos;

public abstract class Roupa {

    //ATRIBUTOS
    protected String id;
    protected String nome;
    protected String descricao;
    protected char genero;
    protected float preco;
    protected String marca;
    protected String cor;

    //Construtor com parametros
    public Roupa(String id_, String nome_,String descricao_,char genero_,float preco_,String marca_,String cor_) {
        id = id_;
        nome = nome_;
		descricao = descricao_;
        genero= genero_;
		preco = preco_;
        marca = marca_;
        cor = cor_;
    }

    //Construtor sem parametros
    public Roupa() {
        id = "";
        nome = "";
		descricao = "";
        genero= 'N';
		preco = 0;
        marca = "";
        cor = "";
    }

    //GETS E SETS
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public float getPreco() {
        return this.preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    //toString de Pessoa
    public String toString() {
        return    "Nome: " + nome + "\n"
                + "Descrição: " + descricao + "\n"
                + "Gênero: " + genero + "\n"
                + "Marca: " + marca + "\n"
                + "Cor: " + cor + "\n"
                + "Preço: " + preco;
    }
}
