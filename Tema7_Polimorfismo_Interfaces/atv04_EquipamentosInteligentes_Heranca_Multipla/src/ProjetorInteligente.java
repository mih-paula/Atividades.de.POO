public class ProjetorInteligente implements Ligavel, Conectavel{

    @Override
    public void ligar(){
        System.out.println("Projetor ligado.");
    }

    @Override
    public void conectadoInternet(){
        System.out.println("Projetor conectado a internet.");
    }
}
