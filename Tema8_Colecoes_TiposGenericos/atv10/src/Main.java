public class Main {
    public static void main(String[] args) {
        Estado estado = new Estado();
        estado.adicionarCidade(new Cidade("Abel"));
        estado.adicionarCidade(new Cidade("Bom-Jesus"));
        estado.adicionarCidade(new Cidade("Marabá"));



        estado.adicionarCidade(new Cidade("Abel"));

        System.out.println(" LISTA DE CIDADES ");

        estado.listarCidades();

        System.out.println("\n PRIMEIRA CIDADE ");

        estado.primeiraCidade();

        System.out.println("\n ÚLTIMA CIDADE ");

        estado.ultimaCidade();

        System.out.println("\n A CIDADE ABEL EXISTE? ");

        estado.verificarCidade(new Cidade("Abel"));

        System.out.println("\n REMOVENDO CIDADE MARABÁ ");

        estado.removerCidade(new Cidade("Marabá"));

        System.out.println("\n LISTA APÓS REMOÇÃO ");

        estado.listarCidades();

        System.out.println("\n QUANTIDADE DE CIDADES ");

        estado.quantidadeCidades();

        System.out.println("\n O ESTADO ESTÁ VAZIO? ");

        estado.verificarEstadoVazio();
    }
}
