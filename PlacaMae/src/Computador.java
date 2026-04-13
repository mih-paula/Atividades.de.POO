import javax.sound.midi.SysexMessage;

public class Computador {
    private String marca, modelo, processador;
    private int memoriaRam;
    private PlacaMae placaMae;

    public Computador(String marca, String modelo, String processador, int memoriaRam, PlacaMae placaMae){
        this.marca= marca;
        this.modelo = modelo;
        this.processador = processador;
        this.memoriaRam = memoriaRam;
        this.placaMae= placaMae;

    }

    public void exibirComputadorCompleto(){
        System.out.println("Marca: "+ marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Processador: " + processador);
        System.out.println("Memória Ram: " + memoriaRam+ "GB");
        placaMae.exibirInformacoes();
    }
    public void atualizarProcessador(String novoProcessador){
        this.processador = novoProcessador;
        System.out.println("Atualize o processador: " + novoProcessador);
    }

    public void expandirMemoria(int adicional){
        this.memoriaRam = adicional;
        System.out.println("Aumente a quantidade de memória RAM:" + adicional);
    }

    public void atualizarPlacaMae(String novoChipset, String novoTipoMemoria){
        System.out.println("Atualize chipset: " + novoChipset);
        System.out.println("Tipo de memória suportada pela placa-mãe: " + novoTipoMemoria);
    }


}
