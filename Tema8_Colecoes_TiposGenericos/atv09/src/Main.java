public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja();
        loja.adicionarCliente(new Cliente("Julia"));
        loja.adicionarCliente(new Cliente("Roberto"));
        loja.adicionarCliente(new Cliente("Lia"));

        loja.adicionarCliente(new Cliente("Julia"));
        System.out.println(" LISTA DE CLIENTES ");
        loja.listarClientes();


        System.out.println("\n QUANTIDADE DE CLIENTES ");
        loja.quantidadeClientes();


        System.out.println("\n CLIENTE ANA EXISTE? ");
        loja.verificarCliente(new Cliente("Julia"));

        System.out.println("\n REMOVENDO CLIENTE Roberto ");
        loja.removerCliente(new Cliente("Roberto"));

        System.out.println("\n LISTA APÓS REMOÇÃO ");
        loja.listarClientes();

        System.out.println("\n A LOJA ESTÁ VAZIA? ");
        loja.verificarLojaVazia();

    }
}
