public class Leitor {
    private String nome, email;
    private int matricula, telefone;


    public Leitor(String nome, int matriculs){
        this.nome= nome;
        this.matricula= matriculs;
    }

    public void atualizarContato(String email, int telefone){
        this.email=email;
        this.telefone=telefone;
    }

    public String getNome(){
        return nome;
    }
    public int getMatricula(){
        return matricula;
    }


    public void exibirInformacoes(){
        System.out.println("Leitor: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Email: " + email);

    }

    public void confirmarEmprestimo(String tituloLivro){
        System.out.println("Confimando emprestimo para " + nome + " | livro: " + tituloLivro);

    }

}
