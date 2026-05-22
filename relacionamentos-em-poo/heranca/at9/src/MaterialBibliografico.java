public class MaterialBibliografico {
    protected String titulo;
    protected String codigo;

    public MaterialBibliografico(String titulo, String codigo){
        this.titulo=titulo;
        this.codigo=codigo;
    }

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public String getCodigo(){
        return codigo;
    }
    public void setCodigo(String codigo){
        this.codigo=codigo;
    }

    public void emprestar(){
        System.out.println("Livro emprestado da classe Base bibliográfico: " + getTitulo());
    }
}
