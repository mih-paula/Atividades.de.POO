public class Papagaio extends Animal{
    private String nomeComum;

    public Papagaio(String nome, String nomeComum){
        super(nome);
        this.nomeComum = nomeComum;
    }

    public void emitirSom(){
        System.out.println(nome + " está emitindo som: Curupaco, curupaco!");
    }
    public void emitirSom(String frase){
        System.out.println(nome + " diz: " + frase);
    }
    public void mover(){
        System.out.println(nome + " está voando pelos céus.");
    }
}
