package codigofonte;

public class Estoque {
    private int estoqueCamisa;
    private int estoqueCalca;

    public Estoque() {
        estoqueCalca = 00;
        estoqueCamisa = 00;
    }

    public int getEstoqueCamisa() {
        return estoqueCamisa;
    }

    public void setEstoqueCamisa(int estoqueCamisa) {
        this.estoqueCamisa = estoqueCamisa;
    }

    public void setEstoqueCalca(int estoqueCalca) {
        this.estoqueCalca = estoqueCalca;
    }

    public int getEstoqueCalca() {
        return estoqueCalca;
    }

    public String toString() {
        return "Camisas em estoque: " + estoqueCamisa + "\n"
              + "Calças em estoque: " + estoqueCalca;
    }
}
