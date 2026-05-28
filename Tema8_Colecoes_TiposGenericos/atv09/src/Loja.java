import java.util.HashSet;

public class Loja {
    private HashSet<Cliente> clientes;


    public Loja() {
        clientes = new HashSet<>();
    }


    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }


    public void removerCliente(Cliente cliente) {
        clientes.remove(cliente);
    }


    public void verificarCliente(Cliente cliente) {
        System.out.println(clientes.contains(cliente));
    }


    public void quantidadeClientes() {
        System.out.println(clientes.size());
    }


    public void verificarLojaVazia() {
        System.out.println(clientes.isEmpty());
    }


    public void listarClientes() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }
}
