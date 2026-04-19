public class Main {
    public static void main(String[] arg){
        Gato gato = new Gato("Victor", 2, "Preto");
        Cachorro cachorro = new Cachorro("Betove", 12, "médio");

        gato.emitirSom();
        gato.emitirSom("Miau, miau...");

        cachorro.emitirSom();
        cachorro.emitirSom("Au, au, au...");

        gato.brincar();
        gato.brincar("lã");

        cachorro.correr();
        cachorro.correr(70);

    }
}
