import java.util.HashMap;
import java.util.Map;

class Estoque {
    private HashMap<Integer, Produto> produtos;


    public Estoque() {
        produtos = new HashMap<>();
    }


    public void adicionarProduto(Integer codigo, Produto produto) {
        produtos.put(codigo, produto);
    }


    public void buscarProduto(Integer codigo) {
        System.out.println(produtos.get(codigo));
    }


    public void removerProduto(Integer codigo) {
        produtos.remove(codigo);
    }


    public void verificarCodigo(Integer codigo) {
        System.out.println(produtos.containsKey(codigo));
    }


    public void quantidadeProdutos() {
        System.out.println(produtos.size());
    }


    public void verificarEstoqueVazio() {
        System.out.println(produtos.isEmpty());
    }


    public void listarProdutos() {
        for (Map.Entry<Integer, Produto> item : produtos.entrySet()) {
            System.out.println("Código: " + item.getKey() + " | " + item.getValue());
        }
    }
}