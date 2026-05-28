import java.util.TreeSet;

public class Estado {
    private TreeSet<Cidade> cidades;




    public Estado() {
        cidades = new TreeSet<>();
    }


    public void adicionarCidade(Cidade cidade) {
        cidades.add(cidade);
    }


    public void removerCidade(Cidade cidade) {
        cidades.remove(cidade);
    }


    public void verificarCidade(Cidade cidade) {
        System.out.println(cidades.contains(cidade));
    }


    public void primeiraCidade() {
        System.out.println(cidades.first());
    }



    public void ultimaCidade() {
        System.out.println(cidades.last());
    }


    public void quantidadeCidades() {
        System.out.println(cidades.size());
    }


    public void verificarEstadoVazio() {
        System.out.println(cidades.isEmpty());
    }


    public void listarCidades() {
        for (Cidade cidade : cidades) {
            System.out.println(cidade);
        }
    }
}
