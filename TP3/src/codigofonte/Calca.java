package codigofonte;

public class Calca extends Roupa {
    private float tamanhocintura;

    public float getTamanhocintura() {
        return this.tamanhocintura;
    }

    public void setTamanhocintura(Float tamanhocintura) {
        this.tamanhocintura = tamanhocintura;
    }

    public String toString() {
        return    "Nome: " + nome + "\n"
                + "Descrição: " + descricao + "\n"
                + "Gênero: " + genero + "\n"
                + "Marca: " + marca + "\n"
                + "Cor: " + cor + "\n"
                + "Tamano da Cintura: " + tamanhocintura + "\n"
                + "Preço: " + preco;
    }
}
