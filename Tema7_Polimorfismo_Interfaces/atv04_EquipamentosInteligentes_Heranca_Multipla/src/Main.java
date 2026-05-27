public class Main {
    public static void main(String[] args){
        ProjetorInteligente projetor = new ProjetorInteligente();

        Ligavel equipamentosLigavel = projetor;
        equipamentosLigavel.ligar();

        Conectavel equipamentosConectavel = projetor;
        equipamentosConectavel.conectadoInternet();


    }
}
