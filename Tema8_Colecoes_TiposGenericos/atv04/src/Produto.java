public class Produto {
    private String nome;
    private double preco;



    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }


    public void mostrarProduto() {
        System.out.println("Produto: " + nome + " | Preço: R$ " + preco);
    }
}