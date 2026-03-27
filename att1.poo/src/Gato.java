public class Gato {
    //atributos
    String nome;
    int qtdComidaDisponivel;
    boolean sono, atletico;


    //construtor
    public Gato (String nome, int qtdComidaDisponivel, boolean sono, boolean atletico){
        this.nome = nome;
        this.qtdComidaDisponivel = qtdComidaDisponivel;
        this.sono = sono;
        this.atletico = atletico;
    }

    //métodos
    public void dormir(){
        sono = true;
        System.out.println(nome +  " dormiu!");
    }

    public void comer(){
        qtdComidaDisponivel -=1;
        System.out.println(nome + " Comeu! Quantidade de comida restante:" + qtdComidaDisponivel);
    }
    public void escalarArvore(){
        atletico = true;
        System.out.println(nome + " Subiu na árvore!" + atletico);
    }

}
