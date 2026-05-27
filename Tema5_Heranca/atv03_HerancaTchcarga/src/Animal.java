public class Animal {
    protected String nome;
    protected int idade;

    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(){
        this.nome = nome;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public void emitirSom(){
        System.out.println(nome + " está emitindo som... ");
    }

    public void emitirSom(String Somcaracteristico){
        System.out.println(nome + " faz: " + Somcaracteristico);
    }
}
