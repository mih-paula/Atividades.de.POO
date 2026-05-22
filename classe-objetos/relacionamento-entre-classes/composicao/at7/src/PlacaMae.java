public class PlacaMae {
    private String fabricante, chipset, tipoDeMemoriaSuportada;
    private int numeroDeSlots;

    public PlacaMae(String fabricante, String chipset, int numeroDeSlots, String tipoDeMemoriaSuportada ){
        this.fabricante = fabricante;
        this.chipset = chipset;
        this.numeroDeSlots = numeroDeSlots;
        this.tipoDeMemoriaSuportada= tipoDeMemoriaSuportada;
    }

    public void exibirInformacoes(){
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Chipset: " + chipset);
        System.out.println("Slots: " + numeroDeSlots);
        System.out.println("Tipo de memória suportada: " + tipoDeMemoriaSuportada);
    }

    public void atualizarChipset(String novoChipset){
        this.chipset= novoChipset;
        System.out.println("Chipset para atualização: " + novoChipset);
    }

    public void adicionarSlot(){
        System.out.println("Adicione slots: " + numeroDeSlots);
    }

    public void definirTipoMemoria(String tipo){
        this.tipoDeMemoriaSuportada=tipo;
        System.out.println("Tipo de memória atualizada para: " + tipo);
    }





}
