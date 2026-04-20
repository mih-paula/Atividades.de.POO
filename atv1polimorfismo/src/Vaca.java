public class Vaca extends Animal{
    private String raca;

    public Vaca(String nome, String raca){
        super(nome);
        this.raca = raca;
    }

    public void emitirSom(){
        System.out.println(nome + " está emitindo som: Muuuu, Muuuu...");
    }
    public void mover(){
        System.out.println(nome + " está andando pelo pasto.");
    }

}
