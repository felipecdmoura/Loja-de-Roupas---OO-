package codigofonte;

public abstract class Roupa {
    protected String nome;
    protected String descricao;
    protected String genreo;
    protected int preco;
    protected String marca;
    protected String cor;

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

    public String getGenreo() {
        return this.genreo;
    }

    public void setGenreo(String genreo) {
        this.genreo = genreo;
    }

    public int getPreco() {
        return this.preco;
    }

    public void setPreco(int preco) {
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

    
}
