import java.time.LocalDate;

public class Emprestimo {
    private Livro livro;
    private Leitor leitor;
    private LocalDate dataRetirada, dataDevolucao;


    public  Emprestimo(Livro livro, Leitor leitor, LocalDate dataRetirada, LocalDate dataDevolucao) {
        this.livro = livro;
        this.leitor = leitor;
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;

        this.livro.marcarComoEmprestado();
        this.leitor.confirmarEmprestimo(livro.getTitulo());
    }

    public void exibirResumoEmprestimo() {
        System.out.println("Resumo do Emprestimo");
        leitor.exibirInformacoes();
        livro.exibirInformacoes();
        System.out.println("Data Retirada: " + dataRetirada);
        System.out.println("Data Devolucao: " + dataDevolucao);
    }

    public void devolverLivro(){
        livro.marcarComoDisposnivel();
        System.out.println("Livro " + livro.getTitulo() + " devolvido.");
    }

    public boolean estaAtrasado(LocalDate hoje){
        return hoje.isAfter(dataDevolucao);
    }
}