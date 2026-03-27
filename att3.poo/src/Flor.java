public class Flor {
    //atributos
    String nome;
    String cor;
    boolean perfume;


    //contrutor da classe
    public Flor(){
        this.perfume = true;
    }

    //métodos de encapsulamento
    public void setNome(String nome) {

        this.nome= nome;
    }

    public String getNome() {

        return nome;
    }

    public void setCor(String cor) {

        this.cor = cor;
    }

    public String getCor() {

        return cor;
    }
    public void setPerfume(boolean perfume) {

        this.perfume = perfume;

    }

    public boolean getPerfume() {

        return perfume;
    }


    //método de negócios
      public void mostrarDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Cor: " + getCor());
        System.out.println("Possui perfume? " + getPerfume());
    }

}
