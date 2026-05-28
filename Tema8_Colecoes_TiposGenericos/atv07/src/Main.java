public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        estoque.adicionarProduto(1, new Produto("Arroz"));
        estoque.adicionarProduto(2, new Produto("Macarrão"));
        estoque.adicionarProduto(3, new Produto("Carne"));

        System.out.println(" LISTA DE PRODUTOS ");
        estoque.listarProdutos();
        

        System.out.println("\n USCANDO PRODUTO CÓDIGO 2 ");
        estoque.buscarProduto(2);


        System.out.println("\n REMOVENDO PRODUTO CÓDIGO 1 ");
        estoque.removerProduto(1);


        System.out.println("\n LISTA APÓS REMOÇÃO ");
        estoque.listarProdutos();


        System.out.println("\n EXISTE O CÓDIGO 3? ");
        estoque.verificarCodigo(3);


        System.out.println("\n QUANTIDADE DE PRODUTOS ");
        estoque.quantidadeProdutos();


        System.out.println("\n ESTOQUE ESTÁ VAZIO? ");
        estoque.verificarEstoqueVazio();

    }
}