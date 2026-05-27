public class Main {
    public static void main(String[] args){
        Diretor diretor = new Diretor("Roberto", "Administrativo");
        Professor professor = new Professor("Ana", "Matemática");
        Secretaria secretaria = new Secretaria("Carol", "Manhã");
        Tercerizado tercerizado = new Tercerizado("Carlos");

        diretor.exibirDados();
        diretor.tomarDecisao();

        professor.exibirDados();
        professor.lecionar();
        professor.registrarPresenca();

        secretaria.exibirDados();
        secretaria.organizarDocumento();
        secretaria.registrarPresenca();

        tercerizado.executarServico();
        tercerizado.registrarPresenca();
    }


}
