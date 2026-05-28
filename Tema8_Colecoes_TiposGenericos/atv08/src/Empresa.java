import java.util.TreeMap;
import java.util.Map;

public class Empresa {
    private TreeMap<Integer, Funcionario> funcionarios;

    public Empresa(){
        funcionarios = new TreeMap<>();
    }

    public void adicionarFuncionario(Integer codigo, Funcionario funcionario){
        funcionarios.put(codigo, funcionario);
    }

    public void buscarFuncionario(Integer codigo) {
        System.out.println(funcionarios.get(codigo));
    }


    public void removerFuncionario(Integer codigo) {
        funcionarios.remove(codigo);
    }


    public void verificarCodigo(Integer codigo) {
        System.out.println(funcionarios.containsKey(codigo));
    }


    public void primeiraChave() {
        System.out.println(funcionarios.firstKey());
    }


    public void ultimaChave() {
        System.out.println(funcionarios.lastKey());
    }


    public void quantidadeFuncionarios() {
        System.out.println(funcionarios.size());
    }


    public void verificarEmpresaVazia() {
        System.out.println(funcionarios.isEmpty());
    }


    public void listarFuncionarios() {
        for (Map.Entry<Integer, Funcionario> item : funcionarios.entrySet()) {
            System.out.println("Código: " + item.getKey() + " | " + item.getValue()
            );
        }
    }


}
