public class Main {
    public static void main(String[] args) {
        //Implementar a regra de négocio
        //Instanciar a classe gato
        Gato gato1 = new Gato("Sushi", 10, true, false);
        Gato gato2 = new Gato("Cachaça", 5, false, true);
        gato1.comer();
        gato2.comer();

        gato1.dormir();
        gato2.dormir();

        gato1.comer();
        gato2.comer();

        gato1.dormir();
        gato2.dormir();

        if (gato1.atletico) {
            gato1.escalarArvore();
        } else {
            System.out.println(gato1.nome + " não consegue subir, prefere ficar no chão.");
        }
        if (gato2.atletico) {
            gato2.escalarArvore();
        } else {
            System.out.println(gato2.nome + " tentou subir, mas não é muito atlético.");
        }

    }
}
