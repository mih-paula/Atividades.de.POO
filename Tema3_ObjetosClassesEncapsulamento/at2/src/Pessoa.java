public class Pessoa {
    //atributos
    private String nome;
    private int idade;


    //contrutor da classe
    public Pessoa(){
    }

    //métodos de encapsulamento
    public void setNome(String nome) {
        this.nome= nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }


    //método de negócios
    public void mostrarDados(){
        System.out.println("Nome:" + getNome());
        System.out.println("Idade:" + getIdade());
    }

}
