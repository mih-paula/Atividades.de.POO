public class Gato extends Animal{
    private String corPelagem;

    public Gato(String nome, String corPelagem){
        super(nome);
        this.corPelagem = corPelagem;
    }

    public void emitirSom(){
        System.out.println(nome + " está emitindo som: Miau! ");
    }
    public void mover(){
        System.out.println(nome + "  está  saltando agilmente. ");
    }
}
