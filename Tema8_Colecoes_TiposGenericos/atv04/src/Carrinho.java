import java.util.Vector;

public class Carrinho {
    private Vector<Produto> produtos;



    public Carrinho() {
        produtos = new Vector<>();
    }


    public void adicionarProduto(Produto p) {
        produtos.add(p);
    }


    public void listarProdutos() {
        for (Produto p : produtos) {
            p.mostrarProduto();
        }
    }
}