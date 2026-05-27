public class Pessoa {
    String nome;
    int idade;
    String genero;
    int cnh;

    public Pessoa(){
    }

    public void setNome(String nome){
        this.nome= nome;
    }
    public String getNome(){
        return nome;
    }
    public void setIdade(int idade){
        this.idade=idade;
    }
    public int getIdade(){
        return idade;
    }
    public void setGenero(String genero){
        this.genero=genero;
    }
    public String getGenero(){
        return genero;
    }
    public void setCnh(int cnh) {
        this.cnh = cnh;
    }
    public int getCnh() {
        return cnh;
    }

    public void mostrarDados(){
        System.out.println("  Dados da pessoa ");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Genero: " + getGenero());
        System.out.println("N° da CNH: " + getCnh());
        System.out.println("---------------------------");
    }

    public void colocarCinto(Carro carro){
        System.out.println(this.nome + " está girando a chave! ");
        carro.Ligar();
    }
    public void usarCarro(Carro carro){
        System.out.println(this.nome  + " esta dirigindo " + carro.getmodelo() + " ! ");
        carro.Dirigir();
    }
    public void apertarAcelerador(Carro carro){
        System.out.println(this.nome + " apertou o acelerador!");
        carro.Acelerar();
    }
}
