public class Main {
    public static void main(String[] args){
        Animal a1 = new Papagaio(" Loro", "Papagaio-verdadeiro");
        Animal a2 = new Gato(" Princesa", "Preto");
        Animal a3 = new Vaca(" Clementina", "Holstein-Frísia");

        Animal[] animais = {a1, a2, a3};

        for(Animal animal: animais){
            animal.emitirSom();
            animal.mover();
            System.out.println();
        }

        Papagaio papagaio = new Papagaio("Loro", "Papagaio-verdadeiro");
        papagaio.emitirSom(" Olá humanos!");
    }

}
