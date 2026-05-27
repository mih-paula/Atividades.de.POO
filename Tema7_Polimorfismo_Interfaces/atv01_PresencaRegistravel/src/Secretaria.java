public class Secretaria extends Funcionario implements PresencaRegistravel{
    private String turno;


    public Secretaria(String nome, String turno){
        this.turno = turno;
        super(nome);

    }

    @Override

    public void exibirDados(){
        super.exibirDados();
    }

    public void organizarDocumento(){
        System.out.println(nome + " está organizando documentos no turno " +turno);
    }

    public void registrarPresenca() {
        System.out.println("Presença registrada para " + nome+".");

    }

}
