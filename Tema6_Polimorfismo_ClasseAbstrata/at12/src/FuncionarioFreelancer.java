public class FuncionarioFreelancer extends Funcionario{
    double horasTrabalho;
    double valorHora;

    public FuncionarioFreelancer(String nome, double horasTrabalho, double valorHora){
        super(nome);
        this.horasTrabalho = horasTrabalho;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario(){
         return horasTrabalho * valorHora;
    }
}

