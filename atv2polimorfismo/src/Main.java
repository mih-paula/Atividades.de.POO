public class Main {
    public static void main(String[] arg){
        FuncionarioCLT fclt = new FuncionarioCLT("Emily", 2000.00);
        FuncionarioFreelancer ffreela = new FuncionarioFreelancer("Ronald", 8, 80);

        System.out.println("Salário de " + fclt.nome + ": " + fclt.calcularSalario());
        System.out.println("Salário de " + ffreela.nome + ": " + ffreela.calcularSalario());
    }
}
