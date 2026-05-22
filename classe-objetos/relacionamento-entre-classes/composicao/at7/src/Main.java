public class Main {
    public static void main(String[] arg){
        PlacaMae minhaplacaMae = new PlacaMae("Asus", "AMD 550x", 4, "DDR4");
        Computador meucomputador = new Computador("Dell", "Inspirion 18", "Intel core i5", 8, minhaplacaMae);

        meucomputador.exibirComputadorCompleto();

        System.out.println("\nAtualizações em andamento...\n");

        meucomputador.atualizarProcessador("Intel core i9");
        meucomputador.expandirMemoria( 12);
        meucomputador.atualizarPlacaMae("AMD 550x", "DDR4");

        System.out.println("\nInformações após atualização:\n");
        meucomputador.exibirComputadorCompleto();



    }
}
