public class Livro {
    private String titulo, autor;
    private int isbn;
    private boolean emprestado;


    public Livro (String titulo, String autor, int isbn){
        this.titulo=titulo;
        this.autor=autor;
        this.isbn=isbn;
        this.emprestado = false;
    }

    public void marcarComoEmprestado(){
        this.emprestado = true;
    }

    public void marcarComoDisposnivel(){
        this.emprestado = false;
    }

    public boolean isEmprestado(){
        return emprestado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void exibirInformacoes(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("isbn: " + isbn);
        System.out.println("Status: " + (emprestado ? "emprestado " : "disponivel"));
    }

}
