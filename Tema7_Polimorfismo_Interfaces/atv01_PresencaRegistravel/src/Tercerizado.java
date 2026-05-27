public class Tercerizado implements PresencaRegistravel {
    private String nome;


    public Tercerizado(String nome){
        this.nome=nome;
    }

    public void executarServico(){
        System.out.println(nome + " está executando serviços terceirizados.");
    }

    public void registrarPresenca() {
        System.out.println("Precença registrada para o tercerizado " + nome+".");

    }
}