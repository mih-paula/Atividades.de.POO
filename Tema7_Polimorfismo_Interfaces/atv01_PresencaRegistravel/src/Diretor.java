public class Diretor extends Funcionario{
    private String setor;

    public Diretor(String nome, String setor){
        this.setor= setor;
        super(nome);

    }

    public void tomarDecisao(){
        System.out.println(nome + " está tomando decisões no setor "+setor);
    }


}
