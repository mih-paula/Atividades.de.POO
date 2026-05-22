public class Professor extends Pessoa{
    private String disciplina;

    public Professor(String nome, int idade, String disciplina){
        super(nome, idade);
        this.disciplina=disciplina;
    }

    public void ensinar(){
        System.out.println("Disciplina: " + disciplina);
    }

}
