public class Professor extends Funcionario implements PresencaRegistravel {
    private String disciplina;


    public Professor(String nome, String disciplina){
        this.disciplina=disciplina;
        super(nome);
    }


    public void lecionar(){
        System.out.println(nome + " está lecionando a disciplina " + disciplina+".");
    }

    public void registrarPresenca() {
        System.out.println("Presença registrada para " + nome+".");

    }



}