public class MidiaDigital extends MaterialBibliografico{
    private String formatoArquivo;
    private int totalDownloads;
    private double tamanhoMb;

    public MidiaDigital(String titulo, String codigo, String formatoArquivo, double tamanhoMb){
        super(titulo, codigo);
        this.formatoArquivo = formatoArquivo;
        this.totalDownloads= 0;
        this.tamanhoMb = tamanhoMb;
    }

    public String getFormatoAqrquivo(){
        return formatoArquivo;
    }
    public void setFormatoAqrquivo(){
        this.formatoArquivo=formatoArquivo;
    }
    public int getTotalDownloads(){
        return totalDownloads;
    }
    public double getTamanhoMb(){
        return tamanhoMb;
    }
    public void setTamanhoMb(double tamanhoMb){
        this.tamanhoMb=tamanhoMb;
    }

    public void emprestar(){
        System.out.println("Midia digital emprestada: " + getTitulo() + " \nQuantidade de downloads: " + getTotalDownloads());
    }

}
