public class Main {
    public static void main(String[] arg){
        Livro livro = new Livro("Carta ao pai", "C450", "Franz Kafka", "C456");
        Revista revista = new Revista("Geração Z", "G78", "05/2026");
        MidiaDigital md = new MidiaDigital("Artigo", "A70", "PDF", 20.5);

        livro.emprestar();
        revista.emprestar();
        md.emprestar();
    }
}
