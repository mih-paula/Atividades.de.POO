public class Curso {
    private String nome, descricao, nivel;
    private int cargaHoraria;

    private Instrutor instrutor1;
    private Instrutor instrutor2;

    public Curso(String nome, int cargaHoraria, String nivel, String descricao){
        this.nome=nome;
        this.cargaHoraria=cargaHoraria;
        this.nivel=nivel;
        this.descricao=descricao;
    }


    public void associarInstrutor(Instrutor instrutor) {
        if (instrutor1 == null) {
            instrutor1=instrutor;
        } else if(instrutor2 == null){
            instrutor2= instrutor;
        } else {
            System.out.println("Não é possível adicionar mais instrutores a este curso.");
        }
    }


    public void Curso(){
        System.out.println("Curso: " + nome);
        System.out.println("Carga Horaria: " + cargaHoraria + "h");
        System.out.println("Nível: " + nivel);
        System.out.println("Descrição: " + descricao);
        System.out.println("Instrutores associados: ");


        if (instrutor1 != null) instrutor1.Instrutor();
        if (instrutor2 != null) instrutor2.Instrutor();
    }


    public String getNome() {
        return nome;
    }

    public int getCargaHoraria(){
        return cargaHoraria;
    }

    public String getNivel(){
        return nivel;
    }

    public String getDescricao(String descricao1) {
        return descricao;
    }

}
