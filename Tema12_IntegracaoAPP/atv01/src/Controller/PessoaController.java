package Controller;

import dao.PessoaDao;
import Model.Pessoa;

public class PessoaController {
    private PessoaDao dao = new PessoaDao();


    public void cadastrarPessoa(String nome){
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        dao.inserir(pessoa);
    }

    public Pessoa consultarPessoa(String nome){
        return dao.buscarPorNome(nome);
    }

    public void atualizarPessoa(int id, String nome) {
        Pessoa pessoa = new Pessoa();
        pessoa.setId(id);
        pessoa.setNome(nome);

        dao.atualizar(pessoa);

        System.out.println("Mensagem para View: Dados atualizados com sucesso no sistema!");
    }

    public void excluirPessoa(int id) {
        dao.excluir(id);
        System.out.println("Mensagem para View: Registro removido com sucesso do sistema!");
    }


}
