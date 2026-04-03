import java.time.LocalDate;

public class Main {
    public static void main(String[] arg){
        Livro livro1 = new Livro("Água viva", "Clarice Lispector", 5798);
        Leitor leitor1 = new Leitor("Emily", 2024);
        leitor1.atualizarContato("emile@@gmail..com", 9745246);

        LocalDate hoje = LocalDate.now();
        LocalDate dataEntrega = hoje.plusDays(15);

        Emprestimo emprestimo = new Emprestimo(livro1, leitor1, hoje, dataEntrega);

        emprestimo.exibirResumoEmprestimo();

        if(emprestimo.estaAtrasado(hoje)){
            System.out.println("Alerta: Emprestimo atrasado!");
        } else{
            System.out.println("Status: Emprestimo dentro do prazo!");
        }
        System.out.println("Devolvendo livro...");
        emprestimo.devolverLivro();

        System.out.println("Status final: ");
        livro1.exibirInformacoes();

    }
}
